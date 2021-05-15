/*
La sentencia for 
for (expr1; expresion logica; expr2){
    conjunto de instrucciones;
}
*/
#include<iostream>
//#include<conio.h> -> No funciona en linux
using namespace std;
int main(){
    for(int i=10; i>=1;i--){
        cout<<i<<endl;
    }
    //getch(); ->Ayuda a detener el programa pero no funciona en Linux
    return 0;
}