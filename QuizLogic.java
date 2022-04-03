import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class QuizLogic {

    static String playerResults;


    QuizLogic(File txtName, int questionsToAsk, Long timeLimit, String userName)throws FileNotFoundException{

        //Scanner scan = new Scanner(System.in);
        AnswerLocator aLocator = new AnswerLocator(txtName);
        QuestionLocator qLocator = new QuestionLocator(txtName);
        int qCount = qLocator.getQuestionCount();


        //************Question place lis*******************/
        // creates list with values 1 to number of questions then shuffles it.
        // This is used to pull random questions.
        ArrayList<Integer> list = new ArrayList<Integer>(qCount);
        for(int i = 1; i <= qCount; i++) {
            list.add(i);
        }
        Collections.shuffle(list);
        ListIterator<Integer> iterator = list.listIterator();

        long startTime = System.currentTimeMillis();
        long endTime = 0;
        long time = 0;
        timeLimit = timeLimit==0 ? null:timeLimit;
        timeLimit = timeLimit!=null ? timeLimit*1000:null; //converts sec to milisec if timeLimit is not null.

        int count = questionsToAsk !=0 ? questionsToAsk:qCount;

        QuizInterface qInterface = new QuizInterface();

        boolean nextQuestion = false;

        QuestionReader qReader;
        AnswerReader aReader;
        int solution = 0;
        int numberOfChoices =0;

        

        for(int j=0; j<count;j++){
            if(timeLimit==null || time<timeLimit){
                int place = iterator.next();
                qReader = new QuestionReader(txtName, qLocator.getQuestionLocation(place));
                aReader = new AnswerReader(txtName, aLocator.getAnswerLocation(place));
                solution = aReader.getSolution();
                numberOfChoices = aReader.getNumberofChoices();
                qInterface.updateInterface(qReader.getQuestion(), aReader.getChoices(), solution, numberOfChoices);
                while(nextQuestion!=true){
                    endTime = System.currentTimeMillis();
                    time = endTime - startTime;
                    qInterface.statsUpdate(time/1000);
                    nextQuestion = qInterface.nextQuestion(); 
                    if(timeLimit!=null && time>timeLimit){
                        nextQuestion=true;
                    }     
                }

            }
            nextQuestion =false;
        }
        qInterface.endGame(time/1000);
    

    playerResults = qInterface.playResults(userName, time/100);

    }

    public String getPlayerResults(){
        return playerResults;
    }


    
}
