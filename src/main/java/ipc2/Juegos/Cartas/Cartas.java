package ipc2.Juegos.Cartas;

import java.util.Random;
import java.util.Scanner;

import ipc2.Menus.Menu;

public class Cartas {
    public static class ApostarEntreCartasGame {
        private static int dinero_inicial ; // El valor lo ajusta el jugador desde main
        private static final int Valor_maximo_carta = 13; // El valor más alto de las cartas en la baraja

        private int Dinero_total_jugador;
        private Random random;
        private Scanner scanner;

        public void dinero(int dinero){
            dinero_inicial = dinero;
        }
        public ApostarEntreCartasGame() {
            //playerMoney = dinero_inicial;
            random = new Random();
            scanner = new Scanner(System.in);
        }

        private int obtenerCarta(int numeroCarta) {
            // Asegurarse de que el valor de la carta esté entre 1 y 13
            //en el retur nos devuelve el residuo entre el valor max y numero de carta +1
            return (numeroCarta % Valor_maximo_carta) + 1;
        }
        //obtenemos el valor aleatorio de la carta
        private int obtenerRsmdonCarta() {
            return random.nextInt(Valor_maximo_carta) + 1;
        }

        private void verCartaCasino(int card1, int card2) {
            System.out.println("Carta 1: " + obtenerCarta(card1));
            System.out.println("Carta 2: " + obtenerCarta(card2));
        }

        private boolean arbitro(int card1, int card2, int card3) {
            int value1 = obtenerCarta(card1);
            int value2 = obtenerCarta(card2);
            int value3 = obtenerCarta(card3);
            // devuelve
            return ((value3 > value1 && value3 < value2) || (value3 < value1 && value3 >value2));
        }

        private void playTurn() {
            System.out.println("Dinero actual: $" + Dinero_total_jugador);

            int card1 = obtenerRsmdonCarta();
            int card2 = obtenerRsmdonCarta();

            verCartaCasino(card1, card2);

            System.out.println("¿Cuánto dinero desea apostar? (0 para salir):");
            int betAmount = scanner.nextInt();

            if (betAmount == 0) {
                System.out.println("¡Gracias por jugar!");
                Dinero_total_jugador = 0; // Terminar el juego
                return;
            }

            if (betAmount > Dinero_total_jugador) {
                System.out.println("No tienes suficiente dinero para apostar esa cantidad.");
                return;
            }

            int card3 = obtenerRsmdonCarta();
            System.out.println("Carta 3: " + obtenerCarta(card3));

            if (arbitro(card1, card2, card3)) {
                System.out.println("¡Ganaste! Ganaste $" + betAmount + ".");
                Dinero_total_jugador += betAmount;
            } else {
                System.out.println("¡Perdiste! Perdiste $" + betAmount + ".");
                Dinero_total_jugador -= betAmount;
            }
        }

        //comienza el juegocondition
        public void startGame(int dinero) {
            Dinero_total_jugador = dinero;
            System.out.println("¡Bienvenido a Apostar entre Cartas!");

            while (Dinero_total_jugador > 0) {
                playTurn();
            }

            System.out.println("Te has quedado sin dinero. ¡Gracias por jugar!");

            System.out.println("");
            System.out.println("*********************");
            System.out.println("*      Perdiste     *");
            System.out.println("*********************");
            try {
            scanner.nextLine();
                Menu.menuFinal(3);
            } catch (Exception e) {
                System.out.println("Ingrese valores correctos ");
            scanner.nextLine();
                Menu.menuFinal(3);
            }
        }


    }
}
