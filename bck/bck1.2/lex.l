%{
	/*
		constants
		LT, EQ, LE, GT, GE, NE,
		IF, THEN, ELSE, RELOP
	*/
	#include<iostream>
	#include<bits/stdc++.h>
	#include<unordered_map>

	extern "C" int yylex();

	using namespace std;

	unordered_map<string, string> typeTable;
	unordered_map<string, int> countTable;

	void dataFill(string words, string typeEntry){
		if(typeTable.find(words)==typeTable.end()){
			typeTable[words] = typeEntry;
			countTable[words] = 1;
		}
		else{
			countTable[words] = countTable[words] + 1;
		}
	}

	int lineNum = 1;

	int error = 0;
%}

/*regular definitions*/
newLine [\n]|[\r]|[\n][\r]

delim  [ \t\r]
WhiteSpace     {delim}+

UnicodeInputCharacter {UnicodeEscape}|{RawInputCharacter}
UnicodeEscape [\\]{UnicodeMarker}{HexDigit}{HexDigit}{HexDigit}{HexDigit}
UnicodeMarker [u][u]*
RawInputCharacter []

LineTerminator [\\n]|[\\r]|[\\n][\\r]

keywords_1  "abstract"|"assert"|"boolean"|"break"|"byte"|"case"|"catch"|"char"|"class"|"const"
keywords_2  "continue"|"default"|"do"|"double"|"else"|"enum"|"extends"|"final"|"finally"|"float"
keywords_3  "for"|"if"|"goto"|"implements"|"import"|"instanceof"|"if"|"int"|"interface"|"long"|"native"
keywords_4  "new"|"package"|"private"|"protected"|"public"|"return"|"short"|"static"|"strictfp"|"super"
keywords_5  "switch"|"synchronized"|"this"|"throw"|"throws"|"transient"|"try"|"void"|"volatile"|"while"
Keywords    {keywords_1}|{keywords_2}|{keywords_3}|{keywords_4}|{keywords_5}

Abstract "abstract"
Assert "assert"
Boolean "boolean"
Break "break"
Byte "byte"
Case "case"
Catch "catch"
Char "char"
Class "class"
Const "const"
Continue "continue"
Default "default"
Do "do"
Double "double"
Else "else"
Enum "enum"
Extends "extends"
Final "final"
Finally "finally"
Float "float"
For "for"
If "if"
Goto "goto"
Implements "implements"
Import "import"
Instanceof "instanceof"
Int "int"
Interface "interface"
Long "long"
Native "native"
New "new"
Package "package"
Private "private"
Protected "protected"
Public "public"
Return "return"
Short "short"
Static "static"
Strictfp "strictfp"
Super "super"
Switch "switch"
Synchronized "synchronized"
This "this"
Throw "throw"
Throws "throws"
Transient "transient"
Try "try"
Void "void"
Volatile "volatile"
While "while"

BinaryDigit [01]

BooleanLiteral [t][r][u][e]|[f][a][l][s][e]

OctalDigit [01234567]

HexDigit [0123456789abcdefABCDEF]

EndofLineComment \/\/{InputCharacter}*

NotStarNotSlash [{InputCharacter}^*\/]|{LineTerminator}
NotStar [{InputCharacter}^*]|{LineTerminator}
CommentTailStar \/|*{CommentTailStar}|{NotStarNotSlash}{CommentTail}
CommentTail *{CommentTailStar}|{NotStar}{CommentTail}
TraditionalComment \/*{CommentTail}

CommentCharacter [^*\/]
StarComment_1 [\/][*]{InputCharacter}*[*][\/]
StarComment_2 \/\*([^*]*\*[*]*[^/])*([^*]*\*[*]*)\/

StarComment [/][*]([^*]|[*][*]*[^*/])*[*][*]*[/]

Comment {EndofLineComment}|{StarComment}

DoubleBackslash \/\/

JavaLetter [qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM\_$]
JavaLetterorDigit [qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM0123456789\_$]
IdentifierChars {JavaLetter}{JavaLetterorDigit}*

