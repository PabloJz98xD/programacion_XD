/*
Realice unn los examen programa que solicite al usuario que piense un numero
entero entre el 1 y el 100. El programa debe de generar un numero
aleatorio en ese mismo rango [1-100], e indicarle al usuario si el
numero que digito es menor o mayor al numero aleatorio, asi hasta 
que lo adivine. Por ultimo mostrarle el numero de intentos que le
llevo.
variable = limite_inferior + rand() % (limite_Superior +1 - limite_inferior);
*/
#include<iostream>
#include<stdlib.h>
#include<time.h>
using namespace std;

int main(){
    int numero, dato, contador =0;
    srand(time(NULL));//Genera un numero aleatorio;
    dato = 1+rand()%(100);//25

    do{
    cout<<"Digite un numero: ";cin>>numero;

    if(numero>dato){
        cout<<"\nDigite un numero menor: \n";
    }
    if(numero<dato){
        cout<<"\nDigite un numero mayor: \n";
    }
    contador++;
    }while(numero != dato);

    cout<<"\nFELICIDADES ADIVINASTE EL NUMERO\n";
    cout<<"Numero de intentos: "<<contador<<endl;    
    return 0;
}