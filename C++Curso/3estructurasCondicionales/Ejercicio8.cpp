/*
Escribe un programa que lea de la entrada estandar tres
numeros. Despues debe leer un cuarto numero e indicar si 
numero coincide con alguno de los introducidos con 
anterioridad.
*/
#include<iostream>

using namespace std;

int main (){
    int n1,n2,n3,n4;

    cout<<"Ingresa tres numeros: ";
    cin>>n1>>n2>>n3;
    cout<<"Ingresa un cuarto numero: ";
    cin>>n4;

    if ((n1==n4) || (n2==n4) || (n3==n4))
    {
        cout<<"El cuarto numero coincide con los anteriores."<<endl;       
    } else {
        cout<<"El cuarto numero no coincide con ningun numero."<<endl;
    }
    

    return 0;
}