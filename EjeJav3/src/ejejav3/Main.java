
package ejejav3;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
           ArrayList<Reparable> reparables = new ArrayList();
           reparables.add(new Auto("Toyota",1));
           reparables.add(new Moto("Yamaha",2));
            reparables.add(new Auto("Ford",1));
           reparables.add(new Moto("Honda",2));
           
           for(Reparable rep : reparables){
               rep.reparar();
           }
    }
    
}
