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
%token DSCLN
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
		   |  ClassOrInterfaceType FST AnnotationRec Identifier TypeArgumentsQues
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

Dims  :  AnnotationRec LSQB RSQB AnnotationRecRec
	  ;

AnnotationRecRec  :  
				  |  AnnotationRec LSQB RSQB AnnotationRecRec
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

AdditionalBound  :  BAND InterfaceType
				 ;

TypeArguments  :  LT TypeArgumentList GT	 
			   ;

TypeArgumentList  :  TypeArgument TypeArgumentCommaRec
				  ;

TypeArgumentComma  :  CMA TypeArgument
				   ;

TypeArgumentCommaRec  :  
					  |  TypeArgumentComma TypeArgumentCommaRec
					  ;

TypeArgument  :  ReferenceType
			  |  WildCard
			  ;

WildCard  :  AnnotationRec QM WildCardBoundsQues
		  ;

WildCardBoundsQues  :  
					|  WildCardBounds
					;

WildCardBounds  :  EXTENDS ReferenceType
				|  SUPER ReferenceType
				;









TypeName  :  Identifier
		  |  PackageOrTypeName FST Identifier
		  ;

PackageOrTypeName  :  Identifier
				   |  PackageOrTypeName FST Identifier
				   ;

ExpressionName  :  Identifier
				|  AmbiguousName FST Identifier
				;

MethodName  :  Identifier
			;

PackageName  :  Identifier
			 |  PackageName FST Identifier
			 ;

AmbiguousName  :  Identifier
			  |  AmbiguousName FST Identifier
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

PackageDeclaration  :  PackageModifierRec PACKAGE Identifier IdentifierDotRec SCLN
					;

IdentifierDot  :  FST Identifier
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

SingleTypeImportDeclaration  :  IMPORT TypeName SCLN
							   ;

TypeImportOnDemandDeclaration  :  IMPORT PackageOrTypeName ".*" SCLN
							   ;

SingleStaticImportDeclaration  :  IMPORT STATIC TypeName FST Identifier SCLN
							   ;

StaticImportOnDemandDeclaration  :  IMPORT STATIC TypeName ".*" SCLN
								 ;

TypeDeclaration  :  ClassDeclaration 
				 |  InterfaceDeclaration
				 | SCLN
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

TypeParameterComma  :  CMA TypeParameter
					;

TypeParameters  :  LT TypeParameterList GT
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

InterfaceTypeComma  :  CMA InterfaceType

ClassBody  :  LCB ClassBodyDeclarationRec RCB
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
						| SCLN
						;

FieldDeclaration  :  FieldModifierRec UnannType VariableDeclaratorList SCLN
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

VariableDeclaratorComma  :  CMA VariableDeclarator
						 ;

VariableDeclarator  :  VariableDeclaratorId VariableInitializerEqualQues
					;

VariableDeclaratorId  :  Identifier DimsQues
					  ;

VariableInitializerEqualQues  :  
							  |  VariableInitializerEqual
							  ;

VariableInitializerEqual  :  EQ VariableInitializer
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
				|  UnannClassOrInterfaceType FST AnnotationRec Identifier TypeArgumentsQues
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

MethodDeclarator  :  Identifier LSMB FormalParameterListQues RSMB DimsQues
				  ;

FormalParameterListQues  :  
						 |  FormalParameterList 
						 ;

FormalParameterList  :  ReceiverParameter
					 |  FormalParameters CMA LastFormalParameter
					 |  LastFormalParameter
					 ;

FormalParameters  :  FormalParameter FormalParameterCommaRec
				  |  ReceiverParameter FormalParameterCommaRec
				  ;

FormalParameterCommaRec  :  
						 |  FormalParameterComma FormalParameterCommaRec
						 ;

FormalParameterComma  :  CMA FormalParameter
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

ThreeDots  :  TDT
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

ExceptionTypeComma  :  CMA ExceptionType
					;

ExceptionType  :  ClassType
			   |  TypeVariable
			   ;

MethodBody  :  Block
			| SCLN
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

ConstructorDeclarator  :  TypeParametersQues SimpleTypeName LSMB FormalParameterListQues RSMB
					   ;

FormalParameterListQues  : 
						 |  FormalParameterList
						 ;

SimpleTypeName  :  Identifier
				;

ConstructorBody  :  LCB ExplicitConstructorInvocationQues BlockStatementsQues RCB
				 ;

ExplicitConstructorInvocationQues  : 
								  |  ExplicitConstructorInvocation
								  ;

BlockStatementsQues  :  
					 |  BlockStatements
					 ;

