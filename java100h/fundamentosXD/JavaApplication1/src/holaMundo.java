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
    }
}
