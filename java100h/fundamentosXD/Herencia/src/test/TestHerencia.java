package test;
import domain.Empleado;
import domain.Cliente;
import java.util.Date;
public class TestHerencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Pablo", 5000.0);
        System.out.println("empleado1 = " + empleado1);
        
        Cliente cliente1 = new Cliente(new Date(), true, "Pablo", 'M' , 23, "Zaragoza #30");
        System.out.println("cliente1 = " + cliente1);
        
        var fecha = new Date();
        Cliente cliente2 = new Cliente(fecha, true, "Areli", 'F' , 22, "Jaramangos #330");
        System.out.println("cliente2 = " + cliente2);
    }
    
}
