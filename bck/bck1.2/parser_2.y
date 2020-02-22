%{
	#include<ctype.h>
}%

%token DIGIT
%token IDENTIFIER

%%
===========================BLOCK 2 BEGINS========================
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

===========================BLOCK 3 BEGINS=======================

TypeName  :  Identifier
		  |  PackageOrTypeName '.' Identifier
		  ;

PackageOrTypeName  :  Identifier
				   |  PackageOrTypeName '.' Identifier
				   ;

ExpressionName  :  Identifier
				|  AmbiguosName '.' Identifier
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

=======================================BLOCK 4 BEGINS===============================

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

SingleStaticImportDeclaration  :  "import" TypeName ';'
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


=================================================BLOCK 6 BEGINS===================================

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

ConstantDeclaration  :  ConstantModifierRec UnannType VariableDeclarationList ';'
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