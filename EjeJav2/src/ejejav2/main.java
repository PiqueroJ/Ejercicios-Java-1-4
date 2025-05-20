
package ejejav2;

import java.util.ArrayList;

public class main {

    public static void main(String[] args) {
        ArrayList<Persona> Estudiantes = new ArrayList();
        
        Estudiantes.add(new Estudiante(14567,"Juan","Piquero",46028398,"Matematica",160));
        Estudiantes.add(new Estudiante(14568, "Maria", "Lopez", 46028399, "Fisica", 140));
        Estudiantes.add(new Estudiante(14569, "Carlos", "Gomez", 46028400, "Quimica", 150));
        
        for(Persona per : Estudiantes){
            per.mostrarInfo();
        }
    }
    
}
