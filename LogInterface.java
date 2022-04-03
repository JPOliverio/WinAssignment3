import java.awt.Container;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SpringLayout;
import javax.swing.plaf.DimensionUIResource;
import java.lang.StringBuffer;

public class LogInterface {

    LogInterface(String password) throws Exception{
        JFrame logframe = new JFrame("User LogFile");
        logframe.setSize(550,700);
        logframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JTextArea textArea;
        textArea = new JTextArea();
        JScrollPane paneTextArea = new JScrollPane(textArea);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        Container logcontentPane = logframe.getContentPane();
        SpringLayout layout = new SpringLayout();
        logcontentPane.setLayout(layout);
        paneTextArea.setPreferredSize(new DimensionUIResource(500,600));
        logcontentPane.add(paneTextArea);


        File logFile = new File(".LogFile.txt");
        try{
            logFile.createNewFile();
        }catch (IOException e){
            e.printStackTrace();
        }

        encrypter enc = new encrypter();
        enc.decrypt(logFile, password);

        String contents;
        try (BufferedReader br = new BufferedReader(new FileReader(".LogFile.txt"))) {
            StringBuffer buffcontents = new StringBuffer();
            String line;
            while ((line = br.readLine()) != null) {
                buffcontents.append(line).append("\n");
            }
            contents = buffcontents.toString();
        }
        textArea.insert(contents, 0);


        enc.encrypt(logFile,password);



        layout.putConstraint(SpringLayout.NORTH, paneTextArea, 0, SpringLayout.NORTH, logcontentPane);
        layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, paneTextArea, 0, SpringLayout.HORIZONTAL_CENTER, logcontentPane);
        



        logframe.setVisible(true);
    }
    
}
