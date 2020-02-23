%{
	#include<bits/stdc++.h>
	#include "lex.yy.c"
	extern "C" int yylex();
	extern "C" void yyerror(const char*);
	using namespace std;
%}

%token DIGIT
%token IDENTIFIER
%token BOOLEAN
%token ABSTRACT
%token ASSERT
%token BREAK
%token BYTE
%token CASE
%token CATCH
%token CHAR
%token CLASS
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
%token SC
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

%%





Identifier  :  IDENTIFIER
			;

Literal  :  LITERAL
		 ;

Type  :  PrimitiveType
	  |	 ReferenceType
	  ;

PrimitiveType  :  AnnotationRec NumericType
			   |  AnnotationRec BOOLEAN
			   ;

AnnotationRec  :  
			   |  Annotation AnnotationRec
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
			   |  TypeVariable
			   |  ArrayType
			   ;

ClassOrInterfaceType  :  ClassType
					  |  InterfaceType
					  ;

ClassType  :  AnnotationRec Identifier TypeArgumentsQues
		   |  ClassOrInterfaceType '.' AnnotationRec Identifier TypeArgumentsQues
		   ;

TypeArgumentsQues  :  
				   |  TypeArguments
				   ;

InterfaceType  :  ClassType
			   ;

TypeVariable  :  AnnotationRec Identifier
			  ;

ArrayType  :  PrimitiveType Dims
		   |  ClassOrInterfaceType Dims
		   |  TypeVariable Dims
		   ;

Dims  :  AnnotationRec '[' ']' AnnotationRecRec
	  ;

AnnotationRecRec  :  
				  |  AnnotationRec '[' ']' AnnotationRecRec
				  ;

TypeParameter  :  TypeParameterModifierRec Identifier TypeBoundQues
			   ;

TypeParameterModifierRec  :  
						  |  TypeParameterModifier TypeParameterModifierRec
						  ;

TypeBoundQues  :  
			   |  TypeBound
			   ;

TypeParameterModifier  :  Annotation
					   ;

TypeBound  :  EXTENDS TypeVariable
		   |  EXTENDS ClassOrInterfaceType AdditionalBoundRec
		   ;

AdditionalBoundRec  :  
					|  AdditionalBound AdditionalBoundRec
					;

AdditionalBound  :  '&' InterfaceType
				 ;

TypeArguments  :  '<' TypeArgumentList '>'	 
			   ;

TypeArgumentList  :  TypeArgument TypeArgumentCommaRec
				  ;

TypeArgumentComma  :  ',' TypeArgument
				   ;

TypeArgumentCommaRec  :  
					  |  TypeArgumentComma TypeArgumentCommaRec
					  ;

TypeArgument  :  ReferenceType
			  |  WildCard
			  ;

WildCard  :  AnnotationRec '?' WildCardBoundsQues
		  ;

WildCardBoundsQues  :  
					|  WildCardBounds
					;

WildCardBounds  :  EXTENDS ReferenceType
				|  SUPER ReferenceType
				;









TypeName  :  Identifier
		  |  PackageOrTypeName '.' Identifier
		  ;

PackageOrTypeName  :  Identifier
				   |  PackageOrTypeName '.' Identifier
				   ;

ExpressionName  :  Identifier
				|  AmbiguousName '.' Identifier
				;

MethodName  :  Identifier
			;

PackageName  :  Identifier
			 |  PackageName '.' Identifier
			 ;

AmbiguousName  :  Identifier
			  |  AmbiguousName '.' Identifier
			  ;











CompilationUnit  :  PackageDeclarationQues ImportDeclarationRec TypeDeclarationRec
				 ;

PackageDeclarationQues  : 
						|  PackageDeclaration
						;

ImportDeclarationRec  :
					  |  ImportDeclaration ImportDeclarationRec
					  ;

TypeDeclarationRec  :  
					|  TypeDeclaration TypeDeclarationRec
					;

PackageDeclaration  :  PackageModifierRec PACKAGE Identifier IdentifierDotRec ';'
					;

IdentifierDot  :  '.' Identifier
			   ;

IdentifierDotRec  :  
				  |  IdentifierDot IdentifierDotRec
				  ;

PackageModifierRec  :  
					|  PackageModifier PackageModifierRec
					;

PackageModifier  :  Annotation
				 ;

ImportDeclaration  :  SingleTypeImportDeclaration
				   |  TypeImportOnDemandDeclaration
				   |  SingleStaticImportDeclaration
				   |  StaticImportOnDemandDeclaration
				   ;

