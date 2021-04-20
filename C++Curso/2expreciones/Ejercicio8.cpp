/*
8.- Escribe un programa que lea de la entrada estandar los
dos catetos de un triangulo y escriba en la salida estandar
su hipotenusa.
*/

#include<iostream>
#include<math.h>

using namespace std;

int main(){
    float cateto1, cateto2, hipotenusa = 0;

    cout<<"Digite el cateto 1: ";
    cin>>cateto1;
    cout<<"Digite el cateto2: ";
    cin>>cateto2;

    hipotenusa = sqrt(pow(cateto1,2)+pow(cateto2,2));

    cout.precision(2);
    cout<<"\nLa hipotenusa del triangulo es: "<<hipotenusa<<endl;

    return 0;

}