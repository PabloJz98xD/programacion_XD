/*
12.- Hacer un programa que calcule el resultado de la siguiente
expresion: 1-2+3-4+5-6
par=-2-4-6
imprar=1+3+5
sumaTotal=par+impar
*/
#include<iostream>
//#include<conio.h> ->No funciona en Linux
using namespace std;
int main(){
    int nElementos, par, sumaPares=0,sumaImpares=0,sumaTotal=0;
    cout<<"Digite numero de elementos a sumar: ";
    cin>>nElementos;
    for(int i= 1;i<=nElementos;i++){
        if(i%2 == 0){
            par = i*-1;
            sumaPares += par;
        } else {
            sumaImpares += i;
        }
    }
    sumaTotal=sumaPares+sumaImpares;
    cout<<"\nEl resultado de la suma es: "<<sumaTotal<<endl;
    //getch(); -> No funciona en Linux
    return 0;
}
