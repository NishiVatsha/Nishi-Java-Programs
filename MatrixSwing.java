 //  14. Matrix Addition
 
 import javax.swing.*;
import java.awt.event.*;

public class MatrixSwing {
    public static void main(String[] args) {
        JFrame f = new JFrame("Matrix Add");

        JTextField a1 = new JTextField();
        JTextField a2 = new JTextField();
        JTextField b1 = new JTextField();
        JTextField b2 = new JTextField();

        JButton btn = new JButton("Add");
        JLabel res = new JLabel();

        a1.setBounds(50,50,50,30);
        a2.setBounds(120,50,50,30);
        b1.setBounds(50,100,50,30);
        b2.setBounds(120,100,50,30);
        btn.setBounds(50,150,100,30);
        res.setBounds(50,200,200,30);

        btn.addActionListener(e -> {
            int r1 = Integer.parseInt(a1.getText()) + Integer.parseInt(b1.getText());
            int r2 = Integer.parseInt(a2.getText()) + Integer.parseInt(b2.getText());
            res.setText("Result: " + r1 + " " + r2);
        });

        f.add(a1); f.add(a2); f.add(b1); f.add(b2);
        f.add(btn); f.add(res);

        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
} 