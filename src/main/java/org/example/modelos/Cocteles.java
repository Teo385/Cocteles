package org.example.modelos;

public abstract class Cocteles {

    private String nombre;

    private Integer precio;

    private String ingredientes;

    private String gradosDeAlcohol;

    private Boolean esPerecedero;

    private String tamaño;

    private String nivelDeDulzura;

    private String descripcion;

    public Cocteles() {
    }

    public Cocteles(String nombre, Integer precio, String ingredientes, String gradosDeAlcohol, Boolean esPerecedero, String tamaño, String nivelDeDulzura, String descripcion) {
        this.nombre = nombre;
        this.precio = precio;
        this.ingredientes = ingredientes;
        this.gradosDeAlcohol = gradosDeAlcohol;
        this.esPerecedero = esPerecedero;
        this.tamaño = tamaño;
        this.nivelDeDulzura = nivelDeDulzura;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getGradosDeAlcohol() {
        return gradosDeAlcohol;
    }

    public void setGradosDeAlcohol(String gradosDeAlcohol) {
        this.gradosDeAlcohol = gradosDeAlcohol;
    }

    public Boolean getEsPerecedero() {
        return esPerecedero;
    }

    public void setEsPerecedero(Boolean esPerecedero) {
        this.esPerecedero = esPerecedero;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getNivelDeDulzura() {
        return nivelDeDulzura;
    }

    public void setNivelDeDulzura(String nivelDeDulzura) {
        this.nivelDeDulzura = nivelDeDulzura;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
