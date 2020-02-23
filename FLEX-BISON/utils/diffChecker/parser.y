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







Identifier  :  IDENTIFIER
			;

Literal  :  LITERAL
		 ;

Type  :  PrimitiveType
	  |	 ReferenceType
	  ;

PrimitiveType  :  BOOLEAN
			   |  NumericType
			   ;

NumericType  :  IntegralType
			 |  FloatingPointType
			 ;

IntegralType  :  BYTE
			  |  SHORT
			  |  INT
			  |  CHAR
			  |  LONG
			  ;

FloatingPointType  :  FLOAT
			  	   |  DOUBLE
			  	   ;

ReferenceType  :  ClassOrInterfaceType
			   |  ArrayType
			   ;

ClassOrInterfaceType  :  Name
					  ;

ClassType  :  ClassOrInterfaceType 
		   ;

InterfaceType  :  ClassOrInterfaceType
				;

ArrayType  :  PrimitiveType LSQB RSQB
		   |  Name LSQB RSQB
		   |  ArrayType LSQB RSQB
		   ;


















Name  :  SimpleName
	  |  QualifiedName
	  ;

SimpleName  :  Identifier
			;

QualifiedName  :  Name FST Identifier
			   ;

















CompilationUnit  :  PackageDeclaration ImportDeclarationRec TypeDeclarationRec
				 |  ImportDeclarationRec TypeDeclarationRec
				 |  PackageDeclaration TypeDeclarationRec
				 |  TypeDeclarationRec
				 |  PackageDeclaration ImportDeclarationRec
				 |  ImportDeclarationRec
				 |  PackageDeclaration
				 |
				 ;

ImportDeclarationRec  :  ImportDeclaration
					  |  ImportDeclarationRec ImportDeclaration
					  ;

TypeDeclarationRec  :  TypeDeclaration
					|  TypeDeclarationRec TypeDeclaration
					;

PackageDeclaration  :  PACKAGE Name SCLN
					;


ImportDeclaration  :  SingleTypeImportDeclaration
				   |  TypeImportOnDemandDeclaration
				   ;

SingleTypeImportDeclaration  :  IMPORT Name SCLN
							   ;

TypeImportOnDemandDeclaration  :  IMPORT Name DST SCLN
							   ;


TypeDeclaration  :  ClassDeclaration 
				 |  InterfaceDeclaration
				 | SCLN
				 ;


Modifiers  :  Modifier
		   |  Modifiers Modifier
		   ;

Modifier  :  PUBLIC
		  |  PROTECTED
		  |  PRIVATE
		  |  STATIC
		  |  ABSTRACT
		  |  FINAL
		  |  NATIVE
		  |  SYNCHRONIZED
		  |  TRANSIENT
		  |  VOLATILE
		  ;


















ClassDeclaration  :  Modifiers CLASS Identifier Super Interfaces ClassBody
				  |  CLASS Identifier Super Interfaces ClassBody
				  |  Modifiers CLASS Identifier Interfaces ClassBody
				  |  CLASS Identifier Interfaces ClassBody
				  |  Modifiers CLASS Identifier Super ClassBody
				  |  CLASS Identifier Super ClassBody
				  |  Modifiers CLASS Identifier ClassBody
				  |  CLASS Identifier ClassBody
				  ;

Super  :  EXTENDS ClassType
	   ;

Interfaces  :  IMPLEMENTS InterfaceTypeList
			;

InterfaceTypeList  :  InterfaceType
				   |  InterfaceTypeList CMA InterfaceType
				   ;

ClassBody  :  LCB RCB
		   |  LCB ClassBodyDeclarationRec RCB
		   ;

ClassBodyDeclarationRec  :  ClassBodyDeclaration
			  |  ClassBodyDeclarationRec ClassBodyDeclaration
			  ;

ClassBodyDeclaration  :  ClassMemberDeclaration
					  |  StaticInitializer
					  |  ConstructorDeclaration
					  ;

ClassMemberDeclaration  :  FieldDeclaration
						|  MethodDeclaration
						;

FieldDeclaration  :  Modifiers Type VariableDeclarators SCLN
				  |  Type VariableDeclarators SCLN
				  ;

VariableDeclarators  :  VariableDeclarator
					 |  VariableDeclarators CMA VariableDeclarator
					 ;

VariableDeclarator  :  VariableDeclaratorId
					|  VariableDeclaratorId ET VariableInitializer
					;

VariableDeclaratorId  :  Identifier
					  |  VariableDeclaratorId LSQB RSQB
					  ;

VariableInitializer  :  Expression
					 |  ArrayInitializer
					 ;



MethodDeclaration  :  MethodHeader MethodBody
				   ;

