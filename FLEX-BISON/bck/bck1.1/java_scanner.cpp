#include <iostream>
#include <utility> 
#include <list>
#include <cstring>

using namespace std;

typedef pair<int, string> pairs; 

extern int yylex();
extern int lineno;
extern char* yytext;

class Hash{
    int no_of_token;  //no of token
    list<pairs> *table;

    public:
        Hash(int no_of_token);//constructor

        //insert a pairs into hash table
        void insertItem(int token,string lexeme);

        //hash function token_no=index in table
        int hashFunction(int token){
            return token-1;
        }

        //display hashmap
        void displayHash();

        //display result in desired format
        void displayResult();
};

Hash::Hash(int no_of_token){
    this->no_of_token = no_of_token;
    table = new list<pairs>[no_of_token];
}

void Hash::insertItem(int token,string lexeme){
    int token_no=hashFunction(token);
    // cout << ":[DEBUG]: " << lexeme << " " << token_no << endl;
    list <pairs> :: iterator i;
    for ( i = table[token_no].begin(); i != table[token_no].end(); i++)
    {
        // cout << "::[DEBUG]::" <<endl;
        if(i->second == lexeme){
            // cout << "MATCH OF TOKEN: " << lexeme << " Token no: " << token_no << endl;
            if(token_no==7){
                break;
            }
            i->first++;
            break;
        }
    }

    if(i == table[token_no].end()){
        // cout << "::[DEBUG]::" << endl;
        if(token_no==7){
            table[token_no].push_back(make_pair(lineno,lexeme));
        }else{
            table[token_no].push_back(make_pair(1,lexeme));
        }
    }
}

// function to display hash table 
void Hash::displayHash() { 
    for (int token_no = 0; token_no < no_of_token; token_no++) { 
        cout << token_no;
        list <pairs> :: iterator i;
        for ( i = table[token_no].begin(); i != table[token_no].end(); i++)
        {
            cout << " --> " << "(" << i->first << "," << i->second << ")";
        }
        cout << endl;
    } 
} 

void Hash::displayResult(){
    for (int token_no = 0; token_no < no_of_token; token_no++) { 
        // cout << token_no;
        string token_id;
        switch(token_no){
            case 0: token_id="Keyword";break;
            case 1: token_id="Separator";break;
            case 2: token_id="Operator";break;
            case 3: token_id="Unicode";break;
            case 4: token_id="Comment";break;
            case 5: token_id="Literal";break;
            case 6: token_id="Identifier";break;
            default: token_id="Error";
        }
        list <pairs> :: iterator i;
        for ( i = table[token_no].begin(); i != table[token_no].end(); i++)
        {
            if(token_no==4){
                continue;
            }
            if(token_no==7){
                cerr << "Found Error at line "<< i->first  << " for symbol: "<< i->second<< endl;
                continue;
            }
            cout << i->second << "," << token_id << "," << i->first << endl;
        }
    }
}

int main(void){
    int token;
    Hash h(8);//bno of possible return value of lex file
    
    token=yylex();

    while(token){
        // printf("%s %d %d\n",yytext,yylineno,token_no);
        h.insertItem(token,yytext);
        token=yylex();
    }

    // cout << "+--------------------------------------HASH MAP-----------------------------------------------------------------------------------------------+" << endl;
    // cout << endl;

    // h.displayHash();

    // cout << endl;
    // cout << "+--------------------------------------LEXEME TABLE-------------------------------------------------------------------------------------------+" << endl;
    // cout << endl;

    cout << "_____________________________________"<<endl;
    cout << endl;
    cout << "Lexeme," << "Token," << "Count" << endl;
    cout << "_____________________________________"<<endl;
    cout << endl;

    h.displayResult();

    cout << "_____________________________________"<<endl;

    // cout << "+---------------------------------------------------------------------------------------------------------------------------------------------+" << endl;

    return 0;
}