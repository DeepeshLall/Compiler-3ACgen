%{
#include<bits/stdc++.h>
#include<iostream>
#include "calc_action_hc.tab.h"
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
[\n\r]					{cout<<endl;}



{EqualTo} {return ET;}
{Add} {return ADD;}
{Subtract} {return SBTR;}
{Multiply} {return MULT;}
{Divide} {return DIV;}



{SemiColon} {return SCLN;}




{Number} {return DIGIT;}
{Identifier} {return IDENTIFIER;}

%%
