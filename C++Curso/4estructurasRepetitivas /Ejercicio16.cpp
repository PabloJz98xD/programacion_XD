/*
16.-Realice un programa que calcule la descompocision en factores
primos de un numero entero.
Por ejemplo: 20 = 2*2*5.
*/
#include<iostream>
using namespace std;

int main(){
    int numero; 

    cout<<"Digite un numero: ";
    cin>>numero;

    // 20 - 10 - 5
    // 2    2    5

    for(int i=2;numero>1;i++){
        while(numero%i==0){
            cout<<i<<" ";
            numero /= i;
        }
    }
    cout<<"\n";
    return 0;
}