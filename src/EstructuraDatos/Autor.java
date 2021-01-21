package EstructuraDatos;

/**
 * Clase autor donde vamos a encontrar toda la información de autor.
 *
 * @author José Manuel Martínez Romera Versión 1.0
 */
public class Autor {

    private String nombre;
    private String apellidos;

    public Autor() {
    }

    /**
     * Muestra información del autor
     *
     * @param nombre de autor
     * @param apellidos de autor
     */
    public Autor(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    /**
     * Set con nombre
     *
     * @param nombre
     */
    public void setNombre(String nombre) {

        this.nombre = nombre;

    }

    /**
     * setter con apellidos
     *
     * @param apellidos
     */
    public void setApellidos(String apellidos) {

        this.apellidos = apellidos;
    }

    /**
     * Getter con nombre
     *
     * @return devuelve nombre
     */
    public String getNombre() {

        return nombre;
    }

    /**
     * Getter de apellidos
     *
     * @return devuelve apellidos
     */
    public String getApellidos() {

        return apellidos;
    }

    /**
     * Se usa para crear una representación de String mostrando los nombres y apellidos
     *
     * @return Devuelve nombre y apellidos
     */
    @Override
    public String toString() {
       return "Autor:\n" + "nombre: " + nombre + "\napellidos: " + apellidos;
    }

}
