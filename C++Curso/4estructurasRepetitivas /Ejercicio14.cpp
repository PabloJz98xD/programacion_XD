/*
14.- En una clase de 5 alumnos se han realizado tres examenes y se
requiere determinar el numero de:
a)Alumnos que aprobaaron los examenes.
b)Alumnosque aprobaron al menos un exmamen.
c)Alumnos que aprobaron unicamente el ultimo examen.

Realice un programa que permita la lectura de los datos y el
calculo de las estadisticas.
*/
#include<iostream>
using namespace std;
int main (){
    float examen1, examen2, examen3;
    int aprobadosTodos=0,aprobadosUno=0,aprobadosUltimo=0;

    for (int i = 0; i < 5; i++)
    {
        cout<<i<<".Digite la nota del primer examen: ";cin>>examen1;
        cout<<i<<".Digite la nota del segundo examen: ";cin>>examen2;
        cout<<i<<".Digite la nota del tercero examen: ";cin>>examen3;
        cout<<"\n";
        if((examen1>7.0)&&(examen2>7.0)&&(examen3>7.0)){
            aprobadosTodos++;
        }
        if ((examen1>7.0)||(examen2>7.0)||examen3>7.0){
            aprobadosUno++;
        }    
        if((examen1<7.0)&&(examen2<7.0)&&(examen3>7.0)){
            aprobadosUltimo++;
        }
        cout<<"Alumnos que aprobaron todos los examanes: "<<aprobadosTodos<<endl;
        cout<<"Alumonos que aprobaron un solo examen: "<<aprobadosUno<<endl;
        cout<<"Alumnos que aprobaron el ultimo examen: "<<aprobadosUltimo<<endl;
        


    }
    

    return 0;
}
