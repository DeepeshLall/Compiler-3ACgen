grammar Java8;

type_1  :  primitiveType
	  |  referenceType
	  ;

primitiveType  :  annotation* numericType
			   |  annotation* 'boolean'
			   ;

numericType  :  integralType
			 |  floatingPointType
			 ;

integralType  :  'byte'
			  |  'short'
			  |  'int'
			  |  'long'
			  |  'char'
			  ;

floatingPointType  :  'float'
				   |  'double'
				   ;

referenceType  :  classOrInterfaceType
				|  typeVariable
				|  arrayType
				;

classOrInterfaceType  :  type_Type_1 type_Type_2*
					  ; 


type_Type_1  :  classType_Type_1
			 |  interfaceType_Type_1
			 ;

type_Type_2  :  classType_Type_2
			 |  interfaceType_Type_2
			 ;

classType_Type_1  :  annotation* Identifier typeArguments?
				  ;

classType_Type_2  :  '.' annotation* Identifier typeArguments?
				  ;

interfaceType_Type_1  :  classType_Type_1
					  ;

interfaceType_Type_2  :  classType_Type_2
					  ;

classType  :  annotation* Identifier typeArguments?
		   |  classOrInterfaceType '.' annotation* Identifier typeArguments?
		   ;

interfaceType  :  classType
			   ;

typeVariable  :  annotation* Identifier
			  ;

arrayType  :  primitiveType dims
		   |  classOrInterfaceType dims
		   |  typeVariable dims
		   ;

dims  :  annotation* '[' ']' (annotation* '[' ']')*
	  ;

typeParameter  :  typeParameterModifier* Identifier typeBound?
			   ;

typeParameterModifier  :  annotation
					   ;

typeBound  :  'extends' typeVariable
		   |  'extends' classOrInterfaceType additionalBound*
		   ;

additionalBound  :  '&' interfaceType
				 ;

typeArguments  :  '<' typeArgumentList '>'
			   ;

typeArgumentList  :  typeArgument (',' typeArgument)*
				  ;

typeArgument  :  referenceType
			  |  wildcard
			  ;

wildcard  :  annotation* '?' wildcardBounds?
		  ;

wildcardBounds  :  'extends' referenceType
				|  'super' referenceType
				;













packageName  :  Identifier
			 |  packageName '.' Identifier
			 ;

typeName  :  Identifier
		  |  packageOrTypeName '.' Identifier
		  ;

packageOrTypeName  :  Identifier
				   |  packageOrTypeName '.' Identifier
				   ; 

expressionName  :  Identifier
				|  ambiguousName '.' Identifier
				;

methodName  :  Identifier
			;

ambiguousName  :  Identifier
			   |  ambiguousName '.' Identifier
			   ;












compilationUnit  :  packageDeclaration? importDeclaration* typeDeclaration* EOF
				 ;

packageDeclaration  :  packageModifier* 'package' Identifier ('.' Identifier)* ';'
					;

packageModifier  :  annotation
				 ;

importDeclaration  :  singleTypeImportDeclaration
				   |  typeImportOnDemandDeclaration
				   |  singleStaticImportDeclaration
				   |  staticImportOnDemandDeclaration
				   ;

singleTypeImportDeclaration  :  'import' typeName ';'
							 ;

typeImportOnDemandDeclaration  :  'import' packageOrTypeName '.' '*' ';'
							   ;

singleStaticImportDeclaration  :  'import' 'static' typeName '.' Identifier ';'
							   ;

staticImportOnDemandDeclaration  :  'import' 'static' typeName '.' '*' ';'
								 ;

typeDeclaration  :  classDeclaration
				 |  interfaceDeclaration
				 | ';'
				 ;













classDeclaration  :  enumDeclaration
				  |  normalclassDeclaration
				  ;

normalclassDeclaration  :  classModifier* 'class' Identifier typeParameters? superclass? superInterfaces? classBody?
						;

classModifier  :  annotation
			   |  'public'
			   |  'private'
			   |  'protected'
			   |  'abstract'
			   |  'final'
			   |  'static'
			   |  'strictfp'
			   ;

typeParameters  :  '<' typeParameterList '>'
				;

typeParameterList  :  typeParameter (',' typeParameter)*
				   ;

superclass  :  'extends' classType
			;

superInterfaces  :  'implements' interfaceTypeList
				 ;

interfaceTypeList  :  interfaceType (',' interfaceType)*
				   ;

classBody  :  '{' classBodyDeclaration* '}'
		   ;

classBodyDeclaration  :  classMemeberDeclaration
					  |  instanceInitializer
					  |  staticInitializer
					  |  constructorDeclaration
					  ;

