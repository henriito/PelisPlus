package negocio;

import datos.AccesoDatosImpl;
import datos.IAccesoDatos;
import dominio.Pelicula;
import dominio.PeliculaAmpliado;
import excepciones.AccesoDatosEx;
import excepciones.EscrituraDatosEx;

import java.util.List;

public class CatalogoPeliculasImpl implements CatalogoPeliculas {
    private final IAccesoDatos datos;

    public CatalogoPeliculasImpl(){
        this.datos = new AccesoDatosImpl();
    }

    @Override
    public void agregarPeliculas(String nombrePelicula, String nombreArchivo) {
        Pelicula pelicula = new Pelicula(nombrePelicula);
        boolean anexar = false;
        try {
            anexar = datos.existe(nombreArchivo);
            datos.escribir(pelicula, nombreArchivo, anexar);
        }catch(AccesoDatosEx ex){
            System.out.println("Error al acceder a los datos.");
        }
    }

    @Override
    public void listarPeliculas(String nombreArchivo) {
        try {
            List<PeliculaAmpliado> peliculas = datos.cargaInformacion(nombreArchivo);
            System.out.println("===== Listar Peliculas =====");
            for (PeliculaAmpliado peli : peliculas){
                System.out.println("Peli: "+peli);
            }
        }catch(Exception e){
            System.out.println("Clavos con el acceso a datos.");
        }
    }

    @Override
    public void buscarPeliculas(String nombreArchivo, String buscar) {
        String resultado = null;
        try {
            resultado = datos.Buscar(nombreArchivo, buscar);
        } catch (EscrituraDatosEx e) {
            System.out.println("Error al buscar la peli.");
        }
        System.out.println("Resultado = "+resultado);
    }
    @Override
    public void iniciarArchivo(String nombreArchivo){
        try {
            if(datos.existe(nombreArchivo)){
                datos.borrar(nombreArchivo);
            }else{
                datos.crear(nombreArchivo);
            }
        }catch (AccesoDatosEx e){
            System.out.println("Error de acceso a datos");
        }
    }
}
