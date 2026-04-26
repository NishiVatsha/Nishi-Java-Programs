// 1. Wap for addition sub mul div using object and classes.

class Calculator {
    int a, b;

    Calculator(int x, int y) {
        a = x;
        b = y;
    }
    void add() {
        System.out.println("Addition: " + (a + b));
    }
    void sub() {
        System.out.println("Subtraction: " + (a - b));
    }
    void mul() {
        System.out.println("Multiplication: " + (a * b));
    }
    void div() {
        if (b != 0)
            System.out.println("Division: " + (a / b));
        else
            System.out.println("Cannot divide by zero");
    }
    public static void main(String[] args) {
        Calculator obj = new Calculator(10, 5);
        obj.add();
        obj.sub();
        obj.mul();
        obj.div();
    }
}

<img width="237" height="101" alt="image" src="https://github.com/user-attachments/assets/035c09b7-a187-4362-a585-3e3c39df4c63" />



// 2. Write a class for addition of two distance where each distance is given in m,cm,mm.

import java.util.Scanner;

class Distance {
    int m, cm, mm;

    Distance(int m, int cm, int mm) {
        this.m = m;
        this.cm = cm;
        this.mm = mm;
    }

    void add(Distance d2) {
        int totalMM = this.mm + d2.mm;
        int carryCM = totalMM / 10;
        totalMM = totalMM % 10;

        int totalCM = this.cm + d2.cm + carryCM;
        int carryM = totalCM / 100;
        totalCM = totalCM % 100;

        int totalM = this.m + d2.m + carryM;

        System.out.println("Result: " + totalM + "m " + totalCM + "cm " + totalMM + "mm");
    }
}

public class DistanceMain {   
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first distance (m cm mm):");
        int m1 = sc.nextInt();
        int cm1 = sc.nextInt();
        int mm1 = sc.nextInt();

        System.out.println("Enter second distance (m cm mm):");
        int m2 = sc.nextInt();
        int cm2 = sc.nextInt();
        int mm2 = sc.nextInt();

        Distance d1 = new Distance(m1, cm1, mm1);
        Distance d2 = new Distance(m2, cm2, mm2);

        d1.add(d2);
    }
}

<img width="288" height="110" alt="image" src="https://github.com/user-attachments/assets/dab00028-3165-44d2-81b1-5b5a75b4e39d" />



// 3. Write a class for addition of two distance where each distance is given in m,cm.

import java.util.Scanner;

class Distance {
    int m, cm;

    Distance(int m, int cm) {
        this.m = m;
        this.cm = cm;
    }
    void add(Distance d2) {
        int totalCM = this.cm + d2.cm;

        int carryM = totalCM / 100;
        totalCM = totalCM % 100;

        int totalM = this.m + d2.m + carryM;

        System.out.println("Result: " + totalM + "m " + totalCM + "cm");
    }
}
public class Distance2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter first distance (m cm):");
        int m1 = sc.nextInt();
        int cm1 = sc.nextInt();
        System.out.println("Enter second distance (m cm):");
        int m2 = sc.nextInt();
        int cm2 = sc.nextInt();
        Distance d1 = new Distance(m1, cm1);
        Distance d2 = new Distance(m2, cm2);
        d1.add(d2);
    }
}

<img width="249" height="114" alt="image" src="https://github.com/user-attachments/assets/27dcae65-b3ce-4b26-aec3-50f2ecd9c009" />



// 4. Write a class for addition of two times where each time is given in hr,min,sec.

import java.util.Scanner;

public class Time {
    int h, m, s;
    Time(int h, int m, int s) {
        this.h = h;
        this.m = m;
        this.s = s;
    }
    void add(Time t2) {
        int sec = this.s + t2.s;
        int carryMin = sec / 60;
        sec %= 60;

        int min = this.m + t2.m + carryMin;
        int carryHr = min / 60;
        min %= 60;

        int hr = this.h + t2.h + carryHr;

        System.out.println("Time: " + hr + ":" + min + ":" + sec);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first time (h m s):");
        int h1 = sc.nextInt();
        int m1 = sc.nextInt();
        int s1 = sc.nextInt();

        System.out.println("Enter second time (h m s):");
        int h2 = sc.nextInt();
        int m2 = sc.nextInt();
        int s2 = sc.nextInt();

        Time t1 = new Time(h1, m1, s1);
        Time t2 = new Time(h2, m2, s2);

        t1.add(t2);
    }
}

