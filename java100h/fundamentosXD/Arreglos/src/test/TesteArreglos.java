package test;
public class TesteArreglos {
    public static void main(String[] args) {
        int edades[] = new int[5]; //Forma de declarar arreglos XD.
        System.out.println("edades = " + edades); //Ruta de memoria donde esta almcenado el arreglo.
        
        edades[0]=5;
        System.out.println("edades = " + edades[0]);
        edades[1]=10;
        edades[2]=15;
        
        for (int i = 0; i < edades.length; i++) {
            System.out.println("edades elemento" + i + ": " + edades[i]);
        }
    }
}
