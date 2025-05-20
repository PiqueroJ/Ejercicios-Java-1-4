
package ejejav3;

public class Auto extends Vehiculo implements Reparable{

    public Auto(String marca, int numero) {
        super(marca, numero);
    }

   
    
    @Override
    public void reparar() {
        System.out.println("Se ha reparado el auto de la marca : " + marca + ", Numero: " + numero);
    }

   

    
}
