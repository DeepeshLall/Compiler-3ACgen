# Generated from Java8.g4 by ANTLR 4.5.1
import antlr4
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
        self.formalType=None # type of formal Declaration
        self.formalModifier=[] # Modifier for formal decalaration
       
        self.dimsForArray=0 # if 1 then dims visitor are to be used for array in variableDeclaratorid visitor
        
        self.variableInitializer = None # if set then declaration need a tac else no tac
        self.expression = None # it contains the temporary for expression before assignment.
        self.ExpressionType = None # if =1 then Lambda Expression , =0 then assignment expression.
        self.assignmentExpression = None # it contain temporary storing expression after asssignment or conditionalExpression
        self.conditionExpression = None # it contain the return temporary for expression after conditionalExpression.
        self.assignment = None # it contain the return temporary for expression after assignment.
        self.LeftHandSide = None # it contains the temporary for leftHandSide in assignment

        self.conditionalOrExpression = None # it contains the temporary for conditonalOrExpression after visiting.
        self.conditionalAndExpression = None # it contains the temporary for conditionalAndExpression after visiting.
        self.inclusiveOrExpression = None # it contains the temporary for inclusiveOrExpression after visiting.
        self.exclusiveOrExpression = None # it contains the temporary for exclusiveOrExpression after visiting.
        self.andExpression = None # it contains the temporary for andExpression after visiting.
        self.equalityExpression = None # it contains the temporary for equalityExpression after visiting.
        self.relationalExpression = None # it contains the temporary for relationalExpression after visiting.
        self.shiftExpression = None # it contains the temporary for shiftExpression after visiting.
        self.additiveExpression = None # it contains the temporary for additiveExpression after visiting.
        self.multiplicativeExpression = None # it contains the temporary for multiplicativeExpression after visiting.
        self.unaryExpression = None # it contains the temporary for unaryExpression after visiting.
        self.preIncrementExpression = None # it contains the temporary for preIncrementExpression after visiting.
        self.preDecrementExpression = None # it contains the temporary for preDecrementExpression after visiting.
        self.unaryExpressionNotPlusMinus = None # it contains the temporary for unaryExpressionNotPlusMinus after visiting.
        self.postfixExpression = None # it contains the temporary for postfixExpression after visiting.
        self.postfix_Type_1 = None # it contains the temporary for postfix_Type_1 after visiting.
        self.primary = None # it contains the temporary for primary after visiting.
        self.castExpression = None # it contains the temporary for castExpression after visiting.
        self.primary_Type_1 = None # it contains the temporary for primary_Type_1 after visiting.
        self.primaryNoNewArray_Type_1_Pr = None # it contains the temporary for primaryNoNewArray_Type_1_Pr after visiting.
        self.methodInvocation_Type_1_Pr = None # it contains the temporary for methodInvocation_Type_1_Pr after visiting.
        self.argumentList = None # it contains the temporary for argumentList after visiting.

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
        self.formalType=None
        self.formalModifier=[]
        self.visitChildren(ctx)
        for i in range(len(self.formalTypeList)):
            ST.Add('variables',str(self.formalTypeList[i]),str(self.formalTypeSizeList[i]),self.formalType,self.formalModifier)
        self.inFormalList=0
        return 1

    def visitMethodBody(self, ctx:Java8Parser.MethodBodyContext):
        self.MethodBlock=0
        self.visitChildren(ctx)
        self.MethodBlock=1
        # print("Decreasing scope from :"+str(ST.scope))
        ST.dec_scope()
        # print("Decreased scope to :"+str(ST.scope))
        return 1

    def visitFormalParameter(self, ctx:Java8Parser.FormalParameterContext):
        return self.visitChildren(ctx)

    def visitBlock(self, ctx:Java8Parser.BlockContext):
        if(self.blockFlag==0 or self.MethodBlock==0 or self.ExpressionType==1):
            flagA=0
            flagB=0
            flagC=0
            if (self.MethodBlock == 0):
                flagA=1
                self.MethodBlock = 1
            if (self.blockFlag == 0):
                flagB=1
                self.blockFlag = 1
            if (self.ExpressionType == 1):
                flagC=1
                self.ExpressionType = None
            self.visitChildren(ctx)
            if (flagA == 1):
                self.MethodBlock=0
            if (flagB == 1):
                self.blockFlag=0
            if (flagC == 1):
                self.ExpressionType=1
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
        self.visitChildren(ctx)
        self.level-=1
        # print("Decreasing scope from :"+str(ST.scope))
        ST.dec_scope()
        # print("Decreased scope to :"+str(ST.scope))
        self.blockFlag=1
        return 1

    def visitLocalVariableDeclaration(self, ctx:Java8Parser.LocalVariableDeclarationContext):
        self.typeList=[]
        self.typeSizeList=[]
        self.type=""
        self.variableModifier=[]
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
        self.type=ctx.getText()
        if self.inFormalList == 1:
            self.formalType=self.type
        return self.visitChildren(ctx)

    def visitVariableDeclaratorId(self, ctx:Java8Parser.VariableDeclaratorIdContext):
        self.typeList.append(ctx.getText())
        self.typeSizeList.append(ctx.getChild.__sizeof__())
        if self.inFormalList == 1:
            self.formalTypeList.append(ctx.getText())
            self.formalTypeSizeList.append(ctx.getChild.__sizeof__())
        return self.visitChildren(ctx)

    def PrintSymbolTable(self):
        print(ST.SymbolTable)
        print()
        print("+----------------------------------------------------------------+")
        print()
        print("function , variable , modifiers , type , dimension")
        for a in ST.SymbolTableFunction:
            for b in ST.SymbolTableFunction[a]['variables']:
                print(str(a) + " , " + str(b) +" , " + str(ST.SymbolTableFunction[a]['variables'][b]['modifiers']) + " , " + str(ST.SymbolTableFunction[a]['variables'][b]['type'])+" , "+str(ST.SymbolTableFunction[a]['variables'][b]['dimension']))
    
    def getSymbolTable(self):
        return ST.SymbolTable

    def printSymbolTableGraph(self):
        dot = Digraph(comment="Symbol Table")
        for i in range(0,len(ST.SymbolTable)):
            dot.node(str(i),json.dumps(ST.SymbolTable[i],indent=4))
            if i == 0:
                continue
            dot.edge(str(ST.SymbolTable[i]["parent"]), str(i))
        dot.render('graph',view=True)
        print()
        print("+----------------------------------------------------------------+")
        print()
        print(dot)

    def visitVariableDeclarator(self, ctx:Java8Parser.VariableDeclaratorContext):
        children = ctx.getChildren()
        lhs = None
        rhs = None
        dest = None
        operator = '='
        for child in children:
            if _isIdentifier_(child):
                continue
            elif parser.ruleNames[child.getRuleIndex()] == 'variableDeclaratorId':
                self.visit(child)
                lhs = child.getText()
                dest =lhs
            elif parser.ruleNames[child.getRuleIndex()] == 'variableInitializer':
                self.visit(child)
                rhs = self.variableInitializer
                tac.emit(str(dest),str(lhs),str(rhs),str(operator))
                #to be replaced by tac.emit for load and store.
        return 1

    def visitVariableInitializer(self, ctx:Java8Parser.VariableInitializerContext):
        children = ctx.getChildren()
        #currently arraycreation is given text.
        for child in children:
            self.visit(child)
        if parser.ruleNames[child.getRuleIndex()] == 'expression':
            self.variableInitializer = self.expression
        else:
            self.variableInitializer = ctx.getText()
        return 1

    def visitExpression(self, ctx:Java8Parser.ExpressionContext):
        # expression : lambdaExpression
		#    | assignmentExpression
		#    ;
        children = ctx.getChildren()
        for child in children:
            if parser.ruleNames[child.getRuleIndex()] == 'assignmentExpression':
                #Assignment Expression
                self.ExpressionType=0
                self.visit(child)
                self.expression = self.assignmentExpression
                self.expressionTL = self.assignmentExpressionTL
                self.expressionFL = self.assignmentExpressionFL
            else:
                #Lambda Expression
                self.ExpressionType=1
                self.visit(child)
                self.expression = "Lambda Expression."
                self.expressionTL = []
                self.expressionFL = []
        self.ExpressionType=None
        return 1

    def visitLambdaParameters(self, ctx:Java8Parser.LambdaParametersContext):
        ST.inc_scope_minor()
        return self.visitChildren(ctx)

    def visitLambdaBody(self, ctx:Java8Parser.LambdaBodyContext):
        self.visitChildren(ctx)
        ST.dec_scope()
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
            elif parser.ruleNames[child.getRuleIndex()] == 'assignment':
                self.assignmentExpression = self.assignment
                self.assignmentExpressionTL = self.assignmentTL
                self.assignmentExpressionFL = self.assignmentFL
        return 1

    def visitAssignment(self, ctx:Java8Parser.AssignmentContext):
        # assignment  :  leftHandSide assignmentOperator expression
		#     ;
        children = ctx.getChildren()
        lhs = None
        rhs = None
        operator = None
        dest = None
        for child in children:
            self.visit(child)
            if parser.ruleNames[child.getRuleIndex()] == 'leftHandSide':
                lhs=self.LeftHandSide
            if parser.ruleNames[child.getRuleIndex()] == 'assignmentOperator':
                operator = child.getText()
            if parser.ruleNames[child.getRuleIndex()] == 'expression':
                rhs = self.expression
        if operator == '=':
            dest = lhs
            tac.emit(str(dest),str(lhs),str(rhs),str(operator))
        else:
            operatorBeforeEqual = operator[:-1]
            dest = tac.getTemp()
            tac.emit(str(dest),str(lhs),str(rhs),str(operatorBeforeEqual))
            tempvar = dest
            operator_equal = '='
            dest = lhs
            rhs = tempvar
            tac.emit(str(dest),str(lhs),str(rhs),str(operator_equal))
        self.assignment = dest
        self.assignmentTL =[]
        self.assignmentFL = []
        return 1

    def visitLeftHandSide(self, ctx:Java8Parser.LeftHandSideContext):
        # leftHandSide  :  expressionName
		# 	  |  fieldAccess
		# 	  |  arrayAccess
		# 	  ;
        self.LeftHandSide = ctx.getText() # to be improved for array and field access.
        return self.visitChildren(ctx)

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
        elif childCount == 5:
            #for now in this case there's no tac for ternary jump or 
            for child in children:
                if _isIdentifier_(child):
                    continue
                elif parser.ruleNames[child.getRuleIndex()] == 'conditionalOrExpression':
                    self.visit(child)
                    # print("Setting Labels,jump and backpatching trueList and FalseList.")
                    #emit tac for this to be backpatched and backpatching visited expression true and falseList..
                elif parser.ruleNames[child.getRuleIndex()] == 'expression':
                    self.visit(child)
                    # print("Print tac for true statements "+str(child.getText()))
                    self.conditionExpression = self.expression
                elif parser.ruleNames[child.getRuleIndex()] == 'conditionalExpression':
                    self.visit(child)
                    # print("Print tac for false statements "+str(child.getText()))
                    #emit tac for below. As self.conditonExpression(temp) is to be stored in same place for self.condtionExpression of head as of self.expression.
                    # self.conditionExpression = self.conditionExpression
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
        elif childCount == 3:
            lhs = None
            rhs = None
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
                    # make trueList and FalseList
                    # emit tac for backpatch and shortcircuit on basis of return value of self.condiotionalOrExpression
                    # what to set self.conditionalOrExpression for head? nothing currently
                    #if to be taken as 3ac then emit a tac here and set the dest -> self.head value
                elif parser.ruleNames[child.getRuleIndex()] == 'conditionalAndExpression':
                    label = tac.newLabel()
                    tac.emit('label: ','','',label)
                    self.visit(child)
                    rhs = self.conditionalAndExpression
            dest = tac.getTemp()
            self.conditionalOrExpression = dest
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
        elif childCount == 3:
            lhs = None
            rhs = None
            operator = None
            dest = None
            for child in children:
                if _isIdentifier_(child):
                    operator = child.getText()
                    continue
                elif parser.ruleNames[child.getRuleIndex()] == 'conditionalAndExpression':
                    self.visit(child)
                    lhs = self.conditionalOrExpression
                    # make trueList and FalseList
                    # emit tac for backpatch and shortcircuit on basis of return value of self.conditionalAndExpression
                    # what to set self.conditionalAndExpression for head? nothing currently.
                    #if to be taken as 3ac then emit a tac here and set the dest -> self.head value
                elif parser.ruleNames[child.getRuleIndex()] == 'inclusiveOrExpression':
                    label = tac.newLabel()
                    tac.emit('label: ','','',label)
                    self.visit(child)
                    rhs = self.conditionalAndExpression
            dest = tac.getTemp()
            self.conditionalAndExpression = dest
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
        elif childCount == 3:
            lhs = None
            rhs = None
            operator = '|'
            for child in children:
                if _isIdentifier_(child):
                    continue
                elif parser.ruleNames[child.getRuleIndex()] == 'inclusiveOrExpression':
                    self.visit(child)
                    lhs = self.inclusiveOrExpression
                elif parser.ruleNames[child.getRuleIndex()] == 'exclusiveOrExpression':
                    self.visit(child)
                    rhs = self.exclusiveOrExpression
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
        elif childCount == 3:
            lhs = None
            rhs = None
            operator = '^'
            for child in children:
                if _isIdentifier_(child):
                    continue
                elif parser.ruleNames[child.getRuleIndex()] == 'exclusiveOrExpression':
                    self.visit(child)
                    lhs = self.exclusiveOrExpression
                elif parser.ruleNames[child.getRuleIndex()] == 'andExpression':
                    self.visit(child)
                    rhs = self.andExpression
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
        elif childCount == 3:
            lhs = None
            rhs = None
            operator = '&'
            for child in children:
                if _isIdentifier_(child):
                    continue
                elif parser.ruleNames[child.getRuleIndex()] == 'andExpression':
                    self.visit(child)
                    lhs = self.andExpression
                elif parser.ruleNames[child.getRuleIndex()] == 'equalityExpression':
                    self.visit(child)
                    rhs = self.equalityExpression
            dest = tac.getTemp()
            self.andExpression = dest
            tac.emit(str(dest),str(lhs),str(rhs),str(operator)) 
            self.andExpressionTL = []
            self.andExpressionFL = []
        return 1

    def visitEqualityExpression(self, ctx:Java8Parser.EqualityExpressionContext):
        # equalityExpression : relationalExpression
		# 		   | equalityExpression '==' relationalExpression
		# 		   | equalityExpression '!=' relationalExpressio
        #          ;
        children = ctx.getChildren()
        childCount = ctx.getChildCount()
        if childCount == 1:
            for child in children:
                self.visit(child)
            self.equalityExpression = self.relationalExpression
            self.equalityExpressionTL = self.relationalExpressionTL
            self.equalityExpressionFL = self.relationalExpressionFL
        elif childCount == 3:
            lhs = None
            rhs = None
            for child in children:
                if _isIdentifier_(child):
                    operator = child.getText()
                    continue
                elif parser.ruleNames[child.getRuleIndex()] == 'equalityExpression':
                    self.visit(child)
                    lhs = self.equalityExpression
                elif parser.ruleNames[child.getRuleIndex()] == 'relationalExpression':
                    self.visit(child)
                    rhs = self.relationalExpression
            dest = tac.getTemp()
            self.equalityExpression = dest
            tac.emit(str(dest),str(lhs),str(rhs),str(operator))
            self.equalityExpressionFL = [len(tac.code)]
            tac.emit('ifgoto',dest,'eq0','')
            self.equalityExpressionTL = [len(tac.code)]
            tac.emit('goto','','','')
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
        elif childCount == 3:
            lhs = None
            rhs = None
            for child in children:
                if _isIdentifier_(child):
                    operator = child.getText()
                    continue
                elif parser.ruleNames[child.getRuleIndex()] == 'relationalExpression':
                    self.visit(child)
                    lhs = self.relationalExpression
                elif parser.ruleNames[child.getRuleIndex()] == 'shiftExpression':
                    self.visit(child)
                    rhs = self.shiftExpression
                elif parser.ruleNames[child.getRuleIndex()] == 'referenceType':
                    self.visit(child)
                    rhs = self.referenceType
            dest = tac.getTemp()
            self.relationalExpression = dest
            tac.emit(str(dest),str(lhs),str(rhs),str(operator))
            self.relationalExpressionFL = [len(tac.code)]
            tac.emit('ifgoto',dest,'eq0','')
            self.relationalExpressionTL = [len(tac.code)]
            tac.emit('goto','','','')
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
        elif childCount == 3:
            lhs = None
            rhs = None
            for child in children:
                if _isIdentifier_(child):
                    operator = child.getText()
                    continue
                elif parser.ruleNames[child.getRuleIndex()] == 'shiftExpression':
                    self.visit(child)
                    lhs = self.shiftExpression
                elif parser.ruleNames[child.getRuleIndex()] == 'additiveExpression':
                    self.visit(child)
                    rhs = self.additiveExpression
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
        elif childCount == 3:
            lhs = None
            rhs = None
            for child in children:
                if _isIdentifier_(child):
                    operator = child.getText()
                    continue
                elif parser.ruleNames[child.getRuleIndex()] == 'additiveExpression':
                    self.visit(child)
                    lhs = self.additiveExpression
                elif parser.ruleNames[child.getRuleIndex()] == 'multiplicativeExpression':
                    self.visit(child)
                    rhs = self.multiplicativeExpression
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
        elif childCount == 3:
            lhs = None
            rhs = None
            for child in children:
                if _isIdentifier_(child):
                    operator = child.getText()
                    continue
                elif parser.ruleNames[child.getRuleIndex()] == 'multiplicativeExpression':
                    self.visit(child)
                    lhs = self.multiplicativeExpression
                elif parser.ruleNames[child.getRuleIndex()] == 'unaryExpression':
                    self.visit(child)
                    rhs = self.unaryExpression
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
            elif parser.ruleNames[child.getRuleIndex()] == 'preDecrementExpression':
                self.unaryExpression = self.preDecrementExpression
            elif parser.ruleNames[child.getRuleIndex()] == 'unaryExpressionNotPlusMinus':
                self.unaryExpression = self.unaryExpressionNotPlusMinus
        elif childCount == 2:
            lhs = None
            rhs = None
            operator = None
            dest = None
            for child in children:
                if _isIdentifier_(child):
                    operator = child.getText()
                    continue
                elif parser.ruleNames[child.getRuleIndex()] == 'unaryExpression':
                    self.visit(child)
                    lhs = self.unaryExpression
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
        lhs = None
        rhs = None
        operator = None
        dest = None
        for child in children:
            if _isIdentifier_(child):
                operator = child.getText()
                continue
            elif parser.ruleNames[child.getRuleIndex()] == 'unaryExpression':
                self.visit(child)
                lhs = self.unaryExpression
        dest = tac.getTemp()
        self.preIncrementExpression = lhs
        if operator == '++':
            operator_1 = '+'
            rhs = '1'
            tac.emit(str(dest),str(lhs),str(rhs),str(operator_1))
            operator_2 = '='
            rhs = dest
            dest = lhs
            tac.emit(str(dest),str(lhs),str(rhs),str(operator_2))
        return 1

    def visitPreDecrementExpression(self, ctx:Java8Parser.PreDecrementExpressionContext):
        # preDecrementExpression : '--' unaryExpression
		# 			   ;
        children = ctx.getChildren()
        lhs = None
        rhs = None
        operator = None
        dest = None
        for child in children:
            if _isIdentifier_(child):
                operator = child.getText()
                continue
            elif parser.ruleNames[child.getRuleIndex()] == 'unaryExpression':
                self.visit(child)
                lhs = self.unaryExpression
        dest = tac.getTemp()
        self.preDecrementExpression = lhs
        if operator == '--':
            operator_1 = '-'
            rhs = '1'
            tac.emit(str(dest),str(lhs),str(rhs),str(operator_1))
            operator_2 = '='
            rhs = dest
            dest = lhs
            tac.emit(str(dest),str(lhs),str(rhs),str(operator_2))
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
            elif parser.ruleNames[child.getRuleIndex()] == 'castExpression':
                self.unaryExpressionNotPlusMinus = self.castExpression
        elif childCount == 2:
            lhs = None
            rhs = None
            operator = None
            dest = None
            for child in children:
                if _isIdentifier_(child):
                    operator = child.getText()
                    continue
                elif parser.ruleNames[child.getRuleIndex()] == 'unaryExpression':
                    self.visit(child)
                    lhs = self.unaryExpression
            dest = tac.getTemp()
            self.unaryExpressionNotPlusMinus = dest
            tac.emit(str(dest),str(lhs),str(rhs),str(operator)) 
        return 1

    def visitPostfixExpression(self, ctx:Java8Parser.PostfixExpressionContext):
        # postfixExpression : postfix_Type_1 postfix_Type_2*
        #           ;
        children = ctx.getChildren()
        lhs = None
        rhs = None
        operator = None
        dest = None
        for child in children:
            if parser.ruleNames[child.getRuleIndex()] == 'postfix_Type_1':
                self.visit(child)
                lhs = self.postfix_Type_1
                dest = lhs
            elif parser.ruleNames[child.getRuleIndex()] == 'postfix_Type_2':
                # postfix_Type_2  :  pure_postfix_decrement
                #                 |  pure_postfix_increment
                #                 ;
                # pure_postfix_decrement  :  '--'
                #                         ;
                # pure_postfix_increment  :  '++'
                #                         ;
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
            elif parser.ruleNames[child.getRuleIndex()] == 'expressionName':
                self.visit(child)
                self.postfix_Type_1 = child.getText()
        return 1

    def visitCastExpression(self, ctx:Java8Parser.CastExpressionContext):
        # castExpression  :  '(' primitiveType ')' unaryExpression
		# 		|  '(' referenceType additionalBound* ')' unaryExpressionNotPlusMinus
		# 		|  '(' referenceType additionalBound* ')' lambdaExpression
		# 		;
        children = ctx.getChildren()
        operator = None
        lhs = None
        rhs = None
        dest = None
        for child in children:
            if _isIdentifier_(child):
                continue
            elif parser.ruleNames[child.getRuleIndex()] == 'primitiveType':
                self.visit(child)
                operator = child.getText()
            elif parser.ruleNames[child.getRuleIndex()] == 'referenceType':
                self.visit(child)
                operator = child.getText()
            elif parser.ruleNames[child.getRuleIndex()] == 'additionalBound':
                self.visit(child)
                operator = operator + child.getText()
            elif parser.ruleNames[child.getRuleIndex()] == 'unaryExpressionNotPlusMinus':
                self.visit(child)
                lhs = self.unaryExpressionNotPlusMinus
            elif parser.ruleNames[child.getRuleIndex()] == 'unaryExpression':
                self.visit(child)
                lhs = self.unaryExpression
            elif parser.ruleNames[child.getRuleIndex()] == 'lambdaExpression':
                self.visit(child)
                lhs = "Lambda Expression"
        dest = tac.getTemp()
        self.castExpression = dest
        tac.emit(str(dest),str(lhs),str(rhs),str(operator))
        return 1

    #if self.primary_Type_2 is simply string added to self.primary_Type_1 for now for simplicity.
    def visitPrimary(self, ctx:Java8Parser.PrimaryContext):
        # primary : primary_Type_1 primary_Type_2*
		# ;
        children = ctx.getChildren()
        for child in children:
            if parser.ruleNames[child.getRuleIndex()] == 'primary_Type_1':
                self.visit(child)
                self.primary = self.primary_Type_1
            elif parser.ruleNames[child.getRuleIndex()] == 'primary_Type_2':
                self.visit(child)
                self.primary = self.primary + child.getText()
        return 1

    # for now arraycreationExpression is just taken as string.    
    def visitPrimary_Type_1(self, ctx:Java8Parser.Primary_Type_1Context):
        # primary_Type_1  :  primaryNoNewArray_Type_1_Pr
		# 		|  arraycreationExpression
		# 		;
        children = ctx.getChildren()
        for child in children:
            if parser.ruleNames[child.getRuleIndex()] == 'primaryNoNewArray_Type_1_Pr':
                self.visit(child)
                self.primary_Type_1 = self.primaryNoNewArray_Type_1_Pr
            elif parser.ruleNames[child.getRuleIndex()] == 'arraycreationExpression':
                self.visit(child)
                self.primary_Type_1 = child.getText()
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
                if ctx.getText() == '(':
                    flag=1
                else:
                    self.primaryNoNewArray_Type_1_Pr = child.getText()
                continue
            elif parser.ruleNames[child.getRuleIndex()] == 'Literal':
                self.visit(child)
                self.primaryNoNewArray_Type_1_Pr = child.getText()
            elif parser.ruleNames[child.getRuleIndex()] == 'methodInvocation_Type_1_Pr':
                self.visit(child)
                self.primaryNoNewArray_Type_1_Pr = self.methodInvocation_Type_1_Pr
            elif flag == 1 and parser.ruleNames[child.getRuleIndex()] == 'expression':
                self.visit(child)
                self.primaryNoNewArray_Type_1_Pr = self.expression
            else:
                self.visit(child)
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
        lhs = ""
        rhs = None
        operator = ""
        dest = None
        for child in children:
            if _isIdentifier_(child):
                self.visit(child)
                operator = operator + child.getText()
                continue
            elif parser.ruleNames[child.getRuleIndex()] == 'methodName':
                self.visit(child)
                operator = operator + child.getText()
            elif parser.ruleNames[child.getRuleIndex()] == 'argumentList':
                self.visit(child)
                lhs = self.argumentList
            else:
                self.visit(child)
                operator = operator + child.getText()
        dest = tac.getTemp()
        self.methodInvocation_Type_1_Pr = dest
        tac.emit(str(dest),str(lhs),str(rhs),str(operator))
        return 1

    def visitArgumentList(self, ctx:Java8Parser.ArgumentListContext):
        # argumentList  :  expression (',' expression)*
		# 	  ;
        children = ctx.getChildren()
        for child in children:
            self.visit(child)
            self.argumentList = self.expression
        return 1

    def visitPostIncrementExpression(self, ctx:Java8Parser.PostIncrementExpressionContext):
        # postIncrementExpression : postfixExpression '++'
		# 				;
        children = ctx.getChildren()
        lhs = None
        rhs = None
        operator = '++'
        dest = None
        for child in children:
            if _isIdentifier_(child):
                continue
            elif parser.ruleNames[child.getRuleIndex()] == 'postfixExpression':
                self.visit(child)
                lhs = self.postfixExpression
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
        lhs = None
        rhs = None
        operator = '--'
        dest = None
        for child in children:
            if _isIdentifier_(child):
                self.visit(child)
                continue
            elif parser.ruleNames[child.getRuleIndex()] == 'postfixExpression':
                self.visit(child)
                lhs = self.postfixExpression
        dest = tac.getTemp()
        tac.emit(str(dest),str(lhs),'1','-')
        tac.emit(str(lhs),str(lhs),str(dest),'=')
        self.postDecrementExpression = lhs
        self.postDecrementExpressionTL = []
        self.postDecrementExpressionFL = []
        return 1

    def showTac(self):
        print("SL.NO.   dest    op1    op2    operator")
        for i in range(len(tac.code)):
            print(str(i) + "    " + str(tac.code[i][0]) + "   " + str(tac.code[i][1]) + "    " + str(tac.code[i][2]) + "    " + str(tac.code[i][3]))

del Java8Parser