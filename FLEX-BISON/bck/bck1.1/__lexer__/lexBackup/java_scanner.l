%{
#include "java_scanner.h"
int lineno=1;
%}
Keyword_set1			"abstract"|"continue"|"for"|"new"|"switch"|"assert"|"default"|"if"|"package"|"synchronized"|"boolean"
Keyword_set2			"do"|"goto"|"private"|"this"|"break"|"double"|"implements"|"protected"|"throw"|"byte"
Keyword_set3			"else"|"import"|"public"|"throws"|"case"|"enum"|"instanceof"|"return"|"transient"|"catch"
Keyword_set4			"extends"|"int"|"short"|"try"|"char"|"final"|"interface"|"static"|"void"
Keyword_set5			"class"|"finally"|"long"|"strictfp"|"volatile"|"const"|"float"|"native"|"super"|"while"
Keyword					{Keyword_set1}|{Keyword_set2}|{Keyword_set3}|{Keyword_set4}|{Keyword_set5}

Separator				"]"|"["|"@"|"::"|"..."|"."|","|"}"|"{"|"\("|"\)"|"\;"
Operator				"="|">"|"<"|"!"|"~"|"?"|":"|"->"|"=="|">="|"<="|"!="|"&&"|"||"|"++"|"--"|"+"|"-"|"*"|"/"|"&"|"|"|"^"|"%"|"<<"|">>"|">>>"|"+="|"-="|"*="|"/="|"&="|"|="|"^="|"%="|"<<="|">>="|">>>="

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
[\n\r]					{lineno++;}
{Keyword}				{return KEYWORD;}
{Separator}				{return SEPARATOR;}
{Operator}				{return OPERATOR;}
{Comment}				{return COMMENT;}
{Literal}				{return LITERAL;}
{Identifier}			{return IDENTIFIER;}
{Error}					{return ERROR;}

%%

int yywrap(void)
{
	return 1;
}