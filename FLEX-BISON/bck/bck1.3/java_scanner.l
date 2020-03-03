%{
#include<bits/stdc++.h>
#include<iostream>
#include "parser.tab.h"
int yylex();

using namespace std;
%}



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



EqualTo "="
GreaterThan ">"
LessThan "<"
Not "!"
Tilda "~"
QuestionMark "?"
Colon ":"
Arrow "->"
EqualEqual "=="
GreaterEqual ">="
LessEqual "<="
NotEqual "!="
Increment "++"
Decrement "--"
Or "||"
And "&&"
Add "+"
Subtract "-"
Multiply "*"
Divide "/"
BitwiseOr "|"
BitwiseAnd "&"
Power "^"
Modulo "%"
DoubleGR ">>"
DoubleLR "<<"
TripleGR ">>>"
PlusEQ "+="
SubEQ "-="
MultEq "*="
AndEQ "&="
OrEQ "|="
PowEQ "^="
DivEQ "/="
ModEQ "%="
DoubleGREQ ">>="
DoubleLREQ "<<="
TripleGREQ ">>>="



LeftCurlyBrace "{"
RightCurlyBrace "}"
LeftSquareBrace "["
RightSquareBrace "]"
LeftSmallBrace "("
RightSmallBrace ")"
Comma ","
DoubleColon "::"
AtTheRate "@"
TripleDot "..."
FullStop "."
SemiColon ";"



DotStar ".*"



