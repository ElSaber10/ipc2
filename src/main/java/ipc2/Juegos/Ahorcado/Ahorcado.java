package ipc2.Juegos.Ahorcado;

import java.util.Scanner;

import ipc2.Menus.Menu;

public class Ahorcado {

    public static String palabra;
    public static char palabraingresada;
    public static AhorcadoJugabilidad jugabilidad;
    public static String mostrarenpantalla = "";
    public static int numerrores = 0;


    public static void inicioAhorcado(Scanner entrada) {
        palabra = "";
        palabraingresada = '\0';
        mostrarenpantalla = "";
        numerrores = 0;
        Jugador1(entrada);
        Jugador2(entrada);
        return;
    }

    public static void calcularPalabras(String palabra, Scanner entrada) {

        pantallas(numerrores);    


        for (int i = 0; i < palabra.length(); i++) {
            
            mostrarenpantalla += "_";
        } 

        

        boolean found = false; 
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == palabraingresada) {
                mostrarenpantalla = mostrarenpantalla.substring(0, i) + palabraingresada + mostrarenpantalla.substring(i + 1);
                found = true;
            
            }
        }
                mostrarenpantalla = mostrarenpantalla.substring(0, palabra.length());
                System.out.println(mostrarenpantalla); 
                if (!found && palabraingresada != '\0') {
                    System.out.println("La letra no esta en la pala1bra.");
                    numerrores++;
                }
        
                if (!mostrarenpantalla.equals(palabra)) {
                    palabraingresada = entrada.next().charAt(0);
                    jugar(entrada);
                } 
                if (mostrarenpantalla.equals(palabra) && numerrores < 8) {
                    numerrores = 9;
                    System.out.println("Felicidades ganaste");
                    Menu.menuFinal(entrada);
                }

                /*if (mostrarenpantalla.equals(palabra)){
                    mostrarenpantalla = "";    
                    palabraingresada = '\0';              
                    System.out.println("Felicidades ganaste");
                    Menu.menuFinal(entrada);*/

                


    }

    public static void Jugador1(Scanner entrada) {
            System.out.println("***************Ahorcado***************");
            System.out.println("**************************************");
            System.out.println("*              Jugador 1             *");
            System.out.println("**************************************");
            System.out.println("**Ingrese la palabra para adivinar****");
            System.out.println("");
            System.out.print(": ");
            palabra = entrada.next();
            entrada.nextLine();
            System.out.println("");
    }

    public static void pantallas(int error){
        
            System.out.println("***************Ahorcado***************");
            System.out.println("**************************************");
            System.out.println("*              Jugador 2             *");
            System.out.println("**************************************");
            System.out.println("**Adivina La palabra**");
            System.out.println("                            ___");
            System.out.println("                            |  |");

        if (error == 0) {
            System.out.println("                            |   ");
            System.out.println("                            |   ");
            System.out.println("                            |   ");
            System.out.println("                            |   ");
        }
        if (error == 1) {
            System.out.println("                            |  Q");
            System.out.println("                            |   ");
            System.out.println("                            |   ");
            System.out.println("                            |   ");
        }
        if (error == 2) {
            System.out.println("                            |  Q");
            System.out.println("                            |  |");
            System.out.println("                            |   ");
            System.out.println("                            |   ");

        }
        if (error == 3) {
            System.out.println("                            |  Q");
            System.out.println("                            | /|");
            System.out.println("                            |   ");
            System.out.println("                            |   ");
        }
        if (error == 4) {
            System.out.println("                            |  Q ");
            System.out.println("                            | /|/");
            System.out.println("                            |    ");
            System.out.println("                            |    ");
            
        }
        if (error == 5) {
            System.out.println("                            |  Q ");
            System.out.println("                            | /|/");
            System.out.println("                            |  | ");
            System.out.println("                            |    ");
            
        }
        if (error == 6) {
            System.out.println("                            |  Q ");
            System.out.println("                            | /|/");
            System.out.println("                            |  | ");
            System.out.println("                            | /  ");
            
        }
        if (error == 7) {
            System.out.println("                            |  Q ");
            System.out.println("                            | /|/");
            System.out.println("                            |  | ");
            System.out.println("                            | / /");
            
        }
        System.out.println("");
        System.out.println("");
        
    }

    public static void Jugador2(Scanner entrada) {

        

        

        jugar(entrada);
        //AhoorcadoJugabilidad.funciones(entrada, palabra);

        /*boolean valor = palabra.contains(palabraingresada);
        int vlue = palabra.indexOf(palabraingresada);

        System.out.println("Valores en cadena son  " + valor + " Posicion" + vlue);

        int count = 0;
        String palabracambiada = "";*/
   

    }


    public static void jugar(Scanner entrada) {
        
        while(numerrores < 8 ){
        
        calcularPalabras(palabra, entrada);

        
    }
    if (numerrores == 8) {
        numerrores = 9;
        System.out.println("Perdiste");
        Menu.menuFinal(entrada);
    }
    }
}
