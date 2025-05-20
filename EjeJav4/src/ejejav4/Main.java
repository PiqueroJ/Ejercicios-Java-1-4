
package ejejav4;

public class Main {
    public static void main(String[] args) {
        CarritoDeCompras carrito = new CarritoDeCompras();
        Electrodomestico tv = new Electrodomestico( 0.21,"TV Samsung", 1000.0, "Samsung");
        Ropa camiseta = new Ropa(0.10,"Camiseta", 50.0, "Nike");
        
        carrito.agregarProducto(tv);
        carrito.agregarProducto(camiseta);
                
         System.out.println("El precio final de la compra: " + carrito.calcularTotal());
    
        
    }
    
}
