package org.example.helper.validaciones;

import org.example.helper.generals.RegexValidator;
import org.example.helper.mensajes.MensajeCocteles;
import org.example.helper.mensajes.RegexExpresiones;

public class ValidacionCocteles {

    RegexValidator regexValidator = new RegexValidator();

    public boolean validarNombre(String nombre)throws Exception {

        if (!regexValidator.validarRegex(nombre, RegexExpresiones.VALIDAR_LETRAS_SIN_ESPACIOS.getExpresionRegular())) {

            throw new Exception(MensajeCocteles.NOMBRE_INVALIDO.getMensajeError());
        }

        if (nombre.length() > 50) {
            throw new Exception(MensajeCocteles.LONGITUD.getMensajeError());
        }

        return true;

    }

    public boolean validarPrecio(Double precio) throws Exception {

        if (precio < 0) {
            throw new Exception(MensajeCocteles.PRECIO.getMensajeError());
        }

        return true;
    }

    public boolean validarDescripcion(String descripcion) throws Exception {

        if (!regexValidator.validarRegex(descripcion, RegexExpresiones.VALIDAR_SOLO_LETRAS_Y_ESPACIOS.getExpresionRegular())) {

            throw new Exception(MensajeCocteles.DESCRIPCION.getMensajeError());
        }

        if (descripcion.length() > 100) {
            throw new Exception(MensajeCocteles.LONGITUD.getMensajeError());
        }

        return true;
    }

}
