package ejejav1;

public class Revista extends MaterialBiblioteca{

    private int numeroEdicion;

    public Revista(int numeroEdicion, String Titulo, String Autor, int anioPublicacion) {
        super(Titulo, Autor, anioPublicacion);
        this.numeroEdicion = numeroEdicion;
    }
    
    

    @Override
    public void mostrarInformacion() {
        System.out.println("Titulo " + Titulo 
        + " Autor: " + Autor 
        + " Anio de Publicacion: " + anioPublicacion
        + " Numero de Edicion " + numeroEdicion);
    }
}
