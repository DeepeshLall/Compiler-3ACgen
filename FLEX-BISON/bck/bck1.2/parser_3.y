%{
	#include<ctype.h>
}%

%token DIGIT
%token IDENTIFIER

%%
===========================BLOCK 2 BEGINS §4 (Types, Values, and Variables)========================
Type  :  PrimitiveType
	  |	 ReferenceType
	  ;

PrimitiveType  :  AnnotationRec NumericType
			   |  AnnotationRec "boolean"
			   ;

AnnotationRec  :  
			   |  Annotation AnnotationRec
			   ;

NumericType  :  IntegralType
			 |  FloatingPointType
			 ;

IntegralType  :  "byte"
			  |  "short"
			  |  "int"
			  |  "char"
			  |  "long"
			  ;

FloatingPointType  :  "float"
			  	   |  "double"
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

TypeBound  :  "extends" TypeVariable
		   |  "extends" ClassOrInterfaceType AdditionalBoundRec
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

WildCardBounds  :  "extends" ReferenceType
				|  "super" ReferenceType
				;
===========================BLOCK 2 ENDS========================

===========================BLOCK 3 BEGINS §6 (Names)=======================

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

=======================================BLOCK 3 ENDS=================================

=======================================BLOCK 4 BEGINS  §7 (Packages)===============================

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

PackageDeclaration  :  PackageModifierRec "package" Identifier IdentifierDotRec ';'
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

SingleTypeImportDeclaration  :  "import" TypeName ';'
							   ;

TypeImportOnDemandDeclaration  :  "import" PackageOrTypeName ".*" ';'
							   ;

SingleStaticImportDeclaration  :  "import" "static" TypeName '.' Identifier ';'
							   ;

StaticImportOnDemandDeclaration  :  "import" "static" TypeName ".*" ';'
								 ;

TypeDeclaration  :  ClassDeclaration 
				 |  InterfaceDeclaration
				 | ';'
				 ;

=================================================BLOCK 4 ENDS=====================================


=================================================BLOCK 5 BEGINS §8 (Classes)===================================

ClassDeclaration  :  NormalClassDeclaration
				  |  EnumDeclaration
				  ;

NormalClassDeclaration  :  ClassModifierRec "class" Identifier TypeParametersQues SuperClassQues
						|  SuperClassQues ClassBody
						;

ClassModifierRec  :
				  |  ClassModifier ClassModifierRec
				  ;

ClassModifier  :  Annotation
			   |  "public"
			   |  "protected"
			   |  "private"
			   |  "abstract"
			   |  "static"
			   |  "final"
			   |  "strictfp"
			   ;

TypeParametersQues  :  
				  |  TypeParameter
			   	  ;

TypeParameterList  :  TypeParameter TypeParameterCommaRec
				   ;

TypeParameterCommaRec  :  
					   |  TypeParameterComma TypeParameterCommaRec
					   ;

TypeParameterComma  :  ',' TypeParameter
					;

TypeParameters  :  "<" TypeParameterList ">"
			   ;

SuperClassQues  :  
				|  SuperClass
				;

SuperClass  :  "extends" ClassType
			;

SuperInterface  :  "implements" InterfaceTypeList
				;

InterfaceTypeList  :  InterfaceType InterfaceTypeCommaRec
				   ;

InterfaceTypeCommaRec  :  
					   | InterfaceTypeComma InterfaceTypeCommaRec
					   ;

InterfaceTypeComma  :  "," InterfaceType

ClassBody  :  "{" ClassBodyRec "}"
		   ;

ClassBodyRec  :
			  |  ClassBody ClassBodyRec
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
						;

FieldDeclaration  :  FieldModifierRec UnannType VariableDeclaratorList
				  ;

FieldModifierRec  :
				  | FieldModifier FieldModifierRec
				  ;

FieldModifier  :  Annotation
			   |  "public"
			   |  "protected"
			   |  "private"
			   |  "static"
			   |  "final"
			   |  "transient"
			   |  "volatile"
			   ;

VariableDeclaratorList  :  VariableDeclarator VariableDeclaratorCommaRec
						 ;

