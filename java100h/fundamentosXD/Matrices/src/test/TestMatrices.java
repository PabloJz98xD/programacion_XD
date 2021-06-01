package test;

import domain.Persona;

public class TestMatrices {
    public static void main(String[] args) {
        int edades [] [] = new int [3][2];
        System.out.println("edades = " + edades);
        
        edades[0][0] =2;
        System.out.println("edades = " + edades[0][0]);
        edades[0][1] =6;
        System.out.println("edades = " + edades[0][1]);
        edades[1][0] =8;
        System.out.println("edades = " + edades[1][0]);
        edades[1][1] =12;
        System.out.println("edades = " + edades[1][1]);
        edades[2][0] =5;
        System.out.println("edades = " + edades[2][0]);
        edades[2][1] =19;
        System.out.println("edades = " + edades[2][1]);
        
        
        System.out.println("================== Llamando 1x1" );

        
        System.out.println("edades = " + edades[0][0] + " " +edades[0][1]);
        System.out.println("==================" );
        System.out.println("edades = " + edades[1][0] + " " + edades[1][1]);
        System.out.println("==================");
        System.out.println("edades = " + edades[2][0] + " " +edades[2][1]);
        System.out.println("==================");
    
        System.out.println("================== Llamando por for anidado");
        
                 //ren = renglones del arreglo XD.
        for (int ren = 0; ren < edades.length; ren++) {
            for (int col = 0; col < edades[ren].length; col++) {
                   //col = columnas del arreglo XD.
                   System.out.println("edades " + ren + "-" + col + ": " + edades[ren][col]);
            }
            
        }
        
        System.out.println("================== Llamando por for anidado ejemplo 2: ");
        
        String frutas[][] = {{"Naranja", "Limon", "Lima"},{"Fresa","Zarzamora","MoraAzul"} ,{"Fresa","Zarzamora"}};
        for (int ren = 0; ren < frutas.length; ren++) {
            for (int col = 0; col < frutas[ren].length; col++) {
                System.out.println("frutas " + ren + "-" + col + "-" + frutas[ren][col]);
            }
        }
        
        Persona personas [][] = new Persona[2][3];
        personas[0][0] = new Persona("Juan");
        personas[0][1] = new Persona("Pablo");
        personas[0][2] = new Persona("Areli");
        personas[1][0] = new Persona("Guadalupe");
        personas[1][1] = new Persona("Evelyn");
        personas[1][2] = new Persona("Jose");
        imprimir(personas);
    }
    //Metodo que manda a imprimir matriz.
    public static void imprimir(Object matriz [][]){
        for (int ren = 0; ren < matriz.length; ren++) {
            for (int col = 0; col < matriz[ren].length; col++) {
                System.out.println("matriz " + ren + "-" + col + ": " + matriz[ren][col]);
            }
        }
    }
}
