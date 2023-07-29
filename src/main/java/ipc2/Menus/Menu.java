package ipc2.Menus;

import java.util.Scanner;

public class Menu {

    public static Scanner entrada = new Scanner(System.in);
    public static int seleccion;

    public static void Inicio() {
        System.out.println("               Bienvenido elija elija el juego              ");
        System.out.println("************************************************************");
        System.out.println("1) Ahorcado");
        System.out.println("2) Basquetball");
        System.out.println("3) Cartas.");
        System.out.println("4) Salir.");
        System.out.println("Selecione entre 1-4");
        
        seleccion = entrada.nextInt();
        Opciones(seleccion);

    }

    public static void Opciones(int seleccion) {
        switch (seleccion) {
            case 1:
                System.out.println("*******Ahorcado*******");
                break;
            case 2:
                System.out.println("*******Basquetball*******");
                break;
            case 3:
                System.out.println("*******Cartas*******");
                break;
            case 4:
                System.out.println("*******Saliendo*******");
                break;        
            default:
                Inicio();
                break;
        }
    }
    
}
