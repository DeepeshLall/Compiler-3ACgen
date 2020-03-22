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
from graphviz import Digraph
from my_visit1 import ST,parser
import SymbolTable
import json

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
        self.MethodBlock=1 # If 1 then that block is not directly inside a method and to be used to increase Scope.
        self.inFormalList=0 # if 1 then we are inside Formal list.
        self.formalTypeList=[] # Each element is id in formal Declaration 
        self.formalTypeSizeList=[] # type of respective indexed id in formalTypeList[]
        self.formalType=None # type of formal Declaration
        self.formalModifier=[] # Modifier for formal decalaration
        self.dimsForArray=0 # if 1 then dims visitor are to be used for array in variableDeclaratorid visitor
        self.MethodName = None # for increasing scope by same name

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
del Java8Parser