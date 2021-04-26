/*
(Ejercicio 3)
Realice un programa que lea de la entrada estandar los siguientes datos de una persona:
    Edad: entero.
    Sexo: Caracter.
    Altura: Real.
Traer los datos y el programa debe de mostrarlos en la salida estandar.
*/
#include<iostream>

using namespace std;

int main(){
    int edad;
    char sexo[10];
    float altura;

    cout<<"Digite su edad: "; cin>>edad;
    cout<<"Digite su sexo "; cin>>sexo;
    cout<<"Digite su altura: "; cin>>altura;

    cout<<"\nEdad: " <<edad<<endl;
    cout<<"\nSexo: " <<sexo<<endl;
    cout<<"\nAltura en metros: " <<altura<<endl;

    return 0; 
}