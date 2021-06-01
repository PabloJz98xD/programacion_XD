package domain;
public class Persona {
    protected String nombre;
    protected char genero;
    protected int edad;
    protected String Direccion;
    
    public Persona (){
        
    }
    
    public Persona (String nombre){
        this.nombre = nombre;
    }

    public Persona(String nombre, char genero, int edad, String Direccion) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.Direccion = Direccion;
    }

    public String getDireccion() {
        return this.Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return this.genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + ", Direccion=" + Direccion + '}';
    }
    
    
    
}
