/*
La sentencia while:
While (expresion logica){
    conjuto de instrucciones 
}
*/
#include<iostream>
//#include<conio.h> ->Esta libreria lo que hace es que los ejecutables
                    //se terminen hasta que presiones una tecla con el
                    //el metodo getch
using namespace std;

int main (){
    int i;

    i = 10;
    while (i>=1){
        cout<<i<<endl;
        i--;
    }
    //getch();
    return 0;
}