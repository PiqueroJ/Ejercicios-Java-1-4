package ejejav1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
         ArrayList<MaterialBiblioteca> materiales = new ArrayList();
         
         materiales.add(new Libro("978-0451524935","1984", "George Orwell",1949));
         materiales.add(new Revista(120,"National Geographic", "Varios", 2022));
         materiales.add(new DVD(169,"Interstellar", "Christopher Nolan", 2014));
         
         for(MaterialBiblioteca material : materiales){
           material.mostrarInformacion();
          }
    }
}
