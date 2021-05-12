
package operaciones;

public class PruebaArtimetica {
    public static void main(String[] args) {
        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.a=3;
        aritmetica1.b=5;
        aritmetica1.sumar();
        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("resultado desde la prueba = " + resultado );
    }

}
