package org.example.modelos.hijos;

import org.example.modelos.Cocteles;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CoctelConJugo extends Cocteles {

    private LocalDate diaEnQueSeVence;

    public CoctelConJugo() {
    }

    public CoctelConJugo(String nombre, Double precio, String ingredientes, String gradosDeAlcohol, Boolean esPerecedero, Integer tamaño, String nivelDeDulzura, String descripcion, Integer cantidadDeCocteles, LocalDate diaEnQueSeVence) {
        super(nombre, precio, ingredientes, gradosDeAlcohol, esPerecedero, tamaño, nivelDeDulzura, descripcion, cantidadDeCocteles);
        this.diaEnQueSeVence = diaEnQueSeVence;
    }

    @Override
    public Double calcularCostoVenta() {
        // Cálculo del costo inicial
        double costoInicial = getCantidadDeCocteles() * getPrecio();

        // Fecha actual
        LocalDate hoy = LocalDate.now();

        // Calcular los días hasta el vencimiento
        long diasHastaVencimiento = ChronoUnit.DAYS.between(hoy, diaEnQueSeVence);

        // Aplicar descuento basado en los días restantes
        if (diasHastaVencimiento == 3) {
            return costoInicial * 0.98; // 2% de descuento
        } else if (diasHastaVencimiento == 2) {
            return costoInicial * 0.965; // 3.5% de descuento
        } else if (diasHastaVencimiento == 1) {
            return costoInicial * 0.95; // 5% de descuento
        } else {
            return costoInicial; // Sin descuento
        }
    }

    public LocalDate getDiaEnQueSeVence() {
        return diaEnQueSeVence;
    }

    public void setDiaEnQueSeVence(LocalDate diaEnQueSeVence) {
        this.diaEnQueSeVence = diaEnQueSeVence;
    }
}
