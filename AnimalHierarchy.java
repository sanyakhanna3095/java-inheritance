import java.util.Scanner;

// Superclass: Animal
class Animal {
    // Attributes
    protected String name;
    protected int age;

    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to be overridden by subclasses
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass: Dog
class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
    }

    // Overriding makeSound method
    @Override
    public void makeSound() {
        System.out.println(name + " barks.");
    }
}

// Subclass: Cat
class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    // Overriding makeSound method
    @Override
    public void makeSound() {
        System.out.println(name + " meows.");
    }
}

// Subclass: Bird
class Bird extends Animal {

    public Bird(String name, int age) {
        super(name, age);
    }

    // Overriding makeSound method
    @Override
    public void makeSound() {
        System.out.println(name + " chirps.");
    }
}

// Main class

public class AnimalHierarchy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Take user input
        System.out.println("Enter dog name: ");
        String dogName = sc.nextLine();
        System.out.println("Enter dog age: ");
        int dogAge = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter cat name: ");
        String catName = sc.nextLine();
        System.out.println("Enter cat age: ");
        int catAge = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter bird name: ");
        String birdName = sc.nextLine();
        System.out.println("Enter bird age: ");
        int birdAge = sc.nextInt();

        // Creating objects of each subclass
        Animal dog = new Dog(dogName, dogAge);
        Animal cat = new Cat(catName, catAge);
        Animal bird = new Bird(birdName, birdAge);

        // Demonstrating polymorphism
        dog.makeSound();
        cat.makeSound();
        bird.makeSound();

    }
}


/*
I/P->
Enter dog name:
Bruno
Enter dog age:
3
Enter cat name:
Tinkerbell
Enter cat age:
5
Enter bird name:
Tweety
Enter bird age:
12

O/P ->
Bruno barks.
Tinkerbell meows.
Tweety chirps.
 */