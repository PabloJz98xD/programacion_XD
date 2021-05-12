/*
9.-Escriba un programa que calcule de 1*2*3...*n (Factorial de
un numero). 
*/
#include<iostream>
using namespace std;

int main(){
    int veces,f=0,factorial=1;
    cout<<"Digite numero para tranasformar a factorial: ";
    cin>>veces;
    for(int i = 1;i<=veces;i++){
        f++;
        factorial*=f;
    }
    cout<<"\nEl factorial es: "<<factorial<<endl;

}