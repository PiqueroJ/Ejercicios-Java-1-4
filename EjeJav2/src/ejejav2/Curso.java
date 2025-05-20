
package ejejav2;


public class Curso {
    private String NombreCurso;
    private int Duracion;

    public Curso(String NombreCurso, int Duracion) {
        this.NombreCurso = NombreCurso;
        this.Duracion = Duracion;
    }

    @Override
    public String toString() {
        return "Curso: " + NombreCurso + ", Duracion: " + Duracion ;
    }
    
    
}
