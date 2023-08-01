package ipc2.Juegos.Ahorcado;

import java.util.Scanner;

import ipc2.Menus.Menu;

public class AhorcadoJugabilidad {

    public static String palabra;
    public static char palabraingresada;
    public static AhorcadoJugabilidad jugabilidad;
    public static String mostrarenpantalla = "";
    public static int numerrores = 0;
    public static boolean valor;
    public static Scanner entrada = new Scanner(System.in);

    /**
     * 
     * Funcion de iniciar el juego y su jugabilidad
     * 
     */
    public static void inicioAhorcado() {
        try {
            reiniciarVariables();
            Ahorcado.Jugador1();
            palabra = entrada.next();
            entrada.nextLine();
            System.out.println("");
            jugar();
        } catch (Exception e) {
            System.out.println("\n*************Ingrese valores numericos correctos*********\n");
            inicioAhorcado();
        }
        

    }

    /**
     * Establecer las valiables con valores de inicio
     */
    public static void reiniciarVariables() {
        palabra = "";
        palabraingresada = '\0';
        mostrarenpantalla = "";
        numerrores = 0;
    }

    /**
     * Sirve para mostrar la plabras que coinciden
     */
    public static void letrasEncontradas() {
        valor = false;
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == palabraingresada) {
                mostrarenpantalla = mostrarenpantalla.substring(0, i) + palabraingresada + mostrarenpantalla.substring(i + 1);
                valor = true;
            }
        }
    }


    /**
     * Sirve para generar un espacio de la cantidad de letras que contiene la letra a adivinar 
     */
    public static void espacios() {
        for (int i = 0; i < palabra.length(); i++) {
            mostrarenpantalla += "_";
        }
    }

    /**
     * Estados en los que el jugador puede estar durante la partida
     */
    public static void estados() {
        if (!valor && palabraingresada != '\0') {
            System.out.println("***La letra no esta en la pala1bra.**");
            System.out.println("");
            numerrores++;
        }

        if (!mostrarenpantalla.equals(palabra)) {
            palabraingresada = entrada.next().charAt(0);
            opciones();
            jugar();
        }

        if (mostrarenpantalla.equals(palabra) && numerrores < 8) {
            numerrores = 9;
            System.out.println("");
            System.out.println("*********************");
            System.out.println("*Felicidades ganaste*");
            System.out.println("*********************");
            try {
                entrada.nextLine();

                Menu.menuFinal(1);
            } catch (Exception e) {
                System.out.println("Ingrese valores correctos ");
                entrada.nextLine();
                Menu.menuFinal(1);
            }
            
        }
    }

    /**
     * Jugabilidad del ahorcado
     */
    public static void jugabilidad( ) {

        Ahorcado.pantallas(numerrores);
        espacios();
        letrasEncontradas();
        mostrarenpantalla = mostrarenpantalla.substring(0, palabra.length());
        System.out.println("La palabra contiene : " + palabra.length() + " letras");
        System.out.println(mostrarenpantalla);
        System.out.println("");
        estados();

    }

    /**
     * Carga del uego y cantidad de repeticiones del mismo antes de perder
     */
    public static void jugar( ) {

        while (numerrores < 8) {

            jugabilidad();

        }

        if (numerrores == 8) {
            numerrores = 9;
            System.out.println("Perdiste");
            entrada.reset();
            Menu.menuFinal(1);
        }
    }

    public static void opciones(){
        if(palabraingresada == '*'){
            Menu.menuIntermedio();
        }
    }

}