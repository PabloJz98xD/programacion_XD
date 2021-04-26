/*
6.- Escriba un programa que lea las tres notas de un alumno
y calcule la nota final de dicho alumno.
*/
#include<iostream>

using namespace std;

int main() {
    float a,b,c, promedio = 0;
    cout<<"Digite la primera calificaion: ";
    cin>>a;
    cout<<"Digite la segunda calificacion: ";
    cin>>b;
    cout<<"Digite la tercera calificacion: ";
    cin>>c;

    promedio = (a + b + c)/3;
    cout.precision(2);
    cout<<"\nEl promedio final es: "<<promedio<<endl;

    return 0; 
}