SingleTypeImportDeclaration  :  IMPORT TypeName ';'
							   ;

TypeImportOnDemandDeclaration  :  IMPORT PackageOrTypeName ".*" ';'
							   ;

SingleStaticImportDeclaration  :  IMPORT STATIC TypeName '.' Identifier ';'
							   ;

StaticImportOnDemandDeclaration  :  IMPORT STATIC TypeName ".*" ';'
								 ;

TypeDeclaration  :  ClassDeclaration 
				 |  InterfaceDeclaration
				 | ';'
				 ;












ClassDeclaration  :  NormalClassDeclaration
				  |  EnumDeclaration
				  ;

NormalClassDeclaration  :  ClassModifierRec CLASS Identifier TypeParametersQues SuperClassQues SuperinterfacesQues
						| ClassBody
						;

SuperinterfacesQues  :  
					 |  Superinterfaces
					 ;

ClassModifierRec  :
				  |  ClassModifier ClassModifierRec
				  ;

ClassModifier  :  Annotation
			   |  PUBLIC
			   |  PROTECTED
			   |  PRIVATE
			   |  ABSTRACT
			   |  STATIC
			   |  FINAL
			   |  STRICTFP
			   ;

TypeParametersQues  :  
				  |  TypeParameters
			   	  ;

TypeParameterList  :  TypeParameter TypeParameterCommaRec
				   ;

TypeParameterCommaRec  :  
					   |  TypeParameterComma TypeParameterCommaRec
					   ;

TypeParameterComma  :  ',' TypeParameter
					;

TypeParameters  :  '<' TypeParameterList '>'
			   ;

SuperClassQues  :  
				|  SuperClass
				;

SuperClass  :  EXTENDS ClassType
			;

Superinterfaces  :  IMPLEMENTS InterfaceTypeList
				;

InterfaceTypeList  :  InterfaceType InterfaceTypeCommaRec
				   ;

InterfaceTypeCommaRec  :  
					   | InterfaceTypeComma InterfaceTypeCommaRec
					   ;

InterfaceTypeComma  :  ',' InterfaceType

ClassBody  :  '{' ClassBodyDeclarationRec '}'
		   ;

ClassBodyDeclarationRec  :
			  |  ClassBodyDeclaration ClassBodyDeclarationRec
			  ;

ClassBodyDeclaration  :  ClassMemberDeclaration
					  |  InstanceInitializer
					  |  StaticInitializer
					  |  ConstructorDeclaration
					  ;

ClassMemberDeclaration  :  FieldDeclaration
						|  MethodDeclaration
						|  ClassDeclaration
						| InterfaceDeclaration
						| ';'
						;

FieldDeclaration  :  FieldModifierRec UnannType VariableDeclaratorList ';'
				  ;

FieldModifierRec  :
				  | FieldModifier FieldModifierRec
				  ;

FieldModifier  :  Annotation
			   |  PUBLIC
			   |  PROTECTED
			   |  PRIVATE
			   |  STATIC
			   |  FINAL
			   |  TRANSIENT
			   |  VOLATILE
			   ;

VariableDeclaratorList  :  VariableDeclarator VariableDeclaratorCommaRec
						 ;

VariableDeclaratorCommaRec  :  
							|  VariableDeclaratorComma VariableDeclaratorCommaRec
							;

VariableDeclaratorComma  :  ',' VariableDeclarator
						 ;

VariableDeclarator  :  VariableDeclaratorId VariableInitializerEqualQues
					;

VariableDeclaratorId  :  Identifier DimsQues
					  ;

VariableInitializerEqualQues  :  
							  |  VariableInitializerEqual
							  ;

VariableInitializerEqual  :  '=' VariableInitializer
						  ;

VariableInitializer  :  Expression
					 |  ArrayInitializer
					 ;

UnannType  :  UnannPrimitiveType
		   |  UnannReferenceType
		   ;

UnannPrimitiveType  :  NumericType
					|  BOOLEAN
					;

UnannReferenceType  :  UnannClassOrInterfaceType
					|  UnannTypeVariable
					|  UnannArrayType
					;

UnannClassOrInterfaceType  :  UnannClassType
						   |  UnannInterfaceType
						   ;

UnannClassType  :  Identifier TypeArgumentsQues
				|  UnannClassOrInterfaceType '.' AnnotationRec Identifier TypeArgumentsQues
				;

TypeArgumentsQues  :  
				   |  TypeArguments
				   ;

UnannInterfaceType  :  UnannClassType
					;

UnannTypeVariable  :  Identifier
				   ;

