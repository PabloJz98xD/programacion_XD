/*
10.-Escriba un programa que calcule el valor de: 1!+2!+3!...+n!
(suma de factoriales).
*/
#include<iostream>
//#include<conio.h> --->No funciona en Linux.
using namespace std;
int main (){
int veces,suma=0,factorial=1;
    cout<<"Digite numero para suma de: ";
    cin>>veces;
    for(int i = 1;i<=veces;i++){
        factorial *= i;
        suma += factorial;
    }
    cout<<"\nEl factorial es: "<<suma<<endl;

    //getch(); --> No funciona en Linux
    return 0;
}
