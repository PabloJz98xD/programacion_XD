package test;
import dominio.Persona;
public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona ("Juan", 5000.00, false);
        System.out.println("persona1 nombre: " + persona1.getNombre());
        persona1.setNombre("Juan Pablo"); // set modifica los objetos.
        //persona1.nombre = "Juan Carlos";
        //System.out.println("nombre: " + persona1.nombre); ->No funciona XD
        System.out.println("persona1 nombre con cambio: " + persona1.getNombre());
        System.out.println("persona1 sueldo: " + persona1.getSueldo()); // get recupera los objetos.
        System.out.println("persona1 eliminado: " + persona1.isEliminado());
        
        System.out.println("persona1: " + persona1.toString());
        System.out.println("persona1: " + persona1);
                   //El metodo println manda llamar directo al metodo
                   //toString asi que se puede omitir su llamado.
    }
    
}