UnannArrayType  :  UnannPrimitiveType Dims
				|  UnannClassOrInterfaceType Dims
				|  UnannTypeVariable Dims
				;

MethodDeclaration  :  MethodModifierRec MethodHeader MethodBody
				   ;

MethodModifierRec  :  
				   |  MethodModifier MethodModifierRec
				   ;

MethodModifier  :  Annotation
				|  PUBLIC
				|  PROTECTED
				|  PRIVATE
				|  ABSTRACT
				|  STATIC
				|  FINAL
				|  SYNCHRONIZED
				|  NATIVE
				|  STRICTFP
				;

MethodHeader  :  Result MethodDeclarator ThrowsQues
			  |  TypeParameters AnnotationRec Result MethodDeclarator ThrowsQues
			  ;

Result  :  UnannType
		|  VOID
		;

MethodDeclarator  :  Identifier '(' FormalParameterListQues ')' DimsQues
				  ;

FormalParameterListQues  :  
						 |  FormalParameterList 
						 ;

FormalParameterList  :  ReceiverParameter
					 |  FormalParameters ',' LastFormalParameter
					 |  LastFormalParameter
					 ;

FormalParameters  :  FormalParameter FormalParameterCommaRec
				  |  ReceiverParameter FormalParameterCommaRec
				  ;

FormalParameterCommaRec  :  
						 |  FormalParameterComma FormalParameterCommaRec
						 ;

FormalParameterComma  :  ',' FormalParameter
					  ;

FormalParameter  :  VariableModifierRec UnannType VariableDeclaratorId 
				 ;

VariableModifierRec  :  
					 |  VariableModifier VariableModifierRec
					 ;

VariableModifier  :  Annotation
				  |  FINAL
				  ;

LastFormalParameter  :  VariableModifierRec UnannType AnnotationRec ThreeDots VariableDeclaratorId
					|  FormalParameter
					;

ThreeDots  :  '.' '.' '.'
		   ;

IdentifierDotQues  :  
				   | IdentifierDot
				   ;

ReceiverParameter  :  AnnotationRec UnannType IdentifierDotQues THIS
				  ;

ThrowsQues  :  
			|  Throws
			;

Throws  :   THROWS ExceptionTypeList
		;

ExceptionTypeList  :  ExceptionType ExceptionTypeCommaRec
				   ;

ExceptionTypeCommaRec  :  
					   |  ExceptionTypeComma ExceptionTypeCommaRec
					   ;

ExceptionTypeComma  :  ',' ExceptionType
					;

ExceptionType  :  ClassType
			   |  TypeVariable
			   ;

MethodBody  :  Block
			| ';'
			;

InstanceInitializer  :  Block
					;

StaticInitializer  :  STATIC Block
				   ;

ConstructorDeclaration  :  ConstructorModifierRec ConstructorDeclarator ThrowsQues ConstructorBody
						;

ConstructorModifierRec  :  
						|  ConstructorModifier ConstructorModifierRec
						;

ConstructorModifier  :  Annotation
					 |  PUBLIC
					 |  PROTECTED
					 |  PRIVATE
					 ;

ConstructorDeclarator  :  TypeParametersQues SimpleTypeName '(' FormalParameterListQues ')'
					   ;

FormalParameterListQues  : 
						 |  FormalParameterList
						 ;

SimpleTypeName  :  Identifier
				;

ConstructorBody  :  '{' ExplicitConstructorInvocationQues BlockStatementsQues '}'
				 ;

ExplicitConstructorInvocationQues  : 
								  |  ExplicitConstructorInvocation
								  ;

BlockStatementsQues  :  
					 |  BlockStatements
					 ;

ExplicitConstructorInvocation  :  TypeArgumentsQues THIS '(' ArgumentListQues ')' ';'
							  |  TypeArgumentsQues SUPER '(' ArgumentListQues ')' ';'
							  |  ExpressionName '.' TypeArgumentsQues SUPER '(' ArgumentListQues ')' ';'
							  |  Primary '.' TypeArgumentsQues SUPER '(' ArgumentListQues ')' ';'
							  ;

EnumDeclaration  :  ClassModifierRec ENUM Identifier SuperinterfacesQues EnumBody
				 ;

SuperinterfacesQues  :  
					 | Superinterfaces
					 ;

EnumBody  :  '{' EnumConstantListQues CommaQues EnumBodyDeclarationQues '}'
		  ;

EnumConstantListQues  :  
					  |  EnumConstantList
					  ;

EnumBodyDeclarationQues  :  
						 |  EnumBodyDeclaration
						 ;

EnumConstantList  :  EnumConstant EnumConstantCommaRec
				  ;