classMemeberDeclaration  :  fieldDeclaration
						 |  methodDeclaration
						 |  classDeclaration
						 |  interfaceDeclaration
						 |  ';'
						 ;

fieldDeclaration  :  fieldModifier* unannType variableDeclaratorList ';'
				  ;

fieldModifier  :  annotation
			   |  'public'
			   |  'private'
			   |  'protected'
			   |  'final'
			   |  'static'
			   |  'transient'
			   |  'volatile'
			   ;

variableDeclaratorList  :  variableDeclarator (',' variableDeclarator)*
						;

variableDeclarator  :  variableDeclaratorId ('=' variableInitializer)*
					;

variableDeclaratorId  :  Identifier dims?
					  ;

variableInitializer  :  expression
					 |  arrayInitializer
					 ;

unannType  :  unannReferenceType
		   |  unannPrimitiveType
		   ;

unannPrimitiveType  :  numericType
					|  'boolean'
					;

unannReferenceType  :  unannclassOrInterfaceType
					|  unannTypeVariable
					|  unannArrayType
					;

unannclassOrInterfaceType  :  unann_Type_Type_1 unann_Type_Type_2*
						   ;

unann_Type_Type_1  :  unann_classType_Type_1
			 |  unann_InterfaceType_Type_1
			 ;

unann_Type_Type_2  :  unann_classType_Type_2
			 |  unann_InterfaceType_Type_2
			 ;

unann_classType_Type_1  :  Identifier typeArguments?
					    ;

unann_classType_Type_2  :  '.' Identifier typeArguments?
						;

unann_InterfaceType_Type_1  :  unann_classType_Type_1
							;

unann_InterfaceType_Type_2  :  unann_classType_Type_2
							;


unannclassType  :  Identifier typeArguments?
				|  unannclassOrInterfaceType '.' annotation* Identifier typeArguments?
				;

unannInterfaceType  :  unannclassType
					;

unannTypeVariable  :  Identifier
				   ;

unannArrayType  :  unannPrimitiveType dims
		   |  unannclassOrInterfaceType dims
		   |  unannTypeVariable dims
		   ;

methodDeclaration  :  methodModifier* methodHeader methodBody
				   ;

methodModifier  :  annotation
			   |  'public'
			   |  'private'
			   |  'protected'
			   |  'final'
			   |  'abstract'
			   |  'synchronized'
			   |  'strictfp'
			   |  'native'
			   |  'static'
			   ;

methodHeader  :  result methodDeclarator throwsVar?
			  |  typeParameters annotation* result methodDeclarator throwsVar?
			  ;

result  :  unannType
		|  'void'
		;

methodDeclarator  :  Identifier '(' formalParameterList? ')' dims?
				  ;

formalParameterList  :  receiverParameter
					 |  formalParameters ',' lastFormalParameter
					 |  lastFormalParameter
					 ;

formalParameters  :  formalParameter (',' formalParameter)*
				  |  receiverParameter (',' formalParameter)
				  ;

formalParameter  :  variableModifier* unannType variableDeclaratorId 
				 ;

variableModifier  :  annotation
				  |  'final'
				  ;

lastFormalParameter  :  variableModifier* unannType annotation* '...' variableDeclaratorId 
					 |  formalParameter
					 ;

receiverParameter  :  annotation* unannType (Identifier '.') 'this'
				   ;

throwsVar  :  'throws' exceptionTypeList
		;

exceptionTypeList  :  exceptionType (',' exceptionType)*
				   ;

exceptionType  :  classType 
			   |  typeVariable
			   ;

methodBody  :  block
			|  ';'
			;

instanceInitializer  :  block
					 ;

staticInitializer  :  'static' block
				   ;

constructorDeclaration  :  constructorModifier* constructorDeclarator throwsVar* constructorBody
						;

constructorDeclarator  :  typeParameters? simpleTypeName '(' formalParameterList? ')'
						;

simpleTypeName  :  Identifier
				;

constructorModifier  :  annotation
					 |  'public'
					 |  'protected'
					 |  'private'
					 ;

constructorBody  :  '{' explicitconstructorInvocation? blockStatements? '}'
				 ;

explicitconstructorInvocation  :  typeArguments? 'this' '(' argumentList ')' ';'
							   |  typeArguments? 'super' '(' argumentList ')' ';'
							   |  expressionName '.' typeArguments? 'super' '(' argumentList ')' ';'
							   |  primary '.' typeArguments? 'super' '(' argumentList ')' ';'
							   ;

enumDeclaration  :  classModifier* 'enum' Identifier superInterfaces? enumBody
				 ;

enumBody  :  '{' enumconstantList? (',')? enumBodyDeclarations? '}'
		  ;

enumconstantList  :  enumconstant (',' enumconstant)*
				  ;

enumconstant  :  enumconstantModifier* Identifier ('(' argumentList? ')')? classBody?
			  ;

