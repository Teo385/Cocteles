package org.example.validaciones;

import java.util.regex.Pattern;

public class CoctelesValidaciones {

    //validacion para el nombre
    public static boolean validarNombre(String nombre){
        String regex = "^[A-Za-z\\s]+$";
        return Pattern.matches(regex, nombre);
    }

    //validacion para solo numeros positivos
    public static boolean validarCosto(Double costo){
        return costo > 0;
    }

    //validar que el tamaño sean numeros positivos
    public static boolean validarTamaño(Integer tamaño){
        return tamaño > 0;
    }

}
