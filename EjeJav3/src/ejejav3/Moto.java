
package ejejav3;


public class Moto extends Vehiculo implements Reparable{

    public Moto(String marca, int numero) {
        super(marca, numero);
    }

   
  

    @Override
    public void reparar() {
        System.out.println("Se ha reparado la moto de la marca: "+marca + ", Numero: " + numero);
    }

    

    
}
