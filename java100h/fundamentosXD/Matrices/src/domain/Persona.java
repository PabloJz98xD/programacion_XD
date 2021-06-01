package domain;
public class Persona {
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{nombre=").append(nombre);
        sb.append('}');
        sb.append(" , ");
        sb.append(super.toString()); // Este comando imprime la direccion
        return sb.toString();        //de memoria.
    }
    
    
    
}