MethodHeader  :  Modifiers Type MethodDeclarator Throws
			  |  Type MethodDeclarator Throws
			  |  Modifiers Type MethodDeclarator
			  |  Type MethodDeclarator
			  |  Modifiers VOID MethodDeclarator Throws
			  |  VOID MethodDeclarator Throws
			  |  Modifiers VOID MethodDeclarator
			  |  VOID MethodDeclarator
			  ;


MethodDeclarator  :  Identifier LSMB FormalParameterList RSMB
				  |  Identifier LSMB RSMB
				  |  MethodDeclarator LSQB LSQB
				  ;

FormalParameterList  :  FormalParameter
					 |  FormalParameterList CMA FormalParameter
					 ;

FormalParameter  :  Type VariableDeclaratorId
				  ;

Throws  :  THROWS ClassTypeList
		;

ClassTypeList  :  ClassType
			   |  ClassTypeList CMA ClassType
			   ;


MethodBody  :  Block
			| SCLN
			;


StaticInitializer  :  STATIC Block
				   ;

ConstructorDeclaration  :  Modifiers ConstructorDeclarator Throws ConstructorBody
						|  ConstructorDeclarator Throws ConstructorBody
						|  Modifiers ConstructorDeclarator ConstructorBody
						|  ConstructorDeclarator ConstructorBody
						;

ConstructorDeclarator  :  SimpleName LSMB FormalParameterList RSMB
					   |  SimpleName LSMB RSMB
					   ;

ConstructorBody  :  LCB ExplicitConstructorInvocation BlockStatements RCB
				 |  LCB BlockStatements RCB
				 |  LCB ExplicitConstructorInvocation RCB
				 |  LCB RCB
				 ;

ExplicitConstructorInvocation  :  THIS LSMB ArgumentList RSMB SCLN
							   |  THIS LSMB RSMB SCLN
							   |  SUPER LSMB ArgumentList RSMB SCLN
							   |  SUPER LSMB RSMB SCLN
							  ;




















InterfaceDeclaration  :  Modifiers INTERFACE Identifier ExtendsInterfaces InterfaceBody
					  |  INTERFACE Identifier ExtendsInterfaces InterfaceBody
					  |  Modifiers INTERFACE Identifier InterfaceBody
					  |  INTERFACE Identifier InterfaceBody
					  ;


ExtendsInterfaces  :  EXTENDS InterfaceType
				   |  ExtendsInterfaces CMA InterfaceType
				   ;

InterfaceBody  :  LCB InterfaceMemberDeclarationRec RCB
			   |  LCB RCB
			   ;

InterfaceMemberDeclarationRec  :  InterfaceMemberDeclaration
							   |  InterfaceMemberDeclarationRec InterfaceMemberDeclaration
							   ;

InterfaceMemberDeclaration  :  ConstantDeclaration
							|  AbstractMethodDeclaration
							;

ConstantDeclaration  :  FieldDeclaration
					 ;

AbstractMethodDeclaration  :  MethodHeader SCLN
						   ;
















ArrayInitializer : LCB VariableInitializerList CMA RCB
				 | LCB CMA RCB
				 | LCB VariableInitializerList RCB
				 | LCB RCB
				 ;

VariableInitializerList : VariableInitializerList CMA VariableInitializer
						| VariableInitializer
						;
















Block : LCB BlockStatements RCB
	  | LCB RCB
	  ;

BlockStatements : BlockStatements BlockStatement
				| BlockStatement
				;


BlockStatement : LocalVariableDeclarationStatement
			   | Statement
			   ;

LocalVariableDeclarationStatement : LocalVariableDeclaration SCLN
								  ;

LocalVariableDeclaration : Type VariableDeclarators
						 ;

Statement : StatementWithoutTrailingSubstatement
		  | LabeledStatement
		  | IfThenStatement
		  | IfThenElseStatement
		  | WhileStatement
		  | ForStatement
		  ;

StatementNoShortIf : StatementWithoutTrailingSubstatement
				   | LabeledStatementNoShortIf
				   | IfThenElseStatementNoShortIf
				   | WhileStatementNoShortIf
				   | ForStatementNoShortIf
				   ;

StatementWithoutTrailingSubstatement : Block
									 | EmptyStatement
									 | ExpressionStatement
									 | SwitchStatement
									 | DoStatement
									 | BreakStatement
									 | ContinueStatement
									 | ReturnStatement
									 | SynchronizedStatement
									 | ThrowStatement
									 | TryStatement
									 ;
EmptyStatement : SCLN
			   ;

LabeledStatement : Identifier COLON Statement
				 ;

LabeledStatementNoShortIf : Identifier COLON StatementNoShortIf
						  ;

