# This is for single scan using my_visit.py
import os
import re
import json
import antlr4
from Java8Lexer import Java8Lexer
from Java8Parser import Java8Parser
from Java8Visitor import Java8Visitor
from my_visit import  my_visit
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
    visitor = my_visit()
    visitor.visit(tree)
    visitor.PrintSymbolTable()
 
if __name__ == '__main__':
    main()