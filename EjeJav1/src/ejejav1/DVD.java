package ejejav1;

public class DVD extends MaterialBiblioteca  {

    private double Duracion;

    public DVD(double Duracion, String Titulo, String Autor, int anioPublicacion) {
        super(Titulo, Autor, anioPublicacion);
        this.Duracion = Duracion;
    }
    
    

    @Override
    public void mostrarInformacion() {
        System.out.println("Titulo " + Titulo 
        + " Autor: " + Autor 
        + " Anio de Publicacion: " + anioPublicacion
        + " Duracion(minutos) " + Duracion);
    }
}
