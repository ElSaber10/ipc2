package ipc2.Menus;

import java.util.Scanner;

public class Menu {

    public static Scanner entrada = new Scanner(System.in);
    public static int seleccion;

    public static void menuInicio() {
        System.out.println("               Bienvenido elija elija el juego              ");
        System.out.println("************************************************************");
        System.out.println("1) Ahorcado");
        System.out.println("2) Basquetball");
        System.out.println("3) Cartas.");
        System.out.println("4) Salir.");
        System.out.println("Selecione entre 1-4");
        
        seleccion = entrada.nextInt();
        opcionesPrincipales(seleccion);

    }

    public static void opcionesPrincipales(int seleccion) {
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
                menuInicio();
                break;
        }
    }

    public static void menuIntermedio() {
        System.out.println("1) Volver al Inicio");
        System.out.println("2) Salir.");
        System.out.println("Selecione entre 1-2");
        
        seleccion = entrada.nextInt();
        opcionesSecundarias(seleccion);
    }
    
     public static void opcionesSecundarias(int seleccion) {
        switch (seleccion) {
            case 1:
                menuInicio();
                break;
            case 2:
                System.out.println("*******Saliendo*******");
                break;
            default:
                System.out.println("*******Ingrese Valores correctos********");
                menuIntermedio();
                break;
        }
    }

    public static void menuFinal() {
        System.out.println("1) Volver a jugar");
        System.out.println("2) Volver a elegir");
        System.out.println("3) Salir");
        System.out.println("Selecione entre 1-3");
        
        seleccion = entrada.nextInt();
        opcionesSecundarias(seleccion);
    }

    public static void opcionesFinales(int juego) {
        switch (seleccion) {
            case 1:
                if(juego == 1){
                    
                }
                if (juego == 2) {
                    
                }
                if (juego == 3) {
                    
                }
                System.out.println("*********Juego no existente***********");
                break;
            case 2:
                menuInicio();
                break;
            default:
                System.out.println("*******Ingrese Valores correctos********");
                menuFinal();
                break;
        }
    }
    
}
