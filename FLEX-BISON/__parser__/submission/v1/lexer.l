%{
#include "dissersation.h"
int lineno=1;
int noOfChapter=0;
int noOfSection=0;
%}

Text					[a-zA-Z,;]
Digit 					[0-9]
Number 					{Digit}+
Real 					{Digit}*[.]{Number}
IdentifierWithoutDigit	{Text}({Text})*
IdentifierWithDigit 	{Text}{Number}{Text}
Identifier				{IdentifierWithDigit}|{IdentifierWithoutDigit}
NonIdentifier		 	{Digit}({Text})*
Word					({Identifier}|{NonIdentifier})
Word_mod				{IdentifierWithoutDigit}|{Real}

Sentence				(" "*{Word_mod})*|{Word_mod}*
TitleSentence			^"Title:"{Sentence}
ChapterSentence			^"Chapter "({Number}" "*":"){Sentence}
SectionSentence			^"Section "({Real}":"{Sentence})

%%

[ \t\f\b]+ 					;
[\n\r]						{lineno++;}
{IdentifierWithoutDigit}	{return IdentifierWithoutDigitToken;}
{IdentifierWithDigit}		{return IdentifierWithDigitToken;}
{NonIdentifier}				{return NonIdentifierToken;}
{TitleSentence}				{printf("TITLE ======> %s\n",yytext);return TitleToken;}
{ChapterSentence}			{printf("Chapter ====> %s\n",yytext); noOfChapter++; return ChapterToken;}
{SectionSentence}			{printf("Section ==> %s\n",yytext); noOfSection++; return SectionToken;}
[\.\?\!]					;
<<EOF>>     				{static int once = 0; return once++ ? 0 : '\n';}

%%

int yywrap(void)
{	
	return 1;
}