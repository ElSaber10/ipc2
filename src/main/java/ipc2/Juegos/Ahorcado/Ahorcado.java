package ipc2.Juegos.Ahorcado;

public class Ahorcado {

    public static String palabra;
    public static char palabraingresada;
    public static AhorcadoJugabilidad jugabilidad;
    public static String mostrarenpantalla = "";
    public static int numerrores = 0;


   

    /**
     * 
     * Parte grafica del jugador 1
     * 
     */
    public static void Jugador1() {
            System.out.println("");
            System.out.println("");
            System.out.println("***************Ahorcado***************");
            System.out.println("**************************************");
            System.out.println("*              Jugador 1             *");
            System.out.println("**************************************");
            System.out.println("**Ingrese la palabra para adivinar****");
            System.out.println("");
            System.out.print(": ");
        
    }

    /**
     * @param error
     * 
     * PArte grafica del juego en el jugador2
     * 
     */
    public static void pantallas(int error){
            System.out.println("");
            System.out.println("");
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
        System.out.println("**Opciones(*)**");
        System.out.println("");
    }
        
    
}
