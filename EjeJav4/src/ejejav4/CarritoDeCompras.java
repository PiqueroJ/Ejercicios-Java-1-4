
package ejejav4;

import java.util.ArrayList;
import java.util.List;


public class CarritoDeCompras {
   protected List<Producto> productos;

    public CarritoDeCompras() {
        productos = new ArrayList<>();
    }
    
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.calcularPrecioFinal();
        }
        return total;
    }
   
}
