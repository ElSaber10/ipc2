package ipc2.Juegos.Basqueball;
import java.util.Scanner;

public class Basquetball {


    public static void inicioBasquetball(){

        Scanner scanner = new Scanner(System.in);
        String jugador1 = "Jugador 1";
        String jugador2 = "Jugador 2";
        int turnos = 0;
        // Ingrese la cantidad de turnos que tendrá el juego.
        try {
            System.out.println("¿Cuántos turnos quieres jugar? ");
            turnos = scanner.nextInt();
            scanner.nextLine();
        } catch (Exception e) {
            System.out.println("Error " + e);
            return;
        }
        

        // Puntua1es
        int[] puntajes = new int[3];
        puntajes[1] = 0;
        puntajes[2] = 0;

        int jugadorActual = 1;

        for (int turno = 0; turno < turnos; turno++) {

            if (turno % 2 == 1) {
                jugadorActual = 2;
            }
            else{
                jugadorActual = 1;
            }


            System.out.println("El puntaje actual es:");
            System.out.println(jugador1 + ": " + puntajes[1]);
            System.out.println(jugador2 + ": " + puntajes[2]);

            String tiro = "";
            String movimiento = "";

            try {
                System.out.println("Jugador " + jugadorActual + ", ¿qué tipo de tiro quieres hacer? (salto largo, salto corto o tiro libre) ");
                tiro = scanner.next();

                System.out.println("Jugador " + jugadorActual + ", ¿qué tipo de movimiento de defensa quieres hacer? (cuerpo a cuerpo o fuerte) ");
                scanner.nextLine();
                movimiento = scanner.next();
                
            } catch (Exception e) {
                 System.out.println("Error : " + e);
                 return;
            }
            

            Double probabilidadDeAnotar = 0.0;

            if (tiro.equals("salto largo")) {
                probabilidadDeAnotar = 0.65;
            } else if (tiro.equals("salto corto")) {
                probabilidadDeAnotar = 0.80;
            } else {
                probabilidadDeAnotar = 0.90;
            }

            Double probabilidadDeFalta;
            
            if (movimiento.equals("cuerpo a cuerpo")) {
                probabilidadDeAnotar -= 0.15;
                probabilidadDeFalta = 0.35;
            } else if (movimiento.equals("fuerte")) {
                probabilidadDeAnotar -= 0.30;
                probabilidadDeFalta = 0.65;
            }

            if (Math.random() <= probabilidadDeAnotar) {
                System.out.println("¡Anotaste!");
                if (tiro.equals("salto largo")) {
                    puntajes[jugadorActual] += 3;
                } else if (tiro.equals("salto corto")) {
                    puntajes[jugadorActual] += 2;
                } else {
                    puntajes[jugadorActual] += 1;
                }
            } else {
                System.out.println("¡Fallaste!");
                if (movimiento.equals("cuerpo a cuerpo")) {
                    puntajes[jugadorActual] -= 1;
                } else {
                    puntajes[jugadorActual] -= 2;
                }
            }

        int ganador = jugadorActual;
        if (puntajes[jugadorActual] > puntajes[(jugadorActual + 1)]) {
            ganador = jugadorActual;
        } else {
            ganador = ganador + 1;
        }

        System.out.println("¡El ganador es elJugador : " + ganador + "!");
        
    }


    }


       

}
