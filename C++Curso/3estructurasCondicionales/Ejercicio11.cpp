/*
11.- Hacer un programa que simule un cajero con un saldo
inicial de 1000 dolares
*/
 #include<iostream>

 using namespace std;

 int main(){
     int saldoInicial =  1000, opc;
     float extra, saldo = 0,retiro;

     cout<<"\tBienvenido a su cajero Virtual"<<endl;
     cout<<"1. Ingresar dinero en cuenta."<<endl;
     cout<<"2. Retirar dinero de la cuenta."<<endl;
     cout<<"3. Salir."<<endl;
     cin>>opc;

     switch (opc)
     {
     case 1:
         cout<<"Digite la cantidad de dinero a ingresar: ";
         cin>>extra;
         saldo = saldoInicial + extra;
         cout<<"Dinero en cuenta: "<<saldo<<endl; break;
    case 2: cout<<"Digite la cantidad de dinero que va retirar: ";
         cin>>retiro;

         if (retiro > saldoInicial){
             cout<<"NO tiene esa cantidad de dinero."<<endl;
         } else {
             saldo = saldoInicial-retiro;
             cout<<"Dinero en Cuenta: "<<saldo<<endl;
         }
         break;
    case 3: break;
     }
     return 0;
 }