enumconstantModifier  :  annotation
					  ;

enumBodyDeclarations  :  ';' classBodyDeclaration*
					  ;















interfaceDeclaration  :  normalInterfaceDeclaration
					  |  annotationTypeDeclaration
					  ;

normalInterfaceDeclaration  :  interfaceModifier* 'interface' Identifier typeParameters? extendsInterfaces? interfaceBody
							;

interfaceModifier  :  annotation
			   |  'public'
			   |  'private'
			   |  'protected'
			   |  'final'
			   |  'abstract'
			   |  'strictfp'
			   |  'static'
			   ;

extendsInterfaces  :  'extends' interfaceTypeList
				   ;

interfaceBody  :  '{' interfaceMemberDeclaration* '}'
			   ;

interfaceMemberDeclaration  :  constantDeclaration
							 |  interfaceMethodDeclaration
							 |  classDeclaration
							 |  interfaceDeclaration
							 |  ';'
							 ;

constantDeclaration  :  constantModifier* unannType variableDeclaratorList ';'
					 ;

constantModifier  :  annotation
				  |  'public'
				  |  'static'
				  |  'final'
				  ;

interfaceMethodDeclaration  :  interfaceMethodModifier* methodHeader methodBody
							;

interfaceMethodModifier  :  annotation
			   |  'public'
			   |  'default'
			   |  'abstract'
			   |  'strictfp'
			   |  'static'
			   ;

annotationTypeDeclaration  :  '{' annotationTypeMemberDeclaration '}'
						   ;

annotationTypeMemberDeclaration  :  annotationTypeElementDeclaration
								 |  constantDeclaration
								 |  classDeclaration
								 |  interfaceDeclaration
								 |  ';'
								 ;

annotationTypeElementDeclaration  :  annotationTypeElementModifier* unannType Identifier '(' ')' dims? defaultValue? ';'
								;

annotationTypeElementModifier  :  annotation
							   |  'public'
							   |  'abstract'
							   ;

defaultValue  :  'default' elementValue
			  ;

annotation  :  normalAnnotation
			|  markerAnnotation
			|  singleElementAnnotation
			;

normalAnnotation  :  '@' typeName '(' elementValuePairList? ')'
				  ;

elementValuePairList  :  elementValuePair (',' elementValuePair)*
					  ;

elementValuePair  :  Identifier '=' elementValue
				  ;

elementValue  :  conditionalExpression
			  |  elementValueArrayInitializer
			  |  annotation
			  ;

elementValueArrayInitializer  :  '{' elementValueList (',')? '}'
							  ;

elementValueList  :  elementValue (',' elementValue)*
				  ;

markerAnnotation  :  '@' typeName
				  ;

singleElementAnnotation  :  '@' typeName '(' elementValue ')'
						 ;












arrayInitializer  :  '{' variableInitializerList? (',')? '}'
				  ;

variableInitializerList  :  variableInitializer (',' variableInitializer)*
						 ;











block  :  '{' blockStatements? '}'
	   ;

blockStatements  :  blockStatement blockStatement*
				 ;

blockStatement  :  localVariableDeclarationStatement
				|  classDeclaration
				|  statement
				;

localVariableDeclarationStatement  :  localVariableDeclaration ';'
								   ;

localVariableDeclaration  :  variableModifier* unannType variableDeclaratorList
						  ;

statement : statementWithoutTrailingSubstatement
		  | labeledStatement
		  | ifThenStatement
		  | ifThenElseStatement
		  | whileStatement
		  | forStatement
		  ;

statementNoShortIf : statementWithoutTrailingSubstatement
				   | labeledStatementNoShortIf
				   | ifThenElseStatementNoShortIf
				   | whileStatementNoShortIf
				   | forStatementNoShortIf
				   ;

statementWithoutTrailingSubstatement : block
									 | emptyStatement
									 | expressionStatement
									 | assertStatement
									 | switchStatement
									 | doStatement
									 | breakStatement
									 | continueStatement
									 | returnStatement
									 | synchronizedStatement
									 | throwStatement
									 | tryStatement
									 ;

emptyStatement  :  ';'
				;

labeledStatement  :  Identifier ':' statement
				  ;

labeledStatementNoShortIf  :  Identifier ':' statementNoShortIf
						   ;

expressionStatement  :  statementExpression ';'
					 ;

statementExpression : assignment
					| preIncrementExpression
					| preDecrementExpression
					| postIncrementExpression
					| postDecrementExpression
					| methodInvocation
					| classInstancecreationExpression
					;

ifThenStatement  :  'if' '(' expression ')' statement 
				 ;

ifThenElseStatement  :  'if' '(' expression ')' statementNoShortIf 'else' statement
					 ;

