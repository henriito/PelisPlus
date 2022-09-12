package datos;

import dominio.PeliculaAmpliado;
import excepciones.AccesoDatosEx;
import excepciones.LecturaDatosEx;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AccesoDatosAdicImpl extends AccesoDatosImpl {
    public List<PeliculaAmpliado> peliFecha = new ArrayList<PeliculaAmpliado>();

    public List<PeliculaAmpliado> cargaInformacion(String nombreArchivo) throws LecturaDatosEx {
        peliFecha = new ArrayList<PeliculaAmpliado>();
        try {
            BufferedReader entrada = null;
            File archivo = new File(nombreArchivo);
            entrada = new BufferedReader(new FileReader(archivo));
            String linea = null;
            linea = entrada.readLine();
            while (linea != null) {
                String nombrePe;
                String Year;
                String[] arreglo = linea.split(" ; ");
                nombrePe = arreglo[0];
                Year = arreglo[1];
                // sugerir cómo validar que no de errores esto
                PeliculaAmpliado pelicula = new PeliculaAmpliado(nombrePe, Year);
                peliFecha.add(pelicula);
                linea = entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    return peliFecha;
}
}