EnumConstantCommaRec  :  
					  |  EnumConstantComma EnumConstantCommaRec
					  ;

EnumConstantComma  :  ',' EnumConstant
				   ;

EnumConstant  :  EnumConstantModifierRec Identifier ArgumentListQuesBracQues ClassBodyQues
			  ;

ClassBodyQues  :  
			   |  ClassBody
			   ;


EnumConstantModifierRec  :  
						 |  EnumConstantModifier EnumConstantModifierRec
						 ;

ArgumentListQuesBracQues  :  
						  | ArgumentListQuesBrac
						  ;

ArgumentListQuesBrac  :  '(' ArgumentListQues ')'
					  ;

ArgumentListQues  :  
				  |  ArgumentList
				  ;

EnumConstantModifier  :  Annotation
					  ;

EnumBodyDeclaration  :  ';' ClassBodyDeclarationRec
					 ;

ClassBodyDeclarationRec  : 
					     |  ClassBodyDeclaration ClassBodyDeclarationRec
					     ;

ClassBodyQues  :  
			   |  ClassBody
			   ;











InterfaceDeclaration  :  NormalInterfaceDeclaration
					  |  AnnotationTypeDeclaration
					  ;

NormalInterfaceDeclaration  :  InterfaceModifierRec INTERFACE Identifier TypeParametersQues ExtendsInterfacesQues 
							|  InterfaceBody
							;

InterfaceModifierRec  :  
					  |  InterfaceModifier InterfaceModifierRec
					  ;

TypeParametersQues  :  
					|  TypeParameter
					;

ExtendsInterfacesQues  :  
					   |  ExtendsInterfaces
					   ;

InterfaceModifier  :  Annotation
				   |  ABSTRACT 
				   |  STATIC
				   |  STRICTFP
				   |  PUBLIC
				   |  PROTECTED
				   |  PRIVATE
				   ;

ExtendsInterfaces  :  EXTENDS InterfaceTypeList
				   ;

InterfaceBody  :  '{' InterfaceMemberDeclarationRec '}'
			   ;

InterfaceMemberDeclarationRec  :  
							   |  InterfaceMemberDeclaration InterfaceMemberDeclarationRec
							   ;

InterfaceMemberDeclaration  :  ConstantDeclaration
							|  InterfaceMethodDeclaration
							|  ClassDeclaration
							|  InterfaceDeclaration
							|  ';'
							;

ConstantDeclaration  :  ConstantModifierRec UnannType VariableDeclaratorList ';'
					 ;

ConstantModifierRec  :  
					 |  ConstantModifier ConstantModifierRec
					 ;

ConstantModifier  :  Annotation 
				  |  STATIC
				  |  FINAL
				  |  PUBLIC
				  ;

InterfaceMethodDeclaration  :  InterfaceMethodModifierRec MethodHeader MethodBody
							;

InterfaceMethodModifierRec  :  
							|  InterfaceMethodModifier InterfaceMethodModifierRec
							;

InterfaceMethodModifier  :  Annotation 
						 |  ABSTRACT
						 |  DEFAULT
						 |  STATIC
						 |  STRICTFP
						 |  PUBLIC
						 ;

AnnotationTypeDeclaration  :  InterfaceModifierRec '@' Identifier AnnotationTypeBody
						   ;

InterfaceModifierRec  :
					  |  InterfaceModifier InterfaceModifierRec
					  ;

AnnotationTypeBody  :  '{' AnnotationTypeMemberDeclarationRec '}'
					;

AnnotationTypeMemberDeclarationRec  :
									|  AnnotationTypeMemberDeclaration AnnotationTypeMemberDeclarationRec
									;

AnnotationTypeMemberDeclaration  :  AnnotationTypeElementDeclaration
								 |  ConstantDeclaration
								 |  ClassDeclaration
								 |  InterfaceDeclaration
								 |  ';'
								 ;

AnnotationTypeElementDeclaration  :  AnnotationTypeElementModifierRec UnannType Identifier '(' ')' DimsQues DefaultValueQues ';'
								  ;

AnnotationTypeElementModifierRec  :
								  |  AnnotationTypeElementModifier AnnotationTypeElementModifierRec
								  ;

DimsQues  : 
		  |  Dims
		  ;

DefaultValueQues  : 
				  |  DefaultValue
				  ;

AnnotationTypeElementModifier  :  Annotation
							   |  ABSTRACT
							   |  PUBLIC
							   ;

DefaultValue  :  DEFAULT ElementValue
			  ;

