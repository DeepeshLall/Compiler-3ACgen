# Generated from Java8.g4 by ANTLR 4.5.1
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .Java8Parser import Java8Parser
    from .Java8Visitor import Java8Visitor
else:
    from Java8Parser import Java8Parser
    from Java8Visitor import Java8Visitor
import SymbolTable


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
        self.visitChildren(ctx)
        ST.Add('methods',self.MethodName,self.MethodParameter,self.MethodType,self.MethodModifier,1)
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
        return self.visitChildren(ctx)
    
    def visitFormalParameterList(self, ctx:Java8Parser.FormalParameterListContext):
        self.MethodParameter=[]
        return self.visitChildren(ctx)

    def visitFormalParameter(self, ctx:Java8Parser.FormalParameterContext):
        self.MethodParameter.append(ctx.getText())
        return self.visitChildren(ctx)

    def visitBlock(self, ctx:Java8Parser.BlockContext):
        if(self.blockFlag==1):
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
        else:
            return self.visitChildren(ctx)

    def visitWhileStatement(self, ctx:Java8Parser.WhileStatementContext):
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
        # print(ST.scope)
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
        return self.visitChildren(ctx)

    def visitUnannType(self, ctx:Java8Parser.UnannTypeContext):
        self.type=ctx.getText()
        return self.visitChildren(ctx)

    def visitVariableDeclaratorId(self, ctx:Java8Parser.VariableDeclaratorIdContext):
        self.typeList.append(ctx.getText())
        self.typeSizeList.append(ctx.getChild.__sizeof__())
        return self.visitChildren(ctx)

    def PrintSymbolTable(self):
        print(ST.SymbolTable)

del Java8Parser