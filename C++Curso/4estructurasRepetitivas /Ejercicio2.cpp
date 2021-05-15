/*
Realice un programa que lea de la entrada estandar numeros hasta
que se introduzca cero. En ese momento el programa debe terminar
y mostrar en la salida estandar el numero de valores mayores que
cero leidos.
*/
#include<iostream>
//#include<conio.h> -> No funciona en Linux
using namespace std;
int main (){
    int numero, conteo=0;

    do{
        cout<<"Digite un numero: ";
        cin>>numero;

        if(numero>0){
            conteo++;
        }
    }while(numero != 0);
    cout<<"\nEl numero de valores mayores a cero introducido es: "<<conteo<<endl;

    //getch();
    return 0;
}