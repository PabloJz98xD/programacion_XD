/*
Escriba un programa que calcule x^y, donde tanto x como y son
enteros positivos, sin utilizar la funcion pow.
*/
#include<iostream>
// #include<conio.h> ──> No funciona en Linux
using namespace std;
int main(){
    int x,y,elevacion=1;
    cout<<"Digite el valor de x: ";
    cin>>x;
    cout<<"Digite el valor de y: ";
    cin>>y;
    for(int i=1;i<=y;i++){
        elevacion = elevacion * x;
    }
    cout<<"\nEl resutlado de la elevacion es: "<< elevacion<<endl;

    // getch();
    return 0;
}