<img width="223" height="106" alt="image" src="https://github.com/user-attachments/assets/a5a69e43-06e7-4585-8e6e-82d9f3c32302" />


// 5. Write a class for addition of two times where each time is given in hr,min.

import java.util.Scanner;

public class TimeHM {
    int h, m;

    TimeHM(int h, int m) {
        this.h = h;
        this.m = m;
    }

    void add(TimeHM t2) {
        int min = this.m + t2.m;
        int carry = min / 60;
        min %= 60;

        int hr = this.h + t2.h + carry;

        System.out.println("Time: " + hr + " hours " + min + " minutes");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first time (h m):");
        int h1 = sc.nextInt();
        int m1 = sc.nextInt();

        System.out.println("Enter second time (h m):");
        int h2 = sc.nextInt();
        int m2 = sc.nextInt();

        TimeHM t1 = new TimeHM(h1, m1);
        TimeHM t2 = new TimeHM(h2, m2);

        t1.add(t2);
    }
}


<img width="216" height="108" alt="image" src="https://github.com/user-attachments/assets/b39ac882-7a5a-43cf-9405-ecf0826165b0" />



//6. Collect the code from internet for any five programs of c language. (Fact, armstrong, palindrome, Fibonacci, pattern).
import java.util.Scanner;
public class Fivefunctions {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        Scanner sc4 = new Scanner(System.in);
        Scanner sc5 = new Scanner(System.in);
        
        System.out.print("Enter a number to check Armstrong: ");
        int n = sc.nextInt();
        Armstrong obj = new Armstrong(n); 
        obj.check(); 
        
        System.out.print("Enter a number to check Palindrome: ");
        int n1 = sc1.nextInt();
        PalindromeNumber p1 = new PalindromeNumber(n1);
        p1.check();
        
        System.out.print("Enter a number to find it's factorial: ");
        int n2 = sc2.nextInt();
        FactorialNumber Num1 = new FactorialNumber(n2);
        Num1.calculate();

        System.out.print("Enter number of terms to print fibonacci series: ");
        int num = sc3.nextInt();
        FibonacciSeries fib = new FibonacciSeries(num);
        fib.printSeries(); 
        
        System.out.println("Enter number of rows and columns to print square pattern: ");
        int n4 = sc4.nextInt();
        int n5 = sc5.nextInt();
        Pattern pa = new Pattern(n4,n5);
        pa.display();
    }
    
}
    

class Armstrong {

    int num;
    
    Armstrong(int n) {
        num = n;
    }
    
    void check() {
        int original = num;
        int remainder;
        int result = 0;

        while (num != 0) {
            remainder = num % 10;
            result = result + (remainder * remainder * remainder);
            num = num / 10;
        }

        if (result == original) {
            System.out.println(original + " is an Armstrong number");
        } else {
            System.out.println(original + " is not an Armstrong number");
        }
    }
}

class PalindromeNumber{
    
    int num,num1;
    int result = 0;
    int remainder;
    
    PalindromeNumber(int n)
    {
        num = n;
    }
    
    void check()
    {
        num1 = num;
        while(num1!=0){
            remainder = num1%10;
            result = (result*10)+remainder;
            num1 = num1/10;
        }
        if(result == num){
            System.out.println("The number is palindromic");
        }
        else{
             System.out.println("The number is not a palindromic number");
        }
    }
}

class FactorialNumber{
    
    int num;
    int result = 1;
    FactorialNumber(int n){
        num = n;
    }
    
    void calculate(){
        while(num!=0){
            result*=num;
            num = num-1;
        }
        System.out.println("Factorial = "+result);
    }
}

class FibonacciSeries {
    int n;

    // Constructor
    FibonacciSeries(int n) {
        this.n = n;
    }

    // print Fibonacci series
    void printSeries() {
        int a = 0;
        int b = 1;
        int c;

        System.out.println("Fibonacci Series: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println();
    }
}

class Pattern{
    int r,c;
    
    Pattern(int r, int c){
        this.r = r;
        this.c = c;
    }
    
