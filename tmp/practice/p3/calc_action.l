%{
#include<bits/stdc++.h>
#include<iostream>
#include "calc_action.tab.h"
int yylex();

using namespace std;
%}

Number [0-9]+ 
Identifier [a-zA-Z]+

EqualTo "="
Add "+"
Subtract "-"
Multiply "*"
Divide "/"

SemiColon ";"



Error					[^{Comment}{Literal}{Identifier}]

%%

[ \t\r\f\b]+ 			;
[\n\r]					;



{EqualTo} {yylval.text=strdup(yytext); return ET;}
{Add} {yylval.text=strdup(yytext); return ADD;}
{Subtract} {yylval.text=strdup(yytext); return SBTR;}
{Multiply} {yylval.text=strdup(yytext); return MULT;}
{Divide} {yylval.text=strdup(yytext); return DIV;}



{SemiColon} {yylval.text=strdup(yytext); return SCLN;}




{Number} {yylval.text=strdup(yytext); return DIGIT;}
{Identifier} {yylval.text=strdup(yytext); return IDENTIFIER;}

%%
