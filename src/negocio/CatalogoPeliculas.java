package negocio;

public interface CatalogoPeliculas {
    public void agregarPeliculas(String nombrePelicula, String nombreArchivo);
    public void listarPeliculas(String nombreArchivo);
    public void buscarPeliculas(String nombreArchivo, String buscar);

    void iniciarArchivo(String nombreArchivo);
}
