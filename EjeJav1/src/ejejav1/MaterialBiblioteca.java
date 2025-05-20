package ejejav1;

public abstract class MaterialBiblioteca  {

    protected String Titulo;
    protected String Autor;
    protected int anioPublicacion;

    public MaterialBiblioteca(String Titulo, String Autor, int anioPublicacion) {
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.anioPublicacion = anioPublicacion;
    }
    
    
     public abstract void mostrarInformacion();
   
}
