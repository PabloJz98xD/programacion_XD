/*
8.-Escriba un programa que calcule el valor de: 1+3+5...+2n-1
──>Es una suma de numeros impares
*/
#include<iostream>

using namespace std;

int main(){
    int suma=0,n;
    cout<<"Digite numero de elementos: ";
    cin>>n;
    for(int i =1;i<=2*n-1;i+=2){
        suma +=i;
    }
    cout<<"La suma de los numeros impares es: "<<suma<<endl;
    
    return 0;

}