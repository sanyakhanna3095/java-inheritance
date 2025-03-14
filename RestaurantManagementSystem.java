import java.util.Scanner;

// Base class: Person
class Person {
    protected String name;
    protected int id;

    // Constructor
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Method to display person details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

// Interface: Worker
interface Worker {
    void performDuties();
}

// Subclass: Chef
class Chef extends Person implements Worker {
    private String specialty;

    // Constructor
    public Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    @Override
    public void performDuties() {
        System.out.println("Duties: Preparing and cooking " + specialty + " dishes.");
    }

    // Method to display role
    public void displayRole() {
        System.out.println("Role: Chef");
    }
}

// Subclass: Waiter
class Waiter extends Person implements Worker {
    private int tableCount;

    // Constructor
    public Waiter(String name, int id, int tableCount) {
        super(name, id);
        this.tableCount = tableCount;
    }

    @Override
    public void performDuties() {
        System.out.println("Duties: Serving customers at " + tableCount + " tables.");
    }

    // Method to display role
    public void displayRole() {
        System.out.println("Role: Waiter");
    }
}

// Main class
public class RestaurantManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creating and displaying a Chef
        System.out.print("Enter Chef's Name: ");
        String chefName = sc.nextLine();
        System.out.print("Enter Chef's ID: ");
        int chefId = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.print("Enter Chef's Specialty: ");
        String specialty = sc.nextLine();
        Chef chef = new Chef(chefName, chefId, specialty);
        chef.displayDetails();
        chef.displayRole();
        chef.performDuties();

        // Creating and displaying a Waiter
        System.out.print("\nEnter Waiter's Name: ");
        String waiterName = sc.nextLine();
        System.out.print("Enter Waiter's ID: ");
        int waiterId = sc.nextInt();
        System.out.print("Enter Number of Tables Served: ");
        int tableCount = sc.nextInt();
        Waiter waiter = new Waiter(waiterName, waiterId, tableCount);
        waiter.displayDetails();
        waiter.displayRole();
        waiter.performDuties();

    }
}


/*
I/P->
Enter Chef's Name: Sanya
Enter Chef's ID: 1234
Enter Chef's Specialty: Italian Food
O/P->
Name: Sanya
ID: 1234
Role: Chef
Duties: Preparing and cooking Italian Food dishes.

I/P->
Enter Waiter's Name: John
Enter Waiter's ID: 11678
Enter Number of Tables Served: 3
O/P->
Name: John
ID: 11678
Role: Waiter
Duties: Serving customers at 3 tables.
 */