using System;
using coreEscuela.entidades;
using static System.Console;
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
            //===================     ===================
            //===================     ===================
            //=================== Declararion de arreglos     ===================
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
            // ===================     ===================
            // ===================     ===================
            escuela.Cursos = new curso[]{
            new curso(){ nombre = "101"},
            new curso() {nombre = "201"},
            new curso{nombre = "301"}
            };
            //Usando escuela.Cursos = new curso[] con una forma diferente de declarar el arreglo.
            impimirCursosEscuela(escuela);
            //===========================
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
            //==========================
            //==========================
            //==========================
            //Ejemplos de como utilizar los condicionales
            //==========================
            //==========================
            bool rta = 10 == 10;//true
            int cantidad = 10;

            if (rta == false)
            {
                WriteLine("Se cumplio la condición #1");
            }
            else if (cantidad > 15)
            {
                WriteLine("Se cumplio la condición #2");
            }
            else
            {
                WriteLine("NO Se cumplio la condición");
            }

            if(cantidad > 5 && rta == false)
            {
                WriteLine("Se cumplio la condición #3");
            }

            
            if(cantidad > 5 && rta )
            {
                WriteLine("Se cumplio la condición #4");
            }

            cantidad = 10;
            if(
                (cantidad > 15 || !rta) 
                && (cantidad % 5 == 0 )
            )
            {
                WriteLine("Se cumplio la condición #5");
            }

        
            //==========================
        }
                private static void impimirCursosEscuela(escuela escuela)
        {
            WriteLine("====================");
            WriteLine("Cursos de la Escuela Mejorado");
            WriteLine("====================");

            if (escuela?.Cursos != null)
            {
                foreach (var curso in escuela.Cursos)
                {
                    WriteLine($"Nombre {curso.nombre  }, Id  {curso.uniqueId}");
                }
            }
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