HexDigit                [0-9a-fA-F]
UnicodeMarker           [u]+
UnicodeEscape           ("\\"|"\\\\\\"+){UnicodeMarker}{HexDigit}{4}
UnicodeInputCharacter   {UnicodeEscape}|{RawInputCharacter}
UnicodeInputCharacterNotStar {UnicodeEscape}|{RawInputCharacterNotStar}
UnicodeInputCharacterNotStarNotSlash {UnicodeEscape}|{RawInputCharacterNotStarNotSlash}
UnicodeInputCharacterNotBackSlash {UnicodeEscape}|{RawInputCharacterNotBackSlash}
UnicodeInputCharacterNotBackSlashNotSingleQuote {UnicodeEscape}|{RawInputCharacterNotBackSlashNotSingleQuote}
UnicodeInputCharacterNotBackSlashNotDoubleQuote {UnicodeEscape}|{RawInputCharacterNotBackSlashNotDoubleQuote}
RawInputCharacter		[^\n\r]
RawInputCharacterNotStar [^*\n\r]
RawInputCharacterNotStarNotSlash [^*/\n\r]
RawInputCharacterNotBackSlash [^\n\r\\]
RawInputCharacterNotBackSlashNotDoubleQuote [^\n\r\\"]
RawInputCharacterNotBackSlashNotSingleQuote [^\n\r\\']

LineTerminator			[\n\r]
InputCharacter			{UnicodeInputCharacter}
InputCharacterNotStar {UnicodeInputCharacterNotStar}
InputCharacterNotStarNotSlash {UnicodeInputCharacterNotStarNotSlash}
InputCharacterNotBackSlash {UnicodeInputCharacterNotBackSlash}
InputCharacterNotBackSlashNotDoubleQuote {UnicodeInputCharacterNotBackSlashNotDoubleQuote}
InputCharacterNotBackSlashNotSingleQuote {UnicodeInputCharacterNotBackSlashNotSingleQuote}

Comment					{MultiLineComment}|{EndOfLneComment}
MultiLineComment		(\/\*([^*]|[\r\n]|(\*+([^*/]|[\r\n])))*\*+\/)
TraditionalComment		"\/\*"{CommentTail}
CommentTail				"\*"{CommentTailStar}|{NotStar}{CommentTail}
CommentTailStar			"\/"|"\*"{CommentTailStar}|{NotStarNotSlash}{CommentTail}
NotStar 				{InputCharacterNotStar}|{LineTerminator}
NotStarNotSlash			{InputCharacterNotStarNotSlash}|{LineTerminator}
EndOfLneComment			"\/\/"{InputCharacter}*

Literal					{IntegerLiteral}|{FloatingPointLiteral}|{BooleanLiteral}|{CharacterLiteral}|{StringLiteral}|{NullLiteral}

IntegerLiteral 			{DecimalIntegerLiteral}|{HexIntegerLiteral}|{OctalIntegerLiteral}|{BinaryIntegerLiteral}
DecimalIntegerLiteral	{DecimalNumeral}({IntegerTypeSuffix})?
HexIntegerLiteral		{HexNumeral}({IntegerTypeSuffix})?
OctalIntegerLiteral		{OctalNumeral}({IntegerTypeSuffix})?
BinaryIntegerLiteral	{BinaryNumeral}({IntegerTypeSuffix})?
IntegerTypeSuffix		"l"|"L"

DecimalNumeral			0|{NonZeroDigit}({Digits})?|{NonZeroDigit}{Underscores}{Digits}
NonZeroDigit			[1-9]
Digits					{Digit}|{Digit}({DigitAndUnderscores})?{Digit}
DigitsForFloat			{NonZeroDigit}|{NonZeroDigit}({DigitAndUnderscores})?{Digit}
Digit 					0|{NonZeroDigit}
DigitAndUnderscores		({DigitOrUnderscores})+
DigitOrUnderscores		{Digit}|"_"
Underscores 			[_]+

HexNumeral				("0x"|"0X"){HexDigits}
HexDigits				{HexDigit}|{HexDigit}({HexDigitAndUnderscores})?{HexDigit}
HexDigitAndUnderscores 	({HexDigitOrUnderscores})+
HexDigitOrUnderscores	{HexDigit}|"_"

OctalNumeral			0{OctalDigits}|0{Underscores}{OctalDigits}
OctalDigits				{OctalDigit}|{OctalDigit}({OctalDigitAndUnderscores})?{OctalDigit}
OctalDigit 				[0-7]
OctalDigitAndUnderscores ({OctalDigitOrUnderscores})+
OctalDigitOrUnderscores	OctalDigit|"_"

BinaryNumeral 			("0b"|"0B"){BinaryDigits}
BinaryDigits			{BinaryDigit}|{BinaryDigit}({BinaryDigitAndUnderscores})?{BinaryDigit}
BinaryDigit 			[01]
BinaryDigitAndUnderscores ({BinaryDigitOrUnderscores})+
BinaryDigitOrUnderscores {BinaryDigit}|"_"

FloatingPointLiteral	{DecimalFloatingPointLiteral}|{HexadecimalFloatingPointLiteral}
DecimalFloatingPointLiteral	{Digits}"."({Digits})?({ExponentPart})?({FloatTypeSuffix})?|"."{Digits}({ExponentPart})?({FloatTypeSuffix})?|{Digits}{ExponentPart}({FloatTypeSuffix})?|{DigitsForFloat}({ExponentPart})?{FloatTypeSuffix}
ExponentPart			{ExponentIndicator}{SignedInteger}
ExponentIndicator		"e"|"E"
SignedInteger			({Sign})?{Digits}
Sign 					"+"|"-"
FloatTypeSuffix			"f"|"F"|"d"|"D"

HexadecimalFloatingPointLiteral	{HexSignificand}{BinaryExponent}({FloatTypeSuffix})?
HexSignificand			{HexNumeral}[.]?|("0x"|"0X")({HexDigits})?"."{HexDigits}
BinaryExponent			{BinaryExponentIndicator}{SignedInteger}
BinaryExponentIndicator	"p"|"P"

BooleanLiteral			"true"|"false"

CharacterLiteral		(')({SingleCharacter}|{EscapeSequence})(')
SingleCharacter			{InputCharacterNotBackSlashNotSingleQuote}

StringLiteral			(\"){StringCharacter}*(\")
StringCharacter			{InputCharacterNotBackSlashNotDoubleQuote}|{EscapeSequence}

EscapeSequence			(\\)[btnfr]|{OctalEscape}|"\\\\"|"\\\""|"\\'"
OctalEscape				(\\)({OctalDigit}|{OctalDigit}{OctalDigit}|{ZeroToThree}{OctalDigit}{OctalDigit})
ZeroToThree				[0-3]

NullLiteral				null

JavaLetter				[A-Za-z]|"_"|"$"
JavaLetterOrDigit		{JavaLetter}|[0-9]
IdentifierChars			{JavaLetter}({JavaLetterOrDigit})*
Identifier				{IdentifierChars}

Error					[^{Keyword}{Separator}{Operator}{Comment}{Literal}{Identifier}]

%%

[ \t\r\f\b]+ 			;
[\n\r]					;


{Abstract} {return ABSTRACT;}
{Assert} {return ASSERT;}
{Boolean} {return BOOLEAN;}
{Break} {return BREAK;}
{Byte} {return BYTE;}
{Case} {return CASE;}
{Catch} {return CATCH;}
{Char} {return CHAR;}
{Class} {return CLASS;}
{Const} {return CONST;}
{Continue} {return CONTINUE;}
{Default} {return DEFAULT;}
{Do} {return DO;}
{Double} {return DOUBLE;}
{Else} {return ELSE;}
{Enum} {return ENUM;}
{Extends} {return EXTENDS;}
{Final} {return FINAL;}
{Finally} {return FINALLY;}
{Float} {return FLOAT;}
{For} {return FOR;}
{If} {return IF;}
{Goto} {return GOTO;}
{Implements} {return IMPLEMENTS;}
{Import} {return IMPORT;}
{Instanceof} {return INSTANCEOF;}
{Int} {return INT;}
{Interface} {return INTERFACE;}
{Long} {return LONG;}
{Native} {return NATIVE;}
{New} {return NEW;}
{Package} {return PACKAGE;}
{Private} {return PRIVATE;}
{Protected} {return PROTECTED;}
{Public} {return PUBLIC;}
{Return} {return RETURN;}
{Short} {return SHORT;}
{Static} {return STATIC;}
{Strictfp} {return STRICTFP;}
{Super} {return SUPER;}
{Switch} {return SWITCH;}
{Synchronized} {return SYNCHRONIZED;}
{This} {return THIS;}
{Throw} {return THROW;}
{Throws} {return THROWS;}
{Transient} {return TRANSIENT;}
{Try} {return TRY;}
{Void} {return VOID;}
{Volatile} {return VOLATILE;}
{While} {return WHILE;}


{EqualTo} {return ET;}
{GreaterThan} {return GT;}
{LessThan} {return LT;}
{Not} {return NT;}
{Tilda} {return TLD;}
{QuestionMark} {return QM;}
{Colon} {return COLON;}
{Arrow} {return AR;}
{EqualEqual} {return EQEQ;}
{GreaterEqual} {return GREQ;}
{LessEqual} {return LEQ;}
{NotEqual} {return NEQ;}
{Increment} {return INCR;}
{Decrement} {return DECR;}
{Or} {return OR;}
{And} {return AND;}
{Add} {return ADD;}
{Subtract} {return SBTR;}
{Multiply} {return MULT;}
{Divide} {return DIV;}
{BitwiseOr} {return BOR;}
{BitwiseAnd} {return BAND;}
{Power} {return POW;}
{Modulo} {return MOD;}
{DoubleGR} {return GRGR;}
{DoubleLR} {return LTLT;}
{TripleGR} {return GRGRGR;}
{PlusEQ} {return PLEQ;}
{SubEQ} {return SBEQ;}
{MultEq} {return MULEQ;}
{AndEQ} {return ANDEQ;}
{OrEQ} {return OREQ;}
{PowEQ} {return POWEQ;}
{DivEQ} {return DIVEQ;}
{ModEQ} {return MODEQ;}
{DoubleGREQ} {return DGRGR;}
{DoubleLREQ} {return DLRLR;}
{TripleGREQ} {return TGRGRGR;}


{LeftCurlyBrace} {return LCB;}
{RightCurlyBrace} {return RCB;}
{LeftSquareBrace} {return LSQB;}
{RightSquareBrace} {return RSQB;}
{LeftSmallBrace} {return LSMB;}
{RightSmallBrace} {return RSMB;}
{Comma} {return CMA;}
{DoubleColon} {return DCLN;}
{AtTheRate} {return ATR;}
{TripleDot} {return TDT;}
{FullStop} {return FST;}
{SemiColon} {return SCLN;}


{DotStar} {return DST;}


{Comment}				{return COMMENT;}
{Literal}				{return LITERAL;}
{Identifier}			{return IDENTIFIER;}
{Error}					{return ERROR;}

%%

int yywrap(){
	return 1;
}
