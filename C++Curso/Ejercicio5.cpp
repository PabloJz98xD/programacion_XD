/*
(Ejercicio 2)
Escribir un programa que de la entrada estandar el precio de un producto y muestre en la salida
estandar el precio del producto al aplicarle el IVA
*/
#include<iostream>

using namespace std;

int main(){
    float precio,iva,precioFinal;

    cout<<"Digite precio del producto: ";
    cin>> precio;

    iva = precio*0.21;
    precioFinal = precio + iva;

    cout<<"\nEl precio final es: "<<precioFinal<<endl;

    return 0;
}
