%{
	#include "y.tab.h"
	#include<bits/stdc++.h>

	extern "C" int yylex();

	using namespace std;

	int count_1 = 0;
%}


Title {TitleHeading}{TitleCharacter}*

Section {SectionHeading}{SectionChapterCharacter}*

Chapter {ChapterHeading}{SectionChapterCharacter}*

TitleCharacter [A-Za-z :]

SectionChapterCharacter [A-Za-z :0-9.]

WhiteSpace [ ]

Semicolon ':'

TitleHeading "Title"

SectionHeading "Section"

ChapterHeading "Chapter"

TitleContent {WordGroup}*{Word}

Sentence {Space}*{WordGroup}*{Word}{Space}*{SentenceEnd}

SentenceEnd {DeclarativeEnd}|{InterrogativeEnd}|{ExclamationEnd}

DeclarativeEnd [.]
InterrogativeEnd [?]
ExclamationEnd [!]

Space [ \t]

DoubleCommaSemiColon [,][,][,]*|[;]+[,]+|[,]+[;]+|[;][;][;]*

WordGroup {Word}{WordSep}{WordSep}*

WordSep [ ,;\t]

Word_1 ({Letter}{Letter}*)|{Number}

Letter [A-Za-z]

Word [A-Za-z]+

LetterOrNumberChar [A-Za-z0-9]

LetterNumber {Letter}+{IntNumber}+{Letter}+|{Letter}+{IntNumber}+|{IntNumber}+{Letter}+

IntNumber [+-]?[0-9]+
FloatNumber [+-]?[0-9]+[.][0-9]+
Number {IntNumber}|{FloatNumber}
Paragraph_1 {Sentence}{Sentence}*{ParagraphEnd}{ParagraphEnd}*

Paragraph [A-Za-z0-9.\t ;,?!]+[\n]

%%

{DeclarativeEnd} {
	declarativecount++;
	return SENTENCEEND;
}

{LetterNumber} {
	//error = 1;
	//printf("%s\n",yytext);
	ispara = 1;
	return WORD;
}

{DoubleCommaSemiColon} {
	error = 1;
}

{Number} {
	//count_1++;
	//printf("%s,Number\n\n",yytext);
	//printf("%s++\n",yytext);
	return NUMBER;
}




{Title} {
			// yymore();
			if(ispara){
				error = 1;
			}
			titl = titl+string(yytext);
			return TITLE;
		}

{Chapter} {
	// yymore();
	//printf("%s,Chapter\n\n",yytext);
	if(ispara){
				error = 1;
			}
	str = str+string(yytext) + "\n";
	return CHAPTER;
}

{Section} {
	// yymore();
	if(ispara){
				error = 1;
			}
	str = str+"\t" +string(yytext) + "\n";
	return SECTION;
}



{Word} {
	//count_1++;
	//str = str+"  " +string(yytext);
	//printf("%s,Word\n\n",yytext);
	ispara = 1;
	return WORD;
}



{InterrogativeEnd} {
	interrogativecount++;
	return SENTENCEEND;
}



{ExclamationEnd} {
	exclamatorycount++;
	return SENTENCEEND;
}


[\n][\n][\n]* {
	if(ispara)paragraphcout++;
	ispara = 0;
	//return PARAEND;
	//yymore();
	//;
}

<<EOF>> {
	//count_1++;
	if(ispara)paragraphcout++;
	//printf("\n%d--count\n",count_1);
	//return PARAGRAPH;
	yyterminate();
}

. {;}
%%

int yywrap (void) {
	//return PARAGRAPH;
	return 1;
}

/*int main(int argc, char **argv){
	yyin = fopen(argv[1],"r");
	yylex();
	fclose(yyin);
	cout << "Count of words" <<count_1<<endl;
	printf("%d : sectioncount\n",sectioncount);
	printf("%d : chaptercount\n",chaptercount);
	printf("%d : paracount\n",paracount);
	printf("%d : interrcount\n",interrcount);
	printf("%d : exclamationcount\n",exclamationcount);
	printf("%d : declarationcount\n",declarationcount);
	printf("%d : wordcount\n",wordcount);
	printf("%d : linecount\n",linecount);
	return 1;
}*/
