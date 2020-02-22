#include <iostream>
#include <utility> 
#include <list>
#include <cstring>

using namespace std;

extern int yylex();
extern int lineno;
extern int noOfChapter;
extern int noOfSection;
extern char* yytext;

int main(void){
    int token;

    token=yylex();

    while (token)
    {
        // printf("%d    ------->   %s\n",token,yytext);


        token = yylex();
    }
    
    printf("No of Line: %d\n",lineno);

    printf("No of Chapter: %d\n",noOfChapter);

    printf("No of Section: %d\n",noOfSection);

    return 0;
}