VariableDeclaratorCommaRec  :  
							|  VariableDeclarator VariableDeclaratorCommaRec
							;

VariableDeclarator  :  VariableDeclaratorId VariableInitializerEqualQues
					;

VariableDeclaratorId  :  Identifier DimsQues
					  ;

VariableInitializerEqualQues  :  
							  |  VariableInitializerEqual
							  ;

VariableInitializerEqual  :  "=" VariableInitializer
						  ;

VariableInitializer  :  Expression
					 |  ArrayType
					 ;

UnannType  :  UnannPrimitiveType
		   |  UnannReferenceType
		   ;

UnannPrimitiveType  :  NumericType
					|  boolean
					;

UnannReferenceType  :  UnannClassOrInterfaceType
					|  UnannTypeVariable
					|  UnannArrayType
					;

UnannClassOrInterfaceType  :  UnannClassType
						   |  UnannInterfaceType
						   ;

UnannClassType  :  Identifier TypeArgumentsQues
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
				|  "public"
				|  "protected"
				|  "private"
				|  "abstract"
				|  "static"
				|  "final"
				|  "synchronized"
				|  "native"
				|  "strictfp"
				;

MethodHeader  :  Result MethodDeclarator ThrowsQues
			  |  TypeParameters AnnotationRec Result MethodDeclarator ThrowsQues
			  ;

Result  :  UnannType
		|  "void"
		;

MethodDeclarator  :  Identifier "(" FormalParameterListQues ")" DimsQues
				  ;

FormalParameterListQues  :  
						 |  FormalParameterList FormalParameterListQues
						 ;

FormalParameterList  :  ReceiverParameter
					 |  FormalParameters "," LastFormalParameter
					 |  LastFormalParameter
					 ;

FormalParameters  :  FormalParameter FormalParameterCommaRec
				  |  ReceiverParameter FormalParameterCommaRec
				  ;

FormalParameterCommaRec  :  
						 |  FormalParameterComma FormalParameterCommaRec
						 ;

FormalParameterComma  :  "," FormalParameter
					  ;

FormalParameter  :  VariableModifierRec UnannType VariableDeclaratorId 
				 ;

VariableModifierRec  :  
					 |  VariableModifier VariableModifierRec
					 ;

VariableModifier  :  Annotation
				  |  "final"
				  ;

LastFormalParameter  :  VariableModifierRec UnannType AnnotationRec ThreeDots VariableDeclaratorId
					|  FormalParameter
					;

ThreeDots  :  '.' '.' '.'
		   ;

IdentifierDotQues  :  
				   | IdentifierDot
				   ;

ReceiverParameter  :  AnnotationRec UnannType IdentifierDotQues "this"
				  ;

ThrowsQues  :  
			|  Throws
			;

Throws  :   "throws" ExceptionTypeList
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
			| ";"
			;

InstanceInitializer  :  Block
					;

StaticInitializer  :  "static" Block
				   ;

ConstructorDeclaration  :  ConstructorModifierRec ConstructorDeclarator ThrowsQues ConstructorBody
						;

ConstructorModifierRec  :  
						|  ConstructorModifier ConstructorModifierRec
						;

ConstructorModifier  :  Annotation
					 |  "public"
					 |  "protected"
					 |  "Private"
					 ;

ConstructorDeclarator  :  TypeParametersQues SimpleTypeName "(" FormalParameterListQues ")"
					   ;

SimpleTypeName  :  Identifier
				;

ConstructorBody  :  "{" ExplicitConstructorInvocationQues BlockStatementsQues "}"
				 ;

ExplicitConstructorInvocationQues  : 
								  |  ExplicitConstructorInvocation
								  ;

BlockStatementsQues  :  
					 |  BlockStatements
					 ;

ExplicitConstructorInvocation  :  TypeArgumentsQues "this" "(" ArgumentListQues ")" ";"
							  |  TypeArgumentsQues "super" "(" ArgumentListQues ")" ";"
							  |  ExpressionName "." TypeArgumentsQues "super" "(" ArgumentListQues ")" ";"
							  |  Primary "." TypeArgumentsQues "super" "(" ArgumentListQues ")" ";"
							  ;

