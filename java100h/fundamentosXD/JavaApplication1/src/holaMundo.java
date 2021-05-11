
import java.util.Scanner;

//Mi clase en Java 
public class holaMundo {
    public static void main(String[] args) {
        System.out.println("Hola mundo XD");
        int variableEntera=10;
        System.out.println(variableEntera);
        //Modificanco el valor de la variable
        variableEntera=5;
        System.out.println(variableEntera);
        
        String variableCadena = "Saludos";
        System.out.println(variableCadena);
        variableCadena = "Adios";
        System.out.println(variableCadena);
        //var con inferencias de datos
        var miVariableEntera2=16;
        System.out.println(miVariableEntera2);
        var miVariableCadena2 = "Nueva Cadena";
        System.out.println("miVariableCadena2 = " + miVariableCadena2);
        //Valores permitidos para declarar variables.
        var miVariable=1;
        var _miVariable=2;
        var $miVariable=3;
        //Concatenacion en Java Ejemplo 1:
        var usuario = "Juan";
        var titulo = "Ingeniero";
        var union = titulo + " " + usuario;
        System.out.println("union = " + union);
        //Concatenacion en Java Ejemplo 2:
        var i = 3;
        var j = 4;
        System.out.println(i + j);//Se realiza la suma de numeros.
        System.out.println(i + j + usuario);//Evaluacion de izq a der, realiza suma.
        System.out.println(usuario + i + j);//Contexto cadena, todo es una cadena.
        System.out.println(usuario + (i + j));//Uso de parentesis modifican la prioridad en la evaluacion.
        
        //Caracteres especiales en Java
        var nombre = "Pablo";
        System.out.println("Nueva linea: \n"+nombre);
        System.out.println("Tabulador: \t" + nombre);
        System.out.println("Retroceso: \b"+nombre);
        System.out.println("Comilla simple: \'"+nombre+"\'");
        System.out.println("Comilla doble: \""+nombre+"\"");
        
        //Clase Scanner
        System.out.println("Escribe tu nombre: ");
        Scanner sc = new Scanner (System.in);
        var usuario2 = sc.nextLine();
        System.out.println("Usuario = "+usuario2);
        System.out.println("Escribe titulo: ");
        var titulo2 = sc.nextLine();
        System.out.println("Resultado: "+titulo2+" "+usuario2);
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proporciona el numero1:");
        int numero1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Proporciona el numero2:");
        int numero2 = Integer.parseInt(scanner.nextLine());
        System.out.println("El numero mayor es:");
        System.out.println(numero1 > numero2 ? numero1 : numero2);
    }
}