Annotation  :  NormalAnnotation
			|  MarkerAnnotation
			|  SingleElementAnnotation
			;

NormalAnnotation  :  '@' TypeName '(' ElementValuePairListQues ')'
				  ;

ElementValuePairListQues  :  
						  |  ElementValuePairList
						  ;

ElementValuePairList  :  ElementValuePair ElementValuePairCommaRec
					  ;

ElementValuePairCommaRec  :  
						  |  ElementValuePairComma ElementValuePairCommaRec
						  ;

ElementValuePairComma  :  ',' ElementValuePair
					   ;

ElementValuePair  :  Identifier '=' ElementValue
				  ;

ElementValue  :  ConditionalExpression
			  |  ElementValueArrayInitializer
			  |  Annotation
			  ;

ElementValueArrayInitializer  :  '{' ElementValueListQues CommaQues '}'
							  ;

ElementValueListQues  :  
					  |  ElementValueList
					  ;

CommaQues  :  
		   |  ','
		   ;

ElementValueList  :  ElementValue ElementValueCommaRec
				  ;

ElementValueCommaRec  :  
					  |  ElementValueComma ElementValueCommaRec
					  ;

ElementValueComma  :  ',' ElementValue
				   ;

MarkerAnnotation  :  '@' TypeName
				  ;

SingleElementAnnotation  :  '@' TypeName '(' ElementValue ')'
						 ;











ArrayInitializer : '{' VariableInitializerListQues CommaQues '}'
				 ;

VariableInitializerListQues  :  
							 |  VariableInitializerList
							 ;

VariableInitializerList : VariableInitializer VariableInitializerCommaRec
						;

VariableInitializerCommaRec  :  
							 |  VariableInitializerComma VariableInitializerCommaRec
							 ;

VariableInitializerComma  :  ',' VariableInitializer
						  ;











Block : '{' BlockStatementsQues '}'
	  ;

BlockStatements : BlockStatement BlockStatementRec
				;

BlockStatementRec  :  
				   |  BlockStatement BlockStatementRec
				   ;
BlockStatementsQues  :  
				   |  BlockStatement
				   ;

BlockStatement : LocalVariableDeclarationStatement
			   | ClassDeclaration
			   | Statement
			   ;

LocalVariableDeclarationStatement : LocalVariableDeclaration ';'
								  ;

LocalVariableDeclaration : VariableModifierRec UnannType VariableDeclaratorList
						 ;

VariableModifierRec  :
					 |  VariableModifier VariableModifierRec
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
									 | AssertStatement
									 | SwitchStatement
									 | DoStatement
									 | BreakStatement
									 | ContinueStatement
									 | ReturnStatement
									 | SynchronizedStatement
									 | ThrowStatement
									 | TryStatement
									 ;
EmptyStatement : ';'
			   ;

LabeledStatement : Identifier ':' Statement
				 ;

LabeledStatementNoShortIf : Identifier ':' StatementNoShortIf
						  ;

ExpressionStatement : StatementExpression ';'
					;

StatementExpression : Assignment
					| PreIncrementExpression
					| PreDecrementExpression
					| PostIncrementExpression
					| PostDecrementExpression
					| MethodInvocation
					| ClassInstanceCreationExpression
					;

IfThenStatement : IF '(' Expression ')' Statement
				;

IfThenElseStatement : IF '(' Expression ')' StatementNoShortIf ELSE Statement
					;

IfThenElseStatementNoShortIf : IF '(' Expression ')' StatementNoShortIf ELSE StatementNoShortIf
							 ;

AssertStatement : ASSERT Expression ';'
				| ASSERT Expression ':' Expression ';'
				;

SwitchStatement : SWITCH '(' Expression ')' SwitchBlock
				;

SwitchBlock : '{' SwitchBlockStatementGroupRec SwitchLabelRec '}'
			;

SwitchBlockStatementGroupRec  :  
							  |  SwitchBlockStatementGroup SwitchBlockStatementGroupRec
							  ;

SwitchLabelRec  :  
				|  SwitchLabel SwitchLabelRec
				;

SwitchBlockStatementGroup : SwitchLabels BlockStatements
						  ;

SwitchLabels : SwitchLabel SwitchLabelRec
			 ;

SwitchLabel : CASE ConstantExpression ':'
			| CASE EnumConstantName ':'
			| DEFAULT ':'
			;

EnumConstantName : Identifier
				 ;

WhileStatement : WHILE '(' Expression ')' Statement
			   ;

WhileStatementNoShortIf : WHILE '(' Expression ')' StatementNoShortIf
						;

