
package operaciones;

public class PruebaArtimetica {
    public static void main(String[] args) {
        Aritmetica aritmetica1 = new Aritmetica();
        System.out.println("aritmetica a:"+ aritmetica1.a);
        System.out.println("aritmetica b:"+ aritmetica1.b);
        
        Aritmetica aritmetica2 = new Aritmetica(5,8);
        System.out.println("aritmetica a:"+ aritmetica2.a);
        System.out.println("aritmetica b:"+ aritmetica2.b);        
//        aritmetica1.a=3;
//        aritmetica1.b=5;
//        aritmetica1.sumar();
//        int resultado = aritmetica1.sumarConRetorno();
//        System.out.println("resultado desde la prueba = " + resultado );
//        
//        resultado = aritmetica1.sumarArgumentos(5, 8);
//        System.out.println("Resultado usando argumentos = "+resultado);
//   
    }

}
