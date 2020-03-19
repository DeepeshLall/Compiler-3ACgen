import os
import re
import json
import antlr4
from Java8Lexer import Java8Lexer
from Java8Parser import Java8Parser
from Java8Visitor import Java8Visitor
from my_visit_1 import  my_visit
import SymbolTable

global ST
ST = SymbolTable.SymbolTable()

def myChecker(ctx):
    # print(antlr4.ParserRuleContext.getChildren(ctx))
    # print("--")
    if isinstance(ctx, antlr4.tree.Tree.TerminalNode):
        print("terminal ===>",ctx)
        return
    for child in ctx.getChildren():
        # print(child)
        myChecker(child)

def main():
    os.walk(".")
    a = open("Java8.tokens","r").read()
    b = a.split('\'')[0]
    b.split('\n')[:-1]
    rev_dict=dict()
    for i,elem in enumerate( [elem.split('=')[0] for elem in b.split('\n')[:-1]]):
        rev_dict[i+1] = elem
    json.dump(rev_dict,open("rev_dict.json","w"),indent=True)
    # lexer_1 = Java8Lexer('a')
    # stream_1 = antlr4.CommonTokenStream(lexer_1)
    # parser_1 = Java8Parser(stream_1)
    # print(lexer_1)
    lexer = Java8Lexer(antlr4.StdinStream())
    stream = antlr4.CommonTokenStream(lexer)
    parser = Java8Parser(stream)
    # print(str(Java8Parser.symbolicNames))
    # print(str(Java8Parser.literalNames))
    tree = parser.compilationUnit()
    # myChecker(tree)
    print("\n-----1-----")
    visitor = my_visit()
    print("\n")

    print("\n-----2-----")
    # print(visitor)
    visitor.visit(tree)
    print("\n")

    print("\n-----3-----")
    visitor.PrintSymbolTable()
    print("\n")
 
if __name__ == '__main__':
    main()