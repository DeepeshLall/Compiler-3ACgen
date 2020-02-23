%{
#include<bits/stdc++.h>
using namespace std;

extern int yylex();
extern int yyparse();
void yyerror(const char*s);

%}
%union{
    std::string* text;
}

%token <text> DIGIT
%token <text> IDENTIFIER

%token <text> ET
%token <text> ADD
%token <text> SBTR
%token <text> MULT
%token <text> DIV



%token SCLN


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

void yyerror(const char *s)
{
	fprintf(stderr ,"Error Type: %s\n", s);
}

int main (int, char**) {
	yyparse();
    printf("SUCCESS 1sT Step.\n");
	return 0;
}