DoStatement : DO Statement WHILE '(' Expression ')' ';'
			;

ForStatement : BasicForStatement
			 | EnhancedForStatement
			 ;

ForStatementNoShortIf : BasicForStatementNoShortIf
					  | EnhancedForStatementNoShortIf
					  ;

BasicForStatement : FOR '(' ForInitQues ';' ExpressionQues ';' ForUpdateques ')' Statement
				  ;

BasicForStatementNoShortIf : FOR '(' ForInitQues ';' ExpressionQues ';' ForUpdateques ')' StatementNoShortIf
						   ;

ForInitQues  :  
			 |  ForInit
			 ;

ExpressionQues  :  
				|  Expression
				;

ForUpdateques  :  
			   |  ForUpdate
			   ;

ForInit : StatementExpressionList
		| LocalVariableDeclaration
		;

ForUpdate : StatementExpressionList
		  ;

StatementExpressionList : StatementExpression StatementExpressionCommaRec
						;

StatementExpressionCommaRec  :  
							 |  StatementExpressionComma StatementExpressionCommaRec
							 ;

StatementExpressionComma  :  ',' StatementExpression
						  ;

EnhancedForStatement : FOR '(' VariableModifierRec UnannType VariableDeclaratorId ':' Expression ')' Statement
					 ;

EnhancedForStatementNoShortIf : FOR '(' VariableModifierRec UnannType VariableDeclaratorId ':' Expression ')' StatementNoShortIf
							  ;

BreakStatement : BREAK IdentifierQues ';'
			   ;

IdentifierQues  :  
				|  Identifier
				;

ContinueStatement : CONTINUE IdentifierQues ';'
				  ;

ReturnStatement : RETURN ExpressionQues ';'
				;

ThrowStatement : THROW Expression ';'
			   ;

SynchronizedStatement : SYNCHRONIZED '(' Expression ')' Block
					  ;

TryStatement : TRY Block Catches
			 | TRY Block CatchesQues Finally
			 | TryWithResourcesStatement
			 ;

CatchesQues  :  
			 |  Catches
			 ;

CatchClauseRec  :  
				|  CatchClause CatchClauseRec
				;

Catches : CatchClause CatchClauseRec
		;

CatchClause  :  CATCH '(' CatchFormalParameter ')' Block
			 ;

CatchFormalParameter : VariableModifierRec CatchType VariableDeclaratorId
					 ;

CatchType : UnannClassType ClassTypeVersepRec
		  ;

ClassTypeVersepRec  :  
					|  ClassTypeVersep ClassTypeVersepRec
					;

ClassTypeVersep  : '|' ClassType
					;

Finally : FINALLY Block
		;

TryWithResourcesStatement : TRY ResourceSpecification Block CatchesQues FinallyQues
						  ;

FinallyQues  :  
			 |  Finally
			 ;

ResourceSpecification : '(' ResourceList SemicolonQues ')'
					  ;

SemicolonQues  :  
			   |  Semicolon
			   ;

Semicolon  :  ';'
		   ;

ResourceList : Resource ResourceSemicolonRec
			 ;

ResourceSemicolonRec  :
					  |  ResourceSemicolon ResourceSemicolonRec
					  ;

ResourceSemicolon  :  ';' Resource
				   ;

Resource : VariableModifierRec UnannType VariableDeclaratorId '=' Expression
		 ;














Primary : PrimaryNoNewArray
		| ArrayCreationExpression
		;

PrimaryNoNewArray : Literal
				  | ClassLiteral
				  | THIS
				  | TypeName '.' THIS
				  |	'(' Expression ')'
				  | ClassInstanceCreationExpression
				  | FieldAccess
				  | ArrayAccess
				  | MethodInvocation
				  | MethodReference
				  ;

ClassLiteral : TypeName SqaureBracketRec '.' CLASS
			 | NumericType SqaureBracketRec '.' CLASS
			 | BOOLEAN SqaureBracketRec '.' CLASS
			 | VOID '.' CLASS
			 ;

SqaureBracketRec  :  
				  |  SqaureBracket SqaureBracketRec
				  ;

SqaureBracket : '[' ']'
			  ;

ClassInstanceCreationExpression : UnqualifiedClassInstanceCreationExpression
								| ExpressionName '.' UnqualifiedClassInstanceCreationExpression
								| Primary '.' UnqualifiedClassInstanceCreationExpression
								;

UnqualifiedClassInstanceCreationExpression : NEW TypeArgumentsQues ClassOrInterfaceTypeToInstantiate '(' ArgumentListQues ')' ClassBodyQues
										   ;

