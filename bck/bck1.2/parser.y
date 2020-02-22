%{
	#include<bits/stdc++.h>
	std::string str = "";
	std::string titl = "";
	int error = 0;
	int ispara = 0;
	int i = 0;
	int e = 0;
	int sectioncount = 0;
	int chaptercount = 0;
	int t = 0;
	int declarativecount = 0;
	int interrogativecount = 0;
	int exclamatorycount = 0;
	int paragraphcout = 0;
	int sentencecount = 0;
	int wordcount = 0;
	int n = 0;
	#include "lex.yy.c"
	extern "C" int yylex();
	extern "C" void yyerror(const char*);
	using namespace std;
	
%}

%union {int i;}
%start S
%token WORD
%token TITLE
%token SECTION
%token CHAPTER
%token PARAGRAPH
%token ENDLINE
%token END
%token SENTENCE
%token SENTENCEEND
%token NUMBER
%token PARAEND

%%

S  :  Title Chapters 
	;


Title  :  TITLE {t++;}
	   ;

Chapters  : Chapters Chapter
			| Chapter
		  ;

Chapter  :  ChapterTitle Sections
			| ChapterTitle Paragraphs Sections
			| ChapterTitle Paragraphs
		 ;

ChapterTitle : CHAPTER {chaptercount++;}
			;

Sections  :  Sections Section
		  | Section 
		  ;

Section  :  SectionTitle Paragraphs
			| SectionTitle
		 ;

Paragraphs : Paragraph Paragraphs
			| Paragraph
			;

Paragraph  :  Sentences 
			;

SectionTitle : SECTION {sectioncount++;}
			;


Sentences : Sentence
			| Sentence Sentences
			;

Sentence : Words SENTENCEEND {sentencecount++;}
		;

Words : WORD {wordcount++;}
	| WORD Words {wordcount++;}
	| NUMBER Words {n++;}
	| NUMBER {n++;}
	;

%%

int main () {
	yyparse();
	if(error){
		cerr << "Syntax Error. Check Your Thesis" <<endl;
		return 0;
	}
	cout << titl << endl;
	//cout << error << endl;
	cout << "Number of Chapters: " << chaptercount << endl;
	cout << "Number of Sections: " << sectioncount << endl;
	cout << "Number of Paragraphs: " << paragraphcout << endl;
	cout << "Number of Sentences: " << sentencecount << endl;
	cout << "Number of Words: " << wordcount << endl;
	cout << "Number of Declarative Sentences: " << declarativecount << endl;
	cout << "Number of Exclamatory Sentences: " << exclamatorycount << endl;
	cout << "Number of Interrogative Sentences: " << interrogativecount << endl;
	cout << "Table of Contents:" << endl;
	cout<< str <<endl;
	return 0;
}

void yyerror (char *s) {
} 
