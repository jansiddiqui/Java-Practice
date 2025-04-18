import java.util.ArrayList;
import java.util.List;

class Animal {
    void eat() {
        System.out.println("Animal Eats");
    }
}

class Cat extends Animal {
    void eat() {
        System.out.println("Cat Eats");
    }
}

class Dog extends Animal {
    void eat() {
        System.out.println("Dog Eats");
    }
}

class Rat {
    void eat() {
        System.out.println("Rat Eats");
    }
}

public class wildcard {

    // Upper bounded: Safe to read as Animal, can't add new ones
    public static void feedAnimals(List<? extends Animal> animals) {
        for (Animal a : animals) {
            a.eat();
        }
    }

    // Lower bounded: Safe to add Animal or its subclasses
    public static void feedLower(List<? super Animal> animals) {
        animals.add(new Animal());
        animals.add(new Cat());
        animals.add(new Dog());

        // We don't know the exact type, so reading is limited
        System.out.println("Added animals to the list (can't safely read them)");
    }

    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Animal());
        animalList.add(new Dog());
        animalList.add(new Cat());

        List<Cat> catList = new ArrayList<>();
        catList.add(new Cat());

        List<Dog> dogList = new ArrayList<>();
        dogList.add(new Dog());

        // Using upper bounded wildcard
        System.out.println("Feeding Animals (Upper Bound):");
        feedAnimals(animalList);
        feedAnimals(catList);
        feedAnimals(dogList);

        // Using lower bounded wildcard
        List<Object> objectList = new ArrayList<>();
        System.out.println("\nFeeding Animals (Lower Bound):");
        feedLower(animalList); // Valid
        feedLower(objectList); // Valid since Object is a superclass of Animal

        // feedLower(catList); ❌ Invalid - Cat is not a superclass of Animal
    }
}
