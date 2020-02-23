yacc -d  parser.y
lex lexer.l
g++ -w -std=c++17 -o thesisparser y.tab.c lex.yy.c -ly -ll
./thesisparser < $1
rm y.tab.h
rm lex.yy.c 
rm thesisparser