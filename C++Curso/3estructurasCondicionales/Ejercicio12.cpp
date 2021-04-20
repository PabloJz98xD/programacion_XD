/*
12. Hacer un Mwnu que considere las siguientes opciones:
    Caso 1: Cubo de un numero.
    Caso 2: Numero par o impar.
    Caso 3: Salir.
*/
#include<iostream>
#include<math.h>
using namespace std;

int main (){
    int opcion;
    int numero,cubo;
    cout<<"\tMenu"<<endl;
    cout<<"1. Cubo de un numero"<<endl;
    cout<<"2. Numero par o impar"<<endl;
    cout<<"3. Salir"<<endl;
    cin>>opcion;

    switch (opcion)
    {
    case 1: cout<<"Ingresar numero: "<<endl; cin>>numero;
            cubo = pow(numero, 3); 
            cout<<"El numero al cubo es: "<<cubo<<endl; 
            break;
    case 2: cout<<"Digite numero: "<<endl; cin>>numero;
            if(numero%2==0){
                cout<<"\nEl numero es par."<<endl;
            }
            else{
                cout<<"\nEl numero es impar"<<endl;
            } break;
    case 3: break;
    }
    return 0;
    }