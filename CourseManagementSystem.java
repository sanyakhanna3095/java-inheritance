import java.util.Scanner;

// Base class: Course
class Course {
    protected String courseName;
    protected int duration; // Duration in weeks

    // Constructor
    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    // Method to display course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
    }
}

// Subclass: OnlineCourse
class OnlineCourse extends Course {
    protected String platform;
    protected boolean isRecorded;

    // Constructor
    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    // Overriding displayCourseDetails to add online course info
    @Override
    public void displayCourseDetails() {
        super.displayCourseDetails();
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}

// Subclass: PaidOnlineCourse
class PaidOnlineCourse extends OnlineCourse {
    private double fee;
    private double discount; // Percentage discount

    // Constructor
    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    // Overriding displayCourseDetails to add fee info
    @Override
    public void displayCourseDetails() {
        super.displayCourseDetails();
        System.out.println("Fee: $" + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Price: $" + calculateFinalPrice());
    }

    // Method to calculate final price after discount
    public double calculateFinalPrice() {
        return fee - (fee * discount / 100);
    }
}

// Main class
public class CourseManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take paid online course details
        System.out.print("Enter Course Name: ");
        String courseName = sc.nextLine();
        System.out.print("Enter Duration (in weeks): ");
        int duration = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.print("Enter Platform: ");
        String platform = sc.nextLine();
        System.out.print("Is the course recorded? (true/false): ");
        boolean isRecorded = sc.nextBoolean();
        System.out.print("Enter Course Fee: ");
        double fee = sc.nextDouble();
        System.out.print("Enter Discount (%): ");
        double discount = sc.nextDouble();

        // Create a PaidOnlineCourse object
        PaidOnlineCourse paidCourse = new PaidOnlineCourse(courseName, duration, platform, isRecorded, fee, discount);

        // Display the course details
        System.out.println("\nCourse Information:");
        paidCourse.displayCourseDetails();

    }
}


/*
I/P ->
Enter Course Name: Java
Enter Duration (in weeks): 32
Enter Platform: Coding Ninjas
Is the course recorded? (true/false): false
Enter Course Fee: 50000
Enter Discount (%): 20


O/P ->
Course Information:
Course Name: Java
Duration: 32 weeks
Platform: Coding Ninjas
Recorded: No
Fee: $50000.0
Discount: 20.0%
Final Price: $40000.0
 */