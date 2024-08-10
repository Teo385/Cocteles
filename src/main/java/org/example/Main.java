package org.example;

import org.example.modelos.hijos.CoctelConJugo;
import org.example.modelos.hijos.CoctelSoloAlcohol;
import org.example.validaciones.CoctelesValidaciones;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);

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

        // Validación de nombre
        do {
            System.out.print("Ingrese el nombre del cóctel: ");
            nombreCoctel = lea.nextLine();
            if (!CoctelesValidaciones.validarNombre(nombreCoctel)) {
                System.out.println("Nombre inválido. Ingrese el nombre del cóctel (solo letras y espacios): ");
            }
        } while (!CoctelesValidaciones.validarNombre(nombreCoctel));

        // Validación de precio
        do {
            System.out.print("Ingrese el costo del cóctel: ");
            precioCoctel = lea.nextDouble();
            if (!CoctelesValidaciones.validarCosto(precioCoctel)) {
                System.out.println("Costo inválido. me va a regalar plata o que mi fai? ");
            }
        } while (!CoctelesValidaciones.validarCosto(precioCoctel));

        // Validación de cantidad
        do {
            System.out.print("Ingrese la cantidad del cóctel (en unidades): ");
            cantidadCoctel = lea.nextInt();
            if (!CoctelesValidaciones.validarTamaño(cantidadCoctel)) {
                System.out.println("Cantidad inválida. Ingrese una cantidad positiva: ");
            }
        } while (!CoctelesValidaciones.validarTamaño(cantidadCoctel));

        lea.nextLine(); // Consumir la nueva línea

        System.out.print("Ingrese los ingredientes del cóctel: ");
        ingredientesCoctel = lea.nextLine();

        System.out.print("Grados de alcohol: ");
        gradosDeAlcohol = lea.nextLine();

        System.out.print("Nivel de dulzura: ");
        nivelDeDulzura = lea.nextLine();

        System.out.print("Descripción: ");
        descripcion = lea.nextLine();

        if (tipoCoctel == 1) { // Coctel con jugo
            LocalDate fechaVencimiento;
            do {
                System.out.print("Ingrese la fecha de vencimiento (YYYY-MM-DD): ");
                try {
                    fechaVencimiento = LocalDate.parse(lea.nextLine());
                    break;
                } catch (Exception e) {
                    System.out.println("Fecha inválida. Ingrese una fecha válida (YYYY-MM-DD): ");
                }
            } while (true);

            CoctelConJugo coctelConJugo = new CoctelConJugo(nombreCoctel, precioCoctel, ingredientesCoctel, gradosDeAlcohol, true, null, nivelDeDulzura, descripcion, cantidadCoctel, fechaVencimiento);

            System.out.println("Información del cóctel con jugo:");
            System.out.println("Nombre: " + coctelConJugo.getNombre());
            System.out.println("Precio: " + coctelConJugo.getPrecio());
            System.out.println("Cantidad: " + coctelConJugo.getCantidadDeCocteles());
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
            System.out.println("Cantidad: " + coctelSoloAlcohol.getCantidadDeCocteles());
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
