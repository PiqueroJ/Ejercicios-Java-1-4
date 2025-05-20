
package ejejav3;

public class Vehiculo {
    
    protected String marca;
    protected int numero;

    public Vehiculo(String marca,int numero) {
        this.marca = marca;
        this.numero = numero;
    }
  
     public String getMarca() {
        return marca;
    }

    public int getNumero() {
        return numero;
    }
     
    
}
