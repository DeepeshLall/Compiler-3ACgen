%{
	#include<ctype.h>
}%

%token DIGIT
%token IDENTIFIER

%%

Identifier   :   IDENTIFIER
			 ;

QualifiedIdentifier    :    Identifier([.]{Identifier})*
					   ;

QualifiedIdentifierList    :    QualifiedIdentifier([.]{QualifiedIdentifier})*
						   ;

CompilationUnit   :   ({Annotations}?"package"{QualifiedIdentifier}[;])?{ImportDeclaration}*{TypeDeclaration}*
				  ;

ImportDeclaration    :    "import"{static}?{Identifier}([.]{Identifier})*{.*}?[;]
					 ;

TypeDeclaration     :    {ClassorInterfaceDeclaration}
					;

ClassorInterfaceDeclaration   :    {Modifier}*({ClassDeclaration}|{InterfaceDeclaration})
							  ;

ClassDeclaration    :    NormalClassDeclaration
					|	 EnumDeclaration
					;

InterfaceDeclaration 	:	 NormalInterfaceDeclaration
						|	 AnnotationTypeDeclaration
						;

NormalClassDeclaration	 : 	"class"{Identifier}{TypeParameters}

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