ExplicitConstructorInvocation  :  TypeArgumentsQues THIS LSMB ArgumentListQues RSMB SCLN
							  |  TypeArgumentsQues SUPER LSMB ArgumentListQues RSMB SCLN
							  |  ExpressionName FST TypeArgumentsQues SUPER LSMB ArgumentListQues RSMB SCLN
							  |  Primary FST TypeArgumentsQues SUPER LSMB ArgumentListQues RSMB SCLN
							  ;

EnumDeclaration  :  ClassModifierRec ENUM Identifier SuperinterfacesQues EnumBody
				 ;

SuperinterfacesQues  :  
					 | Superinterfaces
					 ;

EnumBody  :  LCB EnumConstantListQues CommaQues EnumBodyDeclarationQues RCB
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

EnumConstantComma  :  CMA EnumConstant
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

ArgumentListQuesBrac  :  LSMB ArgumentListQues RSMB
					  ;

ArgumentListQues  :  
				  |  ArgumentList
				  ;

EnumConstantModifier  :  Annotation
					  ;

EnumBodyDeclaration  :  SCLN ClassBodyDeclarationRec
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

InterfaceBody  :  LCB InterfaceMemberDeclarationRec RCB
			   ;

InterfaceMemberDeclarationRec  :  
							   |  InterfaceMemberDeclaration InterfaceMemberDeclarationRec
							   ;

InterfaceMemberDeclaration  :  ConstantDeclaration
							|  InterfaceMethodDeclaration
							|  ClassDeclaration
							|  InterfaceDeclaration
							|  SCLN
							;

ConstantDeclaration  :  ConstantModifierRec UnannType VariableDeclaratorList SCLN
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

AnnotationTypeDeclaration  :  InterfaceModifierRec ATR Identifier AnnotationTypeBody
						   ;

InterfaceModifierRec  :
					  |  InterfaceModifier InterfaceModifierRec
					  ;

AnnotationTypeBody  :  LCB AnnotationTypeMemberDeclarationRec RCB
					;

AnnotationTypeMemberDeclarationRec  :
									|  AnnotationTypeMemberDeclaration AnnotationTypeMemberDeclarationRec
									;

AnnotationTypeMemberDeclaration  :  AnnotationTypeElementDeclaration
								 |  ConstantDeclaration
								 |  ClassDeclaration
								 |  InterfaceDeclaration
								 |  SCLN
								 ;

AnnotationTypeElementDeclaration  :  AnnotationTypeElementModifierRec UnannType Identifier LSMB RSMB DimsQues DefaultValueQues SCLN
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

NormalAnnotation  :  ATR TypeName LSMB ElementValuePairListQues RSMB
				  ;

ElementValuePairListQues  :  
						  |  ElementValuePairList
						  ;

ElementValuePairList  :  ElementValuePair ElementValuePairCommaRec
					  ;

ElementValuePairCommaRec  :  
						  |  ElementValuePairComma ElementValuePairCommaRec
						  ;

ElementValuePairComma  :  CMA ElementValuePair
					   ;

ElementValuePair  :  Identifier ET ElementValue
				  ;

ElementValue  :  ConditionalExpression
			  |  ElementValueArrayInitializer
			  |  Annotation
			  ;

ElementValueArrayInitializer  :  LCB ElementValueListQues CommaQues RCB
							  ;

ElementValueListQues  :  
					  |  ElementValueList
					  ;

CommaQues  :  
		   |  CMA
		   ;

ElementValueList  :  ElementValue ElementValueCommaRec
				  ;

ElementValueCommaRec  :  
					  |  ElementValueComma ElementValueCommaRec
					  ;

ElementValueComma  :  CMA ElementValue
				   ;

MarkerAnnotation  :  ATR TypeName
				  ;

SingleElementAnnotation  :  ATR TypeName LSMB ElementValue RSMB
						 ;











ArrayInitializer : LCB VariableInitializerListQues CommaQues RCB
				 ;

VariableInitializerListQues  :  
							 |  VariableInitializerList
							 ;

VariableInitializerList : VariableInitializer VariableInitializerCommaRec
						;

VariableInitializerCommaRec  :  
							 |  VariableInitializerComma VariableInitializerCommaRec
							 ;

VariableInitializerComma  :  CMA VariableInitializer
						  ;











Block : LCB BlockStatementsQues RCB
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

LocalVariableDeclarationStatement : LocalVariableDeclaration SCLN
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
EmptyStatement : SCLN
			   ;

LabeledStatement : Identifier SC Statement
				 ;

LabeledStatementNoShortIf : Identifier SC StatementNoShortIf
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

AssertStatement : ASSERT Expression SCLN
				| ASSERT Expression SC Expression SCLN
				;

SwitchStatement : SWITCH LSMB Expression RSMB SwitchBlock
				;

SwitchBlock : LCB SwitchBlockStatementGroupRec SwitchLabelRec RCB
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

