/*
do{
    conjunto de instrucciones;
}while(expresiones logica);
*/
#include<iostream>
#include<stdlib.h>//Pausa el programa
using namespace std;

int main(){
    int i;
    i = 10;

    do{
        cout<<i<<endl;
        i--;//Decrementa el iterador de 1 en 1
    }while(i>=1);
    system("pause");
    return 0;
}
