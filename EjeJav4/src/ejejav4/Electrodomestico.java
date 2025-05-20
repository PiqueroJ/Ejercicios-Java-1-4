
package ejejav4;


public class Electrodomestico extends Producto {
    protected double impuesto;

    public Electrodomestico(double impuesto, String nombre, double precioBase, String marca) {
        super(nombre, precioBase, marca);
        this.impuesto = impuesto;
    }
     protected double precioE;
    
    @Override
    public double calcularPrecioFinal() {
        precioE = (precioBase + (precioBase*impuesto));
        return precioE;
    }
}
