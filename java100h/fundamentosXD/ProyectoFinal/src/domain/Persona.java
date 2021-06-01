package domain;
public final class Persona {
    //Si marcas una clase como final,
    //ya no puede heredar a clases hijas.
    public final void imprimir(){
        //El metodo final en metodos hace que ya no se puedan
        //modificar desde las clases hijas, todo el metodo en general.
        System.out.println("Prueba Final");
    
        
    }
    public final static int MI_CONSTANTE = 5;
    //Esta es la forma de poder declarar constantes en java 
    //Se recomienda usar mayusculas para identificarlas mas 
    //rapido XD
    
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
