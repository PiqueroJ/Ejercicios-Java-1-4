
package ejejav4;


public class Ropa extends Producto {
    
    protected double descuento;

    public Ropa(double descuento, String nombre, double precioBase, String marca) {
        super(nombre, precioBase, marca);
        this.descuento = descuento;
    }
    protected double precioR;
    
    @Override
    public double calcularPrecioFinal() {
        precioR = (precioBase - (precioBase*descuento));
        return precioR;
    }
}
