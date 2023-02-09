package java2;

import java.awt.*;
import javax.swing.*;

public class Swi extends JFrame {
    Swi() {
        Image icon = Toolkit.getDefaultToolkit().getImage("icon.png");
        setIconImage(icon);
        JLabel label = new JLabel("dum");
        add(label);
    }

    public static void main(String[] args) {
        Swi r = new Swi();
        r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        r.setSize(500, 500);
        r.setVisible(true);
    }

}
