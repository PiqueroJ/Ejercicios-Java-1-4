package ejejav1;

public class Libro extends MaterialBiblioteca  {

    private String ISNB;

    public Libro(String ISNB, String Titulo, String Autor, int anioPublicacion) {
        super(Titulo, Autor, anioPublicacion);
        this.ISNB = ISNB;
    }

    
    

    @Override
    public void mostrarInformacion() {
        System.out.println("Titulo " + Titulo 
        + " Autor: " + Autor 
        + " Anio de Publicacion: " + anioPublicacion
        + " ISNB " + ISNB);
    }
    
}
