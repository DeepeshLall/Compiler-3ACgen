import antlr4
from Java8Lexer import Java8Lexer
from Java8Parser import Java8Parser
from Java8Visitor import Java8Visitor

LineNum=[]
Line_type=[]
Content=[]

def generateAST(ctx, verbose, indentation):
    if not verbose and ctx.getChildCount() == 1 and isinstance(ctx.getChild(0), antlr4.ParserRuleContext):
        toBeIgnored = 1
    else:
        toBeIgnored = 0
    if not toBeIgnored:
        LineNum.append(str(indentation))
        ruleName = Java8Parser.ruleNames[ctx.getRuleIndex()]
        Line_type.append(ruleName)
        Content.append(ctx.getText())
    for i in range(ctx.getChildCount()):
        child_ctx=ctx.getChild(i)
        if isinstance(child_ctx, antlr4.RuleContext):
            generateAST(child_ctx, verbose, indentation + (not toBeIgnored))

def printDot():
    printLabel()
    pos=0
    for i in range(1,len(LineNum)):
        pos= getPos(int(LineNum[i])-1,i)
        sprint=str(int(LineNum[i])-1) +str(pos)+"->"+str(LineNum[i])+str(i)
        print(sprint)

def printLabel():
    for i in range(len(LineNum)):
        strprint=str(LineNum[i])+str(i)+"[label=\""+str(Line_type[i])+"\\n "+str(Content[i])+" \"]"
        print (strprint)


def getPos(a,b):
    pos=0
    for i in range(b):
        if int(LineNum[i])==a:
            pos = i
    return pos

def main():
    lexer = Java8Lexer(antlr4.StdinStream())
    stream = antlr4.CommonTokenStream(lexer)
    parser = Java8Parser(stream)
    tree = parser.compilationUnit()
    generateAST(tree,0,0)
    print("digraph G {")
    printDot()
    print("}")
 
if __name__ == '__main__':
    main()