    void display(){
        
        for(int i = 0; i<r; i++){
            for(int j = 0; j<c; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


<img width="608" height="479" alt="image" src="https://github.com/user-attachments/assets/c61b52b4-0430-490d-940f-3562ec5520a4" />


// 7. Write a class that is having four method for 1-dimensional array. (Input, output 1,out2, reverse).

import java.util.Scanner;

public class Array1D {
    int arr[] = new int[5];

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements:");
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();
    }

    void output1() {
        System.out.println("Array (for loop):");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }


    void output2() {
        System.out.println("\nArray (for-each loop):");
        for (int x : arr)
            System.out.print(x + " ");
    }


    void reverse() {
        System.out.println("\nReversed array:");
        for (int i = arr.length - 1; i >= 0; i--)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args) {
        Array1D obj = new Array1D();
        obj.input();
        obj.output1();
        obj.output2();
        obj.reverse();
    }
}


<img width="326" height="172" alt="image" src="https://github.com/user-attachments/assets/91d3cb41-2034-4cba-95eb-f9624900acbb" />



// 8. write a class with multiple methods to perform matrix operations. 

import java.util.Scanner;

public class Matrix {
    int a[][] = new int[2][2];
    int b[][] = new int[2][2];
    
    void input() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter matrix A:");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                a[i][j] = sc.nextInt();

        System.out.println("Enter matrix B:");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                b[i][j] = sc.nextInt();
    }
    void addition() {
        System.out.println("Addition:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++)
                System.out.print((a[i][j] + b[i][j]) + " ");
            System.out.println();
        }
    }
    void transpose() {
        System.out.println("Transpose of Matrix A:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++)
                System.out.print(a[j][i] + " ");
            System.out.println();
        }
    }

    void sumRows() {
        System.out.println("Sum of rows (Matrix A):");
        for (int i = 0; i < 2; i++) {
            int sum = 0;
            for (int j = 0; j < 2; j++)
                sum += a[i][j];
            System.out.println("Row " + i + ": " + sum);
        }
    }
    void sumColumns() {
        System.out.println("Sum of columns (Matrix A):");
        for (int j = 0; j < 2; j++) {
            int sum = 0;
            for (int i = 0; i < 2; i++)
                sum += a[i][j];
            System.out.println("Column " + j + ": " + sum);
        }
    }
    void diagonalSum() {
        int sum = 0;
        for (int i = 0; i < 2; i++)
            sum += a[i][i];

        System.out.println("Diagonal sum (Matrix A): " + sum);
    }
    public static void main(String[] args) {
        Matrix obj = new Matrix();

        obj.input();
        obj.addition();
        obj.transpose();
        obj.sumRows();
        obj.sumColumns();
        obj.diagonalSum();
    }
}


<img width="297" height="340" alt="image" src="https://github.com/user-attachments/assets/98fc7192-dafe-4198-8838-1c98f29a0427" />


// 9. Multithreading using Thread class

class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();

        t1.start();
        t2.start();
        t3.start();
    }
}


<img width="111" height="447" alt="image" src="https://github.com/user-attachments/assets/5c21dc55-60ff-4d02-8309-bb88e4b641c6" />
<img width="118" height="461" alt="image" src="https://github.com/user-attachments/assets/7f64d746-246e-4760-bf02-546f4808f62b" />
<img width="132" height="427" alt="image" src="https://github.com/user-attachments/assets/92d3c8ec-28c2-479e-a03f-25f0efcedecd" />


// 10. Synchronization using join()

class JoinExample extends Thread {   
    public void run() {
        for (int i = 1; i <= 5; i++)
            System.out.println(Thread.currentThread().getName() + " " + i);
    }
}

public class Synchronization {
    public static void main(String[] args) throws Exception {
        JoinExample t1 = new JoinExample();
        JoinExample t2 = new JoinExample();
        JoinExample t3 = new JoinExample();

        t1.start();
        t1.join();

        t2.start();
        t2.join();

        t3.start();
    }
}

<img width="111" height="282" alt="image" src="https://github.com/user-attachments/assets/792a0e11-cb31-4708-9643-1acf694a2dd7" />


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


<img width="158" height="200" alt="image" src="https://github.com/user-attachments/assets/b06d4c36-7aa3-4ef9-bfad-cd0900dfe9d4" />


// 13.  Make one calculator in swing.

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalcSwing {
    public static void main(String[] args) {

        JFrame f = new JFrame("Calculator");

        
        JTextField display = new JTextField();
        display.setBounds(30, 30, 240, 40);
        display.setFont(new Font("Arial", Font.BOLD, 18));

       
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

        
        final double num1[] = new double[1];
        final String operator[] = new String[1];

        
        for (JButton b : buttons) {
            String text = b.getText();

            if (text.matches("[0-9]")) {
                b.addActionListener(e -> display.setText(display.getText() + text));
            }
        }

        
        b4.addActionListener(e -> { num1[0] = Double.parseDouble(display.getText()); operator[0] = "+"; display.setText(""); });
        b8.addActionListener(e -> { num1[0] = Double.parseDouble(display.getText()); operator[0] = "-"; display.setText(""); });
        b12.addActionListener(e -> { num1[0] = Double.parseDouble(display.getText()); operator[0] = "*"; display.setText(""); });
        b15.addActionListener(e -> { num1[0] = Double.parseDouble(display.getText()); operator[0] = "/"; display.setText(""); });

       
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

        
        b16.addActionListener(e -> display.setText(""));

       
        f.setSize(320, 350);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}



<img width="265" height="295" alt="image" src="https://github.com/user-attachments/assets/e8510e07-f8d0-42b4-ae19-489888e767d0" />


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

<img width="172" height="206" alt="image" src="https://github.com/user-attachments/assets/fa7bbe74-8381-4ffe-8428-e3e2adb8c2a4" />


// 15. Create one jframe apply 10 buttons on that after clicking on each button a new
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

       
        String[] shapes = {
            "circle", "oval", "rectangle", "square", "line",
            "arc", "roundrect", "fillcircle", "fillrect", "filloval"
        };

       
        for (int i = 0; i < 10; i++) {
            JButton btn = new JButton(shapes[i]);
            btn.setBounds(20 + (i % 5) * 90, 20 + (i / 5) * 50, 85, 30);

            String selectedShape = shapes[i];

            btn.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    shape = selectedShape;
                    panel.repaint(); 
                }
            });

            frame.add(btn);
        }

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

