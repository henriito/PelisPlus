package dominio;

public class PeliculaAmpliado {
    private String nombre;
    private String Fproduccion;


    public PeliculaAmpliado(String nombre_peli, String fecha_produccion){
        this.nombre = nombre_peli;
        this.Fproduccion = fecha_produccion;
    }


    /* @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /* @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /* @return the Fproduccion
     */
    public String getFproduccion() {
        return Fproduccion;
    }

    /* @param Fproduccion the Fproduccion to set
     */
    public void setFproduccion(String Fproduccion) {
        this.Fproduccion = Fproduccion;
    }

    @Override
    public String toString() {
        return nombre + ";" + Fproduccion ;
    }
}
