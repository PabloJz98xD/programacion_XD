//Escriba un programa que calcule el valor de: 1+2+3+...+n
#include<iostream>
// #include<conio.h> ────> No funciona en Linux

using namespace std;

int main(){
int n,suma = 0;

cout<<"Digite numero de elementos: ";
cin>>n;
for(int i=1; i<=n ; i++){
    suma += i;
}
cout<<"\nLa suma es: "<<suma<<endl;

// getch(); ──> No funciona en Linux
return 0;
}