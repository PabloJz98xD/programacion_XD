/*
7.-La calificacion final de un estudiante es la media
ponderada de practicas que cuenta con 30% del total, la
nota teorica que cuenta un 60% y la nota de participacion
que cuenta el 10% restante. Escriba un programa que lea
de la entrada estandar las tres notas de un alumno y 
escriba en la salida estandar su nota final.
*/
#include<iostream>

using namespace std;

int main(){
    float practica, teorica, participacion, notaFinal = 0;

    cout<<"Digite la nota de practica: "; cin>>practica;
    cout<<"Digite la nota teorica: "; cin>>teorica;
    cout<<"Digite la nota de participacion: "; cin>>participacion;

    practica *= 0.30;
    teorica *= 0.60;
    participacion *= 0.10;

    notaFinal = practica + teorica + participacion;

    cout <<"\nLa nota final es: "<<notaFinal;
}
