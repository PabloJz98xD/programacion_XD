
package mx.com.gm.ventas.test;

import mx.com.gm.ventas.*;

public class VentasTest {
    public static void main(String[] args) {
        //Los productos se pueden reutilizar
        Producto producto1 = new Producto("Camisa",50.00);
        Producto producto2 = new Producto("Pantalon",100.00);
        Producto producto3 = new Producto("Tennis", 1000.00);
        Producto producto4 = new Producto("Reloj",500.00);
        //Creando una orden:
        Orden orden1 =  new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.mostrarOrden();
        
        Orden orden2 = new Orden();
        orden2.agregarProducto(producto4);
        orden2.agregarProducto(producto1);
        orden2.agregarProducto(producto3);
        orden2.mostrarOrden();
        
    }
}
