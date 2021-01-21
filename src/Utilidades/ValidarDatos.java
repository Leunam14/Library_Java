package Utilidades;

import java.util.regex.Pattern;
//import java.util.regex.Matcher;

/**
 * Clase que se va a encargar de valiar NIF y comprobar código de libro
 *
 * @author José Manuel Martínez Romera Versión 1.0
 */
public class ValidarDatos {

    /**
     * Validará el NIF, siendo 8 dígitos numéricos y una letra.
     *
     * @param mensaje Que se introduzca
     * @return true si cumple los requisitos
     */
    public static boolean validarNif(String mensaje) {
        /*Mediante una expresión regular, el cual el \\d(8) hace
        referencia a los 8 decimales que va a recoger, y por otra parte tenemos
        la letra que va a recoger, que según he leído no acepta las vocales "i, o y u",
        por lo que mediante los guiones realizaba una intersección donde se 
        encontraban dichas vocales*/

        //Comprobacion: 8 cifras y una letra mayuscula (Quedan excluidas las letras 'I', 'O' y 'U)
        //Expresion regular:
        
        String expresionRegular = "\\d{8}[A-HJ-NP-TV-Z]";

        return Pattern.matches(expresionRegular, mensaje);

    }

    /**
     * Validará el código del libro. 3 letras y 2 números.
     *
     * @param mensaje que se introduzca
     * @return true si cumple los requisitos previos.
     */
    public static boolean comprobarCodigoLibro(String mensaje) {

        /*
        Igual que antes pero invirtiendo el orden, aceptando mayúsculando y minúsculas
        y aceptando tb por ende dos números.
         */
        String expresionRegular = "[A-Za-z]{3}\\d{2}";

        return Pattern.matches(expresionRegular, mensaje);

    }
}
/**
 * Solución hecha por el profesor
 */

//public class ValidarDatos {
//    /**
//     * Método que comprueba que un NIF tenga un formato correcto
//     * @param nif NIF que se quiere comprobar
//     * @return devuelve true si el NIF recibido por parámetro tiene un formato válido.
//     */
//    public static boolean validarNif(String nif){
//        // http://www.juntadeandalucia.es/servicios/madeja/contenido/recurso/677
//        return true;
//    }
//    
//    /**
//     * Método que permite comprobar un código de un libro. Este debe estar formado por 3 letras y 2 números.
//     * @param codigo cadena de caracteres que se quiere comprobar.
//     * @return devuelve true si coincide con la expresión regular y falso en caso contrario.
//     */
//    public static boolean comprobarCodigoLibro(String codigo){
//        Pattern p = Pattern.compile("[A-Z]{3}[0-9]{2}");
//        Matcher m = p.matcher(codigo);
//        return m.matches();
//    }    
//}
//


