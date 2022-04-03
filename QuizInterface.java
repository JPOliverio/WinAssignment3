
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SpringLayout;
import javax.swing.plaf.DimensionUIResource;
import java.awt.Container;
import java.awt.event.*;
import java.awt.Color;

public class QuizInterface {
    /**This class is the use interface for the quiz controller
 * It keeps track of how many questions where asked and
 * how many questions the user gets right. It only needs time to be entered using the
 * updateInterface method.
 */

    JFrame frame;
    JTextArea textArea;
    int solutionKey;
    JLabel qOneText, qTwoText, qThreeText, qFourText, qFiveText,
    qSixText, qSevenText, qEightText, qNineText, qTenText, statsText;
    Container contentPane;
    int buttonClicked;
    boolean alreadyHit =false;
    boolean nextButtonHit = false;
    double correctA;
    double qCount = 1;
    JButton buttonNext;


    QuizInterface(){
        correctA=0;
        
        
        frame = new JFrame("Interactive Quiz");
        frame.setSize(550,700);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        textArea = new JTextArea();
        JScrollPane paneTextArea = new JScrollPane(textArea);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        contentPane = frame.getContentPane();
        SpringLayout layout = new SpringLayout();
        contentPane.setLayout(layout);

        paneTextArea.setPreferredSize(new DimensionUIResource(500,100));
        contentPane.add(paneTextArea);


        //**************Buttons and Label for question choices****************** */
        JButton buttonOne = new JButton();
        contentPane.add(buttonOne); 
        qOneText = new JLabel(" lets go mounitan mamas i like to eat giant gnats");
        contentPane.add(qOneText);

        JButton buttonTwo = new JButton();
        contentPane.add(buttonTwo);
        qTwoText = new JLabel(" question two");
        contentPane.add(qTwoText);

        JButton buttonThree = new JButton();
        contentPane.add(buttonThree);
        qThreeText = new JLabel(" question Three");
        contentPane.add(qThreeText);

        JButton buttonFour = new JButton();
        contentPane.add(buttonFour);
        qFourText = new JLabel(" question Four");
        contentPane.add(qFourText);

        JButton buttonFive = new JButton();
        contentPane.add(buttonFive);
        qFiveText = new JLabel(" question Five");
        contentPane.add(qFiveText);

        JButton buttonSix = new JButton();
        contentPane.add(buttonSix);
        qSixText = new JLabel(" question Six");
        contentPane.add(qSixText);

        JButton buttonSeven = new JButton();
        contentPane.add(buttonSeven);
        qSevenText = new JLabel(" question Seven");
        contentPane.add(qSevenText);

        JButton buttonEight = new JButton();
        contentPane.add(buttonEight);
        qEightText = new JLabel(" question Eight");
        contentPane.add(qEightText);

        JButton buttonNine = new JButton();
        contentPane.add(buttonNine);
        qNineText = new JLabel(" question Nine");
        contentPane.add(qNineText);

        JButton buttonTen = new JButton();
        contentPane.add(buttonTen);
        qTenText = new JLabel(" question Ten");
        contentPane.add(qTenText);
        //***************************************************** */

        //************Btton for next Question****************** */
        buttonNext = new JButton("Next Question");
        contentPane.add(buttonNext);
        //***************************************************** */

        //***************Stats text display******************** */
        statsText = new JLabel(" question Ten");
        contentPane.add(statsText);
        //***************************************************** */


        //*****************Button Action Listner************** */
        buttonOne.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(alreadyHit==false){buttonClicked=1;
                    alreadyHit=true;
                if(solutionKey==1){
                    frame.getContentPane().setBackground(Color.GREEN);
                    correctA++;
                    }else{frame.getContentPane().setBackground(Color.RED);
                }
            }
            }
         });

         buttonTwo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(alreadyHit==false){buttonClicked=2;
                    alreadyHit=true;
                if(solutionKey==2){
                    frame.getContentPane().setBackground(Color.GREEN);
                    correctA++;
                }else{frame.getContentPane().setBackground(Color.RED);
                }
            }
            }
         });

         buttonThree.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(alreadyHit==false){buttonClicked=3;
                    alreadyHit=true;
                if(solutionKey==3){
                    frame.getContentPane().setBackground(Color.GREEN);
                    correctA++;
                }else{frame.getContentPane().setBackground(Color.RED);
                }
            }
            }
         });

         buttonFour.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(alreadyHit==false){buttonClicked=4;
                    alreadyHit=true;
                if(solutionKey==4){
                    frame.getContentPane().setBackground(Color.GREEN);
                    correctA++;
                }else{frame.getContentPane().setBackground(Color.RED);
                }
            }
            }
         });

         buttonFive.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(alreadyHit==false){buttonClicked=5;
                    alreadyHit=true;
                if(solutionKey==5){
                    frame.getContentPane().setBackground(Color.GREEN);
                    correctA++;
                }else{frame.getContentPane().setBackground(Color.RED);
                }
            }
            }
         });

         buttonSix.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(alreadyHit==false){buttonClicked=6;
                    alreadyHit=true;
                if(solutionKey==6){
                    frame.getContentPane().setBackground(Color.GREEN);
                    correctA++;
                }else{frame.getContentPane().setBackground(Color.RED);
                }
            }
            }
         });

         buttonSeven.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(alreadyHit==false){buttonClicked=7;
                    alreadyHit=true;
                if(solutionKey==7){
                    frame.getContentPane().setBackground(Color.GREEN);
                    correctA++;
                }else{frame.getContentPane().setBackground(Color.RED);
                }
            }
            }
         });

         buttonEight.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(alreadyHit==false){buttonClicked=8;
                    alreadyHit=true;
                if(solutionKey==8){
                    frame.getContentPane().setBackground(Color.GREEN);
                    correctA++;
                }else{frame.getContentPane().setBackground(Color.RED);
                }
            }
            }
         });

         buttonNine.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(alreadyHit==false){buttonClicked=9;
                    alreadyHit=true;
                if(solutionKey==9){
                    frame.getContentPane().setBackground(Color.GREEN);
                    correctA++;
                }else{frame.getContentPane().setBackground(Color.RED);
                }
            }
            }
         });

         buttonTen.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(alreadyHit==false){buttonClicked=10;
                    alreadyHit=true;
                if(solutionKey==10){
                    frame.getContentPane().setBackground(Color.GREEN);
                    correctA++;
                }else{frame.getContentPane().setBackground(Color.RED);
                }
            }
            }
         });
         //*****************************************************/

         //***************** NextButton Action *****************/
         buttonNext.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                buttonNext.setVisible(false); // have to hide button to prevent bug cause by user clicking to fast
                nextButtonHit = true;
                qCount++;
            }
         });
        //******************************************************/



        //******************Setting Layout**********************/
        layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, paneTextArea, 0, SpringLayout.HORIZONTAL_CENTER, contentPane);

        layout.putConstraint(SpringLayout.WEST, buttonOne, 15, SpringLayout.WEST, contentPane);
        layout.putConstraint(SpringLayout.NORTH, buttonOne, 10, SpringLayout.SOUTH, paneTextArea);
        layout.putConstraint(SpringLayout.WEST, qOneText, 15, SpringLayout.EAST, buttonOne);
        layout.putConstraint(SpringLayout.NORTH, qOneText, 5, SpringLayout.NORTH, buttonOne);

        layout.putConstraint(SpringLayout.WEST, buttonTwo, 15, SpringLayout.WEST, contentPane);
        layout.putConstraint(SpringLayout.NORTH, buttonTwo, 10, SpringLayout.SOUTH, buttonOne);
        layout.putConstraint(SpringLayout.WEST, qTwoText, 15, SpringLayout.EAST, buttonTwo);
        layout.putConstraint(SpringLayout.NORTH, qTwoText, 5, SpringLayout.NORTH, buttonTwo);

        layout.putConstraint(SpringLayout.WEST, buttonThree, 15, SpringLayout.WEST, contentPane);
        layout.putConstraint(SpringLayout.NORTH, buttonThree, 10, SpringLayout.SOUTH, buttonTwo);
        layout.putConstraint(SpringLayout.WEST, qThreeText, 15, SpringLayout.EAST, buttonThree);
        layout.putConstraint(SpringLayout.NORTH, qThreeText, 5, SpringLayout.NORTH, buttonThree);

        layout.putConstraint(SpringLayout.WEST, buttonFour, 15, SpringLayout.WEST, contentPane);
        layout.putConstraint(SpringLayout.NORTH, buttonFour, 10, SpringLayout.SOUTH, buttonThree);
        layout.putConstraint(SpringLayout.WEST, qFourText, 15, SpringLayout.EAST, buttonFour);
        layout.putConstraint(SpringLayout.NORTH, qFourText, 5, SpringLayout.NORTH, buttonFour);

        layout.putConstraint(SpringLayout.WEST, buttonFive, 15, SpringLayout.WEST, contentPane);
        layout.putConstraint(SpringLayout.NORTH, buttonFive, 10, SpringLayout.SOUTH, buttonFour);
        layout.putConstraint(SpringLayout.WEST, qFiveText, 15, SpringLayout.EAST, buttonFive);
        layout.putConstraint(SpringLayout.NORTH, qFiveText, 5, SpringLayout.NORTH, buttonFive);

        layout.putConstraint(SpringLayout.WEST, buttonSix, 15, SpringLayout.WEST, contentPane);
        layout.putConstraint(SpringLayout.NORTH, buttonSix, 10, SpringLayout.SOUTH, buttonFive);
        layout.putConstraint(SpringLayout.WEST, qSixText, 15, SpringLayout.EAST, buttonSix);
        layout.putConstraint(SpringLayout.NORTH, qSixText, 5, SpringLayout.NORTH, buttonSix);

        layout.putConstraint(SpringLayout.WEST, buttonSeven, 15, SpringLayout.WEST, contentPane);
        layout.putConstraint(SpringLayout.NORTH, buttonSeven, 10, SpringLayout.SOUTH, buttonSix);
        layout.putConstraint(SpringLayout.WEST, qSevenText, 15, SpringLayout.EAST, buttonSeven);
        layout.putConstraint(SpringLayout.NORTH, qSevenText, 5, SpringLayout.NORTH, buttonSeven);

        layout.putConstraint(SpringLayout.WEST, buttonEight, 15, SpringLayout.WEST, contentPane);
        layout.putConstraint(SpringLayout.NORTH, buttonEight, 10, SpringLayout.SOUTH, buttonSeven);
        layout.putConstraint(SpringLayout.WEST, qEightText, 15, SpringLayout.EAST, buttonEight);
        layout.putConstraint(SpringLayout.NORTH, qEightText, 5, SpringLayout.NORTH, buttonEight);

        layout.putConstraint(SpringLayout.WEST, buttonNine, 15, SpringLayout.WEST, contentPane);
        layout.putConstraint(SpringLayout.NORTH, buttonNine, 10, SpringLayout.SOUTH, buttonEight);
        layout.putConstraint(SpringLayout.WEST, qNineText, 15, SpringLayout.EAST, buttonNine);
        layout.putConstraint(SpringLayout.NORTH, qNineText, 5, SpringLayout.NORTH, buttonNine);

        layout.putConstraint(SpringLayout.WEST, buttonTen, 15, SpringLayout.WEST, contentPane);
        layout.putConstraint(SpringLayout.NORTH, buttonTen, 10, SpringLayout.SOUTH, buttonNine);
        layout.putConstraint(SpringLayout.WEST, qTenText, 15, SpringLayout.EAST, buttonTen);
        layout.putConstraint(SpringLayout.NORTH, qTenText, 5, SpringLayout.NORTH, buttonTen);

        layout.putConstraint(SpringLayout.EAST, buttonNext, 0, SpringLayout.EAST, contentPane);
        layout.putConstraint(SpringLayout.SOUTH, buttonNext, 0, SpringLayout.SOUTH, contentPane);

        layout.putConstraint(SpringLayout.WEST, statsText, 0, SpringLayout.WEST, contentPane);
        layout.putConstraint(SpringLayout.SOUTH, statsText, 0, SpringLayout.SOUTH, contentPane);
        //****************************************** */

        frame.setVisible(true);

    }

