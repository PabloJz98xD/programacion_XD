using System;
using coreEscuela.entidades;
namespace etapa1
{
    class Program
    {
        static void Main(string[] args)
        {
            var escuela = new escuela("TESCI", 2013 ,tipoEscuela.Primaria,
            pais:"Mexico",ciudad:"Tlalne");
            // Console.WriteLine(escuela.Nombre);
            // Console.WriteLine("Hello World!");
            // //Probando metodo to String
            // escuela.Pais ="Mexico";
            // escuela.Ciudad="CDMX";
            escuela.tipoEscuela=tipoEscuela.PreEscolar;
            Console.WriteLine(escuela);

            var curso1 = new curso(){
                nombre="101"
            };
            var curso2 = new curso(){
                nombre="201"
            };
            var curso3 = new curso(){
                nombre="301"
            };
            System.Console.WriteLine("====================");
            Console.WriteLine(curso1.nombre + ", " + curso1.uniqueId);
            Console.WriteLine($"{curso2.nombre}, {curso2.uniqueId}");
            Console.WriteLine(curso3);
        }
    }
}