ifThenElseStatementNoShortIf  :  'if' '(' expression ')' statementNoShortIf 'else' statementNoShortIf 
						;

assertStatement  :  'assert' expression ';' 
				 |  'assert' expression ':' expression ';'
				 ;

switchStatement  :  'switch' '(' expression ')' switchBlock
				 ;

switchBlock  :  '{' switchBlockStatementGroup* switchLabel* '}'
			 ;

switchBlockStatementGroup  :  switchLabels blockStatements
						   ;

switchLabels  :  switchLabel switchLabel*
			  ;

switchLabel  :  'case' constantExpression ':'
			 |  'case' enumconstantName ':'
			 |  'default' ':'
			 ;

enumconstantName  :  Identifier
				  ;

whileStatement  :  'while' '(' expression ')' statement
				;

whileStatementNoShortIf  :  'while' '(' expression ')' statementNoShortIf
						 ;

doStatement  :  'do' statement 'while' '(' expression ')' ';'
			 ;

forStatement : basicForStatement
			 | enhancedForStatement
			 ;

forStatementNoShortIf : basicForStatementNoShortIf
					  | enhancedForStatementNoShortIf
					  ;

basicForStatement  :  'for' '(' forInit? ';' expression? ';' forUpdate? ')' statement
				;

basicForStatementNoShortIf  :  'for' '(' forInit? ';' expression? ';' forUpdate? ')' statementNoShortIf
				;

forInit : statementExpressionList
		| localVariableDeclaration
		;

forUpdate : statementExpressionList
		  ;

statementExpressionList  :  statementExpression (',' statementExpression)*
						 ;

enhancedForStatement  :  'for' '(' variableModifier* unannType variableDeclaratorId ':' expression ')' statement
					  ;

enhancedForStatementNoShortIf  :  'for' '(' variableModifier* unannType variableDeclaratorId ':' expression ')' statementNoShortIf
					  ;

breakStatement  :  'break' Identifier? ';'
				;

continueStatement  :  'continue' Identifier? ';'
				   ;

returnStatement  :  'return' expression? ';'
				 ;

throwStatement  :  'throw' expression ';'
				;

synchronizedStatement  :  'synchronized' '(' expression ')' block
					   ;

tryStatement : 'try' block catches
			 | 'try' block catches? finallyVar
			 | tryWithResourcesStatement
			 ;

catches  :  catchclause catchclause*
		 ;

catchclause  :  'catch' '(' catchFormalParameter ')' block
			 ;

catchFormalParameter  :  variableModifier* catchType variableDeclaratorId
					  ;

catchType  :  unannclassType ('|' classType)*
		   ;

finallyVar  :  'finally' block
		 ;

tryWithResourcesStatement  :  'try' resourceSpecification block catches? finallyVar?
						   ;

resourceSpecification  :  '(' resourceList (';')? ')'
					   ;

resourceList  :  resource (';' resource)*
			  ;

resource  :  variableModifier* unannType variableDeclaratorId '=' expression
		  ;















primary : primary_Type_1 primary_Type_2*
		;

primary_Type_1  :  primaryNoNewArray_Type_1_Pr
				|  arraycreationExpression
				;

primary_Type_2  :  primaryNoNewArray_Type_2_Pr
				;

primaryNoNewArray : Literal
				  | classLiteral
				  | 'this'
				  | typeName '.' 'this'
				  |	'(' expression ')'
				  | classInstancecreationExpression
				  | fieldAccess
				  | arrayAccess
				  | methodInvocation
				  | methodReference
				  ;

primaryNoNewArray_Type_2_Aa  :  
							  ;

primaryNoNewArray_Type_1_Aa  :  Literal
				  			| classLiteral
				  			| 'this'
				  			| typeName '.' 'this'
				  			|	'(' expression ')'
				  			| classInstancecreationExpression
				  			| fieldAccess
				  			| methodInvocation
				  			| methodReference
				  			;

primaryNoNewArray_Type_2_Pr  :  classInstancecreationExpression_Type_2_Pr
				  				| fieldAccess_Type_2_Pr
				  				| arrayAccess_Type_2_Pr
				  				| methodInvocation_Type_2_Pr
				  				| methodReference_Type_2_Pr
				  				;

primaryNoNewArray_Type_2_2_2_Pr_Aa_Pr  :  
										;

primaryNoNewArray_Type_2_1_2_Pr_Aa_Pr  :  classInstancecreationExpression_Type_2_Pr
				  				| fieldAccess_Type_2_Pr
				  				| methodInvocation_Type_2_Pr
				  				| methodReference_Type_2_Pr
				  				;

