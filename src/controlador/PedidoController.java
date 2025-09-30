package controlador;

import java.util.Scanner;
import modelo.Pedido;

public class PedidoController {
    private Scanner sc = new Scanner(System.in);

    public void iniciarPedido() {
        // ==== Selección de combo base ====
        System.out.println("Seleccione su combo base:");
        System.out.println("1. Hamburguesa (S/ 15.0)");
        System.out.println("2. Pollo (S/ 14.0)");
        System.out.println("3. Vegetariano (S/ 12.0)");

        int opcionCombo = sc.nextInt();
        String combo = "";
        double precioCombo = 0;

        switch (opcionCombo) {
            case 1 -> { combo = "Hamburguesa"; precioCombo = 15.0; }
            case 2 -> { combo = "Pollo"; precioCombo = 14.0; }
            case 3 -> { combo = "Vegetariano"; precioCombo = 12.0; }
            default -> { combo = "Hamburguesa"; precioCombo = 15.0; }
        }

        // ==== Selección de bebida ====
        System.out.println("\nSeleccione bebida:");
        System.out.println("1. Ninguno (S/ 0)");
        System.out.println("2. Agua (S/ 2.0)");
        System.out.println("3. Gaseosa (S/ 3.5)");
        System.out.println("4. Jugo (S/ 4.0)");

        int opcionBebida = sc.nextInt();
        String bebida = "";
        double precioBebida = 0;

        switch (opcionBebida) {
            case 1 -> { bebida = "Ninguno"; precioBebida = 0; }
            case 2 -> { bebida = "Agua"; precioBebida = 2.0; }
            case 3 -> { bebida = "Gaseosa"; precioBebida = 3.5; }
            case 4 -> { bebida = "Jugo"; precioBebida = 4.0; }
        }

        // ==== Selección de acompañamiento ====
        System.out.println("\nSeleccione acompañamiento:");
        System.out.println("1. Ninguno (S/ 0)");
        System.out.println("2. Papas (S/ 5.0)");
        System.out.println("3. Ensalada (S/ 4.5)");

        int opcionAcompanamiento = sc.nextInt();
        String acompanamiento = "";
        double precioAcompanamiento = 0;

        switch (opcionAcompanamiento) {
            case 1 -> { acompanamiento = "Ninguno"; precioAcompanamiento = 0; }
            case 2 -> { acompanamiento = "Papas"; precioAcompanamiento = 5.0; }
            case 3 -> { acompanamiento = "Ensalada"; precioAcompanamiento = 4.5; }
        }

        // ==== Selección de extra ====
        System.out.println("\nSeleccione extra:");
        System.out.println("1. Ninguno (S/ 0)");
        System.out.println("2. Nuggets (S/ 6.0)");
        System.out.println("3. Alitas (S/ 7.0)");

        int opcionExtra = sc.nextInt();
        String extra = "";
        double precioExtra = 0;

        switch (opcionExtra) {
            case 1 -> { extra = "Ninguno"; precioExtra = 0; }
            case 2 -> { extra = "Nuggets"; precioExtra = 6.0; }
            case 3 -> { extra = "Alitas"; precioExtra = 7.0; }
        }

        // ==== Crear pedido ====
        Pedido pedido = new Pedido(combo, precioCombo,
                                   bebida, precioBebida,
                                   acompanamiento, precioAcompanamiento,
                                   extra, precioExtra);

        pedido.mostrarResumen();
    }
}

