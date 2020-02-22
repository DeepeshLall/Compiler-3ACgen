%{
#include<bits/stdc++.h>

using namespace std;

extern int yylex();
extern int yyparse();
void yyerror(const char*s);

struct Node
{
    string value;
    vector<Node *>child;
};

Node *new_nonTerminal_Node_1_T(string value)
{
    Node *temp = new Node;
    temp->value=value;
    return temp;
}

Node *new_nonTerminal_Node_1_NT(Node *child_A)
{
    Node *temp = new Node;
    temp->value = "";
    (temp->child).push_back(child_A);
    return temp;
}

Node *new_nonTerminal_Node_2_NT(Node *child_A,Node *child_B)
{
    Node *temp = new Node;
    temp->value="";
    (temp->child).push_back(child_A);
    (temp->child).push_back(child_B);
    return temp;
}

Node *new_nonTerminal_Node_3_NT(Node *child_A,Node *child_B,Node *child_C)
{
    Node *temp = new Node;
    temp->value="";
    (temp->child).push_back(child_A);
    (temp->child).push_back(child_B);
    (temp->child).push_back(child_C);
    return temp;
}

Node *new_nonTerminal_Node_2_NT_1_T(string value,Node *child_A,Node *child_C)
{
    Node *temp = new Node;
    temp->value=value;
    (temp->child).push_back(child_A);
    (temp->child).push_back(child_C);
    return temp;
}

Node *new_nonTerminal_Node_1_NT_2_T(string head_value,string child_value,Node *child_A)
{
    Node *temp = new Node;
    temp->value = head_value;
    Node *temp2 = new Node;
    temp2->value=child_value;
    (temp->child).push_back(temp2);
    (temp->child).push_back(child_A);
}

%}
%union{
    std::string* text;
    struct Node *ast_node;
}

%token <text> DIGIT
%token <text> IDENTIFIER
%token <text> ET
%token <text> ADD
%token <text> SBTR
%token <text> MULT
%token <text> DIV
%token <text> SCLN

%type <ast_node> line assignment exp term

%%

line    : assignment SCLN          {$$=new_nonTerminal_Node_1_NT($1);}
		| line assignment SCLN     {$$=new_nonTerminal_Node_2_NT($1,$2);}
        ;

assignment  : IDENTIFIER ET exp    {$$=new_nonTerminal_Node_1_NT_2_T(*($2),*($1),$3);}
		    ;
exp    	: term                     {$$=new_nonTerminal_Node_1_NT($1) ;}
       	| exp ADD term             {$$=new_nonTerminal_Node_2_NT_1_T(*($2),$1,$3);}
       	| exp SBTR term            {$$=new_nonTerminal_Node_2_NT_1_T(*($2),$1,$3);}
        | exp MULT term            {$$=new_nonTerminal_Node_2_NT_1_T(*($2),$1,$3);}
        | exp DIV term             {$$=new_nonTerminal_Node_2_NT_1_T(*($2),$1,$3);}
       	;
term   	: DIGIT                    {$$=new_nonTerminal_Node_1_T(*($1));}
		| IDENTIFIER               {$$=new_nonTerminal_Node_1_T(*($1));}
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