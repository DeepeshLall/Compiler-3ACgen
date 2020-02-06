%{ 
    //Ayush Hitesh Soneria
    //170192
    #include <bits/stdc++.h>
    #include <iostream>
    using namespace std;
    extern int yylex();
    #include <string.h>         
    #include <ctype.h>           
    #include <fstream>
    #include <map>
    #include <string>
    #include <cmath>
    typedef std::map <std::string, int> hashmap;
    hashmap hmap;
    typedef std::map <std::string, std::string> stringmap;
    stringmap strmap;
    int lfcount=0;
    int crcount=0;
    int crlfcount=0;
      
%}

WhiteSpace [\t \f]|{LineTerminator}
LineTerminator \n|\r|\r\n
LF \n
CR \r
CRLF \r\n

Literal {IntegerLiteral}|{FloatingPointLiteral}|{BooleanLiteral}|{NullLiteral}|{StringLiteral}|{CharacterLiteral}

IntegerLiteral {DecimalIntegerLiteral}|{HexIntegerLiteral}|{OctalIntegerLiteral}|{BinaryIntegerLiteral}

DecimalIntegerLiteral {DecimalNumeral}{IntegerTypeSuffix}?
DecimalNumeral 0|{NonZeroDigit}{Digits}?|{NonZeroDigit}{Underscores}{Digits}
NonZeroDigit 1|2|3|4|5|6|7|8|9
Digits {Digit}|{Digit}{DigitsAndUnderscores}?{Digit}
Digit 0|{NonZeroDigit}
DigitsAndUnderscores {DigitsOrUnderscore}|{DigitsOrUnderscore}*
DigitsOrUnderscore {Digit}|_

HexIntegerLiteral {HexNumeral}{IntegerTypeSuffix}?
HexNumeral 0x{HexDigits}|0X{HexDigits}
HexDigits {HexDigit}|{HexDigit}{HexDigitsAndUnderscores}?{HexDigit}
HexDigit 0|1|2|3|4|5|6|7|8|9|a|b|c|d|e|f|A|B|C|D|E|F
HexDigitsAndUnderscores {HexDigitOrUnderscore}|{HexDigitOrUnderscore}*
HexDigitOrUnderscore HexDigit|_

OctalIntegerLiteral {OctalNumeral}{IntegerTypeSuffix}?
OctalNumeral 0{OctalDigits}|0{Underscores}{OctalDigits}
OctalDigits {OctalDigit}|{OctalDigit}{OctalDigitsAndUnderscore}?{OctalDigit}
OctalDigit 0|1|2|3|4|5|6|7
OctalDigitsAndUnderscore {OctalDigitOrUnderscore}|{OctalDigitOrUnderscore}*
OctalDigitOrUnderscore {OctalDigit}|_

BinaryIntegerLiteral {BinaryNumeral}{IntegerTypeSuffix}?
BinaryNumeral 0b{BinaryDigits}|0B{BinaryDigits}
BinaryDigits {BinaryDigit}|{BinaryDigit}{BinaryDigitsAndUnderscore}?{BinaryDigit}
BinaryDigit 0|1
BinaryDigitsAndUnderscore {BinaryDigitOrUnderscore}{BinaryDigitOrUnderscore}*
BinaryDigitOrUnderscore BinaryDigit|_

Underscores _|[_]*
IntegerTypeSuffix l|L

FloatingPointLiteral {DecimalFloatingPointLiteral}|{HexadecimalFloatingPointLiteral}

DecimalFloatingPointLiteral {Digits}\.{Digits}?{ExponentPart}?{FloatTypeSuffix}?|\.{Digits}{ExponentPart}?{FloatTypeSuffix}?|{Digits}{ExponentPart}{FloatTypeSuffix}?|{Digits}{ExponentPart}?{FloatTypeSuffix}
ExponentPart {ExponentIndicator}{SignedInteger}
ExponentIndicator e|E
SignedInteger {Sign}?{Digits}
Sign \+|-
FloatTypeSuffix f|F|d|D