ExpressionStatement : StatementExpression SCLN
					;

StatementExpression : Assignment
					| PreIncrementExpression
					| PreDecrementExpression
					| PostIncrementExpression
					| PostDecrementExpression
					| MethodInvocation
					| ClassInstanceCreationExpression
					;

IfThenStatement : IF LSMB Expression RSMB Statement
				;

IfThenElseStatement : IF LSMB Expression RSMB StatementNoShortIf ELSE Statement
					;

IfThenElseStatementNoShortIf : IF LSMB Expression RSMB StatementNoShortIf ELSE StatementNoShortIf
							 ;


SwitchStatement : SWITCH LSMB Expression RSMB SwitchBlock
				;

SwitchBlock : LCB SwitchBlockStatementGroups SwitchLabels RCB
			| LCB SwitchLabels RCB
			| LCB SwitchBlockStatementGroups RCB
			| LCB RCB
			;

SwitchBlockStatementGroups  :  SwitchBlockStatementGroup
							  |  SwitchBlockStatementGroups SwitchBlockStatementGroup
							  ;

SwitchLabels  :  SwitchLabel
				|  SwitchLabels SwitchLabel
				;

SwitchBlockStatementGroup : SwitchLabels BlockStatements
						  ;


SwitchLabel : CASE ConstantExpression COLON
			| DEFAULT COLON
			;

WhileStatement : WHILE LSMB Expression RSMB Statement
			   ;

WhileStatementNoShortIf : WHILE LSMB Expression RSMB StatementNoShortIf
						;

DoStatement : DO Statement WHILE LSMB Expression RSMB SCLN
			;

ForStatement : BasicForStatement
			 ;

ForStatementNoShortIf : BasicForStatementNoShortIf
					  ;

BasicForStatement : FOR LSMB ForInit SCLN Expression SCLN ForUpdate RSMB Statement
				  | FOR LSMB SCLN Expression SCLN ForUpdate RSMB Statement
				  | FOR LSMB ForInit SCLN SCLN ForUpdate RSMB Statement
				  | FOR LSMB SCLN SCLN ForUpdate RSMB Statement
				  | FOR LSMB ForInit SCLN Expression SCLN RSMB Statement
				  | FOR LSMB SCLN Expression SCLN RSMB Statement
				  | FOR LSMB ForInit SCLN SCLN RSMB Statement
				  | FOR LSMB SCLN SCLN RSMB Statement
				  ;

BasicForStatementNoShortIf : FOR LSMB ForInit SCLN Expression SCLN ForUpdate RSMB StatementNoShortIf
						   | FOR LSMB SCLN Expression SCLN ForUpdate RSMB StatementNoShortIf
						   | FOR LSMB ForInit SCLN SCLN ForUpdate RSMB StatementNoShortIf
						   | FOR LSMB SCLN SCLN ForUpdate RSMB StatementNoShortIf
						   | FOR LSMB ForInit SCLN Expression SCLN RSMB StatementNoShortIf
						   | FOR LSMB SCLN Expression SCLN RSMB StatementNoShortIf
						   | FOR LSMB ForInit SCLN SCLN RSMB StatementNoShortIf
						   | FOR LSMB SCLN SCLN RSMB StatementNoShortIf
						   ;

ForInit : StatementExpressionList
		| LocalVariableDeclaration
		;

ForUpdate : StatementExpressionList
		  ;

StatementExpressionList : StatementExpressionList CMA StatementExpression
						| StatementExpression
						;

BreakStatement : BREAK Identifier SCLN
			   | BREAK SCLN
			   ;

ContinueStatement : CONTINUE Identifier SCLN
				  | CONTINUE SCLN
				  ;

ReturnStatement : RETURN SCLN
				| RETURN Expression SCLN
				;

ThrowStatement : THROW Expression SCLN
			   ;

SynchronizedStatement : SYNCHRONIZED LSMB Expression RSMB Block
					  ;

TryStatement : TRY Block Catches
			 | TRY Block Finally
			 | TRY Block Catches Finally
			 ;

Catches : Catches CatchClause
		| CatchClause
		;

CatchClause  :  CATCH LSMB FormalParameter RSMB Block
			 ;


Finally : FINALLY Block
		;

















Primary : PrimaryNoNewArray
		| ArrayCreationExpression
		;

PrimaryNoNewArray : Literal
				  | THIS
				  |	LSMB Expression RSMB
				  | ClassInstanceCreationExpression
				  | FieldAccess
				  | ArrayAccess
				  | MethodInvocation
				  ;

ClassInstanceCreationExpression : NEW ClassType LSMB ArgumentList RSMB
								| NEW ClassType LSMB RSMB
								;

