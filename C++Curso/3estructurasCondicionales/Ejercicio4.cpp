/*
Comprobar si un numero digitado por el usuario es positivo
o negativo.
*/
#include<iostream>

using namespace std;

int main (){
    int numero;
    cout<<"Digite un numero: "<<endl;
    cin>>numero;
    if (numero == 0)
    {
        cout<<"El numero es igual 0"<<endl;
    }
    else if (numero>0)
    {
        cout<<"El numero es positivo "<<endl;
    } else {
        cout<<"\nEl numero es negativo"<<endl;
    }    

    return 0;
}