EnumDeclaration  :  ClassModifierRec "enum" Identifier SuperInterfacesQues EnumBody
				 ;

SuperInterfacesQues  :  
					 | SuperInterface
					 ;

EnumBody  :  "{" EnumConstantListQues CommaQues EnumBodyDeclarationQues "}"
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

EnumConstantComma  :  "," EnumConstant
				   ;

EnumConstant  :  EnumConstantModifierRec Identifier ArgumentListQuesBracQues ClassBodyQues
			  ;


EnumConstantModifierRec  :  
						 |  EnumConstantModifier EnumConstantModifierRec
						 ;

ArgumentListQuesBracQues  :  
						  | ArgumentListQuesBrac
						  ;

ArgumentListQuesBrac  :  "(" ArgumentListQues ")"
					  ;

ArgumentListQues  :  
				  |  ArgumentList
				  ;

EnumConstantModifier  :  Annotation
					  ;

EnumBodyDeclaration  :  ";" ClassBodyDeclarationRec
					 ;

ClassBodyDeclarationRec  : 
					     |  ClassBodyDeclaration ClassBodyDeclarationRec
					     ;

ClassBodyQues  :  
			   |  ClassBody
			   ;

=================================================BLOCK 5 ENDS=====================================


=================================================BLOCK 6 BEGINS §9 (Interfaces)===================================

InterfaceDeclaration  :  NormalInterfaceDeclaration
					  |  AnnotationTypeDeclaration
					  ;

NormalInterfaceDeclaration  :  InterfaceModifierRec "interface" Identifier TypeParametersQues ExtendsInterfacesQues 
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

InterfaceModifier  :  Annotation "public" "protected" "private"
				   |  "abstract" "static" "strictfp"
				   ;

ExtendsInterfaces  :  "extends" InterfaceTypeList
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

ConstantModifier  :  Annotation "public"
				  |  "static" "final"
				  ;

InterfaceMethodDeclaration  :  InterfaceMethodModifierRec MethodHeader MethodBody
							;

InterfaceMethodModifierRec  :  
							|  InterfaceMethodModifier InterfaceMethodModifierRec
							;

InterfaceMethodModifier  :  Annotation "public"
						 |  "abstract" "default" "static" "strictfp"
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

AnnotationTypeElementModifier  :  Annotation "public"
							   |  "abstract"

DefaultValue  :  "default" ElementValue
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
					  |  ElementValueList ElementValueListQues
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

=========================================BLOCK 6 ENDS======================================

=========================================BLOCK 7 BEGINS §10 (Arrays)====================================
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

=========================================BLOCK 7 ENDS======================================

=========================================BLOCK 8 BEGINS §14 (Blocks and Statements)====================================
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

IfThenStatement : "if" '(' Expression ')' Statement
				;

IfThenElseStatement : "if" '(' Expression ')' StatementNoShortIf "else" Statement
					;

IfThenElseStatementNoShortIf : "if" '(' Expression ')' StatementNoShortIf "else" StatementNoShortIf
							 ;

AssertStatement : "assert" Expression ';'
				| "assert" Expression ':' Expression ';'
				;

SwitchStatement : "switch" '(' Expression ')' SwitchBlock
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

SwitchLabel : "case" ConstantExpression ':'
			| "case" EnumConstantName ':'
			| "default" ':'
			;

EnumConstantName : Identifier
				 ;

WhileStatement : "while" '(' Expression ')' Statement
			   ;

WhileStatementNoShortIf : "while" '(' Expression ')' StatementNoShortIf
						;

DoStatement : "do" Statement "while" '(' Expression ')' ';'
			;

ForStatement : BasicForStatement
			 | EnhancedForStatement
			 ;

ForStatementNoShortIf : BasicForStatementNoShortIf
					  | EnhancedForStatementNoShortIf
					  ;

BasicForStatement : "for" '(' ForInitQues ';' ExpressionQues ';' ForUpdateques ')' Statement
				  ;

