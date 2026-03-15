package Tarea2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestionPedidos gestion = new GestionPedidos();
        int opcion = -1;

        System.out.println("   BIENVENIDO A PIZZA-TRACK  ");

        while (opcion != 0) {
            System.out.println("\n--- MENÚ DE OPCIONES ---");
            System.out.println("1. Registrar Pizza");
            System.out.println("2. Deshacer último pedido");
            System.out.println("3. Rehacer pedido deshecho");
            System.out.println("4. Mostrar Pedido Actual");
            System.out.println("0. Salir del sistema");
            System.out.print("Elige una opción: ");
            
            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                opcion = -1;
            }

            switch (opcion) {
                case 1:
                    System.out.print("Nombre de la pizza: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrediente 1: ");
                    String ing1 = scanner.nextLine();
                    System.out.print("Ingrediente 2: ");
                    String ing2 = scanner.nextLine();
                    System.out.print("Ingrediente 3: ");
                    String ing3 = scanner.nextLine();
                    
                    gestion.registrarPedido(new Pizza(nombre, ing1, ing2, ing3));
                    break;
                case 2:
                    gestion.deshacer();
                    break;
                case 3:
                    gestion.rehacer();
                    break;
                case 4:
                    gestion.mostrarPedidoActual();
                    break;
                case 0:
                    System.out.println("👋 Saliendo del sistema Pizza-Track.");
                    break;
                default:
                    System.out.println("❌ Opción no válida. Intenta de nuevo con un número del 0 al 4.");
            }
        }
        scanner.close();
    }
}