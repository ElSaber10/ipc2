package ipc2.Menus;

import java.util.Scanner;

import ipc2.Juegos.Ahorcado.Ahorcado;
import ipc2.Juegos.Ahorcado.AhorcadoJugabilidad;
import ipc2.Juegos.Basqueball.Basquetball;
import ipc2.Juegos.Cartas.Cartas;

public class Menu {

    public static int seleccion;
    public static Ahorcado ahorcado = new Ahorcado();
    public static Cartas jCartas = new Cartas();
    public static Scanner entrada = new Scanner(System.in);

    public static void menuInicio() {
        System.out.println("               Bienvenido elija elija el juego              ");
        System.out.println("************************************************************");
        System.out.println("1) Ahorcado");
        System.out.println("2) Basquetball");
        System.out.println("3) Cartas.");
        System.out.println("4) Salir.");
        System.out.println("Selecione entre 1-4");
        
        try {
            seleccion = entrada.nextInt();
            entrada.nextLine();
            opcionesPrincipales(seleccion);
        } catch (Exception e) {
            System.out.println("Ingrese valores correctos");
            entrada.nextLine();
            menuInicio();
        }
        

    }

    public static void opcionesPrincipales(int seleccion ) {
        
            switch (seleccion) {
            case 1:
                entrada.reset();
                AhorcadoJugabilidad.inicioAhorcado();
                break;
            case 2:
                entrada.reset();
                System.out.println("*******Basquetball*******");
                Basquetball.inicioBasquetball();
                break;
            case 3:
                System.out.println("*******Cartas*******");
                Scanner scanner = new Scanner(System.in);
                Cartas.ApostarEntreCartasGame game = new Cartas.ApostarEntreCartasGame();
                System.out.println("Ingrese el dinero que tiene");
                int dineroJugador = scanner.nextInt();
                game.startGame(dineroJugador);
                break;
            case 4:
                System.out.println("*******Saliendo*******");
                System.exit(1);
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
        try {
            entrada.nextLine();
            seleccion = entrada.nextInt();
            opcionesSecundarias(seleccion);
        } catch (Exception e) {
            System.out.println("*******Ingrese Valores correctos********");
            menuIntermedio();
        }
        
    }
    
     public static void opcionesSecundarias(int seleccion) {
        switch (seleccion) {
            case 1:
                menuInicio();
                break;
            case 2:
                System.out.println("*******Saliendo*******");
                System.exit(1);
                break;
            default:
                System.out.println("*******Ingrese Valores correctos********");
                menuIntermedio();
                break;
        }
    }

    public static void menuFinal(int seleccionar) {
            System.out.println("1) Volver a jugar");
            System.out.println("2) Volver a elegir");
            System.out.println("3) Salir");
            System.out.println("Selecione entre 1-3");
            Scanner entradanueva = new Scanner(System.in);
        try {
            seleccion = entradanueva.nextInt();
            entradanueva.nextLine();
            opcionesFinales(seleccionar);
        } catch (Exception e) {
            System.out.println("*******Ingrese Valores correctos********");
            menuFinal(seleccionar);
        }
        entradanueva.close();
    }

    public static void opcionesFinales(int juego) {
        switch (seleccion) {
            case 1:
                if(juego == 1){
                    entrada.reset();
                    AhorcadoJugabilidad.inicioAhorcado();
                    break;
                }
                if (juego == 2) {
                    break;
                }
                if (juego == 3) {
                        System.out.println("*******Cartas*******");
                        Scanner scanner = new Scanner(System.in);
                        Cartas.ApostarEntreCartasGame game = new Cartas.ApostarEntreCartasGame();
                        System.out.println("Ingrese el dinero que tiene");
                        int dineroJugador = scanner.nextInt();
                        game.startGame(dineroJugador);
                    break;
                }
                System.out.println("*********Juego no existente***********");
                break;
            case 2:
                menuInicio();
                break;
            case 3:
                System.out.println("*******Saliendo*******");
                System.exit(1);
                break;
            default:
                System.out.println("*******Ingrese Valores correctos********");
                menuFinal(juego);
                break;
        }
    }
    
}
