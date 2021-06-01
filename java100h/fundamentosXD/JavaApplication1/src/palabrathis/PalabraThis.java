package palabrathis;
public class PalabraThis {
    public static void main(String[] args) {
        Persona persona = new Persona("Pablo", "Zuñiga");
        System.out.println("persona = " + persona);
        System.out.println("persona nombre: "+ persona.nombre);
        System.out.println("persona apellido: "+ persona.apellido);
    }
}

class Persona{
    //super(); llamada al constructor de la clase Padre (object)
    String nombre;
    String apellido;
    
    Persona(String nombre, String apellido){
    this.nombre = nombre;
    this.apellido = apellido;
        System.out.println("Objeto persona usando this: "+ this);
    
    //Imprimir imprimir = new Imprimir();
    new Imprimir().imprimir(this);
    }
    
}

class Imprimir{
    
    
    public Imprimir(){
    super();//El constructor de la clase object (padre) para reservar memoria
    }
    
public void imprimir(Persona persona){
    System.out.println("persona desde imprimir: "+ persona);
    System.out.println("impresion del objeto  actual (this ) "+ this);
}
}