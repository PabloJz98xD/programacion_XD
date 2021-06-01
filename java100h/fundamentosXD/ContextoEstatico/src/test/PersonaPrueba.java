package test;
import domain.Persona;
public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan");
        System.out.println("persona1 = " + persona1);
        
        Persona persona2 = new Persona("Pablo");
        System.out.println("persona2 = " + persona2);
        
        Persona persona3 = new Persona("Areli");
        imprimir(persona3);
    }
    
    public static void imprimir(Persona persona){
        System.out.println("persona = " + persona);
    }
}


