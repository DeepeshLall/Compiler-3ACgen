%{
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int yylex();
int yyerror(char *s);

int noOfParagraph=0;
int noOfChapter=0;
int noOfSection=0;
int noOfWord=0;
int noOfDeclarativeSentence=0;
int noOfExclamatorySentence=0;
int noOfInterrogativeSentence=0;
int noOfSentence=0;

char TableOfContent[5000]="Table Of Contents:\n";
char TitleLineStr[500]="";
%}
%union{
    char text[5000];
}

%token <text> IdentifierWithDigitToken IdentifierWithoutDigitToken NonIdentifierToken
%token <text> ChapterLine TitleLine SectionLine
%token LT
%start prog

%type <text> prog
%type <text> ChapterBlocks Chapter ChapterBody
%type <text> SectionBlock Sections SectionBody
%type <text> Paragraphs Paragraph
%type <text> Line Lines
%type <text> DeclarativeLine InterrogativeLine ExclamatoryLine
%type <text> Words

%%

prog        : TitleLine ChapterBlocks   {
                                            strcpy($$,$1);
                                            strcat($$,$2);
                                            strcat(TitleLineStr,$1);
                                            strcat(TitleLineStr,"\n");
                                        }
            ;

ChapterBlocks: Chapter  {
                            strcpy($$,$1);
                            noOfChapter++;
                        }
            | ChapterBlocks Chapter     {
                                            strcpy($$,$1);
                                            strcat($$,$2);
                                            noOfChapter++;
                                        }
            ;

Chapter    : ChapterLine ChapterBody   {
                                            strcpy($$,$1);
                                            strcat($$,$2);
                                            strcat(TableOfContent,$1);
                                            strcat(TableOfContent,"\n");
                                        }
            | ChapterLine   {
                                strcpy($$,$1);
                                strcat(TableOfContent,$1);
                                strcat(TableOfContent,"\n");
                            }
            ;

ChapterBody : SectionBlock  {
                                strcpy($$,$1);
                            }
            | Paragraphs    {
                                strcpy($$,$1);
                            }
            | Paragraphs SectionBlock   {
                                            strcpy($$,$1);
                                            strcat($$,$2);
                                        }
            ;

SectionBlock: Sections  {
                            strcpy($$,$1);
                        }
            | SectionBlock Sections {
                                        strcpy($$,$1);
                                        strcat($$,$2);
                                    }
            ;

Sections    : SectionLine SectionBody {
                                        strcpy($$,$1);
                                        strcat($$,$2);
                                        strcat(TableOfContent,"\t");
                                        strcat(TableOfContent,$1);
                                        strcat(TableOfContent,"\n");
                                        noOfSection++;
                                    }
            ;

SectionBody : Paragraphs    {
                                strcpy($$,$1);
                            }
            ;

Paragraphs  : Paragraph {
                            strcpy($$,$1);
                            noOfParagraph++;
                        }
            | Paragraphs Paragraph  {
                                        strcpy($$,$1);
                                        strcat($$,$2);
                                        noOfParagraph++;
                                    }
            ;

Paragraph   : Lines  LT  {
                            strcpy($$,$1);
                        }
            ;

Lines       : Line {
                        strcpy($$,$1);
                    }
            | Lines Line    {
                                strcpy($$,$1);
                                strcat($$,$2);
                            }
            ;

Line        : DeclarativeLine   {
                                    strcpy($$,$1);
                                    noOfDeclarativeSentence++;
                                    noOfSentence++;
                                }
            | InterrogativeLine {
                                    strcpy($$,$1);
                                    noOfInterrogativeSentence++;
                                    noOfSentence++;
                                }
            | ExclamatoryLine   {
                                    strcpy($$,$1);
                                    noOfExclamatorySentence++;
                                    noOfSentence++;
                                }
            ;

DeclarativeLine : Words '.'     {
                                    strcpy($$,$1);
                                    strcat($$,".");
                                }
                | Words DeclarativeLine {
                                            strcpy($$,$1);
                                            strcat($$,$2);
                                        }
                ;

InterrogativeLine: Words '?'    {
                                    strcpy($$,$1);
                                    strcat($$,"?");
                                }
                | Words InterrogativeLine   {
                                                strcpy($$,$1);
                                                strcat($$,$1);
                                            }
                ;

ExclamatoryLine : Words '!' {
                                strcpy($$,$1);
                                strcat($$,"!");
                            }
                | Words ExclamatoryLine {
                                            strcpy($$,$1);
                                            strcat($$,$2);
                                        }
                ;

Words           : IdentifierWithDigitToken  {
                                                strcpy($$,$1);
                                            }
                | IdentifierWithoutDigitToken   {
                                                    strcpy($$,$1);
                                                    noOfWord++;
                                                }
                | NonIdentifierToken{
                                        strcpy($$,$1);
                                    }
                ;
%%

int yyerror(char *s)
{
	fprintf(stderr ,"Error Type: %s\n", s);
	return 0;
}

int main()
{
    yyparse();
    
    printf("%s",TitleLineStr);
    printf("Number of Chapter: %d\n",noOfChapter);
    printf("Number of Sections: %d\n",noOfSection);
    printf("Number of Paragraph: %d\n",noOfParagraph);
    printf("Number of Sentences: %d\n",noOfSentence);
    printf("Number of Words: %d\n",noOfWord);
    printf("Number of Declarative Sentences: %d\n",noOfDeclarativeSentence);
    printf("Number of Exclamatory Sentences: %d\n",noOfExclamatorySentence);
    printf("Number of Interrogative Sentences: %d\n",noOfInterrogativeSentence);

    printf("%s",TableOfContent);

    return 0;
}