package test;
// import mx.com.globalmentoring.*; -> Para poder mandar llamar todas la libreria
//import mx.com.globalmentoring.Utileria;
import static mx.com.globalmentoring.Utileria.imprimir; // ->  Esta manera de importar importa metodos staticos 
public class TestUtileria {
    public static void main(String[] args) {
        //Utileria.imprimir("Saludos XD");
        imprimir("Adios XD");
        mx.com.globalmentoring.Utileria.imprimir("Opcion del metodo calificado de la clase");
    }
    
}