SwitchLabel : CASE ConstantExpression SC
			| CASE EnumConstantName SC
			| DEFAULT SC
			;

EnumConstantName : Identifier
				 ;

WhileStatement : WHILE LSMB Expression RSMB Statement
			   ;

WhileStatementNoShortIf : WHILE LSMB Expression RSMB StatementNoShortIf
						;

DoStatement : DO Statement WHILE LSMB Expression RSMB SCLN
			;

ForStatement : BasicForStatement
			 | EnhancedForStatement
			 ;

ForStatementNoShortIf : BasicForStatementNoShortIf
					  | EnhancedForStatementNoShortIf
					  ;

BasicForStatement : FOR LSMB ForInitQues SCLN ExpressionQues SCLN ForUpdateques RSMB Statement
				  ;

BasicForStatementNoShortIf : FOR LSMB ForInitQues SCLN ExpressionQues SCLN ForUpdateques RSMB StatementNoShortIf
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

StatementExpressionComma  :  CMA StatementExpression
						  ;

EnhancedForStatement : FOR LSMB VariableModifierRec UnannType VariableDeclaratorId SC Expression RSMB Statement
					 ;

EnhancedForStatementNoShortIf : FOR LSMB VariableModifierRec UnannType VariableDeclaratorId SC Expression RSMB StatementNoShortIf
							  ;

BreakStatement : BREAK IdentifierQues SCLN
			   ;

IdentifierQues  :  
				|  Identifier
				;

ContinueStatement : CONTINUE IdentifierQues SCLN
				  ;

ReturnStatement : RETURN ExpressionQues SCLN
				;

ThrowStatement : THROW Expression SCLN
			   ;

SynchronizedStatement : SYNCHRONIZED LSMB Expression RSMB Block
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

CatchClause  :  CATCH LSMB CatchFormalParameter RSMB Block
			 ;

CatchFormalParameter : VariableModifierRec CatchType VariableDeclaratorId
					 ;

CatchType : UnannClassType ClassTypeVersepRec
		  ;

ClassTypeVersepRec  :  
					|  ClassTypeVersep ClassTypeVersepRec
					;

ClassTypeVersep  : BOR ClassType
					;

Finally : FINALLY Block
		;

TryWithResourcesStatement : TRY ResourceSpecification Block CatchesQues FinallyQues
						  ;

FinallyQues  :  
			 |  Finally
			 ;

ResourceSpecification : LSMB ResourceList SemicolonQues RSMB
					  ;

SemicolonQues  :  
			   |  Semicolon
			   ;

Semicolon  :  SCLN
		   ;

ResourceList : Resource ResourceSemicolonRec
			 ;

ResourceSemicolonRec  :
					  |  ResourceSemicolon ResourceSemicolonRec
					  ;

ResourceSemicolon  :  SCLN Resource
				   ;

Resource : VariableModifierRec UnannType VariableDeclaratorId ET Expression
		 ;














Primary : PrimaryNoNewArray
		| ArrayCreationExpression
		;

PrimaryNoNewArray : Literal
				  | ClassLiteral
				  | THIS
				  | TypeName FST THIS
				  |	LSMB Expression RSMB
				  | ClassInstanceCreationExpression
				  | FieldAccess
				  | ArrayAccess
				  | MethodInvocation
				  | MethodReference
				  ;

ClassLiteral : TypeName SqaureBracketRec FST CLASS
			 | NumericType SqaureBracketRec FST CLASS
			 | BOOLEAN SqaureBracketRec FST CLASS
			 | VOID FST CLASS
			 ;

SqaureBracketRec  :  
				  |  SqaureBracket SqaureBracketRec
				  ;

SqaureBracket : LSQB RSQB
			  ;

ClassInstanceCreationExpression : UnqualifiedClassInstanceCreationExpression
								| ExpressionName FST UnqualifiedClassInstanceCreationExpression
								| Primary FST UnqualifiedClassInstanceCreationExpression
								;

UnqualifiedClassInstanceCreationExpression : NEW TypeArgumentsQues ClassOrInterfaceTypeToInstantiate LSMB ArgumentListQues RSMB ClassBodyQues
										   ;

ClassOrInterfaceTypeToInstantiate : AnnotationRec Identifier AnnotationRecDotIdentifierRec TypeArgumentsOrDiamondQues
								  ;

AnnotationRecDotIdentifierRec  :  
							   |  AnnotationRecDotIdentifier AnnotationRecDotIdentifierRec
							   ;

AnnotationRecDotIdentifier  :  AnnotationRecDot Identifier
							;

AnnotationRecDot  :  FST AnnotationRec
				  ;

TypeArgumentsOrDiamondQues  :  
							|  TypeArgumentsOrDiamond
							;

