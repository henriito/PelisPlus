package datos;

import dominio.Pelicula;
import dominio.PeliculaAmpliado;
import excepciones.AccesoDatosEx;
import excepciones.EscrituraDatosEx;
import excepciones.LecturaDatosEx;
import java.util.List;

public interface IAccesoDatos  {
    boolean existe (String nombreArchivo) throws AccesoDatosEx;
    public List<Pelicula> listar(String nombreArchivo) throws LecturaDatosEx;
    void escribir(Pelicula pelicula,String nombreArchivo, boolean anexar) throws EscrituraDatosEx;
    public String Buscar(String nombreArchivo, String buscar) throws EscrituraDatosEx;
    public void crear(String nombreArchivo) throws AccesoDatosEx;
    public void borrar (String nombreArchivo) throws AccesoDatosEx;
    public List<PeliculaAmpliado> cargaInformacion(String nombreArchivo) throws LecturaDatosEx;

}
