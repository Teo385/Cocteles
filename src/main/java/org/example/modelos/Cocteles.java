package org.example.modelos;

public abstract class Cocteles {

    private String nombre;

    private Double precio;

    private String ingredientes;

    private String gradosDeAlcohol;

    private Boolean esPerecedero;

    private Integer tamaño; //en mililitros

    private String nivelDeDulzura;

    private String descripcion;

    private Integer cantidadDeCocteles;

    public Cocteles() {
    }

    public Cocteles(String nombre, Double precio, String ingredientes, String gradosDeAlcohol, Boolean esPerecedero, Integer tamaño, String nivelDeDulzura, String descripcion, Integer cantidadDeCocteles) {
        this.nombre = nombre;
        this.precio = precio;
        this.ingredientes = ingredientes;
        this.gradosDeAlcohol = gradosDeAlcohol;
        this.esPerecedero = esPerecedero;
        this.tamaño = tamaño;
        this.nivelDeDulzura = nivelDeDulzura;
        this.descripcion = descripcion;
        this.cantidadDeCocteles = cantidadDeCocteles;
    }

    public abstract Double calcularCostoVenta();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
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

    public Integer getTamaño() {
        return tamaño;
    }

    public void setTamaño(Integer tamaño) {
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

    public Integer getCantidadDeCocteles() {
        return cantidadDeCocteles;
    }

    public void setCantidadDeCocteles(Integer cantidadDeCocteles) {
        this.cantidadDeCocteles = cantidadDeCocteles;
    }
}
