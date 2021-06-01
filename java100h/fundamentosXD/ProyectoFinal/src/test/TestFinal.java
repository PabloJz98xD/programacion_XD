
package test;

import domain.Persona;

public class TestFinal {
    public static void main(String[] args) {
        final int miVariable = 10;
        System.out.println("miVariable = " + miVariable);
        //miVariable = 2; --> No se puede moficar una variable Final ya que se vuelve constante.
        
        //Persona.MI_CONSTANTE = 5; --> No se puede modificar por que
        //es un argumento constante
        System.out.println("Mi constante: " + Persona.MI_CONSTANTE);
        
        final Persona persona1 = new Persona();
        //persona1 = new Persona();
        //Como se declaro como final, no se puede
        //cambiar a otro objeto diferente.
        persona1.setNombre("Juan"); //Pero si se puede modificar
                                    //el contenido de su metodo set
        System.out.println("persona1 = " + persona1.getNombre());
        //Para asegurar, volveremos a cambiar el metodo de nuevo
        persona1.setNombre("Pablo");
        System.out.println("persona1 = " + persona1.getNombre());
    }
}
