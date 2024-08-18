package org.example.helper.mensajes;

public enum RegexExpresiones {

    VALIDAR_SOLO_LETRAS_Y_ESPACIOS("^[a-zA-Z\\s]*$"),
    VALIDAR_LETRAS_SIN_ESPACIOS("^[A-Za-z]{1,}$"),
    ;

    private String expresionRegular;

    RegexExpresiones(String expresionRegular) {
        this.expresionRegular = expresionRegular;
    }

    public String getExpresionRegular() {
        return expresionRegular;
    }

    public void setExpresionRegular(String expresionRegular) {
        this.expresionRegular = expresionRegular;
    }
}
