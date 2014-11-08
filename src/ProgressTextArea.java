import javax.swing.*;
import java.awt.*;

public class ProgressTextArea extends JTextArea {

    public ProgressTextArea() {
        this.setEditable(false);
        this.setFont(new Font("Monospaced", Font.PLAIN, 12));
        this.setBackground(Color.BLACK);
        this.setForeground(Color.ORANGE);
    }

}
