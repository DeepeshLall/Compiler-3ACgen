#!/bin/sh

# Yacc Compilation of Parser File($1)
yacc -dv $1

# Lex Compilation of Lex File($2)
lex $2

#Linking the output of Yacc and Lex
gcc y.tab.c lex.yy.c -o output

# Using the binary to Parse Source Code($3)
./output < $3 > "output.txt" 2>"error.txt"

# Removinf useless file at end of execution
rm -rf lex.yy.c y.tab.c y.tab.h y.output