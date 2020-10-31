#include <iostream>
#include <string.h>

using namespace std;


bool inIsTrue(int counter);
bool inIsFalse(int counter);
void codifica(int* key, char[]* stringa);
void decodifica(int* key, char[]* stringa);

int main() {
    int counter;
    bool in = true;
    int key;
    char stringa[100];

    do {

        cout << "1. Codificare" << endl
        << "2. Decodificare" << endl;
        cin >> counter;

        in = (counter < 0 || counter >  2) ? true : false;
    }   
    while(in);

    cout << "Inserire chiave numerica: ->";
    cin >> key;

    cout << "Inserire messaggio: ->";
    cin >> stringa;
    
    if(counter == 1)
        codifica(&key, &stringa);
    else
        decodifica(&key, &stringa);

}

bool inIsTrue(int counter) { 
    return true; 
}

bool inIsFalse(int counter) {
    cout << "Dato inserito non valido" << endl;
    return false;
}

void codifica(int* key) {
    
}

void decodifica(int* key) {

}