InputCharacter  [^\n\r]
InputCharacter_1 {JavaLetterorDigit}|[\ ]
InputCharacter_2  [^\n\r]
InputCharacter_3 [^\\n\\r]

Operator_11 [=]|[>]|[<]|[!]|[~]|[?]|[:]|[-][>]
Operator_12 [=][=]|[>][=]|[<][=]|[!][=]|[+][+]|[-][-]|[\|][\|]|[\&][\&]
Operator_13 [+]|[-]|[*]|[\&]|[\/]|[\^]|[%]|[<][<]|[>][>]|[>][>][>]|[\|]
Operator_14 [+][=]|[-][=]|[*][=]|[=]|[\&][=]|[\|][=]|[\^][=]|[\/][=]
Operator_15 [%][=]|[<][<][=]|[>][>][=]|[>][>][>][=]
Operators   {Operator_11}|{Operator_12}|{Operator_13}|{Operator_14}|{Operator_15}

Separator_1 [\[]|[\}]|[\{]|[\]]|[\(]|[\)]|[,]|[:][:]|[@]|(\.\.\.)|[.]|[@]|[\;]

Separator [\[]|[\}]|[\{]|[\]]|[\(]|[\)]|[,]|[:][:]|[@]|[\.][\.][\.]|[.]|[@]|[\;]

ZerotoThree [0123]

NonZeroDigit [123456789]

OctalEscape [\\]{OctalDigit}|[\\]{OctalDigit}{OctalDigit}*|[\\]{ZerotoThree}{OctalDigit}{OctalDigit}

