package Controlador;

import EstructuraDatos.*;
import Utilidades.ES;

/**
 * Principal donde se muestra un menú con las distintas opciones a elegir
 *
 * @author José Manuel Martínez Romera
 * @version 2.0
 */
public class CPrincipal {

    private static Libro[] libros;
    private static Autor[] autores;

    public static void main(String[] args) {

        libros = new Libro[10];
        autores = new Autor[10];

        gestionMenuPrincipal();
    }

    /**
     * Método que muestra el menú por pantalla y permite elegir entre las
     * principales opciones.
     */
    private static void gestionMenuPrincipal() {
        int opcion;

        do {
            opcion = ES.leerEntero(0, 2, ""
                    + "STOCK DE LIBROS\n"
                    + "---------------\n"
                    + "1. Gestión de libros.\n"
                    + "2. Gestión de autores.\n"
                    + "0. Salir.\n"
                    + "---------------\n"
                    + "Elija una opción: ");
            switch (opcion) {
                case 0:
                    System.out.println("Gracias por usar el programa.");
                    break;
                case 1:
                    gestionLibros();
                    break;
                case 2:
                    gestionAutores();
                    break;
            }
        } while (opcion != 0);
    }

    /**
     * Método que muestra un submenú para la gestión de los libros.
     */
    private static void gestionLibros() {
        int opcion;

        do {
            opcion = ES.leerEntero(0, 7, "\n"
                    + "Gestión de los libros\n"
                    + "---------------------\n"
                    + "1. Añadir libro.\n"
                    + "2. Eliminar libro.\n"
                    + "3. Retirar un ejemplar.\n"
                    + "4. Devolver un ejemplar.\n"
                    + "5. Modificar libro.\n"
                    + "6. Mostrar un libro.\n"
                    + "7. Mostar todos los libros.\n"
                    + "0. Salir.\n"
                    + "---------------------\n"
                    + "Elija una opción: ");
            switch (opcion) {
                case 0:
                    System.out.println("Volviendo al menú principal...");
                    break;
                case 1:
                    if (!añadirLibro()) {
                        System.out.println("No queda espacio para añadir un nuevo registro.");
                    }
                    break;
                case 2:
                    if (!eliminarLibro()) {
                        System.out.println("No hay libros almacenados.");
                    }
                    break;
                case 3:
                    break;
                case 4:
                    if (!devolverLibro()) {
                        System.out.println("No hay libros guardados.");
                    }
                    break;
                case 5:
                    if (!modificarLibro()) {
                        System.out.println("No hay libros guardados.");
                    }
                    break;
                case 6:
                    if (!mostrarLibro()) {
                        System.out.println("No hay libros guardados.");
                    }
                    break;
                case 7:
                    if (!mostrarTodosLosLibros()) {
                        System.out.println("No hay ejemplares guardados.");
                    }
                    break;
            }
        } while (opcion != 0);
    }

    /**
     * Método que muestra un submenú para la gestión de los autores.
     */
    private static void gestionAutores() {
        System.out.println("Disponible proximamente");
    }

    /**
     * Método que muestra todos los elementos almacenados en el array libros
     *
     * @return devuelve true si hay algún libro almacenado en el array y false
     * en caso contrario.
     */
    private static boolean mostrarTodosLosLibros() {
        for (int i = 0; i < libros.length; i++) {
            if (libros[i] != null) {
                System.out.println(libros[i].toString());
            } else if (i == 0) {

                return false;
            } else {
                return true;
            }
        }
        return true;
    }

    /**
     * Método que permite mostrar la información de un libro del array.
     *
     * @return devuelve true si hay algún libro almacenado en el array y false
     * en caso contrario.
     */
    private static boolean mostrarLibro() {

        int numeroLibros = mostrarMenuNombreLibros();
        if (numeroLibros != 0) {
            int opcion = ES.leerEntero(0, numeroLibros - 1, "Elija una opción");
            System.out.println(libros[opcion].toString());
            return true;
        } else {
            System.out.println("No hay libros registradoss");
            return false;
        }

    }

    /**
     * Muestra un menú con los nombres de los libros.
     *
     * @return Devuelve el número de registros que ha sido capaz de mostrar.
     */
    private static int mostrarMenuNombreLibros() {
        System.out.println("Los nombres de los libros son");
        for (int i = 0; i < libros.length; i++) {
            if (libros[i] != null) {
                System.out.println(i + ". " + libros[i].getNombre());
            } else {
                if (i == 0) {
                    return -1;
                } else {
                    return 1;
                }
            }
        }
        return libros.length;
    }

    /**
     * Método que permite añadir un libro al array.
     *
     * @return devuelve false si el array no tiene más capacidad para almacenar
     * libros.
     */
    private static boolean añadirLibro() {

        return true;

    }

    /**
     * Método que permite eliminar un registro del array
     *
     * @return devuelve true si se ha podido realizar el borrado y false si no
     * hay registros almacenados.
     */
    private static boolean eliminarLibro() {

        return true;
    }

    /**
     * Método que permite devolver un ejemplar de un libro.
     *
     * @return devuelve true si se ha podido realizar la devolución y false si
     * no hay registros almacenados.
     */
    private static boolean devolverLibro() {

        return true;
    }

    /**
     * Método que permite devolver un ejemplar de un libro.
     *
     * @return devuelve true si se ha podido realizar el préstamo y false si no
     * hay registros almacenados.
     */
    private static boolean prestarLibro() {

        return true;

    }

    /**
     * Método que permite devolver un ejemplar de un libro.
     *
     * @return devuelve true si se ha podido realizar la devolución y false si
     * no hay registros almacenados.
     */
    private static boolean modificarLibro() {

        return true;
    }

}
