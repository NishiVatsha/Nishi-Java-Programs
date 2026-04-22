// 11.  Addition of 2 numbers using swing.

import javax.swing.*;
import java.awt.event.*;

public class AddSwing {
    public static void main(String[] args) {
        JFrame f = new JFrame("Addition");

        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JButton b = new JButton("Add");
        JLabel l = new JLabel();

        t1.setBounds(50, 50, 100, 30);
        t2.setBounds(50, 100, 100, 30);
        b.setBounds(50, 150, 100, 30);
        l.setBounds(50, 200, 200, 30);

        b.addActionListener(e -> {
            int a = Integer.parseInt(t1.getText());
            int b1 = Integer.parseInt(t2.getText());
            l.setText("Result: " + (a + b1));
        });

        f.add(t1); f.add(t2); f.add(b); f.add(l);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
} 