BasicForStatementNoShortIf : "for" '(' ForInitQues ';' ExpressionQues ';' ForUpdateques ')' StatementNoShortIf
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

EnhancedForStatement : "for" '(' VariableModifierRec UnannType VariableDeclaratorId ':' Expression ')' Statement
					 ;

EnhancedForStatementNoShortIf : "for" '(' VariableModifierRec UnannType VariableDeclaratorId ':' Expression ')' StatementNoShortIf
							  ;

BreakStatement : "break" IdentifierQues ';'
			   ;

IdentifierQues  :  
				|  Identifier
				;

ContinueStatement : "continue" IdentifierQues ';'
				  ;

ReturnStatement : "return" ExpressionQues ';'
				;

ThrowStatement : "throw" Expression ';'
			   ;

SynchronizedStatement : "synchronized" '(' Expression ')' Block
					  ;

TryStatement : "try" Block Catches
			 | "try" Block CatchesQues Finally
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

CatchClause  :  "catch" '(' CatchFormalParameter ')' Block
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

Finally : "finally" Block
		;

TryWithResourcesStatement : "try" ResourceSpecification Block CatchesQues FinallyQues
						  ;

FinallyQues  :  
			 |  Finally
			 ;

ResourceSpecification : '(' ResourceList [';'] ')'
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


=========================================BLOCK 8 ENDS======================================

=========================================BLOCK 9 BEGINS §15 (Expressions)====================================

Primary : PrimaryNoNewArray
		| ArrayCreationExpression
		;

PrimaryNoNewArray : Literal
				  | ClassLiteral
				  | "this"
				  | TypeName '.' "this"
				  |	'(' Expression ')'
				  | ClassInstanceCreationExpression
				  | FieldAccess
				  | ArrayAccess
				  | MethodInvocation
				  | MethodReference
				  ;

ClassLiteral : TypeName SqaureBracketRec '.' "class"
			 | NumericType SqaureBracketRec '.' "class"
			 | "boolean" SqaureBracketRec '.' "class"
			 | "void" '.' "class"
			 ;

SqaureBracketRec  :  
				  |  SqaureBracket SqaureBracketRec
				  ;

SqaureBracket : "[" "]"
			  ;

ClassInstanceCreationExpression : UnqualifiedClassInstanceCreationExpression
								| ExpressionName '.' UnqualifiedClassInstanceCreationExpression
								| Primary '.' UnqualifiedClassInstanceCreationExpression
								;

UnqualifiedClassInstanceCreationExpression : "new" TypeArgumentsQues ClassOrInterfaceTypeToInstantiate '(' ArgumentListQues ')' ClassBodyQues
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
			| "super" '.' Identifier
			| TypeName '.' "super" '.' Identifier
			;

ArrayAccess : ExpressionName '[' Expression ']'
			| PrimaryNoNewArray '[' Expression ']'
			;

MethodInvocation : MethodName '(' ArgumentListQues ')'
				 | TypeName '.' TypeArgumentsQues Identifier '(' ArgumentListQues ')'
				 | ExpressionName '.' TypeArgumentsQues Identifier '(' ArgumentListQues ')'
				 | Primary '.' TypeArgumentsQues Identifier '(' ArgumentListQues ')'
				 | "super" '.' TypeArgumentsQues Identifier '(' ArgumentListQues ')'
				 | TypeName '.' "super" '.' TypeArgumentsQues Identifier '(' ArgumentListQues ')'
				 ;

ArgumentList : Expression ExpressionCommaRec
			 ;

ExpressionCommaRec  :  
					|  ExpressionComma
					;

ExpressionComma  :  ',' Expression
				 ;

MethodReference : ExpressionName '::' TypeArgumentsQues Identifier
				| ReferenceType '::' TypeArgumentsQues Identifier
				| Primary '::' TypeArgumentsQues Identifier
				| "super" '::' TypeArgumentsQues Identifier
				| TypeName '.' "super" '::' TypeArgumentsQues Identifier
				| ClassType '::' TypeArgumentsQues "new"
				| ArrayType '::' "new"
				;

