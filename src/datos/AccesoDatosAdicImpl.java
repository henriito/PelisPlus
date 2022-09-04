package datos;

import dominio.PeliculaAmpliado;
import excepciones.AccesoDatosEx;
import excepciones.LecturaDatosEx;

import java.util.ArrayList;
import java.util.List;

public class AccesoDatosAdicImpl extends AccesoDatosImpl {
    private List<PeliculaAmpliado> peliFecha = new ArrayList<PeliculaAmpliado>();
    public void cargaInformacion(String nombreArchivo) throws LecturaDatosEx {

    }
}
