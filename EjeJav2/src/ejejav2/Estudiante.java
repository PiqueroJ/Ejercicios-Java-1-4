
package ejejav2;

public class Estudiante extends Persona {
    private int legajo;
    private Curso curso;

    public Estudiante(int legajo,String Nombre, String Apellido, int DNI, String nomC, int dur) {
        super(Nombre, Apellido, DNI);
        this.legajo = legajo;
        curso = new Curso(nomC,dur);
    }
   
    @Override
    public void mostrarInfo(){
        System.out.println("Nombre: " + Nombre 
        + " Apellido: " + Apellido 
        + " DIN: " + DNI 
        + " Legajo: " + legajo        
        + " " + curso.toString());
    }
    
}
