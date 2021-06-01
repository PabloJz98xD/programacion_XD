package test;

import operaciones.Operaciones;

public class Test {
    public static void main(String[] args) {
        var resultado = Operaciones.sumar(5, 3);
        System.out.println("resultado = " + resultado);
        
        var resultado2 = Operaciones.sumar(5.3, 8.2);
        System.out.println("resultado2 = " + resultado2);
        
    }
}