ClassOrInterfaceTypeToInstantiate : AnnotationRec Identifier AnnotationRecDotIdentifierRec TypeArgumentsOrDiamondQues
								  ;

AnnotationRecDotIdentifierRec  :  
							   |  AnnotationRecDotIdentifier AnnotationRecDotIdentifierRec
							   ;

AnnotationRecDotIdentifier  :  AnnotationRecDot Identifier
							;

AnnotationRecDot  :  '.' AnnotationRec
				  ;

TypeArgumentsOrDiamondQues  :  
							|  TypeArgumentsOrDiamond
							;

TypeArgumentsOrDiamond : TypeArguments
					   | '<''>'
					   ;

FieldAccess : Primary '.' Identifier
			| SUPER '.' Identifier
			| TypeName '.' SUPER '.' Identifier
			;

ArrayAccess : ExpressionName '[' Expression ']'
			| PrimaryNoNewArray '[' Expression ']'
			;

MethodInvocation : MethodName '(' ArgumentListQues ')'
				 | TypeName '.' TypeArgumentsQues Identifier '(' ArgumentListQues ')'
				 | ExpressionName '.' TypeArgumentsQues Identifier '(' ArgumentListQues ')'
				 | Primary '.' TypeArgumentsQues Identifier '(' ArgumentListQues ')'
				 | SUPER '.' TypeArgumentsQues Identifier '(' ArgumentListQues ')'
				 | TypeName '.' SUPER '.' TypeArgumentsQues Identifier '(' ArgumentListQues ')'
				 ;

ArgumentList : Expression ExpressionCommaRec
			 ;

ExpressionCommaRec  :  
					|  ExpressionComma
					;

ExpressionComma  :  ',' Expression
				 ;

MethodReference : ExpressionName DoubleColon TypeArgumentsQues Identifier
				| ReferenceType DoubleColon TypeArgumentsQues Identifier
				| Primary DoubleColon TypeArgumentsQues Identifier
				| SUPER DoubleColon TypeArgumentsQues Identifier
				| TypeName '.' SUPER DoubleColon TypeArgumentsQues Identifier
				| ClassType DoubleColon TypeArgumentsQues NEW
				| ArrayType DoubleColon NEW
				;

DoubleColon  :  Colon Colon
			 ;

Colon  :  ':'
	   ;

ArrayCreationExpression : NEW PrimitiveType DimExprs DimsQues
						| NEW ClassOrInterfaceType DimExprs DimsQues
						| NEW PrimitiveType Dims ArrayInitializer
						| NEW ClassOrInterfaceType Dims ArrayInitializer
						;

DimExprs : DimExpr DimExprRec
		 ;

DimExprRec  :  
			|  DimExpr DimExprRec
			;

DimExpr : AnnotationRec '[' Expression ']'
		;

Expression : LambdaExpression
		   | AssignmentExpression
		   ;

LambdaExpression : LambdaParameters Arrow LambdaBody
				 ;

Arrow  :  Dash GreaterThan
	   ;

Dash  :  '-'
	  ;

GreaterThan  :  '>'
			 ;

LambdaParameters : Identifier
				 | '(' FormalParameterListQues ')'
				 | '(' InferredFormalParameterList ')'
				 ;

InferredFormalParameterList : Identifier IdentifierCommaRec
							;

IdentifierCommaRec  :  
					|  IdentifierComma IdentifierCommaRec
					;

IdentifierComma  :  
				 |  ',' Identifier
				 ;

LambdaBody : Expression
		   | Block
		   ;

AssignmentExpression  :  ConditionalExpression
					  |  Assignment
					  ;

Assignment  :  LeftHandSide AssignmentOperator Expression
		    ;

LeftHandSide  :  ExpressionName
			  |  FieldAccess
			  |  ArrayAccess
			  ;

MultiplyEquaTo  :  '*' EqualTo
				;

DivideEqualTo  :  '/' EqualTo
			   ;

ModuloEqualTo  :  '%' EqualTo
			   ;

AddEqualTo  :  '+' EqualTo
			;

SubtractEqualTo  :  '-' EqualTo
				 ;

DoubleLessEqualTo  :  '<' LessEqualTo
				   ;

LessEqualTo  :  '<' EqualTo
			 ;

DoubleGreaterEqualTo  :  '>' GreaterEqualTo
				   ;

GreaterEqualTo  :  '>' EqualTo
			 ;

TripleGreaterEqualTo  :  '>' DoubleGreaterEqualTo
					  ;

AmpressandEqualTo  :  '&' EqualTo
				   ;