ArrayCreationExpression : "new" PrimitiveType DimExprs DimsQues
						| "new" ClassOrInterfaceType DimExprs DimsQues
						| "new" PrimitiveType Dims ArrayInitializer
						| "new" ClassOrInterfaceType Dims ArrayInitializer
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

LambdaExpression : LambdaParameters '-''>' LambdaBody
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

===doubt here===
AssignmentOperator  :  "="
					|  "*="
					|  "/=" 
					|  "%="
					|  "+=" 
					|  "-="
					|  "<<="
					|  ">>="
					|  ">>>="
					|  "&="
					|  "^="
					|  "|="
					;
===doubt here===

ConditionalExpression : ConditionalOrExpression
					  | ConditionalOrExpression '\?' Expression ':' ConditionalExpression
					  | ConditionalOrExpression '\?' Expression ':' LambdaExpression
					  ;

ConditionalOrExpression : ConditionalAndExpression
						| ConditionalOrExpression '\|''\|' ConditionalAndExpression
						;

ConditionalAndExpression : InclusiveOrExpression
						 | ConditionalAndExpression '\&''\&' InclusiveOrExpression
						 ;

InclusiveOrExpression : ExclusiveOrExpression
					  | InclusiveOrExpression '\|' ExclusiveOrExpression
					  ;

ExclusiveOrExpression : AndExpression
					  | ExclusiveOrExpression '\^' AndExpression
					  ;

AndExpression : EqualityExpression
			  | AndExpression '\&' EqualityExpression
			  ;
			  
EqualityExpression : RelationalExpression
				   | EqualityExpression '=''=' RelationalExpression
				   | EqualityExpression '\!''=' RelationalExpression
				   ;

RelationalExpression : ShiftExpression
					 | RelationalExpression '<' ShiftExpression
					 | RelationalExpression '>' ShiftExpression
					 | RelationalExpression '<''=' ShiftExpression
					 | RelationalExpression '>''=' ShiftExpression
					 | RelationalExpression instanceof ReferenceType
					 ;

ShiftExpression : AdditiveExpression
				| ShiftExpression '<''<' AdditiveExpression
				| ShiftExpression '>''>' AdditiveExpression
				| ShiftExpression '>''>''>' AdditiveExpression
				;

AdditiveExpression : MultiplicativeExpression
				   | AdditiveExpression '\+' MultiplicativeExpression
				   | AdditiveExpression '-' MultiplicativeExpression
				   ;

MultiplicativeExpression : UnaryExpression
						 | MultiplicativeExpression '\*' UnaryExpression
						 | MultiplicativeExpression '\/' UnaryExpression
						 | MultiplicativeExpression '\%' UnaryExpression
						 ;

UnaryExpression : PreIncrementExpression
				| PreDecrementExpression
				| '\+' UnaryExpression
				| '-' UnaryExpression
				| UnaryExpressionNotPlusMinus
				;

PreIncrementExpression : '\+''\+' UnaryExpression
					   ;

PreDecrementExpression : '-''-' UnaryExpression
					   ;

UnaryExpressionNotPlusMinus : PostfixExpression
							| '\~' UnaryExpression
							| '\!' UnaryExpression
							| CastExpression
							;

PostfixExpression : Primary
                  | ExpressionName
                  | PostIncrementExpression
                  | PostDecrementExpression
                  ;

PostIncrementExpression : PostfixExpression '\+''\+'
						;

PostDecrementExpression : PostfixExpression '-''-'
						;

CastExpression : '(' PrimitiveType ')' UnaryExpression
			   | '(' ReferenceType AdditionalBoundRec ')' UnaryExpressionNotPlusMinus
			   | '(' ReferenceType AdditionalBoundRec ')' LambdaExpression
			   ;

ConstantExpression : Expression
				   ;

=========================================BLOCK 9 ENDS======================================


%%

yylex(){
	int c;
	c = getchar();
	if(isdigit(c)){
		yylval = c-'0';
		return DIGIT;
	}
	return c;
}