HexadecimalFloatingPointLiteral {HexSignificand}{BinaryExponent}{FloatTypeSuffix}?
HexSignificand {HexNumeral}[\.]?|0x{HexDigits}?\.{HexDigits}|0X{HexDigits}?\.{HexDigits}
BinaryExponent {BinaryExponentIndicator}{SignedInteger}
BinaryExponentIndicator p|P

BooleanLiteral true|false
NullLiteral null

CharacterLiteral \'{SingleCharacter}\'|\'{EscapeSequence}\'
SingleCharacter [^\n\r\'\\]

StringLiteral \"{StringCharacter}*\"
StringCharacter [^\n\r\"\\]|{EscapeSequence}

EscapeSequence \\n|\\r|\\b|\\t|\\f|\\\"|\\\'|\\\\|{OctalEscape}
OctalEscape \\{OctalDigit}|\\{OctalDigit}{OctalDigit}|\\{ZeroToThree}{OctalDigit}{OctalDigit}
ZeroToThree 0|1|2|3

Operator \+|-|\*|\/|=|>|<|>=|<=|==|!|!=|~|\?|:|\||\&\&|\|\||->|\&|\+\+|\-\-|\^|\%|<<|>>|>>>|<<=|>>=|>>>=|\+=|-=|\*=|\/=|\&=|\^=|\%=
Separator \(|\)|\{|\}|\[|\]|;|,|\.\.\.|\@|::|\. 
Keyword abstract|continue|for|new|switch|assert|default|if|package|synchronized|boolean|do|goto|private|this|break|double|implements|protected|throw|byte|else|import|public|throws|case|enum|instanceof|return|transient|catch|extends|int|short|try|char|final|interface|static|void|class|finally|long|strictfp|volatile|const|float|native|super|while 

Identifier {IdentifierChars}
IdentifierChars {JavaLetter}{JavaLetterOrDigit}*
JavaLetter [A-Za-z_$]
JavaLetterOrDigit [A-Za-z0-9_$]

Comments "/*"([^*]|\*+[^*/])*\*+"/"|"//"[^\n\r]*

%%

{LF} {
    lfcount++; 
    }
{CR} {
    crcount++; 
    }
{CRLF} {
    crlfcount++; 
    }

{Comments} ;

{Literal} {              
             ++hmap[yytext];
             strmap.insert(pair <std::string, std::string> (yytext, "Literal"));
           }
{Operator} {              
             ++hmap[yytext];
             strmap.insert(pair <std::string, std::string> (yytext, "Operator"));
            }
{Separator} {              
             ++hmap[yytext];
             strmap.insert(pair <std::string, std::string> (yytext, "Separator"));
            }
{Keyword} {              
             ++hmap[yytext];
             strmap.insert(pair <std::string, std::string> (yytext, "Keyword"));
            }
{Identifier} {              
             ++hmap[yytext];
             strmap.insert(pair <std::string, std::string> (yytext, "Identifier"));
           }
{WhiteSpace} ;
. {
  cerr << "ERROR: " << yytext << " on line number -- " << 1+lfcount+crcount-crlfcount << endl; 
  }
%%

int main(int argc, char *argv[]) {

  FILE *infile = fopen(argv[1], "r");

  if (!infile) {
    cout << "can't open input file" << endl;
    return -1;
  }
  yyin = infile;
  yylex(); 
  yywrap();
  std::cout << std::left << std::setw(20) << "LEXEME" << std::left << std::setw(20) << "TOKEN" << std::left<< std::setw(20) << "COUNT" << endl;
  for (hashmap::iterator p = hmap.begin(); p != hmap.end(); ++p) {
        std::cout << std::left << std::setw(20) << p->first << std::left << std::setw(20) << strmap.find(p->first)->second << std::left << std::setw(20) << p->second << "\n";
    }    
  return 0;
}