# This is for double scan using my_visit1.py and my_visit2.py
import os
import re
import json
import antlr4
from Java8Lexer import Java8Lexer
from Java8Parser import Java8Parser
from Java8Visitor import Java8Visitor
from my_visit1 import  my_visit1
from my_visit2 import my_visit2
import SymbolTable

global ST
ST = SymbolTable.SymbolTable()

def main():
    # os.walk(".")
    # a = open("Java8.tokens","r").read()
    # b = a.split('\'')[0]
    # b.split('\n')[:-1]
    # rev_dict=dict()
    # for i,elem in enumerate( [elem.split('=')[0] for elem in b.split('\n')[:-1]]):
    #     rev_dict[i+1] = elem
    # json.dump(rev_dict,open("rev_dict.json","w"),indent=True)
    lexer = Java8Lexer(antlr4.StdinStream())
    stream = antlr4.CommonTokenStream(lexer)
    parser = Java8Parser(stream)
    tree = parser.compilationUnit()
    visitor = my_visit1()
    visitor.visit(tree)
    # print("After 1 visit.")
    # ST = visitor.getSymbolTable()
    # visitor.PrintSymbolTable()
    visitor2 = my_visit2()
    visitor2.reinitializeSymbolTableScope()
    visitor2.visit(tree)
    # visitor.PrintSymbolTable()
    # print("After 2 visit.")
    # visitor.printSymbolTableGraph()
    # print()
    # print("+----------------------------------------------------------------+")
    # print()
    visitor2.showTacNoType()
    # visitor2.showTac()
 
if __name__ == '__main__':
    main()