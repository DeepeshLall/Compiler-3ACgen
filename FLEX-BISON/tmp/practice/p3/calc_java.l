%{
#include "java_scanner.h"
int lineno=1;
%}

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
SemiColon ":"
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










Error					[^{Comment}{Literal}{Identifier}]

%%

[ \t\r\f\b]+ 			;
[\n\r]					{lineno++;}
{Comment}				{return COMMENT;}
{Literal}				{return LITERAL;}
{Identifier}			{return IDENTIFIER;}
{Error}					{return ERROR;}

%%

int yywrap(void)
{
	return 1;
}