import java.util.Scanner;


public class GameMenu {
    public static void showMenu(){
        System.out.println("----------------------------------------------------------------------");
        System.out.println("-------------------Bienvenido a la trivia Sofka-----------------------");
        System.out.println("El juego tiene 5 rondas, en las cuales la dificultad de las preguntas irá en\n " +
                            "aumento. Por cada pregunta acertada ganara $100. Para reclamar el premio \n" +
                            "deberá pasar las 5 rondas, sin embargo antes de cada ronda tendrá la oportunidad \n" +
                            "de retirarse con el premio hasta el momento obtenido, pero si decide continuar \n" +
                            "y responde incorrectamente perdera el premio y su nombre y puntaje se guardara \n" +
                            "en la sección de participantes. \n");

        System.out.println("Digite la opción desada:");
        selectionMenu();

        System.out.println("----------------------------------------------------------------------");
        System.out.println("----------------------------------------------------------------------");
    }

    public static void selectionMenu(){
        int response = 0;

        do {
            try {
                System.out.println("1. Jugar");
                System.out.println("2. Sección de jugadores");

                Scanner sc = new Scanner(System.in);
                response = Integer.valueOf(sc.nextLine());

                switch (response) {
                    case 1:
                        System.out.println("Iniciando juego......");
                        response = 0;
                        System.out.println("----------------------------------------------------------------------");
                        Round.startRound();
                        break;

                    case 2:
                        System.out.println("Carganado sección de jugadores......");
                        response = 0;
                        System.out.println("----------------------------------------------------------------------");
                        break;
                }
            }
            catch (Exception e){
                System.out.println("Por favor seleccione una opción valida");
                selectionMenu();
            }
        } while (response != 0);
    }

}