TypeArgumentsOrDiamond : TypeArguments
					   | LTGT
					   ;

FieldAccess : Primary FST Identifier
			| SUPER FST Identifier
			| TypeName FST SUPER FST Identifier
			;

ArrayAccess : ExpressionName LSQB Expression RSQB
			| PrimaryNoNewArray LSQB Expression RSQB
			;

MethodInvocation : MethodName LSMB ArgumentListQues RSMB
				 | TypeName FST TypeArgumentsQues Identifier LSMB ArgumentListQues RSMB
				 | ExpressionName FST TypeArgumentsQues Identifier LSMB ArgumentListQues RSMB
				 | Primary FST TypeArgumentsQues Identifier LSMB ArgumentListQues RSMB
				 | SUPER FST TypeArgumentsQues Identifier LSMB ArgumentListQues RSMB
				 | TypeName FST SUPER FST TypeArgumentsQues Identifier LSMB ArgumentListQues RSMB
				 ;

ArgumentList : Expression ExpressionCommaRec
			 ;

ExpressionCommaRec  :  
					|  ExpressionComma
					;

ExpressionComma  :  CMA Expression
				 ;

MethodReference : ExpressionName DoubleColon TypeArgumentsQues Identifier
				| ReferenceType DoubleColon TypeArgumentsQues Identifier
				| Primary DoubleColon TypeArgumentsQues Identifier
				| SUPER DoubleColon TypeArgumentsQues Identifier
				| TypeName FST SUPER DoubleColon TypeArgumentsQues Identifier
				| ClassType DoubleColon TypeArgumentsQues NEW
				| ArrayType DoubleColon NEW
				;

DoubleColon  :  Colon Colon
			 ;

Colon  :  SC
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

DimExpr : AnnotationRec LSQB Expression RSQB
		;

Expression : LambdaExpression
		   | AssignmentExpression
		   ;

LambdaExpression : LambdaParameters Arrow LambdaBody
				 ;

Arrow  :  AR
	   ;

Dash  :  SBTR
	  ;

GreaterThan  :  GT
			 ;

LambdaParameters : Identifier
				 | LSMB FormalParameterListQues RSMB
				 | LSMB InferredFormalParameterList RSMB
				 ;

InferredFormalParameterList : Identifier IdentifierCommaRec
							;

IdentifierCommaRec  :  
					|  IdentifierComma IdentifierCommaRec
					;

IdentifierComma  :  
				 |  CMA Identifier
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

MultiplyEquaTo  :  MULT EqualTo
				;

DivideEqualTo  :  DIV EqualTo
			   ;

ModuloEqualTo  :  MOD EqualTo
			   ;

AddEqualTo  :  ADD EqualTo
			;

SubtractEqualTo  :  SBTR EqualTo
				 ;

DoubleLessEqualTo  :  LT LessEqualTo
				   ;

LessEqualTo  :  LT EqualTo
			 ;

DoubleGreaterEqualTo  :  GT GreaterEqualTo
				   ;

GreaterEqualTo  :  GT EqualTo
			 ;

TripleGreaterEqualTo  :  GT DoubleGreaterEqualTo
					  ;

AmpressandEqualTo  :  BAND EqualTo
				   ;

CaratEqualTo  :  POW EqualTo
			  ;

OrEqualTo  :  BOR EqualTo
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
					  | ConditionalOrExpression QM Expression SC ConditionalExpression
					  | ConditionalOrExpression QM Expression SC LambdaExpression
					  ;

ConditionalOrExpression : ConditionalAndExpression
						| ConditionalOrExpression DoubleOr ConditionalAndExpression
						;

DoubleOr  :  Or Or
		  ;

Or  :  BOR
	;

ConditionalAndExpression : InclusiveOrExpression
						 | ConditionalAndExpression DoubleAnd InclusiveOrExpression
						 ;

DoubleAnd  :  And And
		  ;

And  :  BAND
	;

InclusiveOrExpression : ExclusiveOrExpression
					  | InclusiveOrExpression Or ExclusiveOrExpression
					  ;

ExclusiveOrExpression : AndExpression
					  | ExclusiveOrExpression Carat AndExpression
					  ;

Carat  :  POW
	   ;

EqualTo  :  ET
		 ;

GreaterThan  :  GT
			 ;

LessThan  :  LT
		  ;

Not  :  NT
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

Add  :  ADD
	 ;

Subtract  :  SBTR
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
							| TLD UnaryExpression
							| NT UnaryExpression
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

CastExpression : LSMB PrimitiveType RSMB UnaryExpression
			   | LSMB ReferenceType AdditionalBoundRec RSMB UnaryExpressionNotPlusMinus
			   | LSMB ReferenceType AdditionalBoundRec RSMB LambdaExpression
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