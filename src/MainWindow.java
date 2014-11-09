import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame implements ActionListener{

    public MainWindow(){
        setTitle("SoundSergeant");
        setSize(400,400);

        JMenuBar menubar = new JMenuBar();
        JMenu menu = new JMenu("Menu");
        JMenuItem m1 = new JMenuItem("About");
        JMenuItem m2 = new JMenuItem("Exit");

        menubar.add(menu);
        menu.add(m1);
        menu.add(m2);

        m1.addActionListener(this);
        m2.addActionListener(this);

        setJMenuBar(menubar);

        Container mainContainer = getContentPane();
        mainContainer.setLayout(new BorderLayout());

        JPanel folderButtonsPanel = new JPanel();
        folderButtonsPanel.setLayout(new GridLayout(0,2));

        JButton sourceFolderButton = new JButton("Select source folder");
        JButton destinationFolderButton = new JButton("Select destination folder");
        JButton convertButton = new JButton("Convert");

        sourceFolderButton.addActionListener(this);
        destinationFolderButton.addActionListener(this);
        convertButton.addActionListener(this);

        ProgressTextArea progressTextArea = new ProgressTextArea();
        progressTextArea.append("Idle...");

        folderButtonsPanel.add(sourceFolderButton);
        folderButtonsPanel.add(destinationFolderButton);

        mainContainer.add(folderButtonsPanel, BorderLayout.NORTH);
        mainContainer.add(progressTextArea, BorderLayout.CENTER);
        mainContainer.add(convertButton, BorderLayout.SOUTH);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String event = e.getActionCommand();

        if(event.equals("About")) {
            new AboutWindow();
        }

        if(event.equals("Exit")) {
            System.exit(0);
        }

        if(event.equals("Select source folder")) {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

            int returnVal = fileChooser.showOpenDialog(this);
        }

        if(event.equals("Select destination folder")) {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

            int returnVal = fileChooser.showOpenDialog(this);
        }
    }

}