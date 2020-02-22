COMMANDS:

1. bison -d calc_action_hc.y
2. flex calc_action_hc.l
3. g++ -w -std=c++17 calc_action_hc.tab.c lex.yy.c -lfl -o output
4. ./output < text.txt