primaryNoNewArray_Type_1_Pr  :  Literal
				  			| classLiteral
				  			| 'this'
				  			| typeName '.' 'this'
				  			|	'(' expression ')'
				  			| classInstancecreationExpression_Type_1_Pr
				  			| fieldAccess_Type_1_Pr
				  			| arrayAccess_Type_1_Pr
				  			| methodInvocation_Type_1_Pr
				  			| methodReference_Type_1_Pr
				  			;

primaryNoNewArray_Type_1_2_1_Pr_Aa_Pr  :  
										;

primaryNoNewArray_Type_1_1_1_Pr_Aa_Pr  :  Literal
				  			| classLiteral
				  			| 'this'
				  			| typeName '.' 'this'
				  			|	'(' expression ')'
				  			| classInstancecreationExpression_Type_1_Pr
				  			| fieldAccess_Type_1_Pr
				  			| methodInvocation_Type_1_Pr
				  			| methodReference_Type_1_Pr
				  			;

classLiteral  :  typeName ('[' ']')* '.' 'class'
			  |  numericType ('[' ']')* '.' 'class'
			  |  'boolean' ('[' ']')* '.' 'class'
			  |  'void' '.' 'class'
			  ;

classInstancecreationExpression  :  unqualifiedclassInstancecreationExpression
								 |  expressionName '.' unqualifiedclassInstancecreationExpression
								 |  primary '.' unqualifiedclassInstancecreationExpression
								 ;

classInstancecreationExpression_Type_2_Pr  :  '.' unqualifiedclassInstancecreationExpression
											;

classInstancecreationExpression_Type_1_Pr  :  unqualifiedclassInstancecreationExpression
								 |  expressionName '.' unqualifiedclassInstancecreationExpression
								 ;

unqualifiedclassInstancecreationExpression  :  'new' typeArguments? classOrInterfaceTypeToInstantiate '(' argumentList? ')' classBody?
										;

classOrInterfaceTypeToInstantiate  :  annotation* Identifier ('.' annotation* Identifier)* typeArgumentsOrDiamond?
								   ;

typeArgumentsOrDiamond  :  typeArguments
						|  '<' '>'
						;

fieldAccess  :  primary '.' Identifier
			 |  'super' '.' Identifier
			 |  typeName '.' 'super' '.' Identifier
			 ;

fieldAccess_Type_2_Pr  :  '.' Identifier
					   ;

fieldAccess_Type_1_Pr  :  'super' '.' Identifier
						|  typeName '.' 'super' '.' Identifier
						;

arrayAccess  :  arrayAccess_Type_1 arrayAccess_Type_2*
			 ;

arrayAccess_Type_1  :  expressionName '[' expression ']'
					|  primaryNoNewArray_Type_2_Aa '[' expression ']'
					;

arrayAccess_Type_2  :  primaryNoNewArray_Type_2_Aa '[' expression ']'
					;

arrayAccess_Type_2_Pr  :  arrayAccess_Type_2_Pr_Type_1 	arrayAccess_Type_2_Pr_Type_2*
						;
arrayAccess_Type_2_Pr_Type_1  :  primaryNoNewArray_Type_2_1_2_Pr_Aa_Pr '[' expression ']'
								;

arrayAccess_Type_2_Pr_Type_2  :  primaryNoNewArray_Type_2_2_2_Pr_Aa_Pr '[' expression ']' 
								;

arrayAccess_Type_1_Pr  :  arrayAccess_Type_1_Pr_Type_1 	arrayAccess_Type_1_Pr_Type_2*
						;

arrayAccess_Type_1_Pr_Type_1  :  primaryNoNewArray_Type_1_1_1_Pr_Aa_Pr '[' expression ']'
							  |  expressionName '[' expression ']'
								;

arrayAccess_Type_1_Pr_Type_2  :  primaryNoNewArray_Type_1_2_1_Pr_Aa_Pr '[' expression ']' 
								;

methodInvocation  :  methodName '(' argumentList? ')'
				  |  typeName '.' typeArguments? Identifier '(' argumentList? ')'
				  |  expressionName '.' typeArguments? Identifier '(' argumentList? ')'
				  |  primary '.' typeArguments? Identifier '(' argumentList? ')'
				  |  'super' '.' typeArguments? Identifier '(' argumentList? ')'
				  |  typeName '.' 'super' '.' typeArguments? Identifier '(' argumentList? ')'
				  ;

methodInvocation_Type_2_Pr  :  '.' typeArguments? Identifier '(' argumentList? ')'
						 ;

methodInvocation_Type_1_Pr  :  methodName '(' argumentList? ')'
				  |  typeName '.' typeArguments? Identifier '(' argumentList? ')'
				  |  expressionName '.' typeArguments? Identifier '(' argumentList? ')'
				  |  'super' '.' typeArguments? Identifier '(' argumentList? ')'
				  |  typeName '.' 'super' '.' typeArguments? Identifier '(' argumentList? ')'
				  ;

