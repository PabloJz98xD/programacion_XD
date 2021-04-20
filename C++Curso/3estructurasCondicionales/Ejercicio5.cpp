/*
Escriba un programa que lea de la entrada estandar un 
caracter e indique en la salida si el carcter es una 
voval miniscula o no.
*/
#include<iostream>
using namespace std;

int main(){
    char letra;

    cout<<"Digite un caracter: "<<endl;
    cin>>letra;

    switch (letra)
    {
    case 'a':        
    case 'e':
    case 'i':
    case 'o':
    case 'u': cout<<"Es una vocal minuscula"<<endl;break;
    default: cout<<"No es una vocal minuscula"<<endl;break;
    }

    return 0;
}
