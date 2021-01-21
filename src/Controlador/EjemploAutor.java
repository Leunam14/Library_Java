/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import EstructuraDatos.Autor;
import EstructuraDatos.Libro;
import static Utilidades.ValidarDatos.comprobarCodigoLibro;
import static Utilidades.ValidarDatos.validarNif;

/**
 * Clase para realizar la prueba de métodos
 *
 * @author José Manuel Martínez Romera
 */
public class EjemploAutor {

    public static void main(String[] args) {

        Autor a1 = new Autor("Pedro", "Alonso Gonzalez");

        System.out.println(a1);

        Libro libro1 = new Libro("ukresk", "Amacener", a1, 3);

        libro1.prestarEjemplar();
        libro1.prestarEjemplar();
        libro1.prestarEjemplar();
        libro1.prestarEjemplar();

        System.out.println();

        libro1.devolverEjemplar();
        libro1.devolverEjemplar();
        libro1.devolverEjemplar();
        libro1.devolverEjemplar();

        System.out.println();

        System.out.println(validarNif("123e45678A"));

        System.out.println(comprobarCodigoLibro("AVC24"));

    }

}
