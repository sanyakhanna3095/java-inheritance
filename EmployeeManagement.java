// Superclass: Employee
class Employee {
    // Attributes
    protected String name;
    protected int id;
    protected double salary;

    // Constructor
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: Rs." + salary);
    }
}

// Subclass: Manager
class Manager extends Employee {
    private int teamSize;

    public Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}

// Subclass: Developer
class Developer extends Employee {
    private String language;

    public Developer(String name, int id, double salary, String language) {
        super(name, id, salary);
        this.language = language;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + language);
    }
}

// Subclass: Intern
class Intern extends Employee {
    private String school;

    public Intern(String name, int id, double salary, String school) {
        super(name, id, salary);
        this.school = school;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("School: " + school);
    }
}

// Main class
public class EmployeeManagement {
    public static void main(String[] args) {
        // Creating objects of each subclass
        Employee manager = new Manager("Sanya", 101, 80000, 7);
        Employee developer = new Developer("Sehaj", 102, 55000, "Java");
        Employee intern = new Intern("Mehak", 103, 30000, "XYZ University");

        // Displaying details
        System.out.println("Manager Details:");
        manager.displayDetails();

        System.out.println("\nDeveloper Details:");
        developer.displayDetails();

        System.out.println("\nIntern Details:");
        intern.displayDetails();
    }
}


/*
O/P ->
Manager Details:
Name: Sanya
Employee ID: 101
Salary: Rs.80000.0
Team Size: 7

Developer Details:
Name: Sehaj
Employee ID: 102
Salary: Rs.55000.0
Programming Language: Java

Intern Details:
Name: Mehak
Employee ID: 103
Salary: Rs.30000.0
School: XYZ University

 */