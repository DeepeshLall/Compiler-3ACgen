import antlr4
from Java8Lexer import Java8Lexer
from Java8Parser import Java8Parser
from Java8Visitor import Java8Visitor
 
def traversal(node):
    print(type(node)," ",str(node))
    for child in node.getChildren():
    	if isinstance(child, antlr4.tree.Tree.TerminalNode):
    		pass
    	else:
        	traversal(child)

def main():
    lexer = Java8Lexer(antlr4.StdinStream())
    stream = antlr4.CommonTokenStream(lexer)
    parser = Java8Parser(stream)
    tree = parser.compilationUnit()
    traversal(tree)
 
if __name__ == '__main__':
    main()
