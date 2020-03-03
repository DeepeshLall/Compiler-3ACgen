%{
#include<bits/stdc++.h>

using namespace std;

extern int yylex();
extern int yyparse();
void yyerror(const char*s);

struct Node
{
    string key;
    vector<Node *>child;
};

Node *new_nonTerminal_Node_1_T(string value)
{
    Node *temp = new Node;
    temp->key=value;
    
    // cout << temp->key << " ";
    
    return temp;
}

Node *new_nonTerminal_Node_1_NT(Node *child_A)
{
    Node *temp = new Node;
    (temp->child).push_back(child_A);
    temp->key="NULL";
    return temp;
    // return child_A;
}

Node *new_nonTerminal_Node_2_NT(Node *child_A,Node *child_B)
{
    Node *temp = new Node;
    temp->key="NULL";
    (temp->child).push_back(child_A);
    (temp->child).push_back(child_B);
    return temp;
}

Node *new_nonTerminal_Node_3_NT(Node *child_A,Node *child_B,Node *child_C)
{
    Node *temp = new Node;
    temp->key="NULL";
    (temp->child).push_back(child_A);
    (temp->child).push_back(child_B);
    (temp->child).push_back(child_C);
    return temp;
}

Node *new_nonTerminal_Node_2_NT_1_T(string value,Node *child_A,Node *child_C)
{
    Node *temp = new Node;
    temp->key=value;
    
    // cout << value << " ";
    
    (temp->child).push_back(child_A);
    (temp->child).push_back(child_C);
    return temp;
}

Node *new_nonTerminal_Node_1_NT_2_T(string head_value,string child_value,Node *child_A)
{
    Node *temp = new Node;
    temp->key = head_value;
    
    Node *temp2 = new Node;
    temp2->key=child_value;
    
    // cout << temp2->key << " ";
    // cout << temp->key << " ";

    (temp->child).push_back(temp2);
    (temp->child).push_back(child_A);
    return temp;
}

void Visit(Node *root)
{
    if((root->child).size()==0){
        if(root->key=="NULL"){
            return;
        }
        cout << root->key << " ";
        return;
    }
    for(int i=0;i<((root->child).size());i++){
        Visit(root->child[i]);
    }
    if(root->key=="NULL"){
        return;
    }
    cout << root->key << " ";
    return;
}

Node *ast_root;

%}
%union{
    struct Node *ast_node;
}

%token DIGIT
%token IDENTIFIER
%token ET
%token ADD
%token SBTR
%token MULT
%token DIV
%token SCLN

%type <ast_node> start line assignment exp term

%%
start   : line                     {$$=new_nonTerminal_Node_1_NT($1); ast_root=$$;}

line    : assignment SCLN          {$$=new_nonTerminal_Node_1_NT($1);}
		| line assignment SCLN     {$$=new_nonTerminal_Node_2_NT($1,$2);}
        ;

assignment  : IDENTIFIER ET exp    {$$=new_nonTerminal_Node_1_NT_2_T("=","id",$3);}
		    ;
exp    	: term                     {$$=new_nonTerminal_Node_1_NT($1);}
       	| exp ADD term             {$$=new_nonTerminal_Node_2_NT_1_T("+",$1,$3);}
       	| exp SBTR term            {$$=new_nonTerminal_Node_2_NT_1_T("-",$1,$3);}
        | exp MULT term            {$$=new_nonTerminal_Node_2_NT_1_T("*",$1,$3);}
        | exp DIV term             {$$=new_nonTerminal_Node_2_NT_1_T("/",$1,$3);}
       	;
term   	: DIGIT                    {$$=new_nonTerminal_Node_1_T("literal");}
		| IDENTIFIER               {$$=new_nonTerminal_Node_1_T("id");}
        ;


%%

void yyerror(const char *s)
{
	fprintf(stderr ,"Error Type: %s\n", s);
}

int main (int, char**) {
	yyparse();
    Visit(ast_root);
	return 0;
}