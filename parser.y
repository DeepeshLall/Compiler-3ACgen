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

Node *new_nonTerminal_Node_4_NT(Node *child_A,Node *child_B,Node *child_C,Node *child_D)
{
    Node *temp = new Node;
    temp->key="NULL";
    (temp->child).push_back(child_A);
    (temp->child).push_back(child_B);
    (temp->child).push_back(child_C);
    (temp->child).push_back(child_D);
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

Node *new_nonTerminal_Node_3_NT_1_T(string value,Node *child_A,Node *child_B,Node *child_C)
{
    Node *temp = new Node;
    temp->key=value;
    
    // cout << value << " ";
    
    (temp->child).push_back(child_A);
    (temp->child).push_back(child_B);
    (temp->child).push_back(child_C);
    return temp;
}

Node *new_nonTerminal_Node_4_NT_1_T(string value,Node *child_A,Node *child_B,Node *child_C,Node *child_D)
{
    Node *temp = new Node;
    temp->key=value;
    
    // cout << value << " ";
    
    (temp->child).push_back(child_A);
    (temp->child).push_back(child_B);
    (temp->child).push_back(child_C);
    (temp->child).push_back(child_D);
    return temp;
}

Node *new_nonTerminal_Node_5_NT_1_T(string value,Node *child_A,Node *child_B,Node *child_C,Node *child_D,Node *child_E)
{
    Node *temp = new Node;
    temp->key=value;
    
    // cout << value << " ";
    
    (temp->child).push_back(child_A);
    (temp->child).push_back(child_B);
    (temp->child).push_back(child_C);
    (temp->child).push_back(child_D);
    (temp->child).push_back(child_E);
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


%start CompilationUnit





%token COMMENT
%token LITERAL
%token IDENTIFIER
%token ERROR


%token ABSTRACT
%token ASSERT
%token BOOLEAN
%token BREAK
%token BYTE
%token CASE
%token CATCH
%token CHAR
%token CLASS
%token CONST
%token CONTINUE
%token DEFAULT
%token DO
%token DOUBLE
%token ELSE
%token ENUM
%token EXTENDS
%token FINALLY
%token FINAL
%token FLOAT
%token FOR
%token IF
%token GOTO
%token IMPLEMENTS
%token IMPORT
%token INSTANCEOF
%token INT 
%token INTERFACE 
%token LONG
%token NATIVE
%token NEW
%token PACKAGE
%token PRIVATE
%token PROTECTED
%token PUBLIC
%token RETURN
%token SHORT
%token STATIC
%token STRICTFP
%token SUPER
%token SWITCH
%token SYNCHRONIZED
%token THIS
%token THROWS
%token THROW
%token TRANSIENT
%token TRY
%token VOID
%token VOLATILE
%token WHILE



%token ET
%token GT
%token LT
%token NT
%token TLD
%token QM
%token COLON
%token AR
%token EQEQ
%token GREQ
%token LEQ
%token NEQ
%token INCR
%token DECR
%token OR
%token AND
%token ADD
%token SBTR
%token MULT
%token DIV
%token BOR
%token BAND
%token POW
%token MOD
%token GRGR
%token LTLT
%token GRGRGR
%token PLEQ
%token SBEQ
%token MULEQ
%token ANDEQ
%token OREQ
%token POWEQ
%token DIVEQ
%token MODEQ
%token DGRGR
%token DLRLR
%token TGRGRGR



%token LCB
%token RCB
%token LSQB
%token RSQB
%token LSMB
%token RSMB
%token CMA
%token DCLN
%token ATR
%token TDT
%token FST
%token SCLN



%token DST



%%







Identifier  :  IDENTIFIER 																				{$$=new_nonTerminal_Node_1_T("identifier");}
			;

Literal  :  LITERAL 																					{$$=new_nonTerminal_Node_1_T("literal");}
		 ;

Type  :  PrimitiveType 																					{$$=new_nonTerminal_Node_1_NT($1);}
	  |	 ReferenceType 																					{$$=new_nonTerminal_Node_1_NT($1);}
	  ;

PrimitiveType  :  BOOLEAN 																				{$$=new_nonTerminal_Node_1_T("boolean");}
			   |  NumericType 																			{$$=new_nonTerminal_Node_1_NT($1);}
			   ;

NumericType  :  IntegralType 																			{$$=new_nonTerminal_Node_1_NT($1);}
			 |  FloatingPointType 																		{$$=new_nonTerminal_Node_1_NT($1);}
			 ;

IntegralType  :  BYTE 																					{$$=new_nonTerminal_Node_1_T("byte");}
			  |  SHORT 																					{$$=new_nonTerminal_Node_1_T("short");}
			  |  INT 																					{$$=new_nonTerminal_Node_1_T("int");}
			  |  CHAR 																					{$$=new_nonTerminal_Node_1_T("char");}
			  |  LONG 																					{$$=new_nonTerminal_Node_1_T("long");}
			  ;

FloatingPointType  :  FLOAT 																			{$$=new_nonTerminal_Node_1_T(float);}
			  	   |  DOUBLE 																			{$$=new_nonTerminal_Node_1_T("double");}
			  	   ;

ReferenceType  :  ClassOrInterfaceType 																	{$$=new_nonTerminal_Node_1_NT($1);}
			   |  ArrayType 																			{$$=new_nonTerminal_Node_1_NT($1);}
			   ;

ClassOrInterfaceType  :  Name 																			{$$=new_nonTerminal_Node_1_NT($1);}
					  ;

ClassType  :  ClassOrInterfaceType  																	{$$=new_nonTerminal_Node_1_NT($1);}
		   ;

InterfaceType  :  ClassOrInterfaceType 																	{$$=new_nonTerminal_Node_1_NT($1);}
				;

ArrayType  :  PrimitiveType LSQB RSQB 																	{$$=new_nonTerminal_Node_1_NT($1);}
		   |  Name LSQB RSQB 																			{$$=new_nonTerminal_Node_1_NT($1);}
		   |  ArrayType LSQB RSQB 																		{$$=new_nonTerminal_Node_1_NT($1);}
		   ;


















Name  :  SimpleName 																					{$$=new_nonTerminal_Node_1_NT($1);}
	  |  QualifiedName																					{$$=new_nonTerminal_Node_1_NT($1);}
	  ;

SimpleName  :  Identifier 																				{$$=new_nonTerminal_Node_1_NT($1);}
			;

QualifiedName  :  Name FST Identifier 																	{$$=new_nonTerminal_Node_2_NT($1,$3);}
			   ;

















CompilationUnit  :  PackageDeclaration ImportDeclarationRec TypeDeclarationRec 							{$$=new_nonTerminal_Node_3_NT($1,$2,$3);}
				 |  ImportDeclarationRec TypeDeclarationRec 											{$$=new_nonTerminal_Node_2_NT($1,$2);}	
				 |  PackageDeclaration TypeDeclarationRec												{$$=new_nonTerminal_Node_2_NT($1,$2);}
				 |  TypeDeclarationRec 																	{$$=new_nonTerminal_Node_1_NT($1);}
				 |  PackageDeclaration ImportDeclarationRec 											{$$=new_nonTerminal_Node_2_NT($1,$2);}
				 |  ImportDeclarationRec 																{$$=new_nonTerminal_Node_1_NT($1);}
				 |  PackageDeclaration 																	{$$=new_nonTerminal_Node_1_NT($1);}
				 |
				 ;

ImportDeclarationRec  :  ImportDeclaration 																{$$=new_nonTerminal_Node_1_NT($1);}
					  |  ImportDeclarationRec ImportDeclaration 										{$$=new_nonTerminal_Node_2_NT($1,$2);}
					  ;

TypeDeclarationRec  :  TypeDeclaration 																	{$$=new_nonTerminal_Node_1_NT($1);}
					|  TypeDeclarationRec TypeDeclaration 												{$$=new_nonTerminal_Node_2_NT($1,$2);}
					;

PackageDeclaration  :  PACKAGE Name SCLN 																{$$=new_nonTerminal_Node_1_NT_1_T("package",$2);}
					;


ImportDeclaration  :  SingleTypeImportDeclaration 														{$$=new_nonTerminal_Node_1_NT($1);}
				   |  TypeImportOnDemandDeclaration 													{$$=new_nonTerminal_Node_1_NT($1);}
				   ;
 
SingleTypeImportDeclaration  :  IMPORT Name SCLN 														{$$=new_nonTerminal_Node_1_NT_1_T("import",$2);}
							   ;

TypeImportOnDemandDeclaration  :  IMPORT Name DST SCLN 	 												{$$=new_nonTerminal_Node_1_NT_1_T("import",$2);}		
							   ;


TypeDeclaration  :  ClassDeclaration  																	{$$=new_nonTerminal_Node_1_NT($1);}
				 |  InterfaceDeclaration 																{$$=new_nonTerminal_Node_1_NT($1);}
				 | SCLN 																				{/*doubt*/}
				 ;


Modifiers  :  Modifier  																				{$$=new_nonTerminal_Node_1_NT($1);}
		   |  Modifiers Modifier 																		{$$=new_nonTerminal_Node_2_NT($1,$2);}
		   ;

Modifier  :  PUBLIC 																					{$$=new_nonTerminal_Node_1_T("public");}
		  |  PROTECTED	 							 													{$$=new_nonTerminal_Node_1_T("protected");}
		  |  PRIVATE 																					{$$=new_nonTerminal_Node_1_T("private");}
		  |  STATIC 																					{$$=new_nonTerminal_Node_1_T("static");}
		  |  ABSTRACT 																					{$$=new_nonTerminal_Node_1_T("abstract");}		
		  |  FINAL 																						{$$=new_nonTerminal_Node_1_T("final");}
		  |  NATIVE 																					{$$=new_nonTerminal_Node_1_T("native");}
		  |  SYNCHRONIZED 																				{$$=new_nonTerminal_Node_1_T("synchronized");}
		  |  TRANSIENT 																					{$$=new_nonTerminal_Node_1_T("transient");}	
		  |  VOLATILE 																					{$$=new_nonTerminal_Node_1_T("volatile");}
		  ;


















ClassDeclaration  :  Modifiers CLASS Identifier Super Interfaces ClassBody 								{$$=new_nonTerminal_Node_5_NT_1_T("class",$1,$3,$4,$5,$6);}
				  |  CLASS Identifier Super Interfaces ClassBody 										{$$=new_nonTerminal_Node_4_NT_1_T("class",$2,$3,$4,$5);}
				  |  Modifiers CLASS Identifier Interfaces ClassBody 									{$$=new_nonTerminal_Node_4_NT_1_T("class",$1,$3,$4,$5);}
				  |  CLASS Identifier Interfaces ClassBody 												{$$=new_nonTerminal_Node_3_NT_1_T("class",$2,$3,$4);}
				  |  Modifiers CLASS Identifier Super ClassBody 										{$$=new_nonTerminal_Node_4_NT_1_T("class",$1,$3,$4,$5);}
				  |  CLASS Identifier Super ClassBody 													{$$=new_nonTerminal_Node_3_NT_1_T("class",$2,$3,$4);}
				  |  Modifiers CLASS Identifier ClassBody 												{$$=new_nonTerminal_Node_3_NT_1_T("class",$1,$3,$4);}
				  |  CLASS Identifier ClassBody 														{$$=new_nonTerminal_Node_2_NT_1_T("class",$2,$3);}
				  ;

Super  :  EXTENDS ClassType 																			{$$=new_nonTerminal_Node_1_NT_1_T("extends",$2);}
	   ;

Interfaces  :  IMPLEMENTS InterfaceTypeList 															{$$=new_nonTerminal_Node_1_NT_1_T("implements",$2);}
			;

InterfaceTypeList  :  InterfaceType 																	{$$=new_nonTerminal_Node_1_NT($1);}
				   |  InterfaceTypeList CMA InterfaceType 												{$$=new_nonTerminal_Node_2_NT($1,$3);}
				   ;

ClassBody  :  LCB RCB 																					{/*doubt*/}
		   |  LCB ClassBodyDeclarationRec RCB 															{$$=new_nonTerminal_Node_1_NT($2);}
		   ;

ClassBodyDeclarationRec  :  ClassBodyDeclaration 														{$$=new_nonTerminal_Node_1_NT($1);}
			  |  ClassBodyDeclarationRec ClassBodyDeclaration 											{$$=new_nonTerminal_Node_2_NT($1,$2);}
			  ;

ClassBodyDeclaration  :  ClassMemberDeclaration 														{$$=new_nonTerminal_Node_1_NT($1);}
					  |  StaticInitializer 																{$$=new_nonTerminal_Node_1_NT($1);}
					  |  ConstructorDeclaration 														{$$=new_nonTerminal_Node_1_NT($1);}
					  ;

ClassMemberDeclaration  :  FieldDeclaration 															{$$=new_nonTerminal_Node_1_NT($1);}
						|  MethodDeclaration 															{$$=new_nonTerminal_Node_1_NT($1);}
						;

FieldDeclaration  :  Modifiers Type VariableDeclarators SCLN 											{$$=new_nonTerminal_Node_3_NT($1,$2,$3);}
				  |  Type VariableDeclarators SCLN 														{$$=new_nonTerminal_Node_2_NT($1,$2);}
				  ;

VariableDeclarators  :  VariableDeclarator 																{$$=new_nonTerminal_Node_1_NT($1);}
					 |  VariableDeclarators CMA VariableDeclarator 										{$$=new_nonTerminal_Node_2_NT($1,$2);}
					 ;

VariableDeclarator  :  VariableDeclaratorId 															{$$=new_nonTerminal_Node_1_NT($1);}
					|  VariableDeclaratorId ET VariableInitializer 										{$$=new_nonTerminal_Node_2_NT_1_T("=",$1,$3);}
					;

VariableDeclaratorId  :  Identifier 																	{$$=new_nonTerminal_Node_1_NT($1);}
					  |  VariableDeclaratorId LSQB RSQB 												{$$=new_nonTerminal_Node_1_NT($1);}
					  ;

VariableInitializer  :  Expression 																		{$$=new_nonTerminal_Node_1_NT($1);}
					 |  ArrayInitializer 																{$$=new_nonTerminal_Node_1_NT($1);}
					 ;



MethodDeclaration  :  MethodHeader MethodBody 															{$$=new_nonTerminal_Node_2_NT($1,$2);}
				   ;

MethodHeader  :  Modifiers Type MethodDeclarator Throws 												{$$=new_nonTerminal_Node_4_NT($1,$2,$3,$4);}
			  |  Type MethodDeclarator Throws 															{$$=new_nonTerminal_Node_3_NT($1,$2,$3);}
			  |  Modifiers Type MethodDeclarator 														{$$=new_nonTerminal_Node_3_NT($1,$2,$3);}
			  |  Type MethodDeclarator 																	{$$=new_nonTerminal_Node_2_NT($1,$2);}
			  |  Modifiers VOID MethodDeclarator Throws 												{$$=new_nonTerminal_Node_3_NT_1_T("void",$1,$3,$4);}
			  |  VOID MethodDeclarator Throws 															{$$=new_nonTerminal_Node_2_NT_1_T("void",$2,$3);}
			  |  Modifiers VOID MethodDeclarator 														{$$=new_nonTerminal_Node_2_NT_1_T("void",$1,$3);}
			  |  VOID MethodDeclarator 																	{$$=new_nonTerminal_Node_1_NT_1_T("void",$2);}
			  ;


MethodDeclarator  :  Identifier LSMB FormalParameterList RSMB 											{$$=new_nonTerminal_Node_2_NT($1,$3);}
				  |  Identifier LSMB RSMB 																{$$=new_nonTerminal_Node_1_NT($1);}
				  |  MethodDeclarator LSQB LSQB 														{$$=new_nonTerminal_Node_1_NT($1);}
				  ;

FormalParameterList  :  FormalParameter 																{$$=new_nonTerminal_Node_1_NT($1);}
					 |  FormalParameterList CMA FormalParameter 										{$$=new_nonTerminal_Node_2_NT($1,$3);}
					 ;

FormalParameter  :  Type VariableDeclaratorId 															{$$=new_nonTerminal_Node_2_NT($1,$2);}
				  ;

Throws  :  THROWS ClassTypeList 																		{$$=new_nonTerminal_Node_1_NT_1_T("throws",$2);}
		;

ClassTypeList  :  ClassType 																			{$$=new_nonTerminal_Node_1_NT($1);}
			   |  ClassTypeList CMA ClassType 															{$$=new_nonTerminal_Node_2_NT($1,$3);}
			   ;


MethodBody  : Block 																					{$$=new_nonTerminal_Node_1_NT($1);}
			| SCLN  																					{/*doubt*/}
			;


StaticInitializer  :  STATIC Block 																		{$$=new_nonTerminal_Node_1_NT_1_T("static",$2);}
				   ;

ConstructorDeclaration  :  Modifiers ConstructorDeclarator Throws ConstructorBody 						{$$=new_nonTerminal_Node_4_NT($1,$2,$3,$4);}
						|  ConstructorDeclarator Throws ConstructorBody 								{$$=new_nonTerminal_Node_3_NT($1,$2,$3);}
						|  Modifiers ConstructorDeclarator ConstructorBody 								{$$=new_nonTerminal_Node_3_NT($1,$2,$3);}
						|  ConstructorDeclarator ConstructorBody 										{$$=new_nonTerminal_Node_2_NT($1,$2);}
						;

ConstructorDeclarator  :  SimpleName LSMB FormalParameterList RSMB 										{$$=new_nonTerminal_Node_2_NT($2,$4);}
					   |  SimpleName LSMB RSMB 															{$$=new_nonTerminal_Node_1_NT($1);}
					   ;

ConstructorBody  :  LCB ExplicitConstructorInvocation BlockStatements RCB 								{$$=new_nonTerminal_Node_2_NT($2,$3);}
				 |  LCB BlockStatements RCB 															{$$=new_nonTerminal_Node_1_NT($2);}
				 |  LCB ExplicitConstructorInvocation RCB 												{$$=new_nonTerminal_Node_1_NT($2);}
				 |  LCB RCB																				{/*doubt*/}
				 ;

ExplicitConstructorInvocation  :  THIS LSMB ArgumentList RSMB SCLN 										{$$=new_nonTerminal_Node_1_NT_1_T("this",$3);}
							   |  THIS LSMB RSMB SCLN 													{$$=new_nonTerminal_Node_1_T("this");}	
							   |  SUPER LSMB ArgumentList RSMB SCLN 									{$$=new_nonTerminal_Node_1_NT_1_T("super",$3);}
							   |  SUPER LSMB RSMB SCLN 													{$$=new_nonTerminal_Node_1_T("super");}		
							  ;




















InterfaceDeclaration  :  Modifiers INTERFACE Identifier ExtendsInterfaces InterfaceBody 				{$$=new_nonTerminal_Node_4_NT_1_T("interface",$1,$3,$4,$5);}
					  |  INTERFACE Identifier ExtendsInterfaces InterfaceBody 							{$$=new_nonTerminal_Node_3_NT_1_T("interface",$2,$3,$4);}
					  |  Modifiers INTERFACE Identifier InterfaceBody 									{$$=new_nonTerminal_Node_3_NT_1_T("interface",$1,$3,$4);}
					  |  INTERFACE Identifier InterfaceBody 											{$$=new_nonTerminal_Node_2_NT_1_T("interface",$2,$3);}
					  ;


ExtendsInterfaces  :  EXTENDS InterfaceType 															{$$=new_nonTerminal_Node_1_NT_1_T("extends",$2);}
				   |  ExtendsInterfaces CMA InterfaceType 												{$$=new_nonTerminal_Node_2_NT($1,$3);}
				   ;

InterfaceBody  :  LCB InterfaceMemberDeclarationRec RCB 												{$$=new_nonTerminal_Node_1_NT($2);}
			   |  LCB RCB 																				{/*doubt*/}
			   ;

InterfaceMemberDeclarationRec  :  InterfaceMemberDeclaration 											{$$=new_nonTerminal_Node_1_NT($1);}
							   |  InterfaceMemberDeclarationRec InterfaceMemberDeclaration 				{$$=new_nonTerminal_Node_2_NT($1,$2);}
							   ;

InterfaceMemberDeclaration  :  ConstantDeclaration 														{$$=new_nonTerminal_Node_1_NT($1);}
							|  AbstractMethodDeclaration 									 			{$$=new_nonTerminal_Node_1_NT($1);}
							;

ConstantDeclaration  :  FieldDeclaration 																{$$=new_nonTerminal_Node_1_NT($1);}
					 ;

AbstractMethodDeclaration  :  MethodHeader SCLN 														{$$=new_nonTerminal_Node_1_NT($1);}
						   ;
















ArrayInitializer : LCB VariableInitializerList CMA RCB 													{$$=new_nonTerminal_Node_1_NT($2);}		
				 | LCB CMA RCB 																			{/*doubt*/}
				 | LCB VariableInitializerList RCB 														{$$=new_nonTerminal_Node_1_NT($2);}
				 | LCB RCB																				{/*doubt*/}
				 ;

VariableInitializerList : VariableInitializerList CMA VariableInitializer 								{$$=new_nonTerminal_Node_2_NT($1,$3);}
						| VariableInitializer 															{$$=new_nonTerminal_Node_1_NT($1);}
						;
















Block : LCB BlockStatements RCB 																		{$$=new_nonTerminal_Node_1_NT($2);}
	  | LCB RCB 																						{/*doubt*/}
	  ;

BlockStatements : BlockStatements BlockStatement 														{$$=new_nonTerminal_Node_2_NT($1,$2);}	
				| BlockStatement 																		{$$=new_nonTerminal_Node_1_NT($1);}
				;

BlockStatement : LocalVariableDeclarationStatement 														{$$=new_nonTerminal_Node_1_NT($1);}	
			   | Statement 																				{$$=new_nonTerminal_Node_1_NT($1);}	
			   ;

LocalVariableDeclarationStatement : LocalVariableDeclaration SCLN 										{$$=new_nonTerminal_Node_1_NT($1);}	
								  ;

LocalVariableDeclaration : Type VariableDeclarators 													{$$=new_nonTerminal_Node_2_NT($1,$2);}	
						 ;

Statement : StatementWithoutTrailingSubstatement 														{$$=new_nonTerminal_Node_1_NT($1);}			
		  | LabeledStatement 																			{$$=new_nonTerminal_Node_1_NT($1);} 
		  | IfThenStatement 																			{$$=new_nonTerminal_Node_1_NT($1);}	
		  | IfThenElseStatement 																		{$$=new_nonTerminal_Node_1_NT($1);}
		  | WhileStatement 																				{$$=new_nonTerminal_Node_1_NT($1);}
		  | ForStatement 																				{$$=new_nonTerminal_Node_1_NT($1);}
		  ;

StatementNoShortIf : StatementWithoutTrailingSubstatement 												{$$=new_nonTerminal_Node_1_NT($1);}
				   | LabeledStatementNoShortIf 															{$$=new_nonTerminal_Node_1_NT($1);}	
				   | IfThenElseStatementNoShortIf 														{$$=new_nonTerminal_Node_1_NT($1);}
				   | WhileStatementNoShortIf 															{$$=new_nonTerminal_Node_1_NT($1);}
				   | ForStatementNoShortIf 																{$$=new_nonTerminal_Node_1_NT($1);}
				   ;

StatementWithoutTrailingSubstatement : Block 															{$$=new_nonTerminal_Node_1_NT($1);}	
									 | EmptyStatement 													{$$=new_nonTerminal_Node_1_NT($1);}
									 | ExpressionStatement 												{$$=new_nonTerminal_Node_1_NT($1);}
									 | SwitchStatement 													{$$=new_nonTerminal_Node_1_NT($1);}
									 | DoStatement 														{$$=new_nonTerminal_Node_1_NT($1);}							
									 | BreakStatement          											{$$=new_nonTerminal_Node_1_NT($1);}		
									 | ContinueStatement 												{$$=new_nonTerminal_Node_1_NT($1);}		
									 | ReturnStatement 													{$$=new_nonTerminal_Node_1_NT($1);}
									 | SynchronizedStatement 											{$$=new_nonTerminal_Node_1_NT($1);}	
									 | ThrowStatement 													{$$=new_nonTerminal_Node_1_NT($1);}
									 | TryStatement 													{$$=new_nonTerminal_Node_1_NT($1);}
									 ;
EmptyStatement : SCLN 																					{/*doubt*/}
			   ;

LabeledStatement : Identifier COLON Statement 															{/*doubt*/}
				 ;

LabeledStatementNoShortIf : Identifier COLON StatementNoShortIf 										{/*doubt*/}
						  ;

ExpressionStatement : StatementExpression SCLN 															{$$=new_nonTerminal_Node_1_NT($1);}
					;

StatementExpression : Assignment 																		{$$=new_nonTerminal_Node_1_NT($1);}
					| PreIncrementExpression 															{$$=new_nonTerminal_Node_1_NT($1);}
					| PreDecrementExpression 															{$$=new_nonTerminal_Node_1_NT($1);}
					| PostIncrementExpression 															{$$=new_nonTerminal_Node_1_NT($1);}
					| PostDecrementExpression 															{$$=new_nonTerminal_Node_1_NT($1);}
					| MethodInvocation 																	{$$=new_nonTerminal_Node_1_NT($1);}
					| ClassInstanceCreationExpression 													{$$=new_nonTerminal_Node_1_NT($1);}
					;

IfThenStatement : IF LSMB Expression RSMB Statement 													{$$=new_nonTerminal_Node_2_NT_1_T("if",$3,$5);}
				;

IfThenElseStatement : IF LSMB Expression RSMB StatementNoShortIf ELSE Statement 						{$$=new_nonTerminal_Node_3_NT_1_T("if",$3,$5,$7);}
					;

IfThenElseStatementNoShortIf : IF LSMB Expression RSMB StatementNoShortIf ELSE StatementNoShortIf 		{$$=new_nonTerminal_Node_3_NT_1_T("if",$3,$5,$7);}
							 ;


SwitchStatement : SWITCH LSMB Expression RSMB SwitchBlock 												{$$=new_nonTerminal_Node_2_NT_1_T("switch",$3,$5);}
				;

SwitchBlock : LCB SwitchBlockStatementGroups SwitchLabels RCB 											{$$=new_nonTerminal_Node_2_NT($1,$2);}
			| LCB SwitchLabels RCB 																		{$$=new_nonTerminal_Node_1_NT($1);}
			| LCB SwitchBlockStatementGroups RCB 														{$$=new_nonTerminal_Node_1_NT($1);}
			| LCB RCB 																					{/*doubt*/}
			;

SwitchBlockStatementGroups : SwitchBlockStatementGroup 													{$$=new_nonTerminal_Node_1_NT($1);}
						   | SwitchBlockStatementGroups SwitchBlockStatementGroup 						{$$=new_nonTerminal_Node_2_NT($1,$2);}
						   ;

SwitchLabels : SwitchLabel 																				{$$=new_nonTerminal_Node_1_NT($1);}
			 | SwitchLabels SwitchLabel 																{$$=new_nonTerminal_Node_2_NT($1,$2);}
			 ;

SwitchBlockStatementGroup : SwitchLabels BlockStatements 												{$$=new_nonTerminal_Node_2_NT($1,$2);}
						  ;


SwitchLabel : CASE ConstantExpression COLON 															{/*doubt*/}
			| DEFAULT COLON 																			{/*doubt*/}
			;

WhileStatement : WHILE LSMB Expression RSMB Statement 													{$$=new_nonTerminal_Node_2_NT_1_T("while",$3,$5);}
			   ;

WhileStatementNoShortIf : WHILE LSMB Expression RSMB StatementNoShortIf 								{$$=new_nonTerminal_Node_2_NT_1_T("while",$3,$5);}
						;

DoStatement : DO Statement WHILE LSMB Expression RSMB SCLN 												{/*doubt*/}
			;

ForStatement : BasicForStatement 																		{$$=new_nonTerminal_Node_1_NT($1);}
			 ;

ForStatementNoShortIf : BasicForStatementNoShortIf 														{$$=new_nonTerminal_Node_1_NT($1);}
					  ;

BasicForStatement : FOR LSMB ForInit SCLN Expression SCLN ForUpdate RSMB Statement 					  	{$$=new_nonTerminal_Node_4_NT_1_T("for",$3,$5,$7,$9);}	
				  | FOR LSMB SCLN Expression SCLN ForUpdate RSMB Statement 								{$$=new_nonTerminal_Node_3_NT_1_T("for",$4,$6,$8);}
				  | FOR LSMB ForInit SCLN SCLN ForUpdate RSMB Statement 								{$$=new_nonTerminal_Node_3_NT_1_T("for",$3,$6,$8);}
				  | FOR LSMB SCLN SCLN ForUpdate RSMB Statement 										{$$=new_nonTerminal_Node_2_NT_1_T("for",$5,$7);}
				  | FOR LSMB ForInit SCLN Expression SCLN RSMB Statement 								{$$=new_nonTerminal_Node_3_NT_1_T("for",$3,$5,$8);}
				  | FOR LSMB SCLN Expression SCLN RSMB Statement 										{$$=new_nonTerminal_Node_2_NT_1_T("for",$4,$7);}
				  | FOR LSMB ForInit SCLN SCLN RSMB Statement 											{$$=new_nonTerminal_Node_2_NT_1_T("for",$3,$7);}
				  | FOR LSMB SCLN SCLN RSMB Statement 													{$$=new_nonTerminal_Node_1_NT_1_T("for",$6);}
				  ;

BasicForStatementNoShortIf : FOR LSMB ForInit SCLN Expression SCLN ForUpdate RSMB StatementNoShortIf  	{$$=new_nonTerminal_Node_4_NT_1_T("for",$3,$5,$7,$9);}
						   | FOR LSMB SCLN Expression SCLN ForUpdate RSMB StatementNoShortIf 		  	{$$=new_nonTerminal_Node_3_NT_1_T("for",$4,$6,$8);}
						   | FOR LSMB ForInit SCLN SCLN ForUpdate RSMB StatementNoShortIf             	{$$=new_nonTerminal_Node_3_NT_1_T("for",$3,$6,$8);}
						   | FOR LSMB SCLN SCLN ForUpdate RSMB StatementNoShortIf 					  	{$$=new_nonTerminal_Node_2_NT_1_T("for",$5,$7);}
						   | FOR LSMB ForInit SCLN Expression SCLN RSMB StatementNoShortIf 			  	{$$=new_nonTerminal_Node_3_NT_1_T("for",$3,$5,$8);}
						   | FOR LSMB SCLN Expression SCLN RSMB StatementNoShortIf 					  	{$$=new_nonTerminal_Node_2_NT_1_T("for",$4,$7);}	
						   | FOR LSMB ForInit SCLN SCLN RSMB StatementNoShortIf 					  	{$$=new_nonTerminal_Node_2_NT_1_T("for",$3,$7);}
						   | FOR LSMB SCLN SCLN RSMB StatementNoShortIf 							  	{$$=new_nonTerminal_Node_1_NT_1_T("for",$6);}
						   ;

ForInit : StatementExpressionList 																		{$$=new_nonTerminal_Node_1_NT($1);}
		| LocalVariableDeclaration 																		{$$=new_nonTerminal_Node_1_NT($1);}
		;

ForUpdate : StatementExpressionList 																	{$$=new_nonTerminal_Node_1_NT($1);}
		  ;

StatementExpressionList : StatementExpressionList CMA StatementExpression 								{$$=new_nonTerminal_Node_2_NT($1,$3);}
						| StatementExpression 															{$$=new_nonTerminal_Node_1_NT($1);}
						;

BreakStatement : BREAK Identifier SCLN 																	{$$=new_nonTerminal_Node_1_NT_1_T("break",$2);}
			   | BREAK SCLN 																			{$$=new_nonTerminal_Node_1_T("break");}
			   ;

ContinueStatement : CONTINUE Identifier SCLN 															{$$=new_nonTerminal_Node_1_NT_1_T("continue",$2);}
				  | CONTINUE SCLN																		{$$=new_nonTerminal_Node_1_T("continue");}
				  ;

ReturnStatement : RETURN SCLN 																			{$$=new_nonTerminal_Node_1_T("return");}
				| RETURN Expression SCLN 																{$$=new_nonTerminal_Node_1_NT_1_T("return",$2);}
				;

ThrowStatement : THROW Expression SCLN 																	{$$=new_nonTerminal_Node_1_NT_1_T("throw",$2);}
			   ;

SynchronizedStatement : SYNCHRONIZED LSMB Expression RSMB Block 										{$$=new_nonTerminal_Node_2_NT_1_T("synchronized",$3,$5);}
					  ;

TryStatement : TRY Block Catches 																		{$$=new_nonTerminal_Node_2_NT_1_T("try",$2,$3);}
			 | TRY Block Finally 																		{$$=new_nonTerminal_Node_2_NT_1_T("try",$2,$3);}
			 | TRY Block Catches Finally 																{$$=new_nonTerminal_Node_3_NT_1_T("try",$2,$3,$4);}
			 ;

Catches : Catches CatchClause 																			{$$=new_nonTerminal_Node_2_NT($1,$2);}
		| CatchClause 																					{$$=new_nonTerminal_Node_1_NT($1);}
		;

CatchClause  :  CATCH LSMB FormalParameter RSMB Block 													{$$=new_nonTerminal_Node_2_NT_1_T("catch",$3,$5);}
			 ;


Finally : FINALLY Block 																				{$$=new_nonTerminal_Node_1_NT_1_T("finally",$2);}
		;

















Primary : PrimaryNoNewArray 												{$$=new_nonTerminal_Node_1_NT($1);}
		| ArrayCreationExpression 											{$$=new_nonTerminal_Node_1_NT($1);}
		;

PrimaryNoNewArray : Literal 												{$$=new_nonTerminal_Node_1_NT($1);} 
				  | THIS 													{$$=new_nonTerminal_Node_1_NT("this");}
				  |	LSMB Expression RSMB 									{$$=new_nonTerminal_Node_1_NT($2);}	
				  | ClassInstanceCreationExpression 						{$$=new_nonTerminal_Node_1_NT($1);} 
				  | FieldAccess 											{$$=new_nonTerminal_Node_1_NT($1);}
				  | ArrayAccess 											{$$=new_nonTerminal_Node_1_NT($1);}
				  | MethodInvocation										{$$=new_nonTerminal_Node_1_NT($1);}
				  ;

ClassInstanceCreationExpression : NEW ClassType LSMB ArgumentList RSMB 		{$$=new_nonTerminal_Node_2_NT_1_T("new",$2,$4);}
								| NEW ClassType LSMB RSMB 					{$$=new_nonTerminal_Node_1_NT_1_T("new",$2);}
								;

ArgumentList : Expression 													{$$=new_nonTerminal_Node_1_NT($1);}
			 | ArgumentList CMA Expression 									{$$=new_nonTerminal_Node_2_NT($1,$3);}
			 ;



FieldAccess : Primary FST Identifier 										{$$=new_nonTerminal_Node_2_NT($1,$3);}
			| SUPER FST Identifier 											{$$=new_nonTerminal_Node_1_NT_1_T("super",$3);}
			;

ArrayAccess : Name LSQB Expression RSQB 									{$$=new_nonTerminal_Node_2_NT($1,$3);}
			| PrimaryNoNewArray LSQB Expression RSQB						{$$=new_nonTerminal_Node_2_NT($1,$3);}
			;

MethodInvocation : Name LSMB ArgumentList RSMB 								{$$=new_nonTerminal_Node_2_NT($1,$3);}
				 | Name LSMB RSMB 											{$$=new_nonTerminal_Node_1_NT($1);}
				 | Primary FST Identifier LSMB ArgumentList RSMB 			{$$=new_nonTerminal_Node_3_NT($1,$3,$5);}
				 | Primary FST Identifier LSMB RSMB 						{$$=new_nonTerminal_Node_2_NT($1,$3);}
				 | SUPER FST Identifier LSMB ArgumentList RSMB   			{$$=new_nonTerminal_Node_2_NT_1_T("super",$3,$5);}
				 | SUPER FST Identifier LSMB RSMB  							{$$=new_nonTerminal_Node_1_NT_1_T("super",$3);}
				 ;




ArrayCreationExpression : NEW PrimitiveType DimExprs Dims 					{$$=new_nonTerminal_Node_3_NT_1_T("new",$2,$3,$4);}
						| NEW PrimitiveType DimExprs 						{$$=new_nonTerminal_Node_2_NT_1_T("new",$2,$3);}
						| NEW ClassOrInterfaceType DimExprs Dims 			{$$=new_nonTerminal_Node_3_NT_1_T("new",$2,$3,$4);}
						| NEW ClassOrInterfaceType DimExprs 				{$$=new_nonTerminal_Node_2_NT_1_T("new",$2,$3);}
						;

DimExprs : DimExprs DimExpr 												{$$=new_nonTerminal_Node_2_NT($1,$2);}
		 | DimExpr 															{$$=new_nonTerminal_Node_1_NT($1);}
		 ;


DimExpr : LSQB Expression RSQB	   											{$$=new_nonTerminal_Node_1_NT($2);}
		;

Dims  :  LSQB RSQB 															{/*blank?*/}
	  |  Dims LSQB RSQB 													{$$=new_nonTerminal_Node_1_NT($1);}
	  ;

Expression : AssignmentExpression 									 		{$$=new_nonTerminal_Node_1_NT($1);}
		   ;

AssignmentExpression  :  ConditionalExpression 								{$$=new_nonTerminal_Node_1_NT($1);}		
					  |  Assignment 										{$$=new_nonTerminal_Node_1_NT($1);}
					  ;

Assignment  :  LeftHandSide AssignmentOperator Expression 					{$$=new_nonTerminal_Node_3_NT($1,$2,$3);}
		    ;

LeftHandSide  :  Name 														{$$=new_nonTerminal_Node_1_NT($1);}	
			  |  FieldAccess 												{$$=new_nonTerminal_Node_1_NT($1);}	
			  |  ArrayAccess 												{$$=new_nonTerminal_Node_1_NT($1);}
			  ;

AssignmentOperator  :  ET 													{$$=new_nonTerminal_Node_1_T("=");}
					|  MULEQ												{$$=new_nonTerminal_Node_1_T("*=");}
					|  DIVEQ												{$$=new_nonTerminal_Node_1_T("/=");}
					|  MODEQ												{$$=new_nonTerminal_Node_1_T("%=");}
					|  PLEQ													{$$=new_nonTerminal_Node_1_T("+=");}
					|  SBEQ													{$$=new_nonTerminal_Node_1_T("-=");}		
					|  DLRLR												{$$=new_nonTerminal_Node_1_T("<<");}
					|  DGRGR												{$$=new_nonTerminal_Node_1_T(">>");}
					|  TGRGRGR												{$$=new_nonTerminal_Node_1_T(">>>");}
					|  ANDEQ												{$$=new_nonTerminal_Node_1_T("&=");}			
					|  POWEQ												{$$=new_nonTerminal_Node_1_T("^=");}
					|  OREQ													{$$=new_nonTerminal_Node_1_T("|=");}
					;

ConditionalExpression : ConditionalOrExpression 											{$$=new_nonTerminal_Node_1_NT($1);}
					  | ConditionalOrExpression QM Expression COLON ConditionalExpression 	{$$=new_nonTerminal_Node_3_NT_1_T("?",$1,$3,$5);}
					  ;

ConditionalOrExpression : ConditionalAndExpression 											{$$=new_nonTerminal_Node_1_NT($1);}
						| ConditionalOrExpression OR ConditionalAndExpression				{$$=new_nonTerminal_Node_2_NT_1_T("||",$1,$3);}
						;

ConditionalAndExpression : InclusiveOrExpression											{$$=new_nonTerminal_Node_1_NT($1);}
						 | ConditionalAndExpression AND InclusiveOrExpression 				{$$=new_nonTerminal_Node_2_NT_1_T("&&",$1,$3);}
						 ;

InclusiveOrExpression : ExclusiveOrExpression								{$$=new_nonTerminal_Node_1_NT($1);}
					  | InclusiveOrExpression BOR ExclusiveOrExpression 	{$$=new_nonTerminal_Node_2_NT_1_T("|",$1,$3);}
					  ;

ExclusiveOrExpression : AndExpression 										{$$=new_nonTerminal_Node_1_NT($1);}
					  | ExclusiveOrExpression POW AndExpression 			{$$=new_nonTerminal_Node_2_NT_1_T("^",$1,$3);}
					  ;	   

AndExpression : EqualityExpression											{$$=new_nonTerminal_Node_1_NT($1);}
			  | AndExpression BAND EqualityExpression						{$$=new_nonTerminal_Node_2_NT_1_T("&",$1,$3);}
			  ;
			  
EqualityExpression : RelationalExpression 									{$$=new_nonTerminal_Node_1_NT($1);}
				   | EqualityExpression EQEQ RelationalExpression    		{$$=new_nonTerminal_Node_2_NT_1_T("==",$1,$3);}
				   | EqualityExpression NEQ RelationalExpression 			{$$=new_nonTerminal_Node_2_NT_1_T("!=",$1,$3);}
				   ;

RelationalExpression : ShiftExpression										{$$=new_nonTerminal_Node_1_NT($1);}
					 | RelationalExpression LT ShiftExpression 				{$$=new_nonTerminal_Node_2_NT_1_T("<",$1,$3);}
					 | RelationalExpression GT ShiftExpression 				{$$=new_nonTerminal_Node_2_NT_1_T(">",$1,$3);}
					 | RelationalExpression LEQ ShiftExpression 			{$$=new_nonTerminal_Node_2_NT_1_T("<=",$1,$3);}
					 | RelationalExpression GREQ ShiftExpression 			{$$=new_nonTerminal_Node_2_NT_1_T(">=",$1,$3);}				
					 | RelationalExpression INSTANCEOF ReferenceType 		{$$=new_nonTerminal_Node_2_NT_1_T("instanceof",$1,$3);}
					 ;

ShiftExpression : AdditiveExpression 										{$$=new_nonTerminal_Node_1_NT($1);}
				| ShiftExpression LTLT AdditiveExpression 					{$$=new_nonTerminal_Node_2_NT_1_T("<<",$1,$3);}
				| ShiftExpression GRGR AdditiveExpression 					{$$=new_nonTerminal_Node_2_NT_1_T(">>",$1,$3);}
				| ShiftExpression GRGRGR AdditiveExpression 				{$$=new_nonTerminal_Node_2_NT_1_T(">>>",$1,$3);}
				;

AdditiveExpression : MultiplicativeExpression 								{$$=new_nonTerminal_Node_1_NT($1);}
				   | AdditiveExpression ADD MultiplicativeExpression 		{$$=new_nonTerminal_Node_2_NT_1_T("+",$1,$3);}
				   | AdditiveExpression SBTR MultiplicativeExpression 		{$$=new_nonTerminal_Node_2_NT_1_T("-",$1,$3);}
				   ;

MultiplicativeExpression : UnaryExpression 									{$$=new_nonTerminal_Node_1_NT($1);}
						 | MultiplicativeExpression MULT UnaryExpression 	{$$=new_nonTerminal_Node_2_NT_1_T("*",$1,$3);}
						 | MultiplicativeExpression DIV UnaryExpression 	{$$=new_nonTerminal_Node_2_NT_1_T("/",$1,$3);}
						 | MultiplicativeExpression MOD UnaryExpression 	{$$=new_nonTerminal_Node_2_NT_1_T("%",$1,$3);}
						 ;

UnaryExpression : PreIncrementExpression 									{$$=new_nonTerminal_Node_1_NT($1);}
				| PreDecrementExpression 									{$$=new_nonTerminal_Node_1_NT($1);}
				| ADD UnaryExpression 										{$$=new_nonTerminal_Node_1_NT_1_T("+",$2);}
				| SBTR UnaryExpression  									{$$=new_nonTerminal_Node_1_NT_1_T("-",$2);}
				| UnaryExpressionNotPlusMinus 								{$$=new_nonTerminal_Node_1_NT($1);}	
				;

PreIncrementExpression : INCR UnaryExpression 						    	{$$=new_nonTerminal_Node_1_NT_1_T("++",$2);}
					   ;

PreDecrementExpression : DECR UnaryExpression 								{$$=new_nonTerminal_Node_1_NT_1_T("--",$2);}
					   ;

UnaryExpressionNotPlusMinus : PostfixExpression 							{$$=new_nonTerminal_Node_1_NT($1);}
							| TLD UnaryExpression 							{$$=new_nonTerminal_Node_1_NT_1_T("~",$2);}	
							| NT UnaryExpression 							{$$=new_nonTerminal_Node_1_NT_1_T("!",$2);}
							| CastExpression 								{$$=new_nonTerminal_Node_1_NT($1);}
							;

PostfixExpression : Primary 												{$$=new_nonTerminal_Node_1_NT($1);}
                  | Name 													{$$=new_nonTerminal_Node_1_NT($1);}		
                  | PostIncrementExpression 								{$$=new_nonTerminal_Node_1_NT($1);}
                  | PostDecrementExpression									{$$=new_nonTerminal_Node_1_NT($1);}
                  ;

PostIncrementExpression : PostfixExpression INCR 							{$$=new_nonTerminal_Node_1_NT_1_T("++",$1);}
						;

PostDecrementExpression : PostfixExpression DECR 							{$$=new_nonTerminal_Node_1_NT_1_T("--",$1);}
						;

CastExpression : LSMB PrimitiveType Dims RSMB UnaryExpression 				{$$=new_nonTerminal_Node_3_NT($2,$3,$5);}
			   | LSMB Expression RSMB UnaryExpressionNotPlusMinus			{$$=new_nonTerminal_Node_2_NT($2,$4);}
			   | LSMB PrimitiveType RSMB UnaryExpression 					{$$=new_nonTerminal_Node_2_NT($2,$4);}
			   | LSMB Name Dims RSMB UnaryExpressionNotPlusMinus	    	{$$=new_nonTerminal_Node_3_NT($2,$3,$5);}
			   ;

ConstantExpression : Expression 											{$$=new_nonTerminal_Node_1_NT($1);}
				   ;












%%

void yyerror(const char *s)
{
	fprintf(stderr ,"Error Type: %s\n", s);
}

int main (int, char**) {
	yyparse();
    // Visit(ast_root);
	return 0;
}