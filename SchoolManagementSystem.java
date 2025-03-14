import java.util.Scanner;

// Base class: Person
class Person {
    protected String name;
    protected int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Subclass: Teacher
class Teacher extends Person {
    private String subject;

    // Constructor
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    // Method to display role
    public void displayRole() {
        System.out.println("Role: Teacher");
        System.out.println("Subject: " + subject);
    }
}

// Subclass: Student
class Student extends Person {
    private String grade;

    // Constructor
    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    // Method to display role
    public void displayRole() {
        System.out.println("Role: Student");
        System.out.println("Grade: " + grade);
    }
}

// Subclass: Staff
class Staff extends Person {
    private String department;

    // Constructor
    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    // Method to display role
    public void displayRole() {
        System.out.println("Role: Staff");
        System.out.println("Department: " + department);
    }
}

// Main class
public class SchoolManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creating and displaying a Teacher
        System.out.print("Enter Teacher's Name: ");
        String teacherName = sc.nextLine();
        System.out.print("Enter Teacher's Age: ");
        int teacherAge = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.print("Enter Subject: ");
        String subject = sc.nextLine();
        Teacher teacher = new Teacher(teacherName, teacherAge, subject);
        teacher.displayDetails();
        teacher.displayRole();

        // Creating and displaying a Student
        System.out.print("\nEnter Student's Name: ");
        String studentName = sc.nextLine();
        System.out.print("Enter Student's Age: ");
        int studentAge = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.print("Enter Grade: ");
        String grade = sc.nextLine();
        Student student = new Student(studentName, studentAge, grade);
        student.displayDetails();
        student.displayRole();

        // Creating and displaying a Staff member
        System.out.print("\nEnter Staff's Name: ");
        String staffName = sc.nextLine();
        System.out.print("Enter Staff's Age: ");
        int staffAge = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.print("Enter Department: ");
        String department = sc.nextLine();
        Staff staff = new Staff(staffName, staffAge, department);
        staff.displayDetails();
        staff.displayRole();

    }
}


/*
I/P ->
Enter Teacher's Name: Neha Sharma
Enter Teacher's Age: 28
Enter Subject: English

O/P ->
Name: Neha Sharma
Age: 28
Role: Teacher
Subject: English


I/P ->
Enter Student's Name: Sanya Khanna
Enter Student's Age: 12
Enter Grade: 7

O/P->
Name: Sanya Khanna
Age: 12
Role: Student
Grade: 7


I/P->
Enter Staff's Name: Sonia Verma
Enter Staff's Age: 54
Enter Department: Management

O/P->
Name: Sonia Verma
Age: 54
Role: Staff
Department: Management
 */