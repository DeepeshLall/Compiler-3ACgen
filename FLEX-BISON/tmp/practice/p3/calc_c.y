%{
	#include <stdio.h>
    #include <stdlib.h>
    #include <string.h>
    int yylex();
    int yyerror(char *s);


%}
%union{
    char text[5000];
}

%token <text> DIGIT
%token <text> IDENTIFIER

%token <text> ET
%token <text> ADD
%token <text> SBTR
%token <text> MULT
%token <text> DIV



%token <text> SCLN


%%

line    : assignment SCLN
		| line assignment SCLN
        ;

assignment  : IDENTIFIER ET exp
		    ;
exp    	: term
       	| exp ADD term
       	| exp SBTR term
        | exp MULT term
        | exp DIV term
       	;
term   	: DIGIT
		| IDENTIFIER
        ;


%%

int yyerror(char *s)
{
	fprintf(stderr ,"Error Type: %s\n", s);
	return 0;
}

int main () {
	yyparse();
    printf("SUCCESS 1sT Step.\n");
	return 0;
}