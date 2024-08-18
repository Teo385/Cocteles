package org.example.helper.mensajes;

public enum MensajeCocteles {

    NOMBRE_INVALIDO("Nombre inválido. Ingrese el nombre del cóctel (solo letras sin espacios)"),
    LONGITUD("Error en el numero de los caracteres"),
    PRECIO("El precio no puede tiene que ser un numero positivo"),
    DESCRIPCION("Descripcion invalida (solo letras y espacios)")
    ;

    private String mensajeError;

    MensajeCocteles(String mensajeError) {
        this.mensajeError = mensajeError;
    }

    public String getMensajeError() {
        return mensajeError;
    }

    public void setMensajeError(String mensajeError) {
        this.mensajeError = mensajeError;
    }
}

