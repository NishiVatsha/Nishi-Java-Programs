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