import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class AssignmentthreeWin {
    public static void main(String[] args) throws Exception {
        
        Interface fInterface = new Interface();
        boolean start = false;
        boolean endQuiz = false;
        File txtName;
        String username = null;
        long timelimit;
        int questlimit=0;
        

        while(endQuiz!=true){
            if(start){
                txtName = fInterface.getFile();
                username = fInterface.getUserName();
                timelimit = fInterface.getTimeLimit();
                questlimit = fInterface.getQuesionLimit();
                QuizLogic qLogic = new QuizLogic(txtName, questlimit, timelimit, username);
                String userResults = qLogic.getPlayerResults();

                File logFile = new File(".LogFile.txt");
                try{
                    logFile.createNewFile();
                }catch (IOException e){
                    e.printStackTrace();
                }

                encrypter test = new encrypter();
                test.decrypt(logFile, "cats");
                try{
                    Files.write(Paths.get(".LogFile.txt"),userResults.getBytes(),StandardOpenOption.APPEND);
                } catch(IOException e){
                    e.printStackTrace();
                }
                test.encrypt(logFile, "cats");
                endQuiz = true;

            }
            start = fInterface.startQuiz();
        }


        
    }
    
}
