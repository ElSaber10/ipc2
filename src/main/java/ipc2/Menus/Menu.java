package ipc2.Menus;

import java.util.Scanner;

import ipc2.Juegos.Ahorcado.Ahorcado;

public class Menu {

    public static int seleccion;
    public static Ahorcado ahorcado = new Ahorcado();

    public static void menuInicio(Scanner entrada) {
        System.out.println("               Bienvenido elija elija el juego              ");
        System.out.println("************************************************************");
        System.out.println("1) Ahorcado");
        System.out.println("2) Basquetball");
        System.out.println("3) Cartas.");
        System.out.println("4) Salir.");
        System.out.println("Selecione entre 1-4");
        
        seleccion = entrada.nextInt();
        opcionesPrincipales(seleccion, entrada);

    }

    public static void opcionesPrincipales(int seleccion, Scanner entrada) {
        switch (seleccion) {
            case 1:
                System.out.println("*******Ahorcado*******");
                Ahorcado.inicioAhorcado(entrada);
                break;
            case 2:
                System.out.println("*******Basquetball*******");
                break;
            case 3:
                System.out.println("*******Cartas*******");
                break;
            case 4:
                System.out.println("*******Saliendo*******");
                System.exit(1);
                break;        
            default:
                menuInicio(entrada);
                break;
        }
    }

    public static void menuIntermedio(Scanner entrada) {
        System.out.println("1) Volver al Inicio");
        System.out.println("2) Salir.");
        System.out.println("Selecione entre 1-2");
        
        seleccion = entrada.nextInt();
        opcionesSecundarias(seleccion, entrada);
    }
    
     public static void opcionesSecundarias(int seleccion, Scanner entrada) {
        switch (seleccion) {
            case 1:
                menuInicio(entrada);
                break;
            case 2:
                System.out.println("*******Saliendo*******");
                break;
            default:
                System.out.println("*******Ingrese Valores correctos********");
                menuIntermedio(entrada);
                break;
        }
    }

    public static void menuFinal(Scanner entrada) {
        System.out.println("1) Volver a jugar");
        System.out.println("2) Volver a elegir");
        System.out.println("3) Salir");
        System.out.println("Selecione entre 1-3");
        
        seleccion = entrada.nextInt();
        opcionesFinales(seleccion, entrada);
    }

    public static void opcionesFinales(int juego, Scanner entrada) {
        switch (seleccion) {
            case 1:
                if(juego == 1){
                    Ahorcado.inicioAhorcado(entrada);
                    break;
                }
                if (juego == 2) {
                    break;
                }
                if (juego == 3) {
                    break;
                }
                System.out.println("*********Juego no existente***********");
                break;
            case 2:
                menuInicio(entrada);
                break;
            case 3:
                System.out.println("*******Saliendo*******");
                System.exit(1);
                break;
            default:
                System.out.println("*******Ingrese Valores correctos********");
                menuFinal(entrada);
                break;
        }
    }
    
}
