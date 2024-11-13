import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
        String opcionJugador1 = scanner.nextLine();

        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
        String opcionJugador2 = scanner.nextLine();

        if (opcionJugador1.equals(opcionJugador2)) {
            System.out.println("Empate");
        } else {
            int puntosJugador1 = 0;
            int puntosJugador2 = 0;

            switch(opcionJugador1) {
                case "piedra":
                    if (opcionJugador2.equals("tijeras")) {
                        puntosJugador1 = 1;
                    }
                    if (opcionJugador2.equals("papel")) {
                        puntosJugador2 = 1;
                    }
                    break;
                case "papel":
                    if (opcionJugador2.equals("piedra")) {
                        puntosJugador1 = 1;
                    }
                    if (opcionJugador2.equals("tijera")) {
                        puntosJugador2 = 1;
                    }
                    break;
                case "tijera":
                    if (opcionJugador2.equals("papel")) {
                        puntosJugador1 = 1;
                    }
                    if (opcionJugador2.equals("piedra")) {
                        puntosJugador2 = 1;
                    }
                    break;

            }
            if (puntosJugador1 > puntosJugador2) {
                System.out.println("Gana el jugador uno");
            } else {
                System.out.println("Gana el jugador dos");
            }
        }

    }
}



