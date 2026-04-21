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
