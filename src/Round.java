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
        System.out.println("-----> Ronda "+ronda);
        System.out.println("-----> Premio "+premio);
        Questions.randomQuestion(ronda,randomNumber);
        System.out.println("----->Ingrese la opción adecuada: ");
        answerSelectionMenu(randomNumber);

    }
    public static void answerSelectionMenu(int randomNumberQuestion){

        do {
            try {//to check if the value is valid
                Scanner input = new Scanner(System.in);
                optionSelected = input.nextLine().toUpperCase(Locale.ROOT);
                switch (optionSelected) {
                    case "A":
                        boolean correctOrIncorrect = Questions.checkAnswer(optionSelected,ronda,randomNumberQuestion);//The function checks if the answer was correct
                        if(correctOrIncorrect == true){//if true starts a new round
                            System.out.println("¡Felicitaciones! Escogio la respuesta correcta");
                            ronda++;
                            premio +=100;
                            startRound();
                        }else{
                            System.out.println("¡Perdiste! La respuesta es incorrecta. ");
                        }

                    case "B":
                        if(correctOrIncorrect == true){//if true starts a new round
                            System.out.println("¡Felicitaciones! Escogio la respuesta correcta");
                            ronda++;
                            premio +=100;
                            startRound();
                        }

                    case "C":
                        if(correctOrIncorrect == true){//if true starts a new round
                            System.out.println("¡Felicitaciones! Escogio la respuesta correcta");
                            ronda++;
                            premio +=100;
                            startRound();
                        }

                    case "D":
                        if(correctOrIncorrect == true){//if true starts a new round
                            System.out.println("¡Felicitaciones! Escogio la respuesta correcta");
                            ronda++;
                            premio +=100;
                            startRound();
                        }

                }
            }catch (Exception e){
                System.out.println("Opción incorrecta. Por favor digite A,B,C o D para ingresar su respuesta: ");
                answerSelectionMenu(randomNumberQuestion);
            }finally {
                System.out.println("Opción incorrecta. Por favor digite A,B,C o D para ingresar su respuesta: ");
                answerSelectionMenu(randomNumberQuestion);
            }
        }while (optionSelected != "NICOLAS");

    }
}