// this method updates the interface with the new question
    public synchronized void updateInterface(String question, String[] choices, int solution, int numberOfChoices){
        frame.getContentPane().setBackground(Color.WHITE);
        nextButtonHit = false;
        alreadyHit=false;
        //frame.setVisible(false);
        solutionKey = solution;

        // this section updaes the question
        textArea.setText(question);

        // this section resets the text labels
        qOneText.setText((choices[0]!=null ? choices[0]:" "));
        qTwoText.setText((choices[1]!=null ? choices[1]:" "));
        qThreeText.setText((choices[2]!=null ? choices[2]:" "));
        qFourText.setText((choices[3]!=null ? choices[3]:" "));
        qFiveText.setText((choices[4]!=null ? choices[4]:" "));
        qSixText.setText((choices[5]!=null ? choices[5]:" "));
        qSevenText.setText((choices[6]!=null ? choices[6]:" "));
        qEightText.setText((choices[7]!=null ? choices[7]:" "));
        qNineText.setText((choices[8]!=null ? choices[8]:" "));
        qTenText.setText((choices[9]!=null ? choices[9]:" "));
        buttonNext.setVisible(true);
    }


    // this method updates the player stats
    public synchronized void statsUpdate(long time){
        nextButtonHit = false;
        double percent;
        if(alreadyHit){
            percent = (correctA/qCount)*100;
            statsText.setText("Correct:"+correctA+" Percent_Correct" +percent+"%"+" time:"+time);
            buttonNext.setVisible(true);
        }else{
            percent = (correctA/(qCount-1))*100;
            statsText.setText("Correct:"+correctA+" Percent_Correct" +percent+"%"+" time:"+time);
            buttonNext.setVisible(true);
        }

    }


    //this method ends the game and displayes the final stats
    public void endGame(long time){
        qCount--;
        frame.setVisible(false);
        frame.dispose();
        JFrame endFrame = new JFrame("Interactive Quiz");
        endFrame.setSize(550,700);
        endFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel endLabel = new JLabel();
        endLabel.setText("Number of Question:"+qCount +" Correct:"+correctA+" Percent_Correct" +(correctA/qCount)*100+"%"+" time:"+time);
        endFrame.add(endLabel);
        endFrame.setVisible(true);
    }


    public synchronized Boolean nextQuestion(){
        return nextButtonHit;
    }

    public synchronized String playResults(String username, long time){
        double totalQuestions = qCount;


        String playerResults = "\n"+
        "*******************Quiz Statistics****************\n"+
        username +"\n"+
        "play time: "+time+" secounds\n"+
        "Questions Answerd: "+totalQuestions+"\n"+
        "Questions Answerd correctly: "+correctA+"\n"+
        "Precent correct: "+(correctA/qCount)*100+"%\n"+
        "**************************************************";

        return playerResults;

    }





    
}

    