<img width="464" height="370" alt="image" src="https://github.com/user-attachments/assets/b1d4173c-56fe-4adc-9215-7014adbac938" />



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


<img width="351" height="224" alt="image" src="https://github.com/user-attachments/assets/22683393-a9fa-4f7d-936f-731539782e1c" />


// 19. Exception Handling

public  class ExceptionDemo {
    public static void main(String[] args) {
        try {
            int arr[] = new int[5];
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds!");
        }

        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Divide by zero error!");
        }
    }
} 


<img width="379" height="80" alt="image" src="https://github.com/user-attachments/assets/e8217b6c-4cc8-4353-9256-cb283640661c" />


// 20. user defined Exception

class InvalidAgeException extends Exception {
    InvalidAgeException(String msg) {
        super(msg);
    }
}

public class AgeCheck {
    static void check(int age) throws InvalidAgeException {
        if (age < 18)
            throw new InvalidAgeException("Not valid age");
        else
            System.out.println("Valid age");
    }

    public static void main(String[] args) {
        try {
            check(15);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
} 


<img width="352" height="123" alt="image" src="https://github.com/user-attachments/assets/97126f15-537e-43d9-804a-5d79b76dcccb" />


// 21.  File Handling Programs 

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {

        try {
            FileWriter fw = new FileWriter("test.txt");
            fw.write("Hello, this is a file handling program.\n");
            fw.write("We are writing data into the file.");
            fw.close();

            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("Error occurred.");
        }
    }
}


<img width="213" height="36" alt="image" src="https://github.com/user-attachments/assets/e7dda73a-3466-4005-a83f-d92083d56f45" />



// 21. File Handling Programs 

import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {

        try {
            FileReader fr = new FileReader("test.txt");
            int i;

            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }

            fr.close();
        } catch (IOException e) {
            System.out.println("Error occurred.");
        }
    }
}


<img width="305" height="47" alt="image" src="https://github.com/user-attachments/assets/2f88a09f-e585-4a04-b275-b688f36d6bbc" />



// 22.  Inheritance Programs, using interface and abstract classes.


abstract class Animal {
    abstract void sound();  

    void eat() {            
        System.out.println("Animal eats food");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.eat();
    }
}


<img width="149" height="68" alt="image" src="https://github.com/user-attachments/assets/68cb8794-34df-447f-8cd0-335d377aee8a" />
