package EstructuraDatos;

/**
 * Clase libro donde encontraremos datos importantes del mismo (nombre, codigo,
 * uds,etc...
 *
 * @author José Manuel Martínez Romera Versión 1.0
 */
public class Libro {

    /**
     * No sabía si realizar tb documentación de esto, porque al fin y al cabo
     * los atributos son los que nos pides en el ejercicio, y el tema de getters
     * y setters los he realizado mirando el diagrama de la actividad que
     * subiste, y no tiene mucha explicación realizar un return de un parametro
     * o poner "this." para hacer referencia a un objeto, por eso he realizaco
     * la explicación de los métodos que si lo requieren. En el caso de que esté
     * equivocado, hágamelo saber.
     */
    private String codigo;
    private String nombre;
    private int unidades;
    private int unidadesPrestadas;
    private Autor autor;

    public Libro(String codigo, String nombre, Autor autor, int unidades) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.autor = autor;
        this.unidades = unidades;
    }

    public Libro(String codigo, String nombre, int unidades) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.unidades = unidades;
    }

    /**
     * Getter de código
     *
     * @return código
     */
    public String getCodigo() {

        return codigo;
    }

    /**
     * Getter de nombre
     *
     * @return nombre
     */
    public String getNombre() {

        return nombre;
    }

    /**
     * Setter de nombre
     *
     * @param nombre
     */
    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    /**
     * Getter de Autor
     *
     * @return autor
     */
    public Autor getAutor() {

        return autor;
    }

    /**
     * Setter de Autor
     *
     * @param autor
     */
    public void setAutor(Autor autor) {

        this.autor = autor;

    }

    /**
     * Getter de unidades
     *
     * @return unidades
     */
    public int getUnidades() {

        return unidades;
    }

    /**
     * Setter de unidades
     *
     * @param unidades
     */
    public void setUnidades(int unidades) {

        this.unidades = unidades;

    }

    /**
     *
     * @return codigo, nombre y apellidos
     */

    public String toString() {

        return "Código: " + codigo + " Nombre: " + nombre + " Unidades: " + unidades;

    }

    /**
     * Método que se va a encargar prestar un libro si hay stock suficiente.
     */
    public void prestarEjemplar() {
        /*
 Se va encargar de prestar un ejemplar, entonces mediante el if se comprobará
 el stock de las unidades, el cual si  no es igual se le sumará uno a
 unidades prestadas, imprimiendo por consola que se ha prestado un ejemplar.
         */
        if (unidades == unidadesPrestadas) {
            System.out.println("No se pueden prestar más libros");
        } else {
            unidadesPrestadas = unidadesPrestadas + 1;

            System.out.println("Se ha prestado un ejemplar");
        }

    }

    /**
     * Se encarga de devolver un ejemplar si se cumple la condición previa de
     * que unidades prestadas sea distinto de cero. Restándole una unidades a
     * unidades prestadas, indicando que se ha hecho correctamente.
     */
    public void devolverEjemplar() {

        if (unidadesPrestadas != 0) {
            unidadesPrestadas = unidadesPrestadas - 1;
            System.out.println("Se ha devuelto un ejemplar");
        } else {
            System.out.println("No hay ejemplares prestados");
        }

    }

    /**
     * Se encarga de mostrar los ejemplares disponibles
     *
     * @return unidades disponibles
     */
    public int ejemplaresDisponibles() {

        return unidades - unidadesPrestadas;
    }

}
