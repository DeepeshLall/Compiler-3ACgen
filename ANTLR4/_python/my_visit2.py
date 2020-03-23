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

    def reinitializeSymbolTableScope(self):
        ST.func = 'start'
        ST.new_s=1
        ST.scope=1
        ST.offset = 0

    def visitNormalclassDeclaration(self, ctx:Java8Parser.NormalclassDeclarationContext):
        classid=None
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

    def visitWhileStatementNoShortIf(self, ctx:Java8Parser.WhileStatementNoShortIfContext):
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

    def visitBasicForStatement(self, ctx:Java8Parser.BasicForStatementContext):
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

    def visitBasicForStatementNoShortIf(self, ctx:Java8Parser.BasicForStatementNoShortIfContext):
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

    def visitIfThenStatement(self, ctx:Java8Parser.IfThenStatementContext):
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

    def visitIfThenElseStatement(self, ctx:Java8Parser.IfThenElseStatementContext):
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


    def visitIfThenElseStatementNoShortIf(self, ctx:Java8Parser.IfThenElseStatementNoShortIfContext):
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

    def visitSwitchStatement(self, ctx:Java8Parser.SwitchStatementContext):
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
                print(str(lhs)+"   "+str(operator)+"   "+str(rhs)+"   "+str(dest))
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
        children = ctx.getChildren()
        for child in children:
            if parser.ruleNames[child.getRuleIndex()] == 'assignmentExpression':
                #Assignment Expression
                self.ExpressionType=0
                self.visit(child)
                self.expression = self.assignmentExpression
            else:
                #Lambda Expression
                self.ExpressionType=1
                self.visit(child)
                self.expression = "Lambda Expression."
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
        children = ctx.getChildren()
        for child in  children:
            self.visit(child)
            if parser.ruleNames[child.getRuleIndex()] == 'conditionalExpression':
                self.assignmentExpression = self.conditionExpression
            elif parser.ruleNames[child.getRuleIndex()] == 'assignment':
                self.assignmentExpression = self.assignment
        return 1

    def visitAssignment(self, ctx:Java8Parser.AssignmentContext):
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
            print(str(lhs)+"   "+str(operator)+"   "+str(rhs)+"   "+str(dest))
        else:
            operatorBeforeEqual = operator[:-1]
            dest = tac.getTemp()
            print(str(lhs)+"   "+str(operatorBeforeEqual)+"   "+str(rhs)+"   "+str(dest))
            tempvar = dest
            dest = lhs
            lhs = tempvar
            rhs = dest
            print(str(lhs)+"   "+"="+"   "+str(rhs)+"   "+str(dest))
        return 1

    def visitLeftHandSide(self, ctx:Java8Parser.LeftHandSideContext):
        self.LeftHandSide = ctx.getText() # to be improved for array and field access.
        return self.visitChildren(ctx)

    def visitConditionalExpression(self, ctx:Java8Parser.ConditionalExpressionContext):
        children = ctx.getChildren()
        childCount = ctx.getChildCount()
        if childCount == 1:
            for child in children:
                self.visit(child)
            self.conditionExpression = self.conditionalOrExpression
        elif childCount == 5:

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
        return 1

    def visitConditionalOrExpression(self, ctx:Java8Parser.ConditionalOrExpressionContext):
        children = ctx.getChildren()
        childCount = ctx.getChildCount()
        if childCount == 1:
            for child in children:
                self.visit(child)
            self.conditionalOrExpression = self.conditionalAndExpression
        elif childCount == 3:
            for child in children:
                if _isIdentifier_(child):
                    continue
                elif parser.ruleNames[child.getRuleIndex()] == 'conditionalOrExpression':
                    self.visit(child)
                    # make trueList and FalseList
                    # emit tac for backpatch and shortcircuit on basis of return value of self.condiotionalOrExpression
                    # what to set self.conditionalOrExpression for head? nothing currently
                    #if to be taken as 3ac then emit a tac here and set the dest -> self.head value
                elif parser.ruleNames[child.getRuleIndex()] == 'conditionalAndExpression':
                    self.visit(child)
        return 1

    def visitConditionalAndExpression(self, ctx:Java8Parser.ConditionalAndExpressionContext):
        children = ctx.getChildren()
        childCount = ctx.getChildCount()
        if childCount == 1:
            for child in children:
                self.visit(child)
            self.conditionalAndExpression = self.inclusiveOrExpression
        elif childCount == 3:
            for child in children:
                if _isIdentifier_(child):
                    continue
                elif parser.ruleNames[child.getRuleIndex()] == 'conditionalAndExpression':
                    self.visit(child)
                    # make trueList and FalseList
                    # emit tac for backpatch and shortcircuit on basis of return value of self.conditionalAndExpression
                    # what to set self.conditionalAndExpression for head? nothing currently.
                    #if to be taken as 3ac then emit a tac here and set the dest -> self.head value
                elif parser.ruleNames[child.getRuleIndex()] == 'inclusiveOrExpression':
                    self.visit(child)
        return 1

    def visitInclusiveOrExpression(self, ctx:Java8Parser.InclusiveOrExpressionContext):
        children = ctx.getChildren()
        childCount = ctx.getChildCount()
        if childCount == 1:
            for child in children:
                self.visit(child)
            self.inclusiveOrExpression = self.exclusiveOrExpression
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
            print(str(lhs)+"   "+str(operator)+"   "+str(rhs)+"   "+str(dest))
        return 1

    def visitExclusiveOrExpression(self, ctx:Java8Parser.ExclusiveOrExpressionContext):
        children = ctx.getChildren()
        childCount = ctx.getChildCount()
        if childCount == 1:
            for child in children:
                self.visit(child)
            self.exclusiveOrExpression = self.andExpression
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
            print(str(lhs)+"   "+str(operator)+"   "+str(rhs)+"   "+str(dest)) 
        return 1

    def visitAndExpression(self, ctx:Java8Parser.AndExpressionContext):
        children = ctx.getChildren()
        childCount = ctx.getChildCount()
        if childCount == 1:
            for child in children:
                self.visit(child)
            self.andExpression = self.equalityExpression
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
            print(str(lhs)+"   "+str(operator)+"   "+str(rhs)+"   "+str(dest)) 
        return 1

    def visitEqualityExpression(self, ctx:Java8Parser.EqualityExpressionContext):
        children = ctx.getChildren()
        childCount = ctx.getChildCount()
        if childCount == 1:
            for child in children:
                self.visit(child)
            self.equalityExpression = self.relationalExpression
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
            print(str(lhs)+"   "+str(operator)+"   "+str(rhs)+"   "+str(dest)) 
        return 1

    def visitRelationalExpression(self, ctx:Java8Parser.RelationalExpressionContext):
        children = ctx.getChildren()
        childCount = ctx.getChildCount()
        if childCount == 1:
            for child in children:
                self.visit(child)
            self.relationalExpression = self.shiftExpression
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
            print(str(lhs)+"   "+str(operator)+"   "+str(rhs)+"   "+str(dest)) 
        return 1

    def visitShiftExpression(self, ctx:Java8Parser.ShiftExpressionContext):
        children = ctx.getChildren()
        childCount = ctx.getChildCount()
        if childCount == 1:
            for child in children:
                self.visit(child)
            self.shiftExpression = self.additiveExpression
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
            print(str(lhs)+"   "+str(operator)+"   "+str(rhs)+"   "+str(dest)) 
        return 1

    def visitAdditiveExpression(self, ctx:Java8Parser.AdditiveExpressionContext):
        children = ctx.getChildren()
        childCount = ctx.getChildCount()
        if childCount == 1:
            for child in children:
                self.visit(child)
            self.additiveExpression = self.multiplicativeExpression
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
            print(str(lhs)+"   "+str(operator)+"   "+str(rhs)+"   "+str(dest)) 
        return 1

    def visitMultiplicativeExpression(self, ctx:Java8Parser.MultiplicativeExpressionContext):
        children = ctx.getChildren()
        childCount = ctx.getChildCount()
        if childCount == 1:
            for child in children:
                self.visit(child)
            self.multiplicativeExpression = self.unaryExpression
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
            print(str(lhs)+"   "+str(operator)+"   "+str(rhs)+"   "+str(dest)) 
        return 1

    def visitUnaryExpression(self, ctx:Java8Parser.UnaryExpressionContext):
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
            print(str(lhs)+"   "+str(operator)+"   "+str(rhs)+"   "+str(dest)) 
        return 1

    def visitPreIncrementExpression(self, ctx:Java8Parser.PreIncrementExpressionContext):
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
        self.preIncrementExpression = dest
        print(str(lhs)+"   "+str(operator)+"   "+str(rhs)+"   "+str(dest)) 
        return 1

    def visitPreDecrementExpression(self, ctx:Java8Parser.PreDecrementExpressionContext):
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
        self.preDecrementExpression = dest
        print(str(lhs)+"   "+str(operator)+"   "+str(rhs)+"   "+str(dest)) 
        return 1

    def visitUnaryExpressionNotPlusMinus(self, ctx:Java8Parser.UnaryExpressionNotPlusMinusContext):
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
            print(str(lhs)+"   "+str(operator)+"   "+str(rhs)+"   "+str(dest)) 
        return 1

    def visitPostfixExpression(self, ctx:Java8Parser.PostfixExpressionContext):
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
                self.visit(child)
                dest = tac.getTemp()
                operator = child.getText()
                print(str(lhs)+"   "+str(operator)+"   "+str(rhs)+"   "+str(dest))
                lhs = dest
        self.postfixExpression = dest
        return 1

    def visitPostfix_Type_1(self, ctx:Java8Parser.Postfix_Type_1Context):
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
        print(str(lhs)+"   "+str(operator)+"   "+str(rhs)+"   "+str(dest))
        return 1

    #if self.primary_Type_2 is simply string added to self.primary_Type_1 for now for simplicity.
    def visitPrimary(self, ctx:Java8Parser.PrimaryContext):
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
        print(str(lhs)+"   "+str(operator)+"   "+str(rhs)+"   "+str(dest))
        return 1

    def visitArgumentList(self, ctx:Java8Parser.ArgumentListContext):
        children = ctx.getChildren()
        for child in children:
            self.visit(child)
            self.argumentList = self.expression
        return 1

del Java8Parser