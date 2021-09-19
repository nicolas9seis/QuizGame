import java.lang.Math;
import java.util.Random;


public class Questions {

    Random random = new Random();

    static String[][] PREGUNTAS  = {
                                {"¿Ciudad más poblada mundo?","¿Cuál es la moneda de Estados Unidos?","¿Cómo se llama la Reina del Reino Unido?",
                                        "¿Cuál es la capital de Perú?","¿Cuál es el idioma oficial de Francia?"}, //First round questions

                                {"¿A cuánto equivale el número pi?","¿Qué nombre científico recibe el detector de mentiras?","¿Dónde se encuentra la famosa Casa Blanca?",
                                        "¿Cuál es la lengua más hablada en el mundo?","¿Según la Biblia, quién traicionó a Jesús?"}, //Second round questions

                                {"¿Cuántos dientes tiene una persona adulta?","¿Quién es el autor de Hamlet?","¿Cómo se llama el estadio del F.C. Barcelona?",
                                        "¿Quién creó la pintura mural de La última cena?","¿Cuál fue la primera película de Walt Disney?"}, //Third round questions

                                {"¿En qué país se encuentra el Taj Mahal?","¿Cuál es el lugar más frío de la tierra?","¿Quién escribió ‘El Principito’?",
                                        "¿Cuántas veces parpadea una persona?","¿Cuál es el disco más vendido de la historia?"}, //Fourth round answers

                                {"¿Quién fue la primera mujer en ir al espacio?","¿Cuál es la capital de Kosovo?","¿Cuál es el área del arte protagonista en los premios Goya?",
                                        "¿Cuál es el lago más profundo del mundo?","¿Cuántos años duró la guerra de los 100 años?"}// Fifth round answers
                            };
    static String[][][] RESPUESTAS = {
    {{"A. Tokio","B. Pereira","C. La Paz","D. Paris"},{"A. Euro","B. Dolar Canadiense","C. Bolivar","D. Dolar"},{"A. Marbelle","B. Isabel II","C. Rosemary","D. Piedad"},
            {"A. Lima","B. Yopal","C. Buenos Aires","D. Arequipa"},{"A. Frances","B. Español","C. Turco","D. Arabe"}}, //First round questions

    {{"A. 8,5414","B, 3,1416","C. 4,2511","D. 6,2145"},{"A. Polígrafo","B. Mentirografo","C. Lipografo","D. Lector de pulso electromagnetico"},
            {"A. Boston","B. Toronto","C. New York","D. Washington D.C."},{"A. Chino","B. Ruso","C. Ingles","D. Alemán"},{"A. Mateo","B. Judas","C. Pedro","D. Timoteo"}}, //Second round questions

    {{"A. 35","B. 27","C. 32","D. 29"},{"A. William Shakespeare","B. Ernest Hemingway","C. Edgar Allan Poe","D. Honoré de Balzac"},
            {"A. Vicente Calderon","B. Johan Cruyff","C. Camp Nou","D. Estadi Esportiu Barcelona FC"},{"A. Miguel Angel","B. Leonardo Da Vinci","C. Sandro Botticelli","D. Rafael Sanzio"},
            {"A. Dumbo","B. Pinocho","C. Fantasía","D. Blancanieves y los siete enanitos"}}, //Third round answers

    {{"A. Iran","B. Afganistan ","C. India","D. Pakistan"},{"A. Antartida","B. Polo Norte","C. El corazón de tu ex","D. Polor sur"},{"A. Gustave Flaubert","B. Antoine de Saint-Exupéry","C. Charles Baudelaire","D. Marcel Proust"},
            {"A. 8000000 veces por semana","B. 1120000 por semana","C. 55000 veces por semana","D. 25000 veces por semana"},
            {"A. Thriller- Michael Jackson","B. The Dark Side of the Moon- Pink Floyd","C. El guardaespaldas- Whitney Houston","D. Back in Black- AC/DC"}},//Fourth round answers

    {{"A. Yelena Kondakova","B. Svetlana Savítskaya","C. Valentina Tereshkova","D. Sally Ride"},{"A. Riga","B. Vilna","C. Tallin","D. Pristina"},
            {"A. Películas","B. Pinturas","C. Teatro","D. Danza"},{"A. Issyk-Kul","B. Tanganica","C. Baikal","D. Malawi"},{"A. 98 años","B. 116 Años","C. 102 años","D. 100 años"}}
                             };

    static String[][] SOLUCIONES = {
                                        {"A","D","B","A","A"},
                                        {"B","A","D","A","B"},
                                        {"C","A","C","B","D"},
                                        {"C","A","B","D","A"},
                                        {"C","D","A","C","B"},
                                    };

    public static void randomQuestion(int round, int randomNumber){
        System.out.println(PREGUNTAS[round - 1][randomNumber]);

        //Foor loop to print the set of answers of the random question
        for (int i =0; i <4; i++){
            System.out.println(RESPUESTAS[round-1][randomNumber][i]);
        }
    }

    public static boolean checkAnswer(String optionSelected, int round, int randomNumber){
        if(optionSelected == SOLUCIONES[round][randomNumber]){
            return true;
        }else{
            return false;
        }
    }

}