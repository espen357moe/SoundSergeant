import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    public MainWindow(){
        setTitle("SoundSergeant");
        setSize(400,400);

        JMenuBar menubar = new JMenuBar();
        JMenu menu = new JMenu("Menu");
        JMenuItem m1 = new JMenuItem("About");
        JMenuItem m2 = new JMenuItem("Close");

        menubar.add(menu);
        menu.add(m1);
        menu.add(m2);

        setJMenuBar(menubar);

        Container mainContainer = getContentPane();
        mainContainer.setLayout(new BorderLayout());

        JPanel folderButtonsPanel = new JPanel();
        folderButtonsPanel.setLayout(new GridLayout(0,2));

        JButton sourceFolderButton = new JButton("Select source folder");
        JButton destinationFolderButton = new JButton("Select destination folder");
        folderButtonsPanel.add(sourceFolderButton);
        folderButtonsPanel.add(destinationFolderButton);

        JButton convertButton = new JButton("Convert");

        ProgressTextArea progressTextArea = new ProgressTextArea();
        progressTextArea.append("Idle...");

        mainContainer.add(folderButtonsPanel, BorderLayout.NORTH);
        mainContainer.add(progressTextArea, BorderLayout.CENTER);
        mainContainer.add(convertButton, BorderLayout.SOUTH);


        setVisible(true);
    }

}