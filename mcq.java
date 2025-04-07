// Final Snippet: All Types of Advanced Java MCQs

public class JavaMCQs {
    public static void main(String[] args) {
        System.out.println("--- Advanced Java MCQs ---\n");

        // Q1: Inheritance & Method Overriding
        System.out.println("Q1. What will be the output?");
        class Parent {
            int x = 10;
            void show() {
                System.out.println("Parent x: " + x);
            }
        }
        class Child extends Parent {
            int x = 20;
            void show() {
                System.out.println("Child x: " + x);
            }
        }
        Parent obj = new Child();
        obj.show();
        // A) Parent x: 10
        // B) Child x: 20 ✅
        // C) Compile-time error
        // D) Parent x: 20

        // Q2: Abstract Class
        System.out.println("\nQ2. Which will compile and run correctly?");
        abstract class Base {
            abstract void test();
        }
        class Derived extends Base {
            void test() {
                System.out.println("Test implemented");
            }
        }
        Base b = new Derived();
        b.test();
        // A) Error
        // B) Cannot instantiate abstract class
        // C) Test implemented ✅
        // D) Abstract test

        // Q3: Method Hiding (Static Methods)
        System.out.println("\nQ3. Which static method will be called?");
        class StaticParent {
            static void greet() {
                System.out.println("Hello from Parent");
            }
        }
        class StaticChild extends StaticParent {
            static void greet() {
                System.out.println("Hello from Child");
            }
        }
        StaticParent p = new StaticChild();
        p.greet();
        // A) Hello from Child
        // B) Compile error
        // C) Hello from Parent ✅
        // D) Runtime error

        // Q4: Exception Handling
        System.out.println("\nQ4. What exception is thrown by this code?");
        try {
            int[] arr = new int[5];
            arr[10] = 100;
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
        // A) ArrayIndexOutOfBoundsException ✅
        // B) NullPointerException
        // C) ArithmeticException
        // D) ClassCastException

        // Q5: Interface Default Method Conflict
        System.out.println("\nQ5. Interface behavior?");
        interface I1 {
            default void display() {
                System.out.println("I1");
            }
        }
        interface I2 {
            default void display() {
                System.out.println("I2");
            }
        }
        class MyClass implements I1, I2 {
            public void display() {
                I1.super.display();
            }
        }
        MyClass m = new MyClass();
        m.display();
        // A) I1 ✅
        // B) I2
        // C) Compile-time error
        // D) I1I2

        // Q6: Polymorphism (Upcasting)
        System.out.println("\nQ6. What will this output?");
        class Animal {
            void sound() {
                System.out.println("Generic sound");
            }
        }
        class Dog extends Animal {
            void sound() {
                System.out.println("Bark");
            }
        }
        Animal a = new Dog();
        a.sound();
        // A) Generic sound
        // B) Bark ✅
        // C) Error
        // D) Null

        // Q7: Throw vs Throws
        System.out.println("\nQ7. What is the difference between throw and throws?");
        // throw is used to explicitly throw an exception
        // throws is used in method signature to declare exceptions
        // A) Both are same
        // B) throw declares exception, throws handles
        // C) throw handles, throws declares
        // D) throw throws an exception, throws declares exceptions ✅

        // Q8: Compile-time Polymorphism (Overloading)
        System.out.println("\nQ8. What will be the output?");
        class Overload {
            void show(int a) {
                System.out.println("int: " + a);
            }
            void show(double a) {
                System.out.println("double: " + a);
            }
        }
        Overload ov = new Overload();
        ov.show(10);
        ov.show(10.5);
        // A) int: 10\ndouble: 10.5 ✅
        // B) Compile error
        // C) double: 10\ndouble: 10.5
        // D) int: 10.5
    }
}



public class BasicJavaMCQs {
    public static void main(String[] args) {
        System.out.println("--- Fundamental Java MCQs ---\n");

        // Q1: Inheritance Basics
        System.out.println("Q1. What will be the output?");
        class Animal {
            void makeSound() {
                System.out.println("Animal sound");
            }
        }
        class Dog extends Animal {
            void makeSound() {
                System.out.println("Dog barks");
            }
        }
        Animal a = new Dog();
        a.makeSound();
        // A) Animal sound
        // B) Dog barks ✅
        // C) Compile-time error
        // D) Runtime error

        // Q2: Abstract Class Example
        System.out.println("\nQ2. Abstract class usage:");
        abstract class Shape {
            abstract void draw();
        }
        class Circle extends Shape {
            void draw() {
                System.out.println("Drawing Circle");
            }
        }
        Shape s = new Circle();
        s.draw();
        // A) Drawing Circle ✅
        // B) Error
        // C) Abstract class cannot be used
        // D) Drawing Shape

        // Q3: Interface Implementation
        System.out.println("\nQ3. Interface implementation output?");
        interface Greetable {
            void greet();
        }
        class Hello implements Greetable {
            public void greet() {
                System.out.println("Hello there!");
            }
        }
        Hello h = new Hello();
        h.greet();
        // A) Hello there! ✅
        // B) Error: Interface can't be implemented
        // C) No output
        // D) Compilation error

        // Q4: Method Overloading
        System.out.println("\nQ4. What is method overloading?");
        class MathUtils {
            int add(int a, int b) {
                return a + b;
            }
            double add(double a, double b) {
                return a + b;
            }
        }
        MathUtils mu = new MathUtils();
        System.out.println(mu.add(2, 3));
        System.out.println(mu.add(2.5, 3.5));
        // A) 5 and 6.0 ✅
        // B) Error: Same method name
        // C) 2 and 2.5
        // D) Compilation error

        // Q5: Exception Handling Basics
        System.out.println("\nQ5. What exception is caught?");
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Caught: " + e.getClass().getSimpleName());
        }
        // A) Caught: ArithmeticException ✅
        // B) NullPointerException
        // C) Caught: Exception
        // D) No exception

        // Q6: throw vs throws
        System.out.println("\nQ6. What's the correct statement?");
        // A) 'throw' is used to declare exceptions
        // B) 'throws' is used to handle exceptions
        // C) 'throw' is used to explicitly throw exception ✅
        // D) Both are used for handling exceptions

        // Q7: Static Method Access
        System.out.println("\nQ7. What will be printed?");
        class StaticExample {
            static void sayHi() {
                System.out.println("Hi from static method!");
            }
        }
        StaticExample.sayHi();
        // A) Hi from static method! ✅
        // B) Compile error
        // C) Instance method called
        // D) No output
    }
}