argumentList  :  expression (',' expression)*
			  ;

methodReference  :  expressionName '::' typeArguments? Identifier
				 |  referenceType '::' typeArguments? Identifier
				 |  primary '::' typeArguments? Identifier
				 |  'super' '::' typeArguments? Identifier
				 |  typeName '.' 'super' '::' typeArguments? Identifier
				 |  classType '::' typeArguments? 'new'
				 |  arrayType '::' 'new'
				 ;

methodReference_Type_2_Pr  :  '::' typeArguments? Identifier
						   ;

methodReference_Type_1_Pr  :  expressionName '::' typeArguments? Identifier
				 			|  referenceType '::' typeArguments? Identifier
				 			|  'super' '::' typeArguments? Identifier
				 			|  typeName '.' 'super' '::' typeArguments? Identifier
				 			|  classType '::' typeArguments? 'new'
				 			|  arrayType '::' 'new'
				 			;

arraycreationExpression  :  'new' primitiveType dimExprs dims?
						 |  'new' classOrInterfaceType dimExprs dims?
						 |  'new' primitiveType dims arrayInitializer
						 |  'new' classOrInterfaceType dims arrayInitializer
						 ;

dimExprs  :  dimExpr dimExpr*
		  ;

dimExpr  :  annotation* '[' expression ']'
		 ;

expression : lambdaExpression
		   | assignmentExpression
		   ;

lambdaExpression : lambdaParameters '->' lambdaBody
				 ;

lambdaParameters  :  Identifier 
				  |  '(' formalParameterList? ')'
				  |  '(' inferredFormalParameterList ')'
				  ;

inferredFormalParameterList  :  Identifier (',' Identifier)*
							 ;

lambdaBody : expression
		   | block
		   ;

assignmentExpression  :  conditionalExpression
					  |  assignment
					  ;

assignment  :  leftHandSide assignmentOperator expression
		    ;

leftHandSide  :  expressionName
			  |  fieldAccess
			  |  arrayAccess
			  ;

assignmentOperator  :  '='
					|  '*='
					|  '/='
					|  '%='
					|  '+='
					|  '-='
					|  '<<='
					|  '>>='
					|  '>>>='
					|  '&='
					|  '^='
					|  '|='
					;

conditionalExpression : conditionalOrExpression
					  | conditionalOrExpression '?' expression ':' conditionalExpression
					  | conditionalOrExpression '?' expression ':' lambdaExpression
					  ;

conditionalOrExpression : conditionalAndExpression
						| conditionalOrExpression '||' conditionalAndExpression
						;

conditionalAndExpression : inclusiveOrExpression
						 | conditionalAndExpression '&&' inclusiveOrExpression
						 ;

inclusiveOrExpression : exclusiveOrExpression
					  | inclusiveOrExpression '|' exclusiveOrExpression
					  ;

exclusiveOrExpression : andExpression
					  | exclusiveOrExpression '^' andExpression
					  ;	   

andExpression : equalityExpression
			  | andExpression '&' equalityExpression
			  ;
			  
equalityExpression : relationalExpression
				   | equalityExpression '==' relationalExpression
				   | equalityExpression '!=' relationalExpression
				   ;

relationalExpression : shiftExpression
					 | relationalExpression '<' shiftExpression
					 | relationalExpression '>' shiftExpression
					 | relationalExpression '<=' shiftExpression
					 | relationalExpression '>=' shiftExpression
					 | relationalExpression 'instanceof' referenceType
					 ;

shiftExpression : additiveExpression
				| shiftExpression '<<' additiveExpression
				| shiftExpression '>>' additiveExpression
				| shiftExpression '>>>' additiveExpression
				;

additiveExpression : multiplicativeExpression
				   | additiveExpression '+' multiplicativeExpression
				   | additiveExpression '-' multiplicativeExpression
				   ;

multiplicativeExpression : unaryExpression
						 | multiplicativeExpression '*' unaryExpression
						 | multiplicativeExpression '/' unaryExpression
						 | multiplicativeExpression '%' unaryExpression
						 ;

unaryExpression : preIncrementExpression
				| preDecrementExpression
				| '+' unaryExpression
				| '-' unaryExpression
				| unaryExpressionNotPlusMinus
				;

preIncrementExpression : '++' unaryExpression
					   ;

preDecrementExpression : '--' unaryExpression
					   ;

unaryExpressionNotPlusMinus : postfixExpression
							| '~' unaryExpression
							| '!' unaryExpression
							| castExpression
							;

postfixExpression : postfix_Type_1 postfix_Type_2*
                  ;

postfix_Type_1  :  primary
				|  expressionName
				;

