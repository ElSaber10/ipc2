package ipc2.Juegos.Ahorcado;

import java.util.Scanner;

import ipc2.Menus.Menu;

public class Ahorcado {

    public static String palabra;
    public static char palabraingresada;
    public static AhorcadoJugabilidad jugabilidad;
    public static String displayedWord = "";
    public static int incorrectGuesses = 0;


    public static void inicioAhorcado(Scanner entrada) {
        palabra = "";
        palabraingresada = '\0';
        displayedWord = "";
        incorrectGuesses = 0;
        Jugador1(entrada);
        Jugador2(entrada);
        return;
    }

    public static void calcularPalabras(String palabra, Scanner entrada) {

        pantallas();    


        for (int i = 0; i < palabra.length(); i++) {
            
            displayedWord += "_";
        } 

        

        boolean found = false; 
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == palabraingresada) {
                displayedWord = displayedWord.substring(0, i) + palabraingresada + displayedWord.substring(i + 1);
                found = true;
            
            }
        }
                displayedWord = displayedWord.substring(0, palabra.length());
                System.out.println(displayedWord); 
                if (!found) {
                    System.out.println("La letra no esta en la pala1bra.");
                    incorrectGuesses++;
                }
        
                if (!displayedWord.equals(palabra)) {
                    palabraingresada = entrada.next().charAt(0);
                    jugar(entrada);
                } 
                if (displayedWord.equals(palabra) && incorrectGuesses < 8) {
                    incorrectGuesses = 9;
                    System.out.println("Felicidades ganaste");
                    Menu.menuFinal(entrada);
                }

                /*if (displayedWord.equals(palabra)){
                    displayedWord = "";    
                    palabraingresada = '\0';              
                    System.out.println("Felicidades ganaste");
                    Menu.menuFinal(entrada);*/

                


    }

    public static void Jugador1(Scanner entrada) {
            System.out.println("               Jugador 1              ");
            System.out.println("**************************************");
            System.out.println("**Ingrese la palabra para adivinar****");
            palabra = entrada.next();
            entrada.nextLine();
            System.out.println("");
    }

    public static void pantallas() {
        System.out.println("               Jugador 2              ");
        System.out.println("**************************************");
        System.out.println("**Adivina La palabra**");
        System.out.println("                            ___");
        System.out.println("                            |  |");
        System.out.println("                            |   ");
        System.out.println("                            |   ");
        System.out.println("                            |   ");
        System.out.println("                            |   ");
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
        
        while(incorrectGuesses < 8 ){
        
        calcularPalabras(palabra, entrada);

        
    }
    if (incorrectGuesses == 8) {
        System.out.println("Perdiste");
        Menu.menuFinal(entrada);
    }
    }
}
