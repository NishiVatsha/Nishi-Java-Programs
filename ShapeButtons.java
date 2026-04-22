// Create one jframe apply 10 buttons on that after clicking on each button a new
// structure is created

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ShapeButtons {

    static String shape = "";

    public static void main(String[] args) {

        JFrame frame = new JFrame("Shape Drawer");
        frame.setSize(500, 500);
        frame.setLayout(null);

        // Drawing Panel
        JPanel panel = new JPanel() {
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                if (shape.equals("circle")) {
                    g.drawOval(150, 100, 100, 100);
                } else if (shape.equals("oval")) {
                    g.drawOval(130, 100, 150, 100);
                } else if (shape.equals("rectangle")) {
                    g.drawRect(130, 100, 150, 100);
                } else if (shape.equals("square")) {
                    g.drawRect(150, 100, 100, 100);
                } else if (shape.equals("line")) {
                    g.drawLine(100, 100, 300, 200);
                } else if (shape.equals("arc")) {
                    g.drawArc(130, 100, 150, 100, 0, 180);
                } else if (shape.equals("roundrect")) {
                    g.drawRoundRect(130, 100, 150, 100, 30, 30);
                } else if (shape.equals("fillcircle")) {
                    g.fillOval(150, 100, 100, 100);
                } else if (shape.equals("fillrect")) {
                    g.fillRect(130, 100, 150, 100);
                } else if (shape.equals("filloval")) {
                    g.fillOval(130, 100, 150, 100);
                }
            }
        };

        panel.setBounds(50, 150, 400, 300);
        panel.setBackground(Color.WHITE);
        frame.add(panel);

        // Button names
        String[] shapes = {
            "circle", "oval", "rectangle", "square", "line",
            "arc", "roundrect", "fillcircle", "fillrect", "filloval"
        };

        // Create 10 buttons
        for (int i = 0; i < 10; i++) {
            JButton btn = new JButton(shapes[i]);
            btn.setBounds(20 + (i % 5) * 90, 20 + (i / 5) * 50, 85, 30);

            String selectedShape = shapes[i];

            btn.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    shape = selectedShape;
                    panel.repaint(); // redraw panel
                }
            });

            frame.add(btn);
        }

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}