EscapeSequence [\\][btnfr]|[\\][\"]|[\\][\']|[\\][\\]|{OctalEscape}

EscapeSequence_1 (\\[btnfr])|[\\"]|[\\']|[\\]

EscapeSequence_2 (\\[btnfr])|[\\][\"]|[\\][\']|[\\][\\]|{OctalEscape}

SingleCharacter [A-Za-z]

Character_1 [^\'\n\r]|[\/]|[\\][\']|[\\]

Character_2 [^\'\n\r]|[\/]|[\\][\']|[≈]|{UnicodeEscape}

Character_3 [^\'\n\r]|[\/]|[\\][\']|[≈]|{UnicodeEscape}|{EscapeSequence}

Character [^\\\'\n\r]|[\/]|[≈]|{UnicodeEscape}|{EscapeSequence}

CharacterLiteral_1 \'{Character}\'|\'{EscapeSequence}\'|[\'][\\][\\][\'] 

CharacterLiteral_2 \'{Character}\'|[\'][\\][\\][\']

CharacterLiteral \'{Character}\'

StringCharacter [^\\\"\n\r]|[\/]|[≈]|{EscapeSequence}|{UnicodeEscape}

StringCharacter_1 [^"\\\n\r]|{EscapeSequence}

StringCharacter_2 [^\"\n\r]|[\/]|[\\][\"]|[≈]|{EscapeSequence} 

StringLiteral \"{StringCharacter}*\"|"Float.NaN"|"Double.NaN"

StringLiteral_1 \"{StringCharacter}*\"

NullLiteral [n][u][l][l]

FloatTypeSuffix [fFdD]
Sign [+-]
SignedInteger {Sign}?{Digits}
ExponentIndicator [eE]
ExponentPart {ExponentIndicator}{SignedInteger}
DecimalFLoatingPointLiteral {Digits}[.]{Digits}?{ExponentPart}?{FloatTypeSuffix}?|[.]{Digits}{ExponentPart}?{FloatTypeSuffix}?|{Digits}{ExponentPart}{FloatTypeSuffix}?|{Digits}{ExponentPart}?{FloatTypeSuffix}


HexDigitorUnderscore {HexDigit}|[_]
HexDigitandUnderscores {HexDigitorUnderscore}{HexDigitorUnderscore}*
HexDigits {HexDigit}|{HexDigit}{HexDigitandUnderscores}?{HexDigit}
HexNumeral [0][x]{HexDigits}|[0][X]{HexDigits}

Underscores [_][_]*
Digit [0]|{NonZeroDigit}
DigitorUnderscore {Digit}|[_]
DigitandUnderscores {DigitorUnderscore}{DigitorUnderscore}*
Digits {Digit}|{Digit}{DigitandUnderscores}?{Digit}
DecimalNumeral [0]|{NonZeroDigit}{Digits}?|{NonZeroDigit}{Underscores}{Digits}

OctalDigitorUnderscore {OctalDigit}|[_]
OctalDigitandUnderscores {OctalDigitorUnderscore}{OctalDigitorUnderscore}*
OctalDigits {OctalDigit}|{OctalDigit}{OctalDigitandUnderscores}?{OctalDigit}
OctalNumeral [0]{OctalDigits}|[0]{Underscores}{OctalDigits}

BinaryDigitorUnderscore {BinaryDigit}|[_]
BinaryDigitandUnderscores {BinaryDigitorUnderscore}{BinaryDigitorUnderscore}*
BinaryDigits {BinaryDigit}|{BinaryDigit}{BinaryDigitandUnderscores}?{BinaryDigit}
BinaryNumeral [0][b]{BinaryDigits}|[0][B]{BinaryDigits}

BinaryExponentIndicator [pP] 
BinaryExponent {BinaryExponentIndicator}{SignedInteger}
HexSignificand {HexNumeral}[.]?|[0][x]{HexDigits}?[.]{HexDigits}|[0][X]{HexDigits}?[.]{HexDigits}
HexadecimalFloatingPointLiteral {HexSignificand}{BinaryExponent}{FloatTypeSuffix}?

FloatingPointLiteral {DecimalFLoatingPointLiteral}|{HexadecimalFloatingPointLiteral}

IntegerTypeSuffix [lL]
BinaryIntegerLiteral {BinaryNumeral}{IntegerTypeSuffix}?
OctalIntegerLiteral {OctalNumeral}{IntegerTypeSuffix}?
HexIntegerLiteral {HexNumeral}{IntegerTypeSuffix}?
DecimalIntegerLiteral {DecimalNumeral}{IntegerTypeSuffix}?

IntegerLiteral {BinaryIntegerLiteral}|{OctalIntegerLiteral}|{HexIntegerLiteral}|{DecimalIntegerLiteral}

Literal {IntegerLiteral}|{FloatingPointLiteral}|{StringLiteral}|{CharacterLiteral}|{BooleanLiteral}|{NullLiteral}

Char []*

BackSlashAsterisk [\/][*]|[*][\/]


%%
{newLine}			  {lineNum=lineNum+1;}
{WhiteSpace} 		  {;}
{Separator}    		  {dataFill(yytext,"Separator");}
{Operators}  		  {dataFill(yytext,"Operator");}
{Literal}	  		  {dataFill(yytext,"Literal");}
{IdentifierChars}     {dataFill(yytext,"Identifier");}
{Comment}  			  {
							lineNum = lineNum + count(yytext, yytext+strlen(yytext),'\n');
							lineNum = lineNum + count(yytext, yytext+strlen(yytext),'\r');

							for(int i = 0; i < strlen(yytext)-1 ; i++){
								if(count(yytext+i,yytext+1+i,'\r')){
									if(count(yytext+i+1,yytext+2+i,'\n')){
										lineNum = lineNum - 1;
									}
								}
							}
					  }
[^\n\r \t]			  {cerr <<"Line "<<lineNum<<": ILLEGAL CHARACTER\n"<<endl; error=1;}
%%

int yywrap(){
	return 1;
}

int main(int argc, char **argv){
	yyin = fopen(argv[1],"r");
	yylex();
	fclose(yyin);
	unordered_map<string,string>::iterator i;
	if(!error){
		cout <<"Lexeme"<<","<<"Token"<<","<<"Count"<<endl;
		for(i = typeTable.begin(); i!= typeTable.end(); i++){
			cout << i->first << "," << i->second << "," << countTable[i->first] << endl;
		}
	}
	return 1;
}