postfix_Type_2  :  pure_postfix_decrement
				|  pure_postfix_increment
				;

postIncrementExpression : postfixExpression '++'
						;

pure_postfix_decrement  :  '--'
						;

pure_postfix_increment  :  '++'
						;

postDecrementExpression : postfixExpression '--'
						;

castExpression  :  '(' primitiveType ')' unaryExpression
				|  '(' referenceType additionalBound* ')' unaryExpressionNotPlusMinus
				|  '(' referenceType additionalBound* ')' lambdaExpression
				;

constantExpression  :  expression
					;













ABSTRACT : 'abstract';
ASSERT : 'assert';
BOOLEAN : 'boolean';
BREAK : 'break';
BYTE : 'byte';
CASE : 'case';
CATCH : 'catch';
CHAR : 'char';
CLASS : 'class';
CONST : 'const';
CONTINUE : 'continue';
DEFAULT : 'default';
DO : 'do';
DOUBLE : 'double';
ELSE : 'else';
ENUM : 'enum';
EXTENDS : 'extends';
FINAL : 'final';
FINALLY : 'finally';
FLOAT : 'float';
FOR : 'for';
IF : 'if';
GOTO : 'goto';
IMPLEMENTS : 'implements';
IMPORT : 'import';
INSTANCEOF : 'instanceof';
INT : 'int';
INTERFACE : 'interface';
LONG : 'long';
NATIVE : 'native';
NEW : 'new';
PACKAGE : 'package';
PRIVATE : 'private';
PROTECTED : 'protected';
PUBLIC : 'public';
RETURN : 'return';
SHORT : 'short';
STATIC : 'static';
STRICTFP : 'strictfp';
SUPER : 'super';
SWITCH : 'switch';
SYNCHRONIZED : 'synchronized';
THIS : 'this';
THROW : 'throw';
THROWS : 'throws';
TRANSIENT : 'transient';
TRY : 'try';
VOID : 'void';
VOLATILE : 'volatile';
WHILE : 'while';

Literal  :  IntegerLiteral
		 |  FloatingPointLiteral
		 |  BooleanLiteral
		 |  CharacterLiteral
		 |  StringLiteral
		 |  CharacterLiteral
		 |  NullLiteral
		 ;

IntegerLiteral  :	DecimalIntegerLiteral
				|	HexIntegerLiteral
				|	OctalIntegerLiteral
				|	BinaryIntegerLiteral
				;

fragment
DecimalIntegerLiteral  :  DecimalNumeral IntegerTypeSuffix?
					   ;

fragment
HexIntegerLiteral  :  HexNumeral IntegerTypeSuffix?
				   ;

fragment
OctalIntegerLiteral  :	OctalNumeral IntegerTypeSuffix?
					 ;

fragment
BinaryIntegerLiteral  :  BinaryNumeral IntegerTypeSuffix?
					  ;

fragment
IntegerTypeSuffix  :  'l'
				   |  'L'
				   ;

fragment
DecimalNumeral  :  '0'
				|	NonZeroDigit (Digits? | Underscores Digits)
				;

fragment
Digits  :  Digit (DigitsAndUnderscores? Digit)?
		;

fragment
Digit  :  '0'
	   |	NonZeroDigit
	   ;

fragment
NonZeroDigit  :	 [1-9]
			  ;

fragment
DigitsAndUnderscores  :  DigitOrUnderscore+
					  ;

fragment
DigitOrUnderscore  :  Digit
				   |	'_'
				   ;

fragment
Underscores  :	'_'+
			 ;

fragment
HexNumeral  :  '0' 'x' HexDigits
			|  '0' 'X' HexDigits
			;

fragment
HexDigits  :  HexDigit (HexDigitsAndUnderscores? HexDigit)?
		   ;

fragment
HexDigit  :  [0-9a-fA-F]
		  ;

fragment
HexDigitsAndUnderscores  :  HexDigitOrUnderscore+
						 ;

fragment
HexDigitOrUnderscore  :  HexDigit
					  |	'_'
					  ;

fragment
OctalNumeral  :  '0' Underscores? OctalDigits
			  ;

fragment
OctalDigits  : 	OctalDigit (OctalDigitsAndUnderscores? OctalDigit)?
			 ;

fragment
OctalDigit  :  [0-7]
			;

fragment
OctalDigitsAndUnderscores  :  OctalDigitOrUnderscore+
						   ;

fragment
OctalDigitOrUnderscore	:  OctalDigit
						|	'_'
						;

fragment
BinaryNumeral  :  '0' 'b' BinaryDigits
			   |  '0' 'B' BinaryDigits
			   ;

fragment
BinaryDigits  :  BinaryDigit (BinaryDigitsAndUnderscores? BinaryDigit)?
			  ;

