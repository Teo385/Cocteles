package org.example.modelos.hijos;

import org.example.modelos.Cocteles;

public class CoctelSoloAlcohol extends Cocteles {

    private String tipo;

    public CoctelSoloAlcohol() {
    }

    public CoctelSoloAlcohol(String nombre, Double precio, String ingredientes, String gradosDeAlcohol, Boolean esPerecedero, Integer tamaño, String nivelDeDulzura, String descripcion, Integer cantidadDeCocteles, String tipo) {
        super(nombre, precio, ingredientes, gradosDeAlcohol, esPerecedero, tamaño, nivelDeDulzura, descripcion, cantidadDeCocteles);
        this.tipo = tipo;
    }

    @Override
    public Double calcularCostoVenta(){
        return getCantidadDeCocteles() * getPrecio();
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
