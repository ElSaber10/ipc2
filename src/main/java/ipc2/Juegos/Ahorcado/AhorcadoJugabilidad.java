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

    public static void inicioAhorcado(Scanner entrada) {
        try {
            reiniciarVariables();
            Ahorcado.Jugador1(entrada);
            palabra = entrada.next();
            entrada.nextLine();
            System.out.println("");
            jugar(entrada);
        } catch (Exception e) {
            System.out.println("\n*************Ingrese valores numericos correctos*********\n");
            inicioAhorcado(entrada);
        }
        

    }

    public static void reiniciarVariables() {
        palabra = "";
        palabraingresada = '\0';
        mostrarenpantalla = "";
        numerrores = 0;
    }

    public static void letrasEncontradas() {
        valor = false;
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == palabraingresada) {
                mostrarenpantalla = mostrarenpantalla.substring(0, i) + palabraingresada + mostrarenpantalla.substring(i + 1);
                valor = true;
            }
        }
    }

    public static void espacios() {
        for (int i = 0; i < palabra.length(); i++) {
            mostrarenpantalla += "_";
        }
    }

    public static void estados(Scanner entrada) {
        if (!valor && palabraingresada != '\0') {
            System.out.println("***La letra no esta en la pala1bra.**");
            System.out.println("");
            numerrores++;
        }

        if (!mostrarenpantalla.equals(palabra)) {
            palabraingresada = entrada.next().charAt(0);
            jugar(entrada);
        }

        if (mostrarenpantalla.equals(palabra) && numerrores < 8) {
            numerrores = 9;
            System.out.println("");
            System.out.println("*********************");
            System.out.println("*Felicidades ganaste*");
            System.out.println("*********************");
            Menu.menuFinal(entrada);
        }
    }

    public static void calcularPalabras(Scanner entrada) {

        Ahorcado.pantallas(numerrores);
        espacios();
        letrasEncontradas();
        mostrarenpantalla = mostrarenpantalla.substring(0, palabra.length());
        System.out.println("La palabra contiene : " + palabra.length() + " letras");
        System.out.println(mostrarenpantalla);
        System.out.println("");
        estados(entrada);

    }

    public static void jugar(Scanner entrada) {

        while (numerrores < 8) {

            calcularPalabras(entrada);

        }

        if (numerrores == 8) {
            numerrores = 9;
            System.out.println("Perdiste");
            Menu.menuFinal(entrada);
        }
    }

}