package org.example;

import org.example.helper.validaciones.ValidacionCocteles;
import org.example.modelos.Cocteles;
import org.example.modelos.hijos.CoctelConJugo;
import org.example.modelos.hijos.CoctelSoloAlcohol;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        ValidacionCocteles validacion = new ValidacionCocteles();

        // Elegir tipo de cóctel
        System.out.println("Seleccione el tipo de cóctel (1: Con Jugo, 2: Solo Alcohol): ");
        int tipoCoctel = lea.nextInt();
        lea.nextLine(); // Consumir la nueva línea

        // Obtener datos del cóctel
        String nombreCoctel;
        Double precioCoctel;
        String ingredientesCoctel;
        String gradosDeAlcohol;
        Integer cantidadCoctel;
        String nivelDeDulzura;
        String descripcion;

        while (true) {
            try {
                System.out.print("Ingrese el nombre del cóctel: ");
                nombreCoctel = lea.nextLine();
                validacion.validarNombre(nombreCoctel);
                break; // Salir del bucle si la validación es exitosa
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.print("Ingrese el costo del cóctel: ");
                precioCoctel = lea.nextDouble();
                validacion.validarPrecio(precioCoctel);
                break; // Salir del bucle si la validación es exitosa
            } catch (Exception e) {
                System.out.println(e.getMessage());
                lea.nextLine(); // Consumir la nueva línea en caso de excepción
            }
        }

        System.out.print("Ingrese la cantidad del cóctel (en unidades): ");
        cantidadCoctel = lea.nextInt();
        lea.nextLine();

        System.out.print("Ingrese los ingredientes del cóctel: ");
        ingredientesCoctel = lea.nextLine();

        System.out.print("Grados de alcohol: ");
        gradosDeAlcohol = lea.nextLine();

        System.out.print("Nivel de dulzura: ");
        nivelDeDulzura = lea.nextLine();

        while (true) {
            try {
                System.out.print("Descripción: ");
                descripcion = lea.nextLine();
                validacion.validarDescripcion(descripcion);
                break; // Salir del bucle si la validación es exitosa
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        if (tipoCoctel == 1) { // Coctel con jugo
            LocalDate fechaVencimiento;
            while (true) {
                System.out.print("Ingrese la fecha de vencimiento (YYYY-MM-DD): ");
                try {
                    fechaVencimiento = LocalDate.parse(lea.nextLine());
                    break; // Salir del bucle si la fecha es válida
                } catch (Exception e) {
                    System.out.println("Fecha inválida. Ingrese una fecha válida (YYYY-MM-DD): ");
                }
            }

            CoctelConJugo coctelConJugo = new CoctelConJugo(nombreCoctel, precioCoctel, ingredientesCoctel, gradosDeAlcohol, true, null, nivelDeDulzura, descripcion, cantidadCoctel, fechaVencimiento);

            System.out.println("Información del cóctel con jugo:");
            System.out.println("Nombre: " + coctelConJugo.getNombre());
            System.out.println("Precio: " + coctelConJugo.getPrecio());
            System.out.println("Cantidad: " + coctelConJugo.getCantidadDeCocteles() + " mL");
            System.out.println("Ingredientes: " + coctelConJugo.getIngredientes());
            System.out.println("Grados de alcohol: " + coctelConJugo.getGradosDeAlcohol());
            System.out.println("Nivel de dulzura: " + coctelConJugo.getNivelDeDulzura());
            System.out.println("Descripción: " + coctelConJugo.getDescripcion());
            System.out.println("Día en que se vence: " + coctelConJugo.getDiaEnQueSeVence());
            System.out.println("Costo de venta del cóctel con jugo: " + coctelConJugo.calcularCostoVenta());

        } else if (tipoCoctel == 2) { // Coctel solo alcohol
            CoctelSoloAlcohol coctelSoloAlcohol = new CoctelSoloAlcohol(nombreCoctel, precioCoctel, ingredientesCoctel, gradosDeAlcohol, false, null, nivelDeDulzura, descripcion, cantidadCoctel, gradosDeAlcohol);

            System.out.println("Información del cóctel solo alcohol:");
            System.out.println("Nombre: " + coctelSoloAlcohol.getNombre());
            System.out.println("Precio: " + coctelSoloAlcohol.getPrecio());
            System.out.println("Cantidad: " + coctelSoloAlcohol.getCantidadDeCocteles() + " mL");
            System.out.println("Ingredientes: " + coctelSoloAlcohol.getIngredientes());
            System.out.println("Grados de alcohol: " + coctelSoloAlcohol.getGradosDeAlcohol());
            System.out.println("Nivel de dulzura: " + coctelSoloAlcohol.getNivelDeDulzura());
            System.out.println("Descripción: " + coctelSoloAlcohol.getDescripcion());
            System.out.println("Tipo de alcohol: " + coctelSoloAlcohol.getTipo());
            System.out.println("Costo de venta del cóctel solo alcohol: " + coctelSoloAlcohol.calcularCostoVenta());

        } else {
            System.out.println("Tipo de cóctel no válido.");
        }

        lea.close();
    }
}
