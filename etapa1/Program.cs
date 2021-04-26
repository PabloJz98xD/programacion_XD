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

            // var curso1 = new curso(){
            //     nombre="101"
            // };
            // var curso2 = new curso(){
            //     nombre="201"
            // };
            // var curso3 = new curso(){
            //     nombre="301"
            // };
            var arregloCursos = new curso[3];
            arregloCursos[0] = new curso(){
                nombre="101"
            };
            arregloCursos[1] = new curso(){
                nombre="201"
            };
            arregloCursos[2] = new curso(){
                nombre="301"
            };
            System.Console.WriteLine("==================== while");
            // Console.WriteLine(curso1.nombre + ", " + curso1.uniqueId);
            // Console.WriteLine($"{curso2.nombre}, {curso2.uniqueId}");
            // Console.WriteLine(curso3);
            imprimirCursosWhile(arregloCursos);
            System.Console.WriteLine("==================== doWhile");
            imprimirCursosDoWhile(arregloCursos);
            System.Console.WriteLine("==================== for");
            imprimirCursosFor(arregloCursos);
            System.Console.WriteLine("==================== forEach");
            imprimirCursosForEach(arregloCursos);
        }

        private static void imprimirCursosWhile(curso[] arregloCursos)
        {
            int contador=0;
            while (contador < arregloCursos.Length)
            {
              Console.WriteLine($"Nombre {arregloCursos[contador].nombre }, Id {arregloCursos[contador].uniqueId}");
              contador++;  
            }
        }
        private static void imprimirCursosDoWhile(curso[] arregloCursos)
        {
            int contador=0;
            do
            {
              Console.WriteLine($"Nombre {arregloCursos[contador].nombre }, Id {arregloCursos[contador].uniqueId}");
              contador++;  
            }while(contador < arregloCursos.Length);
        }
        private static void imprimirCursosFor(curso[] arregloCursos)
        {
            for (int i = 0; i < arregloCursos.Length; i++)
            {
            Console.WriteLine($"Nombre {arregloCursos[i].nombre }, Id {arregloCursos[i].uniqueId}");    
            }
        }
        private static void imprimirCursosForEach(curso[] arregloCursos)
        {
            foreach (var curso in arregloCursos)
            {
             Console.WriteLine($"Nombre {curso.nombre }, Id {curso.uniqueId}");   
            }
            
        }        
    }
}
