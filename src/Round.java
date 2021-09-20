import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Round {
    static Random random = new Random();
    static int ronda = 1;
    static int premio = 0;
    static String optionSelected;
    static boolean correctAnswer;

    public Round() {
    }

    public static void startRound() {
        int randomNumber = random.nextInt(5);
        System.out.println("----------------------------------------------------------------------");
        System.out.println("-----> Ronda " + ronda);
        System.out.println("-----> Premio $ " + premio);
        System.out.println("----------------------------------------------------------------------");
        Questions.randomQuestion(ronda, randomNumber);
        System.out.println("----------------------------------------------------------------------");
        System.out.println("----->Ingrese la opción adecuada: ");
        answerSelectionMenu(randomNumber);

    }

    public static void answerSelectionMenu(int randomNumberQuestion) {
        boolean enJuego = true;


                            /*
                            This block of code was used to create the logic of the round
                            while(enJuego == true){
                                Scanner input = new Scanner(System.in);
                                optionSelected = input.nextLine().toUpperCase(Locale.ROOT);
                                boolean correctOrIncorrect = Questions.checkAnswer(optionSelected, ronda, randomNumberQuestion);
                                if(correctOrIncorrect == true){
                                    System.out.println("¡Felicitaciones! Escogio la respuesta correcta");
                                    ronda++;
                                    premio += 100;
                                    startRound();
                                }else{
                                    System.out.println("¡Perdiste! La respuesta es incorrecta. ");
                                    enJuego = false;
                                }
                            }
*/


        while (enJuego == true) {
            try {//to check if the value is valid
                Scanner input = new Scanner(System.in);
                optionSelected = input.nextLine().toUpperCase(Locale.ROOT);
                switch (optionSelected) {
                    case "A":
                        boolean correctOrIncorrect = Questions.checkAnswer(optionSelected, ronda, randomNumberQuestion);//The function checks if the answer was correct
                        ifTrueStartANewRound(correctOrIncorrect);

                    case "B":
                        boolean correctOrIncorrectB = Questions.checkAnswer(optionSelected, ronda, randomNumberQuestion);//The function checks if the answer was correct
                        ifTrueStartANewRound(correctOrIncorrectB);

                    case "C":
                        boolean correctOrIncorrectC = Questions.checkAnswer(optionSelected, ronda, randomNumberQuestion);//The function checks if the answer was correct
                        ifTrueStartANewRound(correctOrIncorrectC);

                    case "D":
                        boolean correctOrIncorrectD = Questions.checkAnswer(optionSelected, ronda, randomNumberQuestion);//The function checks if the answer was correct
                        ifTrueStartANewRound(correctOrIncorrectD);

                }
            } catch (Exception e) {
                System.out.println("Opción incorrecta. Por favor digite A,B,C o D para ingresar su respuesta: ");
                answerSelectionMenu(randomNumberQuestion);
            } finally {
                System.out.println("Opción incorrecta. Por favor digite A,B,C o D para ingresar su respuesta: ");
                answerSelectionMenu(randomNumberQuestion);
            }


        }
    }//End of the answerSelection function

    public static void ifTrueStartANewRound(boolean b){
        if (b == true) {//if true starts a new round
            System.out.println("----------------------------------------------------------------------");
            System.out.println("¡Felicitaciones! Escogio la respuesta correcta");
            System.out.println("----------------------------------------------------------------------");
            continueGame();

        } else {
            System.out.println("¡Perdiste! La respuesta es incorrecta. ");
            premio = 0;
            loseWindow();
        }
    }

    public static void continueGame(){

        try{
            System.out.println("¿Desea continuar jugando?");
            System.out.println("Recuerde que si se retira ahora podra conservar el premio. ");
            System.out.println("Digite S para seguir jugando o R para retirarse: ");
            Scanner input = new Scanner(System.in);
            optionSelected = input.nextLine().toUpperCase(Locale.ROOT);

            switch (optionSelected){
                case "S":
                    ronda++;
                    premio += 100;
                    startRound();
                case "R":
                    premio += 100;
                    loseWindow();
            }

        } catch (Exception e) {
            System.out.println("Opción incorrecta. Por favor digite S para seguir jugando o R para retirarse. ");
            continueGame();
        } finally {
            System.out.println("Opción incorrecta. Por favor digite S para seguir jugando o R para retirarse. ");
            continueGame();
        }
    }

    public static void loseWindow(){


            System.out.println("----------------------------------------------------------------------");
            System.out.println("Fin del juego. \n Por favor ingrese su nombre para guardar su puntaje en la sección de participantes. ");
            Scanner input = new Scanner(System.in);
            String name = input.nextLine();
            System.out.println("----------------------------------------------------------------------");
            System.out.println("----->Su nombre es " + name + " y su premio es $" + premio );
            System.out.println("----------------------------------------------------------------------");
            System.out.println("Presione la tecla H para volver al menú principal. ");
            gameMenuLoseWindowSelecction();

    }

    public static void gameMenuLoseWindowSelecction(){
        try{
            Scanner input = new Scanner(System.in);
            String menu = input.nextLine().toUpperCase(Locale.ROOT);
            String menuOption = "H";
            Boolean optionMenu = menu.equals(menuOption);
            if(optionMenu){
                GameMenu.showMenu();
            }else{
                System.out.println("Opción incorrecta. Por favor digite H para volver al menú principal. ");
                gameMenuLoseWindowSelecction();
            }

        } catch (Exception e) {
            System.out.println("Opción incorrecta. Por favor digite H para volver al menú principal. ");
            gameMenuLoseWindowSelecction();
        } finally {
            System.out.println("Opción incorrecta. Por favor digite H para volver al menú principal.  ");
            gameMenuLoseWindowSelecction();
        }
    }
}
