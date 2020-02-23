%{
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "y.tab.h"

int Reading = 0;
int once=1;
void yyerror (char *s);
int yylex();
int term = 0;

extern int noOfParagraph;
extern int noOfChapter;
extern int noOfSection;
extern int noOfWord;
extern int noOfDeclarativeSentence;
extern int noOfExclamatorySentence;
extern int noOfInterrogativeSentence;
extern int noOfSentence;

%}

Text					[a-zA-Z]
Punctuation				[,;]
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
{Punctuation}{Punctuation}+	{fprintf(stderr ,"Error Type: Consecutive Punctuation\n");}
[\n][\n]+					{if(Reading){ Reading = 0; return LT;}}
[ \t\f\b]+ 					;
{Punctuation}				;
{IdentifierWithoutDigit}	{strcpy(yylval.text,yytext); return (IdentifierWithoutDigitToken);}
{IdentifierWithDigit}		{strcpy(yylval.text,yytext); return (IdentifierWithDigitToken);}
{NonIdentifier}				{strcpy(yylval.text,yytext); return (NonIdentifierToken);}
{TitleSentence}				{strcpy(yylval.text,yytext); return (TitleLine);}
{ChapterSentence}			{strcpy(yylval.text,yytext); return (ChapterLine);}
{SectionSentence}			{strcpy(yylval.text,yytext); return (SectionLine);}
[.]							{Reading = 1; return '.';}
[!]							{Reading = 1; return '!';}
[?]							{Reading = 1; return '?';}
<<EOF>>						{static int ctr=0; return (ctr++ ? 0 : LT);}
%%

int yywrap(void)
{	
	return 1;
}