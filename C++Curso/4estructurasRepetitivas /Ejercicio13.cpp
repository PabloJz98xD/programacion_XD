/*
Hacer un ejercicio que realice la serie Fibonacci
1,1,2,3,5,8,13
*/
#include<iostream>
using namespace std;
int main(){
    int n,x=0,y=1,z=1;
    cout<<"Digite el numero elementos: "; cin>>n;
    cout<<"1 ";
    for (int i = 0; i<n;i++){
        z=x+y;
        cout<<z<<" ";
        x=y;
        y=z;
    }
    cout<<"\n";
    return 0;
}