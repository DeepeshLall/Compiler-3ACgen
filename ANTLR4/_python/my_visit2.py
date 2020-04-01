import antlr4
import sys
import warnings
if __name__ is not None and "." in __name__:
    from .Java8Lexer import Java8Lexer
    from .Java8Parser import Java8Parser
    from .Java8Visitor import Java8Visitor
else:
    from Java8Lexer import Java8Lexer
    from Java8Parser import Java8Parser
    from Java8Visitor import Java8Visitor
from tac import TAC
from graphviz import Digraph
from my_visit1 import ST,parser
import SymbolTable
import json

global tac
tac = TAC()

# This class defines a Overriden visitor for a parse tree produced by Java8Parser.
# For now all datatype have been given 4 byte (x86-32 bit needed to  be handled for x86-64)

def _isIdentifier_(ctx):
    if isinstance(ctx, antlr4.tree.Tree.TerminalNode):
        # Return true is isIdentifier
        return True
    else:
        return False

class my_visit2(Java8Visitor):
    def __init__(self):
        super().__init__()
        self.typeList=[] # Each element is id in local Declaration 
        self.typeSizeList=[]   # type of respective indexed id in typeList[]
        self.type=None # type of local Declaration
        self.variableModifier = [] # Modifier for local decalaration
       
        self.level=0  # level of Scope
        self.blockFlag=1 # Used for identifying normal block from if,for,while and switch block.
       
        self.fieldModifier = [] # Modifier List for Field declaration. 
        self.MethodName = None # for increasing scope by same name
        self.MethodBlock=1 # If 1 then that block is not directly inside a method and to be used to increase Scope.
       
        self.inFormalList=0 # if 1 then we are inside Formal list.
        self.formalTypeList=[] # Each element is id in formal Declaration 
        self.formalTypeSizeList=[] # type of respective indexed id in formalTypeList[]
        self.formalType=[] # type of formal Declaration list for method's argument
        self.formalModifier=[] # Modifier for formal decalaration
       
        self.dimsForArray=0 # if 1 then dims visitor are to be used for array in variableDeclaratorid visitor
        
        self.variableInitializer = None # if set then declaration need a tac else no tac
        self.expression = None # it contains the temporary for expression before assignment.
        self.ExpressionClass = None # if =1 then Lambda Expression , =0 then assignment expression.
        self.assignmentExpression = None # it contain temporary storing expression after asssignment or conditionalExpression
        self.conditionExpression = None # it contain the return temporary for expression after conditionalExpression.
        self.assignment = None # it contain the return temporary for expression after assignment.
        self.LeftHandSide = None # it contains the temporary for leftHandSide in assignment
        self.dimsNo = 0 # no of dims to set dimension
        self.dimensionTemp = 0 # store dimension for self.typeSizeList before variable Declarator id

        self.NextLabel = None # carry label for statement to be jumped at in switch case.
        self.exitLabel = None #  label for exit point in switch case for break to be backpatched with.

        #contains temporary register in case of operand reduction at that named non terminal node in parse tree.
        self.conditionalOrExpression = None 
        self.conditionalAndExpression = None 
        self.inclusiveOrExpression = None 
        self.exclusiveOrExpression = None 
        self.andExpression = None 
        self.equalityExpression = None 
        self.relationalExpression = None 
        self.shiftExpression = None 
        self.additiveExpression = None 
        self.multiplicativeExpression = None 
        self.unaryExpression = None 
        self.preIncrementExpression = None 
        self.preDecrementExpression = None 
        self.unaryExpressionNotPlusMinus = None 
        self.postfixExpression = None 
        self.postfix_Type_1 = None 
        self.primary = None 
        self.castExpression = None 
        self.primary_Type_1 = None 
        self.primaryNoNewArray_Type_1_Pr = None 
        self.methodInvocation_Type_1_Pr = None
        self.methodInvocation = None
        self.argumentList = []
        self.postDecrementExpression = None 
        self.postIncrementExpression = None  
        self.expressionName = None
        self.ConstExpression = None
        self.constantExpression = None

        # False List of all the nonterminal having value to be backpatched.
        self.expressionFL = []
        self.assignmentExpressionFL = []
        self.assignmentFL = []
        self.conditionExpressionFL = []
        self.conditionalOrExpressionFL = []
        self.conditionalAndExpressionFL = []
        self.conditionalAndExpressionFL = []
        self.inclusiveOrExpressionFL = []
        self.exclusiveOrExpressionFL = []
        self.andExpressionFL = []
        self.equalityExpressionFL = []
        self.relationalExpressionFL = []
        self.shiftExpressionFL = []
        self.additiveExpressionFL = []
        self.multiplicativeExpressionFL = []
        self.unaryExpressionFL = []
        self.postDecrementExpressionFL = []
        self.postIncrementExpressionFL = []

        # True List of all the nonterminal having value to be backpatched.
        self.expressionTL = []
        self.assignmentExpressionTL = []
        self.assignmentTL = []
        self.conditionExpressionTL = []
        self.conditionalOrExpressionTL = []
        self.conditionalAndExpressionTL = []
        self.conditionalAndExpressionTL = []
        self.inclusiveOrExpressionTL = []
        self.exclusiveOrExpressionTL = []
        self.andExpressionTL = []
        self.equalityExpressionTL = []
        self.relationalExpressionTL = []
        self.shiftExpressionTL = []
        self.additiveExpressionTL = []
        self.multiplicativeExpressionTL = []
        self.unaryExpressionTL = []
        self.postDecrementExpressionTL = []
        self.postIncrementExpressionTL = []

        #Type variable for each node to access the type of that non terminal before leaving it.
        self.unannType = "void"
        self.unannPrimitiveType = "void"
        self.unannReferenceType = "void"
        self.unannArrayType ="void"
        self.variableInitializerType = 'void'
        self.expressionType = 'void'
        self.assignmentExpressionType = 'void'
        self.conditionExpressionType = 'void'
        self.assignmentType = 'void'
        self.LeftHandSideType = 'void'
        self.conditionalOrExpressionType = 'void'
        self.conditionalAndExpressionType = 'void'
        self.inclusiveOrExpressionType = 'void'
        self.exclusiveOrExpressionType = 'void'
        self.andExpressionType = 'void'
        self.equalityExpressionType = 'void'
        self.relationalExpressionType = 'void'
        self.shiftExpressionType = 'void'
        self.additiveExpressionType = 'void'
        self.multiplicativeExpressionType = 'void'
        self.unaryExpressionType = 'void'
        self.preIncrementExpressionType = 'void'
        self.preDecrementExpressionType = 'void'
        self.unaryExpressionNotPlusMinusType = 'void'
        self.postfixExpressionType = 'void'
        self.postfix_Type_1Type = 'void'
        self.primaryType = 'void'
        self.castExpressionType = 'void'
        self.primary_Type_1Type = 'void'
        self.primaryNoNewArray_Type_1_PrType = 'void'
        self.methodInvocation_Type_1_PrType = 'void'
        self.methodInvocationType = 'void'
        self.argumentListType = []
        self.postDecrementExpressionType = 'void'
        self.postIncrementExpressionType = 'void'
        self.expressionNameType = 'void'
        self.constantExpressionType = 'void'

        self.BreakList = []
        self.ContinueList = []
        self.MethodList = []

    def reinitializeSymbolTableScope(self):
        ST.func = 'start'
        ST.new_s=1
        ST.scope=1
        ST.offset = 0

    def visitNormalclassDeclaration(self, ctx:Java8Parser.NormalclassDeclarationContext):
        classid = None
        children = ctx.getChildren()
        for child in children:
            if(_isIdentifier_(child)):
                classid = child.getText()
                if classid == 'class':
                    continue
            elif(parser.ruleNames[child.getRuleIndex()] == 'classModifier' ):
                pass
            elif(parser.ruleNames[child.getRuleIndex()] == 'classBody' ):
                self.level+=1
                ST.inc_scope_minor(classid)
                self.visitClassBody(child)
                ST.dec_scope()
                ST.func='start'
                self.level-=1
        return 1

    def visitMethodDeclaration(self, ctx:Java8Parser.MethodDeclarationContext):
        self.MethodName = None
        self.visitChildren(ctx)
        return 1

    def visitMethodModifier(self, ctx:Java8Parser.MethodModifierContext):
        self.visitChildren(ctx)
        return 1

    def visitResult(self, ctx:Java8Parser.ResultContext):
        self.visitChildren(ctx)
        return 1

    def visitMethodDeclarator(self, ctx:Java8Parser.MethodDeclaratorContext):
        self.MethodName = str(ctx.getChild(0).getText())
        ST.inc_scope_minor(self.MethodName)
        return self.visitChildren(ctx)
    
    def visitMethodHeader(self, ctx:Java8Parser.MethodHeaderContext):
        self.visitChildren(ctx)
        return 1

    def visitFormalParameterList(self, ctx:Java8Parser.FormalParameterListContext):
        self.inFormalList=1
        self.formalTypeList=[]
        self.formalTypeSizeList=[]
        self.formalType=[]
        self.formalModifier=[]
        self.dimsNo = 0
        self.visitChildren(ctx)
        for i in range(len(self.formalTypeList)):
            ST.Add('variables',str(self.formalTypeList[i]),str(self.formalTypeSizeList[i]),str(self.formalType[i]),self.formalModifier)
        self.inFormalList=0
        return 1

    def visitMethodBody(self, ctx:Java8Parser.MethodBodyContext):
        self.MethodBlock=0
        self.MethodList.append([])
        tac.emit(str(ST.func),'','','')
        self.MethodList[-1].append(len(tac.code))
        tac.emit("BeginFunc",str(len(self.formalTypeList)*4),'','')
        self.visitChildren(ctx)
        # this part is according to https://web.stanford.edu/class/archive/cs/cs143/cs143.1128/handouts/240%20TAC%20Examples.pdf
        for x in self.MethodList[-1]:
            tac.code[x][1] = str(ST.SymbolTableFunction[ST.func]['offset'])
        tac.emit("EndFunc",'','','')
        self.MethodList.pop()
        self.MethodBlock=1
        # print("Decreasing scope from :"+str(ST.scope))
        ST.dec_scope()
        # print("Decreased scope to :"+str(ST.scope))
        return 1

    def visitFormalParameter(self, ctx:Java8Parser.FormalParameterContext):
        return self.visitChildren(ctx)

    def visitBlock(self, ctx:Java8Parser.BlockContext):
        if(self.blockFlag==0 or self.MethodBlock==0 or self.ExpressionClass==1):
            flagA=0
            flagB=0
            flagC=0
            if (self.MethodBlock == 0):
                flagA=1
                self.MethodBlock = 1
            if (self.blockFlag == 0):
                flagB=1
                self.blockFlag = 1
            if (self.ExpressionClass == 1):
                flagC=1
                self.ExpressionClass = None
            self.visitChildren(ctx)
            if (flagA == 1):
                self.MethodBlock=0
            if (flagB == 1):
                self.blockFlag=0
            if (flagC == 1):
                self.ExpressionClass=1
            return 1
        else:
            self.level+=1
            # print("Increasing scope from :"+str(ST.scope))
            ST.inc_scope_minor()
            # print("Increased scope to :"+str(ST.scope))
            self.visitChildren(ctx)
            self.level-=1
            # print("Decreasing scope from :"+str(ST.scope))
            ST.dec_scope()
            # print("Decreased scope to :"+str(ST.scope))
            return 1

    def visitWhileStatement(self, ctx:Java8Parser.WhileStatementContext):
        # whileStatement  :  'while' '(' expression ')' statement
		# 		;
        self.level+=1
        # print("Increasing scope from :"+str(ST.scope))
        ST.inc_scope_minor()
        # print("Increased scope to :"+str(ST.scope))
        self.blockFlag=0
        children = ctx.getChildren()
        l1 = tac.newLabel()
        l2 = tac.newLabel()
        l3 = tac.newLabel()
        self.BreakList.append([])
        self.ContinueList.append([])
        for child in children:
            if _isIdentifier_(child):
                continue
            elif parser.ruleNames[child.getRuleIndex()] == 'expression':
                tac.emit('label :','', '', l1)
                self.visit(child)
                tac.backpatch(self.expressionTL,l2)
                tac.backpatch(self.expressionFL,l3)
            elif parser.ruleNames[child.getRuleIndex()] == 'statement':
                tac.emit('label :','', '', l2)
                self.visit(child)
                tac.emit('goto','', '', l1)
                tac.emit('label :','', '', l3)
        tac.backpatch(self.BreakList[-1],l3)
        tac.backpatch(self.ContinueList[-1],l1)
        self.BreakList.pop()
        self.ContinueList.pop()
        self.level-=1
        # print("Decreasing scope from :"+str(ST.scope))
        ST.dec_scope()
        # print("Decreased scope to :"+str(ST.scope))
        self.blockFlag=1
        return 1

    def visitWhileStatementNoShortIf(self, ctx:Java8Parser.WhileStatementNoShortIfContext):
        # whileStatementNoShortIf  :  'while' '(' expression ')' statementNoShortIf
		# 				 ;
        self.level+=1
        # print("Increasing scope from :"+str(ST.scope))
        ST.inc_scope_minor()
        # print("Increased scope to :"+str(ST.scope))
        self.blockFlag=0
        children = ctx.getChildren()
        l1 = tac.newLabel()
        l2 = tac.newLabel()
        l3 = tac.newLabel()
        self.BreakList.append([])
        self.ContinueList.append([])
        for child in children:
            if _isIdentifier_(child):
                continue
            elif parser.ruleNames[child.getRuleIndex()] == 'expression':
                tac.emit('label :','', '', l1)
                self.visit(child)
                tac.backpatch(self.expressionTL,l2)
                tac.backpatch(self.expressionFL,l3)
            elif parser.ruleNames[child.getRuleIndex()] == 'statementNoShortIf':
                tac.emit('label :','', '', l2)
                self.visit(child)
                tac.emit('goto','', '', l1)
                tac.emit('label :','', '', l3)
        tac.backpatch(self.BreakList[-1],l3)
        tac.backpatch(self.ContinueList[-1],l1)
        self.BreakList.pop()
        self.ContinueList.pop()
        self.level-=1
        # print("Decreasing scope from :"+str(ST.scope))
        ST.dec_scope()
        # print("Decreased scope to :"+str(ST.scope))
        self.blockFlag=1
        return 1

    def visitDoStatement(self, ctx:Java8Parser.DoStatementContext):
        # doStatement  :  'do' statement 'while' '(' expression ')' ';'
		# 	 ;
        self.level+=1
        # print("Increasing scope from :"+str(ST.scope))
        ST.inc_scope_minor()
        # print("Increased scope to :"+str(ST.scope))
        self.blockFlag=0
        children = ctx.getChildren()
        l1 = tac.newLabel()
        l2 = tac.newLabel()
        l3 = tac.newLabel()
        self.BreakList.append([])
        self.ContinueList.append([])
        for child in children:
            if _isIdentifier_(child):
                continue
            elif parser.ruleNames[child.getRuleIndex()] == 'expression':
                tac.emit('label :','', '', l1)
                self.visit(child)
                tac.backpatch(self.expressionTL,l2)
                tac.backpatch(self.expressionFL,l3)
            elif parser.ruleNames[child.getRuleIndex()] == 'statement':
                tac.emit('label :','', '', l2)
                self.visit(child)
                tac.emit('goto','', '', l1)
        tac.emit('label :','', '', l3)
        tac.backpatch(self.BreakList[-1],l3)
        tac.backpatch(self.ContinueList[-1],l1)
        self.BreakList.pop()
        self.ContinueList.pop()
        self.level-=1
        # print("Decreasing scope from :"+str(ST.scope))
        ST.dec_scope()
        # print("Decreased scope to :"+str(ST.scope))
        self.blockFlag=1
        return 1


    def visitBasicForStatement(self, ctx:Java8Parser.BasicForStatementContext):
        # basicForStatement  :  'for' '(' forInit? ';' expression? ';' forUpdate? ')' statement
		# 		;
        self.level+=1
        # print("Increasing scope from :"+str(ST.scope))
        ST.inc_scope_minor()
        # print("Increased scope to :"+str(ST.scope))
        self.blockFlag=0
        children = ctx.getChildren()
        l1 = tac.newLabel()
        l2 = tac.newLabel()
        l3 = tac.newLabel()
        l4 = tac.newLabel()
        l5 = tac.newLabel()
        self.BreakList.append([])
        self.ContinueList.append([])
        for child in children:
            if _isIdentifier_(child):
                continue
            elif parser.ruleNames[child.getRuleIndex()] == 'forInit':
                self.visit(child)
            elif parser.ruleNames[child.getRuleIndex()] == 'expression':
                tac.emit('label :','', '', l1)
                self.visit(child)
                tac.backpatch(self.expressionTL,l4)
                tac.backpatch(self.expressionFL,l5)
            elif parser.ruleNames[child.getRuleIndex()] == 'forUpdate':
                tac.emit('label :','', '', l2)
                self.visit(child)
                tac.emit('goto','', '', l1)
            elif parser.ruleNames[child.getRuleIndex()] == 'statement':
                tac.emit('label :','', '', l4)
                self.visit(child)
                tac.emit('goto','', '', l2)
                tac.emit('label :','', '', l5)
        tac.backpatch(self.BreakList[-1],l5)
        tac.backpatch(self.ContinueList[-1],l2)
        self.BreakList.pop()
        self.ContinueList.pop()
        self.level-=1
        # print("Decreasing scope from :"+str(ST.scope))
        ST.dec_scope()
        # print("Decreased scope to :"+str(ST.scope))
        self.blockFlag=1
        return 1

    def visitBasicForStatementNoShortIf(self, ctx:Java8Parser.BasicForStatementNoShortIfContext):
        # basicForStatementNoShortIf  :  'for' '(' forInit? ';' expression? ';' forUpdate? ')' statementNoShortIf
		# 		;
        self.level+=1
        # print("Increasing scope from :"+str(ST.scope))
        ST.inc_scope_minor()
        # print("Increased scope to :"+str(ST.scope))
        self.blockFlag=0
        children = ctx.getChildren()
        l1 = tac.newLabel()
        l2 = tac.newLabel()
        l3 = tac.newLabel()
        l4 = tac.newLabel()
        l5 = tac.newLabel()
        self.BreakList.append([])
        self.ContinueList.append([])
        for child in children:
            if _isIdentifier_(child):
                continue
            elif parser.ruleNames[child.getRuleIndex()] == 'forInit':
                self.visit(child)
            elif parser.ruleNames[child.getRuleIndex()] == 'expression':
                tac.emit('label :','', '', l1)
                self.visit(child)
                tac.backpatch(self.expressionTL,l4)
                tac.backpatch(self.expressionFL,l5)
            elif parser.ruleNames[child.getRuleIndex()] == 'forUpdate':
                tac.emit('label :','', '', l2)
                self.visit(child)
                tac.emit('goto','', '', l1)
            elif parser.ruleNames[child.getRuleIndex()] == 'statementNoShortIf':
                tac.emit('label :','', '', l4)
                self.visit(child)
                tac.emit('goto','', '', l2)
                tac.emit('label :','', '', l5)
        tac.backpatch(self.BreakList[-1],l5)
        tac.backpatch(self.ContinueList[-1],l2)
        self.BreakList.pop()
        self.ContinueList.pop()
        self.level-=1
        # print("Decreasing scope from :"+str(ST.scope))
        ST.dec_scope()
        # print("Decreased scope to :"+str(ST.scope))
        self.blockFlag=1
        return 1

    def visitIfThenStatement(self, ctx:Java8Parser.IfThenStatementContext):
        # ifThenStatement  :  'if' '(' expression ')' statement 
        #            ;
        self.level+=1
        # print("Increasing scope from :"+str(ST.scope))
        ST.inc_scope_minor()
        # print("Increased scope to :"+str(ST.scope))
        self.blockFlag=0
        # self.visitChildren(ctx)
        children = ctx.getChildren()
        l1 = tac.newLabel()
        l2 = tac.newLabel()
        for child in children:
            if _isIdentifier_(child):
                continue
            elif parser.ruleNames[child.getRuleIndex()] == 'expression':
                self.visit(child)
                tac.backpatch(self.expressionTL,l1)
                tac.backpatch(self.expressionFL,l2)
            elif parser.ruleNames[child.getRuleIndex()] == 'statement':
                tac.emit('label :','', '', l1)
                self.visit(child)
                tac.emit('label :','', '', l2)
        self.level-=1
        # print("Decreasing scope from :"+str(ST.scope))
        ST.dec_scope()
        # print("Decreased scope to :"+str(ST.scope))
        self.blockFlag=1
        return 1

    def visitIfThenElseStatement(self, ctx:Java8Parser.IfThenElseStatementContext):
        # ifThenElseStatement  :  'if' '(' expression ')' statementNoShortIf 'else' statement
		# 			 ;
        self.level+=1
        # print("Increasing scope from :"+str(ST.scope))
        ST.inc_scope_minor()
        # print("Increased scope to :"+str(ST.scope))
        self.blockFlag=0
        children = ctx.getChildren()
        l1 = tac.newLabel()
        l2 = tac.newLabel()
        l3 = tac.newLabel()
        for child in children:
            if _isIdentifier_(child):
                continue
            elif parser.ruleNames[child.getRuleIndex()] == 'expression':
                self.visit(child)
                tac.backpatch(self.expressionTL,l1)
                tac.backpatch(self.expressionFL,l3)
            elif parser.ruleNames[child.getRuleIndex()] == 'statementNoShortIf':
                tac.emit('label :','','',l1)
                self.visit(child)
            elif parser.ruleNames[child.getRuleIndex()] == 'statement':
                tac.emit('goto','','',l2)
                tac.emit('label :','', '', l3)
                self.visit(child)
                tac.emit('label :','', '', l2)
        self.level-=1
        # print("Decreasing scope from :"+str(ST.scope))
        ST.dec_scope()
        # print("Decreased scope to :"+str(ST.scope))
        self.blockFlag=1
        return 1

    def visitIfThenElseStatementNoShortIf(self, ctx:Java8Parser.IfThenElseStatementNoShortIfContext):
        # ifThenElseStatementNoShortIf  :  'if' '(' expression ')' statementNoShortIf 'else' statementNoShortIf 
		# 			 ;
        self.level+=1
        # print("Increasing scope from :"+str(ST.scope))
        ST.inc_scope_minor()
        # print("Increased scope to :"+str(ST.scope))
        self.blockFlag=0
        children = ctx.getChildren()
        l1 = tac.newLabel()
        l2 = tac.newLabel()
        l3 = tac.newLabel()
        firstVisit = 0
        for child in children:
            if _isIdentifier_(child):
                continue
            elif parser.ruleNames[child.getRuleIndex()] == 'expression':
                self.visit(child)
                tac.backpatch(self.expressionTL,l1)
                tac.backpatch(self.expressionFL,l3)
            elif parser.ruleNames[child.getRuleIndex()] == 'statementNoShortIf' and firstVisit  == 0:
                tac.emit('label :','','',l1)
                self.visit(child)
                firstVisit = 1
            elif parser.ruleNames[child.getRuleIndex()] == 'statementNoShortIf' and firstVisit == 1:
                tac.emit('goto','','',l2)
                tac.emit('label :','', '', l3)
                self.visit(child)
                tac.emit('label :','', '', l2)
        self.level-=1
        # print("Decreasing scope from :"+str(ST.scope))
        ST.dec_scope()
        # print("Decreased scope to :"+str(ST.scope))
        self.blockFlag=1
        return 1

    def visitSwitchStatement(self, ctx:Java8Parser.SwitchStatementContext):
        # switchStatement  :  'switch' '(' expression ')' switchBlock
        #                    ;
        self.level+=1
        # print("Increasing scope from :"+str(ST.scope))
        ST.inc_scope_minor()
        # print("Increased scope to :"+str(ST.scope))
        self.blockFlag=0
        # self.visitChildren(ctx)
        children = ctx.getChildren()
        childCount = ctx.getChildCount()
        self.ConstExpression = None
        self.exitLabel = tac.newLabel()
        exitLabel = self.exitLabel
        self.BreakList.append([])
        for child in children:
            if _isIdentifier_(child):
                pass
            elif parser.ruleNames[child.getRuleIndex()] == 'expression':
                self.visit(child)
                self.ConstExpression = self.expression
            elif parser.ruleNames[child.getRuleIndex()] == 'switchBlock':
                self.visit(child)
        tac.emit('label','','',exitLabel)
        tac.backpatch(self.BreakList[-1],exitLabel)
        self.level-=1
        # print("Decreasing scope from :"+str(ST.scope))
        ST.dec_scope()
        # print("Decreased scope to :"+str(ST.scope))
        self.blockFlag=1
        return 1

    def visitSwitchBlock(self, ctx:Java8Parser.SwitchBlockContext):
        # switchBlock  :  '{' switchBlockStatementGroup* switchLabel* '}'
        children = ctx.getChildren()
        counter = 0
        self.NextLabel = None
        for child in children:
            counter += 1
            if _isIdentifier_(child):
                pass
            elif parser.ruleNames[child.getRuleIndex()] == 'switchBlockStatementGroup':
                nextLabel = tac.newLabel()
                self.NextLabel = nextLabel
                exitLabel = self.exitLabel
                constExpr = self.ConstExpression
                self.visit(child)
                self.NextLabel = nextLabel
                self.exitLabel = exitLabel
                self.ConstExpression = constExpr
                # tac.emit('goto','','',exitLabel)
                tac.emit('label:','','',nextLabel)
        return 1

    def visitSwitchBlockStatementGroup(self, ctx:Java8Parser.SwitchBlockStatementGroupContext):
        # switchBlockStatementGroup  :  switchLabels blockStatements
		# 				   ;
        children = ctx.getChildren()
        for child in children:
            if parser.ruleNames[child.getRuleIndex()] == 'switchLabels':
                self.visit(child)
            elif parser.ruleNames[child.getRuleIndex()] == 'blockStatements':
                self.visit(child)
        return 1

    def visitSwitchLabels(self, ctx:Java8Parser.SwitchLabelsContext):
        # switchLabels  :  switchLabel switchLabel*
		# 	  ;
        children = ctx.getChildren()
        for child in children:
            if _isIdentifier_(child):
                pass
            elif parser.ruleNames[child.getRuleIndex()] == 'switchLabel':
                self.visit(child)
        return 1

    def visitSwitchLabel(self, ctx:Java8Parser.SwitchLabelContext):
        # switchLabel  :  'case' constantExpression ':'
		# 	 |  'case' enumconstantName ':'
		# 	 |  'default' ':'
		# 	 ;
        children = ctx.getChildren()
        emitTACflag = 0
        exprVal = None
        for child in children:
            if _isIdentifier_(child):
                if child.getText() == 'case':
                    emitTACflag = 1
                elif child.getText == 'default':
                    emit.emitTACflag = 0
                else:
                    continue
            elif parser.ruleNames[child.getRuleIndex()] == 'constantExpression':
                self.visit(child)
                exprVal = self.constantExpression
                consExprType = self.constantExpressionType # not checking it for now
            elif parser.ruleNames[child.getRuleIndex()] == 'enumconstantName':
                self.visit(child)
                exprVal = child.getText()
        if not emitTACflag == 0:
            dest = tac.getTemp()
            tac.emit(dest,exprVal,self.ConstExpression,'==')
            tac.emit('ifgoto',dest,'eq0',self.NextLabel)
        return 1

    def visitConstantExpression(self, ctx:Java8Parser.ConstantExpressionContext):
        self.visitChildren(ctx)
        self.constantExpression = self.expression
        self.constantExpressionType = self.expressionType
        return 1

    def visitLocalVariableDeclaration(self, ctx:Java8Parser.LocalVariableDeclarationContext):
        self.typeList=[]
        self.typeSizeList=[]
        self.type=""
        self.variableModifier=[]
        self.dimsNo = 0
        self.visitChildren(ctx)
        # print("Adding entry to Symbol Table: "+str(str(self.type)+" "+str(self.typeList)+" "+str(self.level)+" "+str(ST.scope)))
        for i in range(len(self.typeList)):
            ST.Add('variables',str(self.typeList[i]),str(self.typeSizeList[i]),self.type,self.variableModifier)
        return 1
        
    def visitFieldDeclaration(self, ctx:Java8Parser.FieldDeclarationContext):
        self.typeList=[]
        self.typeSizeList=[]
        self.type=""
        self.fieldModifier=[]
        self.dimsNo = 0
        self.visitChildren(ctx)
        # print("Adding entry to Symbol Table: "+str(str(self.type)+" "+str(self.typeList)+" "+str(self.level)+" "+str(ST.scope)))
        for i in range(len(self.typeList)):
            ST.Add('variables',str(self.typeList[i]),str(self.typeSizeList[i]),self.type,self.fieldModifier)
        return 1

    def visitFieldModifier(self, ctx:Java8Parser.FieldModifierContext):
        self.fieldModifier.append(ctx.getText())
        return self.visitChildren(ctx)

    def visitVariableModifier(self, ctx:Java8Parser.VariableModifierContext):
        self.variableModifier.append(ctx.getText())
        if self.inFormalList == 1:
            self.formalModifier.append(ctx.getText())
        return self.visitChildren(ctx)

    def visitUnannType(self, ctx:Java8Parser.UnannTypeContext):
        children = ctx.getChildren()
        for child in children:
            if parser.ruleNames[child.getRuleIndex()] == 'unannReferenceType':
                self.visit(child)
                self.unannType = self.unannReferenceType
            elif parser.ruleNames[child.getRuleIndex()] == 'unannPrimitiveType':
                self.visit(child)
                self.unannType = self.unannPrimitiveType
        self.type = self.unannType
        if self.inFormalList == 1:
            self.formalType.append(self.type)
        self.dimensionTemp = self.dimsNo
        return 1

    def visitUnannPrimitiveType(self, ctx:Java8Parser.UnannPrimitiveTypeContext):
        self.unannPrimitiveType = ctx.getText()
        return self.visitChildren(ctx)

    def visitUnannReferenceType(self, ctx:Java8Parser.UnannReferenceTypeContext):
        # unannReferenceType  :  unannclassOrInterfaceType
		# 			|  unannTypeVariable
		# 			|  unannArrayType
		# 			;
        children = ctx.getChildren()
        for child in children:
            if parser.ruleNames[child.getRuleIndex()] == 'unannArrayType':
                self.visit(child)
                self.unannReferenceType = self.unannArrayType
            else:
                self.visit(child)
                self.unannReferenceType = child.getText()
        return 1

    def visitUnannArrayType(self, ctx:Java8Parser.UnannArrayTypeContext):
        # unannArrayType  :  unannPrimitiveType dims
		#    |  unannclassOrInterfaceType dims
		#    |  unannTypeVariable dims
		#    ;
        children = ctx.getChildren()
        for child in children:
            if parser.ruleNames[child.getRuleIndex()] == 'unannPrimitiveType':
                self.visit(child)
                self.unannArrayType = child.getText()
            elif parser.ruleNames[child.getRuleIndex()] == 'unannclassOrInterfaceType':
                self.visit(child)
                self.unannArrayType = child.getText()
            elif parser.ruleNames[child.getRuleIndex()] == 'unannTypeVariable':
                self.visit(child)
                self.unannArrayType = child.getText()
            elif parser.ruleNames[child.getRuleIndex()] == 'dims':
                self.visit(child)
        return 1

    def visitDims(self, ctx:Java8Parser.DimsContext):
        # self.dimsNo = self.dimsNo + ctx.getChildCount() // 2
        children = ctx.getChildren()
        for child in children:
            if _isIdentifier_(child):
                if child.getText() == '[':
                    self.dimsNo = self.dimsNo + 1
            else:
                self.visit(child)
        return 1

    def visitVariableDeclarator(self, ctx:Java8Parser.VariableDeclaratorContext):
        children = ctx.getChildren()
        lhs = ""
        rhs = ""
        dest = None
        operator = '='
        for child in children:
            if _isIdentifier_(child):
                continue
            elif parser.ruleNames[child.getRuleIndex()] == 'variableDeclaratorId':
                self.visit(child)
                lhs = child.getText()
                dest =lhs
                lhsType = self.type 
            elif parser.ruleNames[child.getRuleIndex()] == 'variableInitializer':
                self.visit(child)
                rhsType = self.variableInitializerType
                rhs = self.variableInitializer
                if not lhsType == rhsType :
                    # Coercion limited to widening rule Page 389 Aho.
                    if ((lhsType == 'short' or lhsType == 'byte') and (rhsType == 'char')):
                        sys.exit("Type widening not possible in Declaration. lhsType = "+lhsType+" , rhsType = "+rhsType)
                    tac.emit(str(rhs),str(rhs),'',"("+str(lhsType)+")")
                else:
                    pass
                tac.emit(str(dest),str(rhs),'',str(operator))
                #to be replaced by tac.emit for load and store.
        return 1

    def visitVariableDeclaratorId(self, ctx:Java8Parser.VariableDeclaratorIdContext):
        children = ctx.getChildren()
        temp = self.dimsNo
        children = ctx.getChildren()
        for child in children:
            if _isIdentifier_(child):
                self.typeList.append(child.getText())
                if self.inFormalList == 1:
                    self.formalTypeList.append(child.getText())
                continue
            elif parser.ruleNames[child.getRuleIndex()] == 'dims':
                self.visit(child)
        self.typeSizeList.append(self.dimsNo)
        if self.inFormalList == 1:
            self.formalTypeSizeList.append(self.dimsNo)
        self.dimsNo = temp
        return 1

    def visitVariableInitializer(self, ctx:Java8Parser.VariableInitializerContext):
        children = ctx.getChildren()
        #currently arraycreation is given text.
        for child in children:
            self.visit(child)
        if parser.ruleNames[child.getRuleIndex()] == 'expression':
            self.variableInitializer = self.expression
            self.variableInitializerType = self.expressionType
        else:
            self.variableInitializer = ctx.getText()
            self.variableInitializerType = 'int:arraycreation' #Hardcoded..needed to be stored in self.arraycreationType
        return 1

    def visitExpression(self, ctx:Java8Parser.ExpressionContext):
        # expression : lambdaExpression
		#    | assignmentExpression
		#    ;
        children = ctx.getChildren()
        for child in children:
            if parser.ruleNames[child.getRuleIndex()] == 'assignmentExpression':
                #Assignment Expression
                self.ExpressionClass=0
                self.visit(child)
                self.expression = self.assignmentExpression
                self.expressionTL = self.assignmentExpressionTL
                self.expressionFL = self.assignmentExpressionFL
                self.expressionType = self.assignmentExpressionType
            else:
                #Lambda Expression
                self.ExpressionClass=1
                self.visit(child)
                self.expression = "Lambda Expression."
                self.expressionTL = []
                self.expressionFL = []
                self.expressionType = 'Lamda'
        self.ExpressionClass=None
        return 1

    def visitLambdaParameters(self, ctx:Java8Parser.LambdaParametersContext):
        # ST.inc_scope_minor()
        return self.visitChildren(ctx)

    def visitLambdaBody(self, ctx:Java8Parser.LambdaBodyContext):
        self.visitChildren(ctx)
        # ST.dec_scope()
        return 1

    def visitAssignmentExpression(self, ctx:Java8Parser.AssignmentExpressionContext):
        # assignmentExpression  :  conditionalExpression
		# 			  |  assignment
		# 			  ;
        children = ctx.getChildren()
        for child in  children:
            self.visit(child)
            if parser.ruleNames[child.getRuleIndex()] == 'conditionalExpression':
                self.assignmentExpression = self.conditionExpression
                self.assignmentExpressionTL = self.conditionExpressionTL
                self.assignmentExpressionFL = self.conditionExpressionFL
                self.assignmentExpressionType = self.conditionExpressionType
            elif parser.ruleNames[child.getRuleIndex()] == 'assignment':
                self.assignmentExpression = self.assignment
                self.assignmentExpressionTL = self.assignmentTL
                self.assignmentExpressionFL = self.assignmentFL
                self.assignmentExpressionType = self.assignmentType
        return 1

    def visitAssignment(self, ctx:Java8Parser.AssignmentContext):
        # assignment  :  leftHandSide assignmentOperator expression
		#     ;
        children = ctx.getChildren()
        lhs = ""
        rhs = ""
        operator = None
        dest = None
        for child in children:
            self.visit(child)
            if parser.ruleNames[child.getRuleIndex()] == 'leftHandSide':
                lhs=self.LeftHandSide
                lhsType = self.LeftHandSideType
            if parser.ruleNames[child.getRuleIndex()] == 'assignmentOperator':
                operator = child.getText()
            if parser.ruleNames[child.getRuleIndex()] == 'expression':
                rhs = self.expression
                rhsType = self.expressionType
        if not lhsType == rhsType :
            # Coercion limited to widening rule Page 389 Aho.
            if ((lhsType == 'short' or lhsType == 'byte') and (rhsType == 'char')) or ((rhsType == 'short' or rhsType == 'byte') and (lhsType == 'char')):
                sys.exit("Type widening not possible in assignment. lhsType = "+lhsType+" , rhsType = "+rhsType)
            tac.emit(str(rhs),str(rhs),'',"("+str(lhsType)+")")
        if operator == '=':
            dest = lhs
            tac.emit(str(dest),str(rhs),'',str(operator))
        else:
            operatorBeforeEqual = operator[:-1]
            dest = lhs
            tac.emit(str(dest),str(lhs),str(rhs),str(operatorBeforeEqual))
        self.assignment = dest
        self.assignmentTL =[]
        self.assignmentFL = []
        self.assignmentType = 'void'
        return 1

    def visitLeftHandSide(self, ctx:Java8Parser.LeftHandSideContext):
        # leftHandSide  :  expressionName
		# 	  |  fieldAccess
		# 	  |  arrayAccess
		# 	  ;
        children = ctx.getChildren()
        for child in children:
            if parser.ruleNames[child.getRuleIndex()] == 'expressionName':
                self.visit(child)
                self.LeftHandSide = self.expressionName
                self.LeftHandSideType = self.expressionNameType
            elif parser.ruleNames[child.getRuleIndex()] == 'arrayAccess':
                self.visit(child)
                self.LeftHandSide = child.getText() # need to be replaced by self.arrayAccess
                self.leftHandSideType = 'int' #HARDCODED.
            elif parser.ruleNames[child.getRuleIndex()] == 'fieldAccess':
                self.visit(child)
                self.LeftHandSide = child.getText() # need to be replaced by self.fieldAccess
                self.leftHandSideType = 'int' #HARDCODED.
        return 1

    def visitExpressionName(self, ctx:Java8Parser.ExpressionNameContext):
        # expressionName  :  Identifier
		# 		|  ambiguousName '.' Identifier
		# 		;
        children = ctx.getChildren()
        for child in children:
            if _isIdentifier_(child):
                self.expressionName = ctx.getText()
                self.expressionNameType = ST.getType('variables',child.getText())
                continue
            elif parser.ruleNames[child.getRuleIndex()] == 'ambiguousName':
                # to be updated for object access.
                self.visit(child)
                self.expressionName = child.getText
                self.expressionNameType = ST.getType('variables',child.getText())

        return 1

    def visitConditionalExpression(self, ctx:Java8Parser.ConditionalExpressionContext):
        # conditionalExpression : conditionalOrExpression
		# 			  | conditionalOrExpression '?' expression ':' conditionalExpression
		# 			  | conditionalOrExpression '?' expression ':' lambdaExpression
		# 			  ;
        children = ctx.getChildren()
        childCount = ctx.getChildCount()
        if childCount == 1:
            for child in children:
                self.visit(child)
            self.conditionExpression = self.conditionalOrExpression
            self.conditionExpressionTL = self.conditionalOrExpressionTL
            self.conditionExpressionFL =  self.conditionalOrExpressionFL
            self.conditionExpressionType = self.conditionalOrExpressionType
        elif childCount == 5:
            #for now in this case there's no tac for ternary jump or labels.
            ifTruetype = 'void'
            ifFalseType = 'void'
            label1 = tac.newLabel()
            label2 = tac.newLabel()
            label3 = tac.newLabel()
            predicateType = "void"
            for child in children:
                if _isIdentifier_(child):
                    continue
                elif parser.ruleNames[child.getRuleIndex()] == 'conditionalOrExpression':
                    self.visit(child)
                    predicateType = self.conditionalOrExpressionType
                    tac.backpatch(self.conditionalOrExpressionTL,label1)
                    tac.backpatch(self.conditionalOrExpressionFL,label2)
                elif parser.ruleNames[child.getRuleIndex()] == 'expression':
                    tac.emit('label: ','','',label1)
                    self.visit(child)
                    tac.emit('goto','','',label3)
                    self.conditionExpression = self.expression
                    ifTruetype = self.expressionType
                elif parser.ruleNames[child.getRuleIndex()] == 'conditionalExpression':
                    tac.emit('label: ','','',label2)
                    self.visit(child)
                    ifFalseType = self.conditionExpressionType
                    tac.emit('label: ','','',label3)
            if predicateType in ['int','float','boolean'] and ifTruetype == ifFalseType:
                self.conditionExpressionType = ifTruetype
            elif predicateType in ['int','float','boolean']:
                print("ifTrueType : "+str(ifTruetype)+" ifFalseType : "+str(ifFalseType))
                sys.exit("ifTrue and ifFalse type of ternary operator are different.")
            else:
                print("Type Error : Predicate Must Be A Boolean")
                sys.exit(predicateType)
            self.conditionExpressionTL = []
            self.conditionExpressionFL = []
        return 1

    def visitConditionalOrExpression(self, ctx:Java8Parser.ConditionalOrExpressionContext):
        # conditionalOrExpression :   conditionalAndExpression
		# 				            | conditionalOrExpression '||' conditionalAndExpression
		# 				            ;
        children = ctx.getChildren()
        childCount = ctx.getChildCount()
        if childCount == 1:
            for child in children:
                self.visit(child)
            self.conditionalOrExpression = self.conditionalAndExpression
            self.conditionalOrExpressionTL = self.conditionalAndExpressionTL
            self.conditionalOrExpressionFL = self.conditionalAndExpressionFL
            self.conditionalOrExpressionType = self.conditionalAndExpressionType
        elif childCount == 3:
            lhs = ""
            rhs = ""
            operator = None
            dest = None
            label = None
            for child in children:
                if _isIdentifier_(child):
                    operator = child.getText()
                    continue
                elif parser.ruleNames[child.getRuleIndex()] == 'conditionalOrExpression':
                    self.visit(child)
                    lhs = self.conditionalOrExpression
                    lhsType = self.conditionalOrExpressionType
                elif parser.ruleNames[child.getRuleIndex()] == 'conditionalAndExpression':
                    label = tac.newLabel()
                    tac.emit('label: ','','',label)
                    self.visit(child)
                    rhs = self.conditionalAndExpression
                    rhsType = self.inclusiveOrExpressionType
            if lhsType == rhsType :
                if not ((lhsType == 'char') or (lhsType == 'string')  or (lhsType == 'int') or (lhsType == 'float')):
                    self.conditionalOrExpressionType = 'boolean'
                else:
                    sys.exit("Type error in conditionalOrExpressionType, don't accept char or string for shift.")
            elif (lhsType in ['int','float','boolean'] and rhsType in ['float','boolean']) or (rhsType in ['int','float','boolean'] and lhsType in ['float','boolean']):
                self.conditionalOrExpressionType = 'boolean'
            else:
                print("Type Error in conditionalOrExpression")
                sys.exit("LHS type: "+str(lhsType)+" ,RHS type: "+str(rhsType))
            dest = tac.getTemp()
            self.conditionalOrExpression = dest
            # Generated between a goto and lablel so skipped.
            tac.emit(str(dest),str(lhs),str(rhs),str(operator))
            tac.backpatch(self.conditionalOrExpressionFL,label)
            self.conditionalOrExpressionTL = self.conditionalOrExpressionTL + self.conditionalAndExpressionTL
            self.conditionalOrExpressionFL = self.conditionalAndExpressionFL
        return 1

    def visitConditionalAndExpression(self, ctx:Java8Parser.ConditionalAndExpressionContext):
        # conditionalAndExpression : inclusiveOrExpression
		# 				 | conditionalAndExpression '&&' inclusiveOrExpression
		# 				 ;
        children = ctx.getChildren()
        childCount = ctx.getChildCount()
        if childCount == 1:
            for child in children:
                self.visit(child)
            self.conditionalAndExpression = self.inclusiveOrExpression
            self.conditionalAndExpressionTL = self.inclusiveOrExpressionTL
            self.conditionalAndExpressionFL = self.inclusiveOrExpressionFL
            self.conditionalAndExpressionType = self.inclusiveOrExpressionType
        elif childCount == 3:
            lhs = ""
            rhs = ""
            operator = None
            dest = None
            for child in children:
                if _isIdentifier_(child):
                    operator = child.getText()
                    continue
                elif parser.ruleNames[child.getRuleIndex()] == 'conditionalAndExpression':
                    self.visit(child)
                    lhs = self.conditionalOrExpression
                    lhsType = self.conditionalAndExpressionType
                elif parser.ruleNames[child.getRuleIndex()] == 'inclusiveOrExpression':
                    label = tac.newLabel()
                    tac.emit('label: ','','',label)
                    self.visit(child)
                    rhs = self.conditionalAndExpression
                    rhsType = self.inclusiveOrExpressionType
            if lhsType == rhsType :
                if not ((lhsType == 'char') or (lhsType == 'string') or (lhsType == 'int') or (lhsType == 'float')):
                    self.conditionalAndExpressionType = 'boolean'
                else:
                    sys.exit("Type error in conditionalAndExpression, don't accept char or string for shift.")
            elif (lhsType in ['int','float','boolean'] and rhsType in ['float','boolean']) or (rhsType in ['int','float','boolean'] and lhsType in ['float','boolean']):
                self.conditionalAndExpressionType = 'boolean'
            else:
                print("Type Error in conditionalAndExpression")
                sys.exit("LHS type: "+str(lhsType)+" ,RHS type: "+str(rhsType))
            dest = tac.getTemp()
            self.conditionalAndExpression = dest
            # Generated between a goto and lablel so skipped.
            tac.emit(str(dest),str(lhs),str(rhs),str(operator))
            tac.backpatch(self.conditionalAndExpressionTL,label)
            self.conditionalAndExpressionFL = self.conditionalAndExpressionFL + self.inclusiveOrExpression
            self.conditionalAndExpressionTL = self.inclusiveOrExpressionTL
        return 1

    def visitInclusiveOrExpression(self, ctx:Java8Parser.InclusiveOrExpressionContext):
        # inclusiveOrExpression : exclusiveOrExpression
		# 			  | inclusiveOrExpression '|' exclusiveOrExpression
		# 			  ;
        children = ctx.getChildren()
        childCount = ctx.getChildCount()
        if childCount == 1:
            for child in children:
                self.visit(child)
            self.inclusiveOrExpression = self.exclusiveOrExpression
            self.inclusiveOrExpressionTL = self.exclusiveOrExpressionTL
            self.inclusiveOrExpressionFL = self.exclusiveOrExpressionFL
            self.inclusiveOrExpressionType = self.exclusiveOrExpressionType
        elif childCount == 3:
            lhs = ""
            rhs = ""
            operator = '|'
            for child in children:
                if _isIdentifier_(child):
                    continue
                elif parser.ruleNames[child.getRuleIndex()] == 'inclusiveOrExpression':
                    self.visit(child)
                    lhs = self.inclusiveOrExpression
                    lhsType = self.inclusiveOrExpressionType
                elif parser.ruleNames[child.getRuleIndex()] == 'exclusiveOrExpression':
                    self.visit(child)
                    rhs = self.exclusiveOrExpression
                    rhsType = self.exclusiveOrExpressionType
            if lhsType == rhsType :
                if not ((lhsType == 'char') or (lhsType == 'string')):
                    self.inclusiveOrExpressionType = lhsType
                else:
                    sys.exit("Type error: inclusiveOrExpression don't take string or char.")
            elif (lhsType in ['int','float'] and rhsType in ['float']) or (rhsType in ['int','float'] and lhsType in ['float']):
                if lhsType == 'int' and rhsType == 'float':
                    tac.emit(str(lhs),str(lhs),'','(float)')
                elif rhsType == 'int' and rhsType == 'float':
                    tac.emit(str(rhs),str(rhs),'','(float)')
                self.inclusiveOrExpressionType = 'float'
            else:
                print("Type Error in inclusiveOrExpression")
                sys.exit("LHS type: "+str(lhsType)+" ,RHS type: "+str(rhsType))
            dest = tac.getTemp()
            self.inclusiveOrExpression = dest
            tac.emit(str(dest),str(lhs),str(rhs),str(operator))
            self.inclusiveOrExpressionTL = []
            self.inclusiveOrExpressionFL = []
        return 1

    def visitExclusiveOrExpression(self, ctx:Java8Parser.ExclusiveOrExpressionContext):
        # exclusiveOrExpression : andExpression
		# 			  | exclusiveOrExpression '^' andExpression
		# 			  ;	  
        children = ctx.getChildren()
        childCount = ctx.getChildCount()
        if childCount == 1:
            for child in children:
                self.visit(child)
            self.exclusiveOrExpression = self.andExpression
            self.exclusiveOrExpressionTL = self.andExpressionTL
            self.exclusiveOrExpressionFL = self.andExpressionFL
            self.exclusiveOrExpressionType = self.andExpressionType
        elif childCount == 3:
            lhs = ""
            rhs = ""
            operator = '^'
            for child in children:
                if _isIdentifier_(child):
                    continue
                elif parser.ruleNames[child.getRuleIndex()] == 'exclusiveOrExpression':
                    self.visit(child)
                    lhs = self.exclusiveOrExpression
                    lhsType = self.exclusiveOrExpressionType
                elif parser.ruleNames[child.getRuleIndex()] == 'andExpression':
                    self.visit(child)
                    rhs = self.andExpression
                    rhsType = self.andExpressionType
            if lhsType == rhsType :
                if not ((lhsType == 'char') or (lhsType == 'string')):
                    self.andExpressionType = lhsType
                else:
                    sys.exit("Type error: andExpression don't take string or char.")
            elif (lhsType in ['int','float'] and rhsType in ['float']) or (rhsType in ['int','float'] and lhsType in ['float']):
                if lhsType == 'int' and rhsType == 'float':
                    tac.emit(str(lhs),str(lhs),'','(float)')
                elif rhsType == 'int' and rhsType == 'float':
                    tac.emit(str(rhs),str(rhs),'','(float)')
                self.andExpressionType = 'float'
            else:
                print("Type Error in andExpression")
                sys.exit("LHS type: "+str(lhsType)+" ,RHS type: "+str(rhsType))
            dest = tac.getTemp()
            self.exclusiveOrExpression = dest
            tac.emit(str(dest),str(lhs),str(rhs),str(operator)) 
            self.exclusiveOrExpressionTL = []
            self.exclusiveOrExpressionFL = []
        return 1

    def visitAndExpression(self, ctx:Java8Parser.AndExpressionContext):
        # andExpression : equalityExpression
		# 	  | andExpression '&' equalityExpression
		# 	  ;
        children = ctx.getChildren()
        childCount = ctx.getChildCount()
        if childCount == 1:
            for child in children:
                self.visit(child)
            self.andExpression = self.equalityExpression
            self.andExpressionTL = self.equalityExpressionTL
            self.andExpressionFL = self.equalityExpressionFL
            self.andExpressionType = self.equalityExpressionType
        elif childCount == 3:
            lhs = ""
            rhs = ""
            operator = '&'
            for child in children:
                if _isIdentifier_(child):
                    continue
                elif parser.ruleNames[child.getRuleIndex()] == 'andExpression':
                    self.visit(child)
                    lhs = self.andExpression
                    lhsType = self.andExpressionType
                elif parser.ruleNames[child.getRuleIndex()] == 'equalityExpression':
                    self.visit(child)
                    rhs = self.equalityExpression
                    rhsType = self.equalityExpression
            if lhsType == rhsType :
                if not ((lhsType == 'char') or (lhsType == 'string')):
                    self.andExpressionType = lhsType
                else:
                    sys.exit("Type error: andExpression don't take string or char.")
            elif (lhsType in ['int','float'] and rhsType in ['float']) or (rhsType in ['int','float'] and lhsType in ['float']):
                if lhsType == 'int' and rhsType == 'float':
                    tac.emit(str(lhs),str(lhs),'','(float)')
                elif rhsType == 'int' and rhsType == 'float':
                    tac.emit(str(rhs),str(rhs),'','(float)')
                self.andExpressionType = 'float'
            else:
                print("Type Error in andExpression")
                sys.exit("LHS type: "+str(lhsType)+" ,RHS type: "+str(rhsType))
            dest = tac.getTemp()
            self.andExpression = dest
            tac.emit(str(dest),str(lhs),str(rhs),str(operator)) 
            self.andExpressionTL = []
            self.andExpressionFL = []
        return 1

    def visitEqualityExpression(self, ctx:Java8Parser.EqualityExpressionContext):
        # equalityExpression : relationalExpression
		# 		   | equalityExpression '==' relationalExpression
		# 		   | equalityExpression '!=' relationalExpression
        #          ;
        children = ctx.getChildren()
        childCount = ctx.getChildCount()
        if childCount == 1:
            for child in children:
                self.visit(child)
            self.equalityExpression = self.relationalExpression
            self.equalityExpressionTL = self.relationalExpressionTL
            self.equalityExpressionFL = self.relationalExpressionFL
            self.equalityExpressionType = self.relationalExpressionType
        elif childCount == 3:
            lhs = ""
            rhs = ""
            for child in children:
                if _isIdentifier_(child):
                    operator = child.getText()
                    continue
                elif parser.ruleNames[child.getRuleIndex()] == 'equalityExpression':
                    self.visit(child)
                    lhs = self.equalityExpression
                    lhsType = self.equalityExpressionType
                elif parser.ruleNames[child.getRuleIndex()] == 'relationalExpression':
                    self.visit(child)
                    rhs = self.relationalExpression
                    rhsType = self.relationalExpressionType
            if lhsType == rhsType :
                if not ((lhsType == 'char') or (lhsType == 'string')):
                    #considered relationExpression when containing == or != return a boolean. 
                    self.equalityExpressionType = 'boolean'
                else:
                    sys.exit("Type error in relationalExpression, don't accept char or string for shift.")
            elif (lhsType in ['int','float'] and rhsType in ['float','null']) or (rhsType in ['int','float','null'] and lhsType in ['float']):
                self.equalityExpressionType = 'boolean'
            else:
                print("Type Error in relationalExpression")
                sys.exit("LHS type: "+str(lhsType)+" ,RHS type: "+str(rhsType))
            dest = tac.getTemp()
            self.equalityExpression = dest
            tac.emit(str(dest),str(lhs),str(rhs),str(operator))
            label_temp = tac.newLabel()
            self.equalityExpressionFL = [len(tac.code)]
            tac.emit('ifgoto',dest,'eq0',label_temp)
            self.equalityExpressionTL = [len(tac.code)]
            tac.emit('goto','','',label_temp)
            tac.emit('label: ','','',label_temp)
        return 1

    def visitRelationalExpression(self, ctx:Java8Parser.RelationalExpressionContext):
        # relationalExpression : shiftExpression
		# 			 | relationalExpression '<' shiftExpression
		# 			 | relationalExpression '>' shiftExpression
		# 			 | relationalExpression '<=' shiftExpression
		# 			 | relationalExpression '>=' shiftExpression
		# 			 | relationalExpression 'instanceof' referenceType
		# 			 ;
        children = ctx.getChildren()
        childCount = ctx.getChildCount()
        if childCount == 1:
            for child in children:
                self.visit(child)
            self.relationalExpression = self.shiftExpression
            self.relationalExpressionTL = self.shiftExpressionTL
            self.relationalExpressionFL = self.shiftExpressionFL
            self.relationalExpressionType = self.shiftExpressionType
        elif childCount == 3:
            lhs = ""
            rhs = ""
            noTac = 0
            for child in children:
                if _isIdentifier_(child):
                    operator = child.getText()
                    continue
                elif parser.ruleNames[child.getRuleIndex()] == 'relationalExpression':
                    self.visit(child)
                    lhs = self.relationalExpression
                    lhsType = self.relationalExpressionType
                elif parser.ruleNames[child.getRuleIndex()] == 'shiftExpression':
                    self.visit(child)
                    rhs = self.shiftExpression
                    rhsType = self.shiftExpressionType
                elif parser.ruleNames[child.getRuleIndex()] == 'referenceType':
                    self.visit(child)
                    rhs = child.getText()
                    #check for this case in symboltable for typeCheck.
                    rhsType = child.getText()
                    noTac = 1
            if lhsType == rhsType :
                if not ((lhsType == 'char') or (lhsType == 'string')):
                    self.relationalExpressionType = 'boolean'
                else:
                    sys.exit("Type error in relationalExpression, don't accept char or string for shift.")
            elif (lhsType in ['int','float'] and rhsType in ['float']) or (rhsType in ['int','float'] and lhsType in ['float']):
                self.relationalExpressionType = 'boolean'
            else:
                print("Type Error in relationalExpression")
                sys.exit("LHS type: "+str(lhsType)+" ,RHS type: "+str(rhsType))
            if noTac == 1:
                return 1
            dest = tac.getTemp()
            self.relationalExpression = dest
            tac.emit(str(dest),str(lhs),str(rhs),str(operator))
            label_temp = tac.newLabel()
            self.relationalExpressionFL = [len(tac.code)]
            tac.emit('ifgoto',dest,'eq0',label_temp)
            self.relationalExpressionTL = [len(tac.code)]
            tac.emit('goto','','',label_temp)
            tac.emit('label: ','','',label_temp)
        return 1

    def visitShiftExpression(self, ctx:Java8Parser.ShiftExpressionContext):
        # shiftExpression : additiveExpression
		# 		| shiftExpression '<<' additiveExpression
		# 		| shiftExpression '>>' additiveExpression
		# 		| shiftExpression '>>>' additiveExpression
		# 		;
        children = ctx.getChildren()
        childCount = ctx.getChildCount()
        if childCount == 1:
            for child in children:
                self.visit(child)
            self.shiftExpression = self.additiveExpression
            self.shiftExpressionTL = self.additiveExpressionTL
            self.shiftExpressionFL = self.additiveExpressionFL
            self.shiftExpressionType = self.additiveExpressionType
        elif childCount == 3:
            lhs = ""
            rhs = ""
            for child in children:
                if _isIdentifier_(child):
                    operator = child.getText()
                    # if >> then preserve sign else in case >>> dont preserve sign.
                    continue
                elif parser.ruleNames[child.getRuleIndex()] == 'shiftExpression':
                    self.visit(child)
                    lhs = self.shiftExpression
                    lhsType = self.shiftExpressionType
                elif parser.ruleNames[child.getRuleIndex()] == 'additiveExpression':
                    self.visit(child)
                    rhs = self.additiveExpression
                    rhsType = self.additiveExpressionType
            if lhsType == rhsType :
                if not ((lhsType == 'char') or (lhsType == 'string')):
                    if lhsType == 'float':
                        sys.exit("Cant use shift operator in JAVA.")
                    else:
                        self.shiftExpressionType = 'int'
                else:
                    sys.exit("Type error in shiftExpression, don't accept char or string for shift.")
            elif (lhsType in ['int','float'] and rhsType in ['float']) or (rhsType in ['int','float'] and lhsType in ['float']):
                if rhsType == 'float' or rhsType == 'float':
                    sys.exit("Cant shift by floating value. Type Error in shiftExpression.")
                self.shiftExpressionType = 'int'
            else:
                print("Type Error in shiftExpression")
                sys.exit("LHS type: "+str(lhsType)+" ,RHS type: "+str(rhsType))
            dest = tac.getTemp()
            self.shiftExpression = dest
            tac.emit(str(dest),str(lhs),str(rhs),str(operator)) 
            self.shiftExpressionTL = []
            self.shiftExpressionFL = []
        return 1

    def visitAdditiveExpression(self, ctx:Java8Parser.AdditiveExpressionContext):
        # additiveExpression : multiplicativeExpression
		# 		   | additiveExpression '+' multiplicativeExpression
		# 		   | additiveExpression '-' multiplicativeExpression
		# 		   ;
        children = ctx.getChildren()
        childCount = ctx.getChildCount()
        if childCount == 1:
            for child in children:
                self.visit(child)
            self.additiveExpression = self.multiplicativeExpression
            self.additiveExpressionTL = self.multiplicativeExpressionTL
            self.additiveExpressionFL = self.multiplicativeExpressionFL
            self.additiveExpressionType = self.multiplicativeExpressionType
        elif childCount == 3:
            lhs = ""
            rhs = ""
            for child in children:
                if _isIdentifier_(child):
                    operator = child.getText()
                    continue
                elif parser.ruleNames[child.getRuleIndex()] == 'additiveExpression':
                    self.visit(child)
                    lhs = self.additiveExpression
                    lhsType =  self.additiveExpressionType
                elif parser.ruleNames[child.getRuleIndex()] == 'multiplicativeExpression':
                    self.visit(child)
                    rhs = self.multiplicativeExpression
                    rhsType = self.multiplicativeExpressionType
            if lhsType == rhsType :
                if not ((lhsType == 'char') or (lhsType == 'string')):
                    if lhsType == 'void':
                        warnings.warn("additiveExpression type can't have void operand.")
                    self.additiveExpressionType = lhsType
                else:
                    warnings.warn("stringConcat malloc")
                    pass
                    #tac for malloc of string concatenation.
            elif (lhsType in ['int','float'] and rhsType in ['float']) or (rhsType in ['int','float'] and lhsType in ['float']):
                if lhsType == 'int' and rhsType == 'float':
                    tac.emit(str(lhs),str(lhs),'','(float)')
                elif rhsType == 'int' and rhsType == 'float':
                    tac.emit(str(rhs),str(rhs),'','(float)')
                self.additiveExpressionType = 'float'
            else:
                print("Type Error in additiveExpression")
                sys.exit("LHS type: "+str(lhsType)+" ,RHS type: "+str(rhsType))
            dest = tac.getTemp()
            self.additiveExpression = dest
            tac.emit(str(dest),str(lhs),str(rhs),str(operator)) 
            self.additiveExpressionTL = []
            self.additiveExpressionFL = []
        return 1

    def visitMultiplicativeExpression(self, ctx:Java8Parser.MultiplicativeExpressionContext):
        # multiplicativeExpression : unaryExpression
		# 				 | multiplicativeExpression '*' unaryExpression
		# 				 | multiplicativeExpression '/' unaryExpression
		# 				 | multiplicativeExpression '%' unaryExpression
		# 				 ;
        children = ctx.getChildren()
        childCount = ctx.getChildCount()
        if childCount == 1:
            for child in children:
                self.visit(child)
            self.multiplicativeExpression = self.unaryExpression
            self.multiplicativeExpressionTL = self.unaryExpressionTL
            self.multiplicativeExpressionFL = self.unaryExpressionFL
            self.multiplicativeExpressionType = self.unaryExpressionType
        elif childCount == 3:
            lhs = ""
            rhs = ""
            for child in children:
                if _isIdentifier_(child):
                    operator = child.getText()
                    continue
                elif parser.ruleNames[child.getRuleIndex()] == 'multiplicativeExpression':
                    self.visit(child)
                    lhs = self.multiplicativeExpression
                    lhsType = self.multiplicativeExpressionType
                elif parser.ruleNames[child.getRuleIndex()] == 'unaryExpression':
                    self.visit(child)
                    rhs = self.unaryExpression
                    rhsType = self.unaryExpressionType
            if lhsType == rhsType :
                if not ((lhsType == 'char') or (lhsType == 'string')):
                    if lhsType == 'void':
                        warnings.warn("multiplicativeExpression type can't have void operand.")
                    self.multiplicativeExpressionType = lhsType
                else:
                    warnings.warn("Type error: multiplicativeExpression don't take string or char.")
            elif (lhsType in ['int','float'] and rhsType in ['float']) or (rhsType in ['int','float'] and lhsType in ['float']):
                if lhsType == 'int' and rhsType == 'float':
                    tac.emit(str(lhs),str(lhs),'','(float)')
                elif rhsType == 'int' and rhsType == 'float':
                    tac.emit(str(rhs),str(rhs),'','(float)')
                self.multiplicativeExpressionType = 'float'
            else:
                print("Type Error in multiplicativeExpression")
                sys.exit("LHS type: "+str(lhsType)+" ,RHS type: "+str(rhsType))
            dest = tac.getTemp()
            self.multiplicativeExpression = dest
            tac.emit(str(dest),str(lhs),str(rhs),str(operator))
            self.multiplicativeExpressionTL = []
            self.multiplicativeExpressionFL = []
        return 1

    def visitUnaryExpression(self, ctx:Java8Parser.UnaryExpressionContext):
        # unaryExpression : preIncrementExpression
		# 		| preDecrementExpression
		# 		| '+' unaryExpression
		# 		| '-' unaryExpression
		# 		| unaryExpressionNotPlusMinus
		# 		;
        children = ctx.getChildren()
        childCount = ctx.getChildCount()
        if childCount == 1:
            for child in children:
                self.visit(child)
            if parser.ruleNames[child.getRuleIndex()] == 'preIncrementExpression':
                self.unaryExpression = self.preIncrementExpression
                self.unaryExpressionType = self.preIncrementExpressionType
            elif parser.ruleNames[child.getRuleIndex()] == 'preDecrementExpression':
                self.unaryExpression = self.preDecrementExpression
                self.unaryExpressionType = self.preDecrementExpressionType
            elif parser.ruleNames[child.getRuleIndex()] == 'unaryExpressionNotPlusMinus':
                self.unaryExpression = self.unaryExpressionNotPlusMinus
                self.unaryExpressionType = self.unaryExpressionNotPlusMinusType
        elif childCount == 2:
            lhs = ""
            rhs = ""
            operator = None
            dest = None
            for child in children:
                if _isIdentifier_(child):
                    operator = child.getText()
                    continue
                elif parser.ruleNames[child.getRuleIndex()] == 'unaryExpression':
                    self.visit(child)
                    lhs = self.unaryExpression
                    if not self.unaryExpressionType in ['int','float','boolean','null']:
                        sys.exit("Type error in unaryExpression.")
            dest = tac.getTemp()
            self.unaryExpression = dest
            tac.emit(str(dest),str(lhs),str(rhs),str(operator)) 
        self.unaryExpressionTL = []
        self.unaryExpressionFL = []
        return 1

    def visitPreIncrementExpression(self, ctx:Java8Parser.PreIncrementExpressionContext):
        # preIncrementExpression : '++' unaryExpression
		# 			   ;
        children = ctx.getChildren()
        lhs = ""
        rhs = ""
        operator = None
        dest = None
        for child in children:
            if _isIdentifier_(child):
                operator = child.getText()
                continue
            elif parser.ruleNames[child.getRuleIndex()] == 'unaryExpression':
                self.visit(child)
                lhs = self.unaryExpression
                if not self.unaryExpressionType in ['int','float','boolean','null']:
                    sys.exit("Type error in preIncrementExpression.")
                self.preIncrementExpressionType = self.unaryExpressionType
        dest = tac.getTemp()
        self.preIncrementExpression = lhs
        if operator == '++':
            operator_1 = '+'
            rhs = '1'
            tac.emit(str(dest),str(lhs),str(rhs),str(operator_1))
            operator_2 = '='
            rhs = dest
            dest = lhs
            tac.emit(str(dest),str(rhs),'',str(operator_2))
        return 1

    def visitPreDecrementExpression(self, ctx:Java8Parser.PreDecrementExpressionContext):
        # preDecrementExpression : '--' unaryExpression
		# 			   ;
        children = ctx.getChildren()
        lhs = ""
        rhs = ""
        operator = None
        dest = None
        for child in children:
            if _isIdentifier_(child):
                operator = child.getText()
                continue
            elif parser.ruleNames[child.getRuleIndex()] == 'unaryExpression':
                self.visit(child)
                lhs = self.unaryExpression
                if not self.unaryExpressionType in ['int','float','boolean','null']:
                    sys.exit("Type error in preDecrementExpression.")
                self.preDecrementExpressionType = self.unaryExpressionType
        dest = tac.getTemp()
        self.preDecrementExpression = lhs
        if operator == '--':
            operator_1 = '-'
            rhs = '1'
            tac.emit(str(dest),str(lhs),str(rhs),str(operator_1))
            operator_2 = '='
            rhs = dest
            dest = lhs
            tac.emit(str(dest),str(rhs),'',str(operator_2))
        return 1

    def visitUnaryExpressionNotPlusMinus(self, ctx:Java8Parser.UnaryExpressionNotPlusMinusContext):
        # unaryExpressionNotPlusMinus : postfixExpression
		# 					| '~' unaryExpression
		# 					| '!' unaryExpression
		# 					| castExpression
		# 					;
        children = ctx.getChildren()
        childCount = ctx.getChildCount()
        if childCount == 1:
            for child in children:
                self.visit(child)
            if parser.ruleNames[child.getRuleIndex()] == 'postfixExpression':
                self.unaryExpressionNotPlusMinus = self.postfixExpression
                self.unaryExpressionNotPlusMinusType = self.postfixExpressionType
            elif parser.ruleNames[child.getRuleIndex()] == 'castExpression':
                self.unaryExpressionNotPlusMinus = self.castExpression
                self.unaryExpressionNotPlusMinusType = self.castExpressionType
        elif childCount == 2:
            lhs = ""
            rhs = ""
            operator = None
            dest = None
            for child in children:
                if _isIdentifier_(child):
                    operator = child.getText()
                    continue
                elif parser.ruleNames[child.getRuleIndex()] == 'unaryExpression':
                    self.visit(child)
                    lhs = self.unaryExpression
                    if not self.unaryExpressionType in ['int','float','boolean','null']:
                        sys.exit("Type error in unaryExpressionNotPlusMinus.")
                    self.unaryExpressionNotPlusMinusType = self.unaryExpressionType
            dest = tac.getTemp()
            self.unaryExpressionNotPlusMinus = dest
            tac.emit(str(dest),str(lhs),str(rhs),str(operator)) 
        return 1

    def visitPostfixExpression(self, ctx:Java8Parser.PostfixExpressionContext):
        # postfixExpression : postfix_Type_1 postfix_Type_2*
        #           ;
        children = ctx.getChildren()
        lhs = ""
        rhs = ""
        operator = None
        dest = None
        for child in children:
            if parser.ruleNames[child.getRuleIndex()] == 'postfix_Type_1':
                self.visit(child)
                lhs = self.postfix_Type_1
                dest = lhs
                self.postfixExpressionType = self.postfix_Type_1Type
            elif parser.ruleNames[child.getRuleIndex()] == 'postfix_Type_2':
                # postfix_Type_2  :  pure_postfix_decrement
                #                 |  pure_postfix_increment
                #                 ;
                # pure_postfix_decrement  :  '--'
                #                         ;
                # pure_postfix_increment  :  '++'
                #                         ;
                if not self.postfixExpressionType in ['int','float','boolean','null']:
                    sys.exit("Type error in postfixExpression.")
                self.visit(child)
                operator = child.getText()
                if operator == '++':
                    operator_1='+'
                    dest = tac.getTemp()
                    rhs = '1'
                    tac.emit(str(dest),str(lhs),str(rhs),str(operator_1))
                    rhs = dest
                    dest = lhs
                    operator_2 = '='
                    tac.emit(str(dest),str(lhs),str(rhs),str(operator_2))
                elif operator == '--':
                    operator_1='-'
                    dest = tac.getTemp()
                    rhs = '1'
                    tac.emit(str(dest),str(lhs),str(rhs),str(operator_1))
                    rhs = dest
                    dest = lhs
                    operator_2 = '='
                    tac.emit(str(dest),str(lhs),str(rhs),str(operator_2))
                lhs = dest
        self.postfixExpression = dest
        return 1

    def visitPostfix_Type_1(self, ctx:Java8Parser.Postfix_Type_1Context):
        # postfix_Type_1  :  primary
		# 		|  expressionName
		# 		;
        children = ctx.getChildren()
        for child in children:
            if parser.ruleNames[child.getRuleIndex()] == 'primary':
                self.visit(child)
                self.postfix_Type_1 = self.primary
                self.postfix_Type_1Type = self.primaryType
            elif parser.ruleNames[child.getRuleIndex()] == 'expressionName':
                self.visit(child)
                self.postfix_Type_1 = self.expressionName
                self.postfix_Type_1Type = self.expressionNameType
        return 1

    def visitCastExpression(self, ctx:Java8Parser.CastExpressionContext):
        # castExpression  :  '(' primitiveType ')' unaryExpression
		# 		|  '(' referenceType additionalBound* ')' unaryExpressionNotPlusMinus
		# 		|  '(' referenceType additionalBound* ')' lambdaExpression
		# 		;
        children = ctx.getChildren()
        operator = ""
        lhs = ""
        rhs = ""
        dest = None
        for child in children:
            if _isIdentifier_(child):
                operator = operator + child.getText()
                continue
            elif parser.ruleNames[child.getRuleIndex()] == 'primitiveType':
                self.visit(child)
                operator = operator + child.getText()
                self.castExpressionType = child.getText()
            elif parser.ruleNames[child.getRuleIndex()] == 'referenceType':
                self.visit(child)
                operator = child.getText()
                #can be done for self.refrenceType.
                self.castExpressionType = child.getText()
            elif parser.ruleNames[child.getRuleIndex()] == 'additionalBound':
                self.visit(child)
                operator = operator + child.getText()
            elif parser.ruleNames[child.getRuleIndex()] == 'unaryExpressionNotPlusMinus':
                self.visit(child)
                lhs = self.unaryExpressionNotPlusMinus
                if self.unaryExpressionNotPlusMinusType == 'string':
                    sys.exit("Can't apply type case on string type unaryExpression")
            elif parser.ruleNames[child.getRuleIndex()] == 'unaryExpression':
                self.visit(child)
                lhs = self.unaryExpression
                if self.unaryExpressionType == 'string':
                    sys.exit("Can't apply type case on string type unaryExpression")
            elif parser.ruleNames[child.getRuleIndex()] == 'lambdaExpression':
                self.visit(child)
                lhs = "Lambda Expression"
        dest = tac.getTemp()
        self.castExpression = dest
        tac.emit(str(dest),str(lhs),str(rhs),str(operator))
        return 1

    def visitPrimary(self, ctx:Java8Parser.PrimaryContext):
        #if self.primary_Type_2 is simply string added to self.primary_Type_1 for now for simplicity.
        # primary : primary_Type_1 primary_Type_2*
		# ;
        children = ctx.getChildren()
        for child in children:
            if parser.ruleNames[child.getRuleIndex()] == 'primary_Type_1':
                self.visit(child)
                self.primary = self.primary_Type_1
                self.primaryType = self.primary_Type_1Type
            elif parser.ruleNames[child.getRuleIndex()] == 'primary_Type_2':
                self.visit(child)
                self.primary = self.primary + child.getText()
        return 1

    def visitPrimary_Type_1(self, ctx:Java8Parser.Primary_Type_1Context):
        # for now arraycreationExpression is just taken as string.
        # primary_Type_1  :  primaryNoNewArray_Type_1_Pr
		# 		|  arraycreationExpression
		# 		;
        children = ctx.getChildren()
        for child in children:
            if parser.ruleNames[child.getRuleIndex()] == 'primaryNoNewArray_Type_1_Pr':
                self.visit(child)
                self.primary_Type_1 = self.primaryNoNewArray_Type_1_Pr
                self.primary_Type_1Type = self.primaryNoNewArray_Type_1_PrType
            elif parser.ruleNames[child.getRuleIndex()] == 'arraycreationExpression':
                self.visit(child)
                self.primary_Type_1 = child.getText()
                # needed to be seen from Symbol Table or temp self variable.
                self.primary_Type_1Type = 'int'
        return 1

    def visitPrimaryNoNewArray_Type_1_Pr(self, ctx:Java8Parser.PrimaryNoNewArray_Type_1_PrContext):
        # primaryNoNewArray_Type_1_Pr  :  Literal
		# 		  			| classLiteral
		# 		  			| 'this'
		# 		  			| typeName '.' 'this'
		# 		  			|	'(' expression ')'
		# 		  			| classInstancecreationExpression_Type_1_Pr
		# 		  			| fieldAccess_Type_1_Pr
		# 		  			| arrayAccess_Type_1_Pr
		# 		  			| methodInvocation_Type_1_Pr
		# 		  			| methodReference_Type_1_Pr  #NOT TO BE CONSIDERED
		# 		  			;
        children = ctx.getChildren()
        flag = 0
        for child in children:
            if _isIdentifier_(child):
                if ctx.getText() == '(' or ctx.getText() == ')' or ctx.getText() == '.' or ctx.getText() == 'this':
                    if ctx.getText() == '(':
                        flag=1
                else:
                    Literal = child.getText()
                    if Literal[0] == '\'':
                        self.primaryNoNewArray_Type_1_PrType = 'char'
                    elif Literal[0] == '\"':
                        self.primaryNoNewArray_Type_1_PrType = 'string'
                    elif Literal.find('.') == 1:
                        self.primaryNoNewArray_Type_1_PrType = 'float'
                    elif Literal == "null" or Literal == 'true' or Literal == 'false':
                        if Literal == 'true' or Literal == 'false':
                            self.primaryNoNewArray_Type_1_PrType = 'boolean'
                        else:
                            self.primaryNoNewArray_Type_1_PrType = Literal
                    else:
                        self.primaryNoNewArray_Type_1_PrType = 'int'
                    dest = tac.getTemp()
                    tac.emit(str(dest),str(Literal),'','=')
                    self.primaryNoNewArray_Type_1_Pr = dest
                continue
            elif parser.ruleNames[child.getRuleIndex()] == 'methodInvocation_Type_1_Pr':
                self.visit(child)
                # Assuming for now method return type inside expression is int
                self.primaryNoNewArray_Type_1_PrType = 'int'
                self.primaryNoNewArray_Type_1_Pr = self.methodInvocation_Type_1_Pr
            elif flag == 1 and parser.ruleNames[child.getRuleIndex()] == 'expression':
                self.visit(child)
                self.primaryNoNewArray_Type_1_PrType = self.expressionType
                self.primaryNoNewArray_Type_1_Pr = self.expression
            elif parser.ruleNames[child.getRuleIndex()] == 'classLiteral':
                self.visit(child)
                self.primaryNoNewArray_Type_1_PrType = 'void'
                self.primaryNoNewArray_Type_1_Pr = child.getText()
            elif parser.ruleNames[child.getRuleIndex()] == 'typeName':
                self.visit(child)
                #assuming typeName is identifier i.e. macro
                self.primaryNoNewArray_Type_1_PrType = child.getText()
                self.primaryNoNewArray_Type_1_Pr = child.getText()
            elif parser.ruleNames[child.getRuleIndex()] == 'classInstancecreationExpression_Type_1_Pr':
                self.visit(child)
                self.primaryNoNewArray_Type_1_PrType = 'void'                
                self.primaryNoNewArray_Type_1_Pr = child.getText()
            elif parser.ruleNames[child.getRuleIndex()] == 'fieldAccess_Type_1_Pr':
                self.visit(child)
                self.primaryNoNewArray_Type_1_PrType = 'void'                
                self.primaryNoNewArray_Type_1_Pr = child.getText()
            elif parser.ruleNames[child.getRuleIndex()] == 'arrayAccess_Type_1_Pr':
                self.visit(child)
                #array type from SymbolTable or temp self. variable to be used for array type
                self.primaryNoNewArray_Type_1_PrType = 'int'                
                self.primaryNoNewArray_Type_1_Pr = child.getText()
            elif parser.ruleNames[child.getRuleIndex()] == 'methodReference_Type_1_Pr':
                self.visit(child)
                self.primaryNoNewArray_Type_1_PrType = 'int'                
                self.primaryNoNewArray_Type_1_Pr = child.getText()
        return 1

    def visitMethodInvocation_Type_1_Pr(self, ctx:Java8Parser.MethodInvocation_Type_1_PrContext):
        # methodInvocation_Type_1_Pr  :  methodName '(' argumentList? ')'
		# 		  |  typeName '.' typeArguments? Identifier '(' argumentList? ')'
		# 		  |  expressionName '.' typeArguments? Identifier '(' argumentList? ')'
		# 		  |  'super' '.' typeArguments? Identifier '(' argumentList? ')'   #NOT TO BE CONSIDERED
		# 		  |  typeName '.' 'super' '.' typeArguments? Identifier '('argumentList? ')'    #NOT TO BE CONSIDERED
		# 		  ;
        children = ctx.getChildren()
        argList = []
        argTypeList = []
        input_method = []
        method_name = ""
        argType = 'void'
        target = None
        for child in children:
            if _isIdentifier_(child):
                self.visit(child)
                continue
            elif parser.ruleNames[child.getRuleIndex()] == 'methodName':
                self.visit(child)
                method_name = child.getText()
            elif parser.ruleNames[child.getRuleIndex()] == 'argumentList':
                self.visit(child)
                argList = self.argumentList
                argTypeList = self.argumentListType
            elif parser.ruleNames[child.getRuleIndex()] == 'typeArguments':
                self.visit(child)
                argType = 'void' # to be set w.r.t. self.typeArguments
            elif parser.ruleNames[child.getRuleIndex()] == 'expressionName':
                self.visit(child)
                target = self.expressionName
                if method_name == "":
                    method_name = target
            elif parser.ruleNames[child.getRuleIndex()] == 'typeName':
                self.visit(child)
                target = child.getText() # to be set w.r.t. self.typeName
                if method_name == "":
                    method_name = target
            else:
                self.visit(child)
        if not target:
            if not ST.Search('methods',method_name):
                self.methodInvocation_Type_1_PrType = 'void'
                sys.exit(str(method_name)+' not declared in current scope.')
            else:
                self.methodInvocation_Type_1_PrType = ST.getType('methods',method_name)
            method_scope = ST.getScope('methods',method_name)
            input_method = ST.SymbolTable[method_scope]['methods'][method_name]['dimension']
            if not len(input_method) == len(argTypeList):
                sys.exit(str(method_name)+" is called with incorrect number of arguments.")
            for (x,y) in zip(input_method,argTypeList):
                if not x[:-2] == y:
                    sys.exit(str(method_name)+' not called with correct argument type. clash of '+str(x)+' , '+str(y))
        else:
            self.methodInvocation_Type_1_PrType = 'undefined'
        for x in reversed(argList):
            tac.emit('push',x,'','')
        tac.emit('call',str(method_name)+'_'+str(len(argList)),'','')
        dest = tac.getTemp()
        if not target:
            if ST.SymbolTableFunction[method_name]['type'] == 'void':
                tac.emit('pop',str(len(argList)*4),'','') # according to https://web.stanford.edu/class/archive/cs/cs143/cs143.1128/handouts/240%20TAC%20Examples.pdf
                self.methodInvocation_Type_1_Pr = 'void'
            else:
                tac.emit(dest,'_ret_','','=')
                tac.emit('pop',str(len(argList)*4),'','')
                self.methodInvocation_Type_1_Pr = dest
                # check for self.returnType (currently set to self.expressionType , expression inside func call) and self.methodInvocation_Type_1_PrType
        else:
            #case of System.out.println() in this case the number decide for offset of stack frame popped.
            tac.emit('pop',str(len(argList)*4),'','')
            self.methodInvocation_Type_1_Pr = 'void'
        return 1

    def visitMethodInvocation(self, ctx:Java8Parser.MethodInvocationContext):
        # methodInvocation  :  methodName '(' argumentList? ')'
		# 		  |  typeName '.' typeArguments? Identifier '(' argumentList? ')'
		# 		  |  expressionName '.' typeArguments? Identifier '(' argumentList? ')'
		# 		  |  primary '.' typeArguments? Identifier '(' argumentList? ')'
		# 		  |  'super' '.' typeArguments? Identifier '(' argumentList? ')'
		# 		  |  typeName '.' 'super' '.' typeArguments? Identifier '(' argumentList? ')'
		# 		  ;
        children = ctx.getChildren()
        argList = []
        argTypeList = []
        input_method = []
        method_name = ""
        argType = 'void'
        target = None
        for child in children:
            if _isIdentifier_(child):
                self.visit(child)
                continue
            elif parser.ruleNames[child.getRuleIndex()] == 'methodName':
                self.visit(child)
                method_name = child.getText()
            elif parser.ruleNames[child.getRuleIndex()] == 'argumentList':
                self.visit(child)
                argList = self.argumentList
                argTypeList = self.argumentListType
            elif parser.ruleNames[child.getRuleIndex()] == 'typeArguments':
                self.visit(child)
                argType = 'void' # to be set w.r.t. self.typeArguments
            elif parser.ruleNames[child.getRuleIndex()] == 'expressionName':
                self.visit(child)
                target = self.expressionName
                if method_name == "":
                    method_name = target
            elif parser.ruleNames[child.getRuleIndex()] == 'typeName':
                self.visit(child)
                target = child.getText() # to be set w.r.t. self.typeName
                if method_name == "":
                    method_name = target
            elif parser.ruleNames[child.getRuleIndex()] == 'primary':
                self.visit(child)
                target = child.getText()
            else:
                self.visit(child)
        if not target:
            if not ST.Search('methods',method_name):
                self.methodInvocationType = 'void'
                sys.exit(str(method_name)+' not declared in current scope.')
            else:
                self.methodInvocationType = ST.getType('methods',method_name)
            method_scope = ST.getScope('methods',method_name)
            input_method = ST.SymbolTable[method_scope]['methods'][method_name]['dimension']
            if not len(input_method) == len(argTypeList):
                sys.exit(str(method_name)+" is called with incorrect number of arguments.")
            for (x,y) in zip(input_method,argTypeList):
                if not x[:-2] == y:
                    sys.exit(str(method_name)+' not called with correct argument type. clash of '+str(x)+' , '+str(y))
        else:
            self.methodInvocationType = 'undefined'
        for x in reversed(argList):
            tac.emit('push',x,'','')
        tac.emit('call',str(method_name)+'_'+str(len(argList)),'','')
        dest = tac.getTemp()
        if not target:
            if ST.SymbolTableFunction[method_name]['type'] == 'void':
                tac.emit('pop',str(len(argList)*4),'','') # according to https://web.stanford.edu/class/archive/cs/cs143/cs143.1128/handouts/240%20TAC%20Examples.pdf
                self.methodInvocation = 'void'
            else:
                tac.emit(dest,'_ret_','','=')
                tac.emit('pop',str(len(argList)*4),'','')
                self.methodInvocation = dest
                # check for self.returnType (currently set to self.expressionType , expression inside func call) and self.methodInvocationType
        else:
            #case of System.out.println() in this case the number decide for offset of stack frame popped.
            tac.emit('pop',str(len(argList)*4),'','')
            self.methodInvocation = 'void'
        return 1

    def visitArgumentList(self, ctx:Java8Parser.ArgumentListContext):
        # argumentList  :  expression (',' expression)*
		# 	  ;
        children = ctx.getChildren()
        self.argumentList = []
        self.argumentListType = []
        for child in children:
            if _isIdentifier_(child):
                continue
            else:
                self.visit(child)
                temp = tac.getTemp()
                tac.emit(str(temp),str(self.expression),"","=")
                self.argumentList.append(temp)
                self.argumentListType.append(self.expressionType)
        return 1

    def visitReturnStatement(self, ctx:Java8Parser.ReturnStatementContext):
        children = ctx.getChildren()
        returnVal = ""
        self.returnType = "void"
        for child in children:
            if _isIdentifier_(child):
                pass
            elif parser.ruleNames[child.getRuleIndex()] == 'expression':
                self.returnType = self.expressionType
                returnVal = self.expression
        tac.emit("_ret_",returnVal,"","=")
        return 1

    def visitPostIncrementExpression(self, ctx:Java8Parser.PostIncrementExpressionContext):
        # postIncrementExpression : postfixExpression '++'
		# 				;
        children = ctx.getChildren()
        lhs = ""
        rhs = ""
        operator = '++'
        dest = None
        for child in children:
            if _isIdentifier_(child):
                continue
            elif parser.ruleNames[child.getRuleIndex()] == 'postfixExpression':
                self.visit(child)
                lhs = self.postfixExpression
                lhsType = self.postfixExpressionType
        if not lhsType in ['int','float']:
            sys.exit("Type Error in postIncrementExpression.")
        self.postIncrementExpressionType = lhsType
        dest = tac.getTemp()
        tac.emit(str(dest),str(lhs),'1','+')
        tac.emit(str(lhs),str(lhs),str(dest),'=')
        self.postIncrementExpression = lhs
        self.postIncrementExpressionTL = []
        self.postIncrementExpressionFL = []
        return 1

    def visitPostDecrementExpression(self, ctx:Java8Parser.PostDecrementExpressionContext):
        # postDecrementExpression : postfixExpression '--'
		# 				;
        children = ctx.getChildren()
        lhs = ""
        rhs = ""
        operator = '--'
        dest = None
        for child in children:
            if _isIdentifier_(child):
                self.visit(child)
                continue
            elif parser.ruleNames[child.getRuleIndex()] == 'postfixExpression':
                self.visit(child)
                lhs = self.postfixExpression
                lhsType = self.postfixExpressionType
        if not lhsType in ['int','float']:
            sys.exit("Type Error in postDecrementExpression.")
        self.postDecrementExpressionType = lhsType
        dest = tac.getTemp()
        tac.emit(str(dest),str(lhs),'1','-')
        tac.emit(str(lhs),str(lhs),str(dest),'=')
        self.postDecrementExpression = lhs
        self.postDecrementExpressionTL = []
        self.postDecrementExpressionFL = []
        return 1

    def visitBreakStatement(self, ctx:Java8Parser.BreakStatementContext):
        self.visitChildren(ctx)
        self.BreakList[-1].append(len(tac.code))
        tac.emit('goto','','','')
        return 1

    def visitContinueStatement(self, ctx:Java8Parser.ContinueStatementContext):
        self.visitChildren(ctx)
        self.ContinueList[-1].append(len(tac.code))
        tac.emit('goto','','','')
        return 1

    def showTac(self):
        print("SL.NO.            dest            op1            op2            operator")
        for i in range(len(tac.code)):
            print(str(i) + "            " + str(tac.code[i][0]) + "         " + str(tac.code[i][1]) + "             " + str(tac.code[i][2]) + "             " + str(tac.code[i][3]))

del Java8Parser