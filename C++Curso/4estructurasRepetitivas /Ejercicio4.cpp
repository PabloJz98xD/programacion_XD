/*
4.-Escribe un programa que tome cada 4 horas la temperatura 
exterior, leyendola durante un periodo de 24 horas. Es decir,
debe leer 6 temperaturas la mas alta y la mas naja.
*/
#include<iostream>
// #include<conio.h> -> No funciona en linux 
using namespace std;

int main(){
    float temperatura, mayor=0, menor=999;
    float sumaTotal = 0, promedio = 0;

    for(int i=0;i<24;i+=4){
        cout<<"Digite la temperatura de la hora "<<i<<": ";
        cin>>temperatura;

        sumaTotal += temperatura;

        if(temperatura > mayor){
            mayor = temperatura;
        }
        if(temperatura<menor){
            menor = temperatura;
        }
    }
    promedio = sumaTotal/6;

    cout<<"\nTemperatura Promedio: "<<promedio<<endl;
    cout<<"\nTemperatura mas alta: "<<mayor<<endl;
    cout<<"\nTemperatura mas baja: "<<menor<<endl;
    // getch();
    return 0;
}