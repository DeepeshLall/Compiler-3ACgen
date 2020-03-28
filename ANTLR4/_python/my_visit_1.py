# Generated from Java8.g4 by ANTLR 4.5.1
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .Java8Parser import Java8Parser
    from .Java8Visitor import Java8Visitor
else:
    from Java8Parser import Java8Parser
    from Java8Visitor import Java8Visitor
import SymbolTable
import check as chk


global ST
ST = SymbolTable.SymbolTable()
# This class defines a Overriden visitor for a parse tree produced by Java8Parser.

class my_visit(Java8Visitor):
    def __init__(self):
        super().__init__()
        self.typeList=[] # Each element is id in local Declaration 
        self.typeSizeList=[]   # type of respective indexed id in typeList[]
        self.type=None # type of local Declaration
        self.variableModifier = [] # Modifier for local decalaration
        self.level=0  # level of Scope
        self.blockFlag=1 # Used for identifying normal block from if,for,while and switch block.
        self.classid=None # used of id of class in Symbol Table
        self.classModifier=None # Modifier of class
        self.classType=None # Type of class
        self.MethodModifier = [] # Modifiers in Method Declaration.
        self.MethodName = None # Method id in Symbol Table
        self.MethodParameter = [] # Method Parameters
        self.MethodType = None # Method Type
        self.fieldModifier = [] # Modifier List for Field declaration. 
        self.MethodBlock=1 # If 1 then that block is not directly inside a method and to be used to increase Scope.
        self.inFormalList=0 # if 1 then we are inside Formal list.
        self.formalTypeList=[] # Each element is id in formal Declaration 
        self.formalTypeSizeList=[] # type of respective indexed id in formalTypeList[]
        self.formalType=None # type of formal Declaration
        self.formalModifier=[] # Modifier for formal decalaration
        self.dimsForArray=0 # if 1 then dims visitor are to be used for array in variableDeclaratorid visitor
        self.varType=""
        self.dataType=""


    ##################################################################################
    ################## portion added by Srinjay starts ###############################
    ###################################################################################

    # def checkCompatiability(a,b):
    #     print(a,b)
    #     if a==b:
    #         print(a," is compatiable with ",b)
    #         return
    #     if a=="int":
    #         if b=="float":
    #             print(a," can be typecasted to ",b)
    #             return
    #         else:
    #             print("Typecasting not possible")
    #             return
    #     if a=="float":
    #         if b=="int":
    #             print("Typecasting not possible")
    #             return 
    #     if a=="char":
    #         print("Typecasting not possible")
    #         return
    #     if a=="string":
    #         if b=="char":
    #             print(a," can be typecasted to ",b)
    #             return
    #         else:
    #             print("Typecasting not possible")
    #             return
    #     if a=="boolean":
    #         print("Typecasting not possible")
    #         return
    #     if a=="null":
    #         print("Typecasting not possible")
    #         return



    def visitExpressionStatement(self, ctx:Java8Parser.ExpressionStatementContext):
        # print("In ExpressionStatement")
        self.typeList=[]
        self.typeSizeList=[]
        self.type=""
        self.variableModifier=[]
        self.classModifier=""
        print(ctx.getText(),"ExpressionStatement")
        self.visitChildren(ctx)
        return 1

    def visitAssignment(self, ctx:Java8Parser.AssignmentContext):
        print("In Assignment ")
        self.varType=""
        self.dataType=""
        self.visitChildren(ctx)
        print(ctx.getText()," : Assignment------",self.varType," : varType-----",self.dataType," : dataType-----")
        a = self.varType
        b = self.dataType
        chk.checkCompatiability(a,b)
        return 1

    def visitExpressionName(self, ctx:Java8Parser.ExpressionNameContext):
        print("In ExpressionName")
        self.typeList=[]
        self.typeSizeList=[]
        self.type=""
        self.variableModifier=[]
        print(self.classModifier,"++")
        # print(ctx.getTypedRuleContexts())
        # c = ctx.getText()
        # print(dir(ctx))
        # print(dir(self))
        # print(ctx.getType())
        self.visitChildren(ctx)
        # print(ST.SymbolTable[self.scope])
        for a in ST.SymbolTable:
            # for b in ST.SymbolTable[a]['variables']:
            if a!=0:
                print(a,"-----a-----")
                print(a['variables'],"------a->variables-------")
                for b in a['variables']:
                    if b==ctx.getText():
                        self.varType=str(a['variables'][b]['type'])
                        print(a['variables'][b]['type'],"----b----")
            # print(a)
        return 1

    def visitAssignmentOperator(self, ctx:Java8Parser.AssignmentOperatorContext):
        print("In AssignmentOperator")
        self.visitChildren(ctx)
        return 1

    def visitExpression(self, ctx:Java8Parser.ExpressionContext):
        return self.visitChildren(ctx)

    def visitPrimaryNoNewArray_Type_1_Pr(self, ctx:Java8Parser.PrimaryNoNewArray_Type_1_PrContext):
        print("In PrimaryNoNewArray_Type_1_Pr")
        self.visitChildren(ctx)
        print(ctx.getText())
        return 1

    def visitClassLiteral(self, ctx:Java8Parser.ClassLiteralContext):
        print("In classLiteral")
        print(ctx.getText())
        self.visitChildren(ctx)
        return 1

    def visitLiteral(self, ctx:Java8Parser.LiteralContext):
        print("In Literal")
        return self.visitChildren(ctx)


    def visitIntegerLiteral(self, ctx:Java8Parser.IntegerLiteralContext):
        print("In Integer Literal")
        self.dataType = "int"
        return self.visitChildren(ctx)


    def visitFloatingPointLiteral(self, ctx:Java8Parser.FloatingPointLiteralContext):
        print("In Floating Point Literal")
        self.dataType = "float"
        return self.visitChildren(ctx)


    def visitBooleanLiteral(self, ctx:Java8Parser.BooleanLiteralContext):
        print("In Boolean Literal")
        self.dataType = "boolean"
        return self.visitChildren(ctx)


    def visitCharacterLiteral(self, ctx:Java8Parser.CharacterLiteralContext):
        print("In Character Literal")
        self.dataType = "char"
        return self.visitChildren(ctx)


    def visitStringLiteral(self, ctx:Java8Parser.StringLiteralContext):
        print("In String Literal")
        self.dataType = "string"
        return self.visitChildren(ctx)


    def visitNullLiteral(self, ctx:Java8Parser.NullLiteralContext):
        print("In Null Literal")
        self.dataType = "null"
        return self.visitChildren(ctx)

    def visitIntegralType(self, ctx:Java8Parser.IntegralTypeContext):
        print("In IntegralType")
        print(ctx.getText())
        self.visitChildren(ctx)
        return 1

    ##################################################################################
    ################## portion added by Srinjay ends ###############################
    ###################################################################################

    def visitNormalclassDeclaration(self, ctx:Java8Parser.NormalclassDeclarationContext):
        self.classModifier = None
        self.classid=str(ctx.getChild(2).getText())
        self.classType=None
        self.visitChildren(ctx)
        ST.Add('classes',self.classid,None,self.classType,self.classModifier)
        return 1

    def visitClassModifier(self, ctx:Java8Parser.ClassModifierContext):
        self.classModifier = str(ctx.getText())
        self.visitChildren(ctx)
        return 1

    def visitTypeParameter(self, ctx:Java8Parser.TypeParameterContext):
        return self.visitChildren(ctx)

    def visitClassBody(self, ctx:Java8Parser.ClassBodyContext):
        self.level+=1
        # print("Increasing scope from :"+str(ST.scope))
        ST.inc_scope()
        # print("Increased scope to :"+str(ST.scope))
        self.visitChildren(ctx)
        self.level-=1
        # print("Decreasing scope from :"+str(ST.scope))
        ST.dec_scope()
        # print("Decreased scope to :"+str(ST.scope))
        return 1

    def visitMethodDeclaration(self, ctx:Java8Parser.MethodDeclarationContext):
        self.MethodModifier = []
        self.MethodName = None
        self.MethodParameter = []
        self.MethodType = None
        self.MethodBlock=0
        self.visitChildren(ctx)
        self.MethodBlock=1
        ST.Add('methods',self.MethodName,self.MethodParameter,self.MethodType,self.MethodModifier,1)
        # print("Decreasing scope from :"+str(ST.scope))
        ST.dec_scope()
        # print("Decreased scope to :"+str(ST.scope))
        return 1

    def visitMethodModifier(self, ctx:Java8Parser.MethodModifierContext):
        self.MethodModifier.append(ctx.getText())
        self.visitChildren(ctx)
        return 1

    def visitResult(self, ctx:Java8Parser.ResultContext):
        self.MethodType = ctx.getText()
        return self.visitChildren(ctx)

    def visitMethodDeclarator(self, ctx:Java8Parser.MethodDeclaratorContext):
        self.MethodName = str(ctx.getChild(0).getText())
        # print("Increasing scope from :"+str(ST.scope))
        ST.inc_scope(self.MethodName)
        # print("Increasing scope to :"+str(ST.scope))
        return self.visitChildren(ctx)
    
    def visitFormalParameterList(self, ctx:Java8Parser.FormalParameterListContext):
        self.MethodParameter=[]
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

    def visitFormalParameter(self, ctx:Java8Parser.FormalParameterContext):
        print("\nIn formal Parameters Declaration\n")
        self.MethodParameter.append(ctx.getText())
        return self.visitChildren(ctx)

    def visitBlock(self, ctx:Java8Parser.BlockContext):
        print("\nIn block\n")
        if(self.blockFlag==0 or self.MethodBlock==0):
            flagA=0
            flagB=0
            if (self.MethodBlock == 0):
                flagA=1
                self.MethodBlock = 1
            if (self.blockFlag == 0):
                flagB=1
                self.blockFlag = 1
            self.visitChildren(ctx)
            if (flagA == 1):
                self.MethodBlock=0
            if (flagB == 1):
                self.blockFlag=0
            return 1
        else:
            self.level+=1
            # print("Increasing scope from :"+str(ST.scope))
            ST.inc_scope()
            # print("Increased scope to :"+str(ST.scope))
            self.visitChildren(ctx)
            self.level-=1
            # print("Decreasing scope from :"+str(ST.scope))
            ST.dec_scope()
            # print("Decreased scope to :"+str(ST.scope))
            return 1
            

    def visitWhileStatement(self, ctx:Java8Parser.WhileStatementContext):
        print("\nIn while Declaration\n")
        self.level+=1
        # print("Increasing scope from :"+str(ST.scope))
        ST.inc_scope()
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
        print("\nIn while NSI Declaration\n")
        self.level+=1
        # print("Increasing scope from :"+str(ST.scope))
        ST.inc_scope()
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
        print("\nIn basic for Declaration\n")
        self.level+=1
        # print("Increasing scope from :"+str(ST.scope))
        ST.inc_scope()
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
        print("\nIn basic for NSI Declaration\n")
        self.level+=1
        # print("Increasing scope from :"+str(ST.scope))
        ST.inc_scope()
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
        print("\nIn if then Declaration\n")
        self.level+=1
        # print("Increasing scope from :"+str(ST.scope))
        ST.inc_scope()
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
        print("\nIn if then else Declaration\n")
        self.level+=1
        # print("Increasing scope from :"+str(ST.scope))
        ST.inc_scope()
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
        print("\nIn if then else NSI Declaration\n")
        self.level+=1
        # print("Increasing scope from :"+str(ST.scope))
        ST.inc_scope()
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
        print("\nIn switch Declaration\n")
        self.level+=1
        # print("Increasing scope from :"+str(ST.scope))
        ST.inc_scope()
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
        print("\nIn local variable Declaration")
        self.typeList=[]
        self.typeSizeList=[]
        self.type=""
        self.variableModifier=[]
        self.visitChildren(ctx)
        print(self.typeList,"--")
        # print("Adding entry to Symbol Table: "+str(str(self.type)+" "+str(self.typeList)+" "+str(self.level)+" "+str(ST.scope)))
        for i in range(len(self.typeList)):
            ST.Add('variables',str(self.typeList[i]),str(self.typeSizeList[i]),self.type,self.variableModifier)
            # print('variables',str(self.typeList[i]),str(self.typeSizeList[i]),self.type,self.variableModifier)
        return 1

    def visitFieldDeclaration(self, ctx:Java8Parser.FieldDeclarationContext):
        # print(ST.scope)
        print("\nIn field Declaration\n")
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
        print("\nIn variable declarator id")
        self.typeList.append(ctx.getText())
        self.typeSizeList.append(ctx.getChild.__sizeof__())
        if self.inFormalList == 1:
            self.formalTypeList.append(ctx.getText())
            self.formalTypeSizeList.append(ctx.getChild.__sizeof__())
        return self.visitChildren(ctx)

    def PrintSymbolTable(self):
        for x in ST.SymbolTable:
            print(x)
        print(ST.SymbolTable)
        print()
        print("+----------------------------------------------------------------+")
        print()
        print("function , variable , modifiers , type , dimension")
        for a in ST.SymbolTableFunction:
            for b in ST.SymbolTableFunction[a]['variables']:
                print(str(a) + " , " + str(b) +" , " + str(ST.SymbolTableFunction[a]['variables'][b]['modifiers']) + " , " + str(ST.SymbolTableFunction[a]['variables'][b]['type'])+" , "+str(ST.SymbolTableFunction[a]['variables'][b]['dimension']))

del Java8Parser