// 16.  Just using mouse Event create a frame like paint brush with selection of colour and width .


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PaintBrush extends JFrame {

    private Color currentColor = Color.BLACK;
    private int brushSize = 5;

    public PaintBrush() {
        setTitle("Simple Paint Brush");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Drawing Panel
        DrawPanel panel = new DrawPanel();

        // Top Panel for controls
        JPanel controls = new JPanel();

        // Color Button
        JButton colorBtn = new JButton("Choose Color");
        colorBtn.addActionListener(e -> {
            Color selected = JColorChooser.showDialog(null, "Pick a Color", currentColor);
            if (selected != null) {
                currentColor = selected;
            }
        });

        // Brush Size Selector
        String[] sizes = {"2", "5", "10", "20", "30"};
        JComboBox<String> sizeBox = new JComboBox<>(sizes);
        sizeBox.addActionListener(e -> {
            brushSize = Integer.parseInt((String) sizeBox.getSelectedItem());
        });

        controls.add(colorBtn);
        controls.add(new JLabel("Brush Size:"));
        controls.add(sizeBox);

        add(controls, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);
    }

    class DrawPanel extends JPanel {

        int x, y;

        public DrawPanel() {
            setBackground(Color.WHITE);

            addMouseListener(new MouseAdapter() {
                public void mousePressed(MouseEvent e) {
                    x = e.getX();
                    y = e.getY();
                }
            });

            addMouseMotionListener(new MouseMotionAdapter() {
                public void mouseDragged(MouseEvent e) {
                    Graphics g = getGraphics();
                    g.setColor(currentColor);
                    g.fillOval(e.getX(), e.getY(), brushSize, brushSize);

                    x = e.getX();
                    y = e.getY();
                }
            });
        }
    }

    public static void main(String[] args) {
        new PaintBrush().setVisible(true);
    }
}