// Java examples for core OOP concepts: Inheritance, Polymorphism, Overriding, Abstract Class, Interface, Method Hiding

// 1. Inheritance Example
class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

// 2. Polymorphism Example
class Bird extends Animal {
    void sound() {
        System.out.println("Bird chirps");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

// 3. Method Overriding Example
class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

class Bike extends Vehicle {
    @Override
    void run() {
        System.out.println("Bike is running safely");
    }
}

// 4. Abstract Class Example
abstract class Shape {
    abstract void draw();

    void display() {
        System.out.println("This is a shape");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}

// 5. Interface Example
interface Printable {
    void print();
}

interface Showable {
    void show();
}

class Document implements Printable, Showable {
    public void print() {
        System.out.println("Printing Document");
    }

    public void show() {
        System.out.println("Showing Document");
    }
}

// 6. Method Hiding Example
class Parent {
    static void display() {
        System.out.println("Static method in Parent");
    }
}

class Child extends Parent {
    static void display() {
        System.out.println("Static method in Child (Method Hiding)");
    }
}

public class OOPExamples {
    public static void main(String[] args) {
        // Inheritance
        Dog dog = new Dog();
        dog.sound();
        dog.bark();

        // Polymorphism (Runtime)
        Animal a1 = new Bird();
        Animal a2 = new Cat();
        a1.sound();
        a2.sound();

        // Method Overriding
        Vehicle v = new Bike();
        v.run();

        // Abstract Class
        Shape s = new Circle();
        s.display();
        s.draw();

        // Interface
        Document doc = new Document();
        doc.print();
        doc.show();

        // Method Hiding
        Parent.display();
        Child.display();
    }
}
