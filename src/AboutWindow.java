import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AboutWindow extends JFrame implements ActionListener {

    public AboutWindow(){
        setSize(400, 200);

        Container mainContainer = getContentPane();
        mainContainer.setLayout(new GridLayout(2,0));

        JPanel textAreaPanel = new JPanel();
        JPanel closeButtonPanel = new JPanel();

        mainContainer.add(textAreaPanel);
        mainContainer.add(closeButtonPanel);

        JTextArea aboutTextArea = new JTextArea();
        aboutTextArea.append("SoundSergeant (c) Espen Moe, 2014\n         www.espenmoe.no");
        aboutTextArea.setEditable(false);
        textAreaPanel.add(aboutTextArea);

        JButton closeAboutWindowButton = new JButton("Close");

        closeAboutWindowButton.addActionListener(this);
        closeAboutWindowButton.setPreferredSize(new Dimension(100, 40));
        closeButtonPanel.add(closeAboutWindowButton);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String event = e.getActionCommand();

        if(event.equals("Close")) {
            dispose();
        }
    }

}