CaratEqualTo  :  '^' EqualTo
			  ;

OrEqualTo  :  '|' EqualTo
		   ;

AssignmentOperator  :  EqualTo
					|  MultiplyEquaTo
					|  DivideEqualTo
					|  ModuloEqualTo
					|  AddEqualTo
					|  SubtractEqualTo
					|  DoubleLessEqualTo
					|  DoubleGreaterEqualTo
					|  TripleGreaterEqualTo
					|  AmpressandEqualTo
					|  CaratEqualTo
					|  OrEqualTo
					;

ConditionalExpression : ConditionalOrExpression
					  | ConditionalOrExpression '?' Expression ':' ConditionalExpression
					  | ConditionalOrExpression '?' Expression ':' LambdaExpression
					  ;

ConditionalOrExpression : ConditionalAndExpression
						| ConditionalOrExpression DoubleOr ConditionalAndExpression
						;

DoubleOr  :  Or Or
		  ;

Or  :  '|'
	;

ConditionalAndExpression : InclusiveOrExpression
						 | ConditionalAndExpression DoubleAnd InclusiveOrExpression
						 ;

DoubleAnd  :  And And
		  ;

And  :  '&'
	;

InclusiveOrExpression : ExclusiveOrExpression
					  | InclusiveOrExpression Or ExclusiveOrExpression
					  ;

ExclusiveOrExpression : AndExpression
					  | ExclusiveOrExpression Carat AndExpression
					  ;

Carat  :  '^'
	   ;

EqualTo  :  '='
		 ;

GreaterThan  :  '>'
			 ;

LessThan  :  '<'
		  ;

Not  :  '!'
	 ;	   

AndExpression : EqualityExpression
			  | AndExpression And EqualityExpression
			  ;
			  
EqualityExpression : RelationalExpression
				   | EqualityExpression DoubleEqualTo RelationalExpression
				   | EqualityExpression Not EqualTo RelationalExpression
				   ;

DoubleEqualTo  :  EqualTo EqualTo
			   ;

RelationalExpression : ShiftExpression
					 | RelationalExpression LessThan ShiftExpression
					 | RelationalExpression GreaterThan ShiftExpression
					 | RelationalExpression LessThan EqualTo ShiftExpression
					 | RelationalExpression GreaterThan EqualTo ShiftExpression
					 | RelationalExpression INSTANCEOF ReferenceType
					 ;

ShiftExpression : AdditiveExpression
				| ShiftExpression LessThan LessThan AdditiveExpression
				| ShiftExpression GreaterThan GreaterThan AdditiveExpression
				| ShiftExpression GreaterThan GreaterThan GreaterThan AdditiveExpression
				;

AdditiveExpression : MultiplicativeExpression
				   | AdditiveExpression '+' MultiplicativeExpression
				   | AdditiveExpression '-' MultiplicativeExpression
				   ;

MultiplicativeExpression : UnaryExpression
						 | MultiplicativeExpression '*' UnaryExpression
						 | MultiplicativeExpression '/' UnaryExpression
						 | MultiplicativeExpression '%' UnaryExpression
						 ;

UnaryExpression : PreIncrementExpression
				| PreDecrementExpression
				| '+' UnaryExpression
				| '-' UnaryExpression
				| UnaryExpressionNotPlusMinus
				;

Add  :  '+'
	 ;

Subtract  :  '-'
		  ;

DoubleAdd  :  Add Add
		   ;

DoubleSubtract  :  Subtract Subtract
				;

PreIncrementExpression : DoubleAdd UnaryExpression
					   ;

PreDecrementExpression : DoubleSubtract UnaryExpression
					   ;

UnaryExpressionNotPlusMinus : PostfixExpression
							| '~' UnaryExpression
							| '!' UnaryExpression
							| CastExpression
							;

PostfixExpression : Primary
                  | ExpressionName
                  | PostIncrementExpression
                  | PostDecrementExpression
                  ;

PostIncrementExpression : PostfixExpression DoubleAdd
						;

PostDecrementExpression : PostfixExpression DoubleSubtract
						;

CastExpression : '(' PrimitiveType ')' UnaryExpression
			   | '(' ReferenceType AdditionalBoundRec ')' UnaryExpressionNotPlusMinus
			   | '(' ReferenceType AdditionalBoundRec ')' LambdaExpression
			   ;

ConstantExpression : Expression
				   ;












%%

int main () {
	yyparse();

	if(error){
		cerr << "Syntax Error. Check Your Thesis" <<endl;
		return 0;
	}

	return 0;
}

void yyerror (char *s) {
} 