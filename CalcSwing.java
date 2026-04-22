// 13.  Make one calculator in swing.

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalcSwing {
    public static void main(String[] args) {

        JFrame f = new JFrame("Calculator");

        // Display field
        JTextField display = new JTextField();
        display.setBounds(30, 30, 240, 40);
        display.setFont(new Font("Arial", Font.BOLD, 18));

        // Buttons
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("+");

        JButton b5 = new JButton("4");
        JButton b6 = new JButton("5");
        JButton b7 = new JButton("6");
        JButton b8 = new JButton("-");

        JButton b9 = new JButton("7");
        JButton b10 = new JButton("8");
        JButton b11 = new JButton("9");
        JButton b12 = new JButton("*");

        JButton b13 = new JButton("0");
        JButton b14 = new JButton("=");
        JButton b15 = new JButton("/");
        JButton b16 = new JButton("C");

        // Set positions
        int x = 30, y = 90;

        JButton buttons[] = {b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16};

        int i = 0;
        for (int row = 0; row < 4; row++) {
            int colX = x;
            for (int col = 0; col < 4; col++) {
                buttons[i].setBounds(colX, y, 50, 40);
                f.add(buttons[i]);
                colX += 60;
                i++;
            }
            y += 50;
        }

        f.add(display);

        // Logic variables
        final double num1[] = new double[1];
        final String operator[] = new String[1];

        // Number buttons
        for (JButton b : buttons) {
            String text = b.getText();

            if (text.matches("[0-9]")) {
                b.addActionListener(e -> display.setText(display.getText() + text));
            }
        }

        // Operator buttons
        b4.addActionListener(e -> { num1[0] = Double.parseDouble(display.getText()); operator[0] = "+"; display.setText(""); });
        b8.addActionListener(e -> { num1[0] = Double.parseDouble(display.getText()); operator[0] = "-"; display.setText(""); });
        b12.addActionListener(e -> { num1[0] = Double.parseDouble(display.getText()); operator[0] = "*"; display.setText(""); });
        b15.addActionListener(e -> { num1[0] = Double.parseDouble(display.getText()); operator[0] = "/"; display.setText(""); });

        // Equal button
        b14.addActionListener(e -> {
            double num2 = Double.parseDouble(display.getText());
            double result = 0;

            switch (operator[0]) {
                case "+": result = num1[0] + num2; break;
                case "-": result = num1[0] - num2; break;
                case "*": result = num1[0] * num2; break;
                case "/":
                    if (num2 != 0)
                        result = num1[0] / num2;
                    else {
                        display.setText("Error");
                        return;
                    }
                    break;
            }

            display.setText(String.valueOf(result));
        });

        // Clear button
        b16.addActionListener(e -> display.setText(""));

        // Frame settings
        f.setSize(320, 350);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}