fragment
BinaryDigit  :	[01]
			 ;

fragment
BinaryDigitsAndUnderscores  :  BinaryDigitOrUnderscore+
							;

fragment
BinaryDigitOrUnderscore  :	BinaryDigit
						 |	'_'
						 ;


FloatingPointLiteral  :	 DecimalFloatingPointLiteral
					  |	HexadecimalFloatingPointLiteral
					  ;

fragment
DecimalFloatingPointLiteral	 :	Digits '.' Digits? ExponentPart? FloatTypeSuffix?
							 |	'.' Digits ExponentPart? FloatTypeSuffix?
							 |	Digits ExponentPart FloatTypeSuffix?
							 |	Digits FloatTypeSuffix
							 ;

fragment
ExponentPart  :  ExponentIndicator SignedInteger
			  ;

fragment
ExponentIndicator  :  'e'
				   |  'E'
				   ;

fragment
SignedInteger  :  Sign? Digits
			   ;

fragment
Sign  :  '+'
	  |  '-'
	  ;

fragment
FloatTypeSuffix  :	'f'
				 |  'F'
				 |  'd'
				 |  'D'
				 ;

fragment
HexadecimalFloatingPointLiteral  :	HexSignificand BinaryExponent FloatTypeSuffix?
								 ;

fragment
HexSignificand  :  HexNumeral '.'?
				|	'0' 'x' HexDigits? '.' HexDigits
				|   '0' 'X' HexDigits? '.' HexDigits
				;

fragment
BinaryExponent  :  BinaryExponentIndicator SignedInteger
				;

fragment
BinaryExponentIndicator  :	'p'
						 |  'P'
						 ;


BooleanLiteral  :  'true'
				|	'false'
				;


CharacterLiteral  :	'\'' CharLitCharacter '\''
				  |	'\'' EscapeSequence '\''
				  ;

fragment
CharLitCharacter  :	~['\\]
				  ;

StringLiteral  :  '"' StringCharacter* '"'
			   ;

fragment
StringCharacters  :	 StringCharacter+
				  ;

fragment
StringCharacter  :	~["\\]
				 |	EscapeSequence
				 ;

fragment
EscapeSequence  :  '\\' [btnfr"'\\]
				|	OctalEscape
    			|   UnicodeEscape 
				;

fragment
OctalEscape  :	'\\' OctalDigit
			 |	'\\' OctalDigit OctalDigit
			 |	'\\' ZeroToThree OctalDigit OctalDigit
			 ;

fragment
ZeroToThree  :	[0-3]
			 ;

fragment
UnicodeEscape  :  '\\' 'u' HexDigit HexDigit HexDigit HexDigit
    		   ;


NullLiteral  :	'null'
			 ;


LSMB : '(';
RSMB : ')';
LCRB : '{';
RCRB : '}';
LSQB : '[';
RSQB : ']';
SEMI : ';';
COMMA : ',';
DOT : '.';


ASSIGN : '=';
GT : '>';
LT : '<';
NOT : '!';
TILDE : '~';
QMARK : '?';
COLON : ':';
EQEQ : '==';
LEEQ : '<=';
GEEQ : '>=';
NTEQ : '!=';
AND : '&&';
OR : '||';
INCR : '++';
DECR : '--';
ADD : '+';
SUB : '-';
MUL : '*';
DIV : '/';
BAND : '&';
BOR : '|';
CARET : '^';
MOD : '%';
ARROW : '->';
DCLN : '::';

ADDEQ : '+=';
SUBEQ : '-=';
MULEQ : '*=';
DIVEQ : '/=';
ANDEQ : '&=';
OREQ : '|=';
XOREQ : '^=';
MODEQ : '%=';
LTLTEQ : '<<=';
GTGTEQ : '>>=';
GTGTGTEQ : '>>>=';




Identifier  :  JavaLetter JavaLetterOrDigit*
			;

fragment
JavaLetter  :  [a-zA-Z$_]
			|	~[\u0000-\u007F\uD800-\uDBFF]
			|	[\uD800-\uDBFF] [\uDC00-\uDFFF]
			;

fragment
JavaLetterOrDigit  :  [a-zA-Z0-9$_]
				   |	~[\u0000-\u007F\uD800-\uDBFF]
				   |	[\uD800-\uDBFF] [\uDC00-\uDFFF]
				   ;


ATTHERATE : '@';

THREEDOTS : '...';


WHITE_SPACE  :  [ \t\r\n\u000C]+ -> channel(HIDDEN)
			 ;

MULTI_LINE_COMMENT  :  '/*' .*? '*/' -> channel(HIDDEN)
    				;

SINGLE_LINE_COMMENT  :  '//' ~[\r\n]* -> channel(HIDDEN)
    				 ;