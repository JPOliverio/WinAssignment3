import java.awt.Container;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SpringLayout;
import javax.swing.border.Border;
import java.awt.event.*;
import java.io.File;
import java.awt.Color;

public class Interface {
    File txtName;
    String username = null;
    Boolean quizStart = false;
    long timelimit=0;
    int questlimit=0;
    String password;

    JPanel uFPanel;

    Interface(){
        JFrame frame;
    

        frame = new JFrame("Interactive Quiz");
        frame.setSize(550,700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = frame.getContentPane();
        SpringLayout layout = new SpringLayout();
        contentPane.setLayout(layout);
        JButton buttonOne = new JButton("Load quiz file");
        contentPane.add(buttonOne); 
        JLabel qLabel= new JLabel("No file selected");
        JPanel qFile = new JPanel();
        Border blackline = BorderFactory.createLineBorder(Color.black);
        qFile.setBorder(blackline);
        qFile.add(qLabel);
        contentPane.add(qFile);

        JLabel uLabel = new JLabel("User name:");
        JPanel uPanel = new JPanel();
        uPanel.add(uLabel);
        contentPane.add(uPanel);
        JTextArea uField = new JTextArea();
        uField.setPreferredSize(new Dimension(100, 20));
        JPanel uFPanel = new JPanel();
        uFPanel.setBorder(blackline);
        uFPanel.add(uField);
        contentPane.add(uFPanel);

      
        JLabel timeLabel = new JLabel("Time Limit (seounds):");
        JPanel timePanel = new JPanel();
        timePanel.add(timeLabel);
        contentPane.add(timePanel);
        JTextArea tField = new JTextArea();
        tField.setPreferredSize(new Dimension(100, 20));
        JPanel tFPanel = new JPanel();
        tFPanel.setBorder(blackline);
        tFPanel.add(tField);
        contentPane.add(tFPanel);
        JLabel timeInsLabel = new JLabel("use 0 for no time limit or leave blank");
        JPanel timeInsPanel = new JPanel();
        timeInsPanel.add(timeInsLabel);
        contentPane.add(timeInsPanel);

        JLabel qLimitLabel = new JLabel("Question Limit:");
        JPanel qLimitPanel = new JPanel();
        qLimitPanel.add(qLimitLabel);
        contentPane.add(qLimitPanel);
        JTextArea qField = new JTextArea();
        qField.setPreferredSize(new Dimension(100, 20));
        JPanel qFPanel = new JPanel();
        qFPanel.setBorder(blackline);
        qFPanel.add(qField);
        contentPane.add(qFPanel);
        JLabel questInsLabel = new JLabel("use 0 for no question limit or leave blank");
        JPanel questInsPanel = new JPanel();
        questInsPanel.add(questInsLabel);
        contentPane.add(questInsPanel);

        JButton startButton = new JButton("Start Quiz!");
        startButton.setPreferredSize(new Dimension(100, 40));
        contentPane.add(startButton);


        JButton buttonFour = new JButton("View LogFile");
        contentPane.add(buttonFour);
        JLabel pLabel = new JLabel("password:");
        contentPane.add(pLabel);
        JTextArea pField = new JTextArea("cats");
        pField.setPreferredSize(new Dimension(100, 20));
        JPanel pFPanel = new JPanel();
        pFPanel.setBorder(blackline);
        pFPanel.add(pField);
        contentPane.add(pFPanel);

        buttonOne.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FileSelector fs = new FileSelector();
                txtName = fs.getFile();
                qLabel.setText(txtName.getName().replace(".txt", ""));
            }
         });

         startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(txtName!=null){
                    if(!(tField.getText().equals(""))){
                        String timecontents = tField.getText();
                        timecontents.replaceAll("[^0-9]","");
                        timelimit = Long.parseLong(timecontents);
                    }
                    if(!(qField.getText().equals(""))){
                        String questcontents = qField.getText();
                        questcontents.replaceAll("[^0-9]","");
                        questlimit = Integer.parseInt(questcontents);
                    }
                    username = uField.getText().replaceAll(" ","");
                    System.out.println("test"+username);
                    if(username!=null && username.isEmpty()!=true){
                        quizStart = true;
                    }else{
                        uFPanel.setBackground(Color.RED);
                    }
                }else{
                    FileSelector fs = new FileSelector();
                    txtName = fs.getFile();
                    qLabel.setText(txtName.getName().replace(".txt", ""));
                }
            }
         });


         buttonFour.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                password = pField.getText();
                try {
                    new LogInterface(password);
                } catch (Exception e1) {
                    e1.printStackTrace();
                }

            }
         });


         
         layout.putConstraint(SpringLayout.NORTH, buttonOne, 10, SpringLayout.NORTH, contentPane);
         layout.putConstraint(SpringLayout.WEST, buttonOne, 10, SpringLayout.WEST, contentPane);
         layout.putConstraint(SpringLayout.NORTH, qFile, 0, SpringLayout.NORTH, buttonOne);
         layout.putConstraint(SpringLayout.WEST, qFile, 75, SpringLayout.EAST, buttonOne);

         layout.putConstraint(SpringLayout.WEST, uPanel, 15, SpringLayout.WEST, contentPane);
         layout.putConstraint(SpringLayout.NORTH, uPanel, 10, SpringLayout.SOUTH, buttonOne);
         layout.putConstraint(SpringLayout.WEST, uFPanel, 0, SpringLayout.WEST, qFile);
         layout.putConstraint(SpringLayout.NORTH, uFPanel, 0, SpringLayout.NORTH, uPanel);

         layout.putConstraint(SpringLayout.WEST, timePanel, 15, SpringLayout.WEST, contentPane);
         layout.putConstraint(SpringLayout.NORTH, timePanel, 10, SpringLayout.SOUTH, uPanel);
         layout.putConstraint(SpringLayout.WEST, tFPanel, 0, SpringLayout.WEST, qFile);
         layout.putConstraint(SpringLayout.NORTH, tFPanel, 0, SpringLayout.NORTH, timePanel);
         layout.putConstraint(SpringLayout.WEST, timeInsPanel, 0, SpringLayout.EAST, tFPanel);
         layout.putConstraint(SpringLayout.NORTH, timeInsPanel, 0, SpringLayout.NORTH, tFPanel);


         layout.putConstraint(SpringLayout.WEST, qLimitPanel, 15, SpringLayout.WEST, contentPane);
         layout.putConstraint(SpringLayout.NORTH, qLimitPanel, 10, SpringLayout.SOUTH, timePanel);
         layout.putConstraint(SpringLayout.WEST, qFPanel, 0, SpringLayout.WEST, qFile);
         layout.putConstraint(SpringLayout.NORTH, qFPanel, 0, SpringLayout.NORTH, qLimitPanel);
         layout.putConstraint(SpringLayout.WEST, questInsPanel, 0, SpringLayout.EAST, qFPanel);
         layout.putConstraint(SpringLayout.NORTH, questInsPanel, 0, SpringLayout.NORTH, qFPanel);

         layout.putConstraint(SpringLayout.NORTH, startButton, 0, SpringLayout.SOUTH, qFPanel);
         layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, startButton, 0, SpringLayout.HORIZONTAL_CENTER, contentPane);


         layout.putConstraint(SpringLayout.WEST, buttonFour, 15, SpringLayout.WEST, contentPane);
         layout.putConstraint(SpringLayout.NORTH, buttonFour, 100, SpringLayout.SOUTH, timePanel);

         layout.putConstraint(SpringLayout.WEST, pLabel, 15, SpringLayout.WEST, contentPane);
         layout.putConstraint(SpringLayout.NORTH, pLabel, 10, SpringLayout.SOUTH, buttonFour);
         layout.putConstraint(SpringLayout.WEST, pFPanel, 15, SpringLayout.EAST, pLabel);
         layout.putConstraint(SpringLayout.NORTH, pFPanel, 0, SpringLayout.NORTH, pLabel);
         

        frame.setVisible(true);

    }

    public synchronized boolean startQuiz(){
        return quizStart;
    }

    public long getTimeLimit(){
        return timelimit;
    }

    public int getQuesionLimit(){
        return questlimit;
    }

    public File getFile(){
        return txtName;
    }

    public String getUserName(){
        return username;
    }

    
}