ArgumentList : Expression
			 | ArgumentList CMA Expression
			 ;



FieldAccess : Primary FST Identifier
			| SUPER FST Identifier
			;

ArrayAccess : Name LSQB Expression RSQB
			| PrimaryNoNewArray LSQB Expression RSQB
			;

MethodInvocation : Name LSMB ArgumentList RSMB
				 | Name LSMB RSMB
				 | Primary FST Identifier LSMB ArgumentList RSMB
				 | Primary FST Identifier LSMB RSMB
				 | SUPER FST Identifier LSMB ArgumentList RSMB
				 | SUPER FST Identifier LSMB RSMB
				 ;




ArrayCreationExpression : NEW PrimitiveType DimExprs Dims
						| NEW PrimitiveType DimExprs
						| NEW ClassOrInterfaceType DimExprs Dims
						| NEW ClassOrInterfaceType DimExprs
						;

DimExprs : DimExprs DimExpr
		 | DimExpr
		 ;


DimExpr : LSQB Expression RSQB
		;

Dims  :  LSQB RSQB
	  |  Dims LSQB RSQB
	  ;

Expression : AssignmentExpression
		   ;

AssignmentExpression  :  ConditionalExpression
					  |  Assignment
					  ;

Assignment  :  LeftHandSide AssignmentOperator Expression
		    ;

LeftHandSide  :  Name
			  |  FieldAccess
			  |  ArrayAccess
			  ;

AssignmentOperator  :  ET
					|  MULEQ
					|  DIVEQ
					|  MODEQ
					|  PLEQ
					|  SBEQ
					|  DLRLR
					|  DGRGR
					|  TGRGRGR
					|  ANDEQ
					|  POWEQ
					|  OREQ
					;

ConditionalExpression : ConditionalOrExpression
					  | ConditionalOrExpression QM Expression COLON ConditionalExpression
					  ;

ConditionalOrExpression : ConditionalAndExpression
						| ConditionalOrExpression OR ConditionalAndExpression
						;

ConditionalAndExpression : InclusiveOrExpression
						 | ConditionalAndExpression AND InclusiveOrExpression
						 ;

InclusiveOrExpression : ExclusiveOrExpression
					  | InclusiveOrExpression BOR ExclusiveOrExpression
					  ;

ExclusiveOrExpression : AndExpression
					  | ExclusiveOrExpression POW AndExpression
					  ;	   

AndExpression : EqualityExpression
			  | AndExpression BAND EqualityExpression
			  ;
			  
EqualityExpression : RelationalExpression
				   | EqualityExpression EQEQ RelationalExpression
				   | EqualityExpression NEQ RelationalExpression
				   ;

RelationalExpression : ShiftExpression
					 | RelationalExpression LT ShiftExpression
					 | RelationalExpression GT ShiftExpression
					 | RelationalExpression LEQ ShiftExpression
					 | RelationalExpression GREQ ShiftExpression
					 | RelationalExpression INSTANCEOF ReferenceType
					 ;

ShiftExpression : AdditiveExpression
				| ShiftExpression LTLT AdditiveExpression
				| ShiftExpression GRGR AdditiveExpression
				| ShiftExpression GRGRGR AdditiveExpression
				;

AdditiveExpression : MultiplicativeExpression
				   | AdditiveExpression ADD MultiplicativeExpression
				   | AdditiveExpression SBTR MultiplicativeExpression
				   ;

MultiplicativeExpression : UnaryExpression
						 | MultiplicativeExpression MULT UnaryExpression
						 | MultiplicativeExpression DIV UnaryExpression
						 | MultiplicativeExpression MOD UnaryExpression
						 ;

UnaryExpression : PreIncrementExpression
				| PreDecrementExpression
				| ADD UnaryExpression
				| SBTR UnaryExpression
				| UnaryExpressionNotPlusMinus
				;

PreIncrementExpression : INCR UnaryExpression
					   ;

PreDecrementExpression : DECR UnaryExpression
					   ;

UnaryExpressionNotPlusMinus : PostfixExpression
							| TLD UnaryExpression
							| NT UnaryExpression
							| CastExpression
							;

PostfixExpression : Primary
                  | Name
                  | PostIncrementExpression
                  | PostDecrementExpression
                  ;

PostIncrementExpression : PostfixExpression INCR
						;

PostDecrementExpression : PostfixExpression DECR
						;

CastExpression : LSMB PrimitiveType Dims RSMB UnaryExpression
			   | LSMB Expression RSMB UnaryExpressionNotPlusMinus
			   | LSMB PrimitiveType RSMB UnaryExpression
			   | LSMB Name Dims RSMB UnaryExpressionNotPlusMinus
			   ;

ConstantExpression : Expression
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