import java.util.Scanner;

// Base class: Vehicle
class Vehicle {
    protected String model;
    protected int maxSpeed;

    // Constructor
    public Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    // Method to display vehicle details
    public void displayDetails() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}

// Interface: Refuelable
interface Refuelable {
    void refuel();
}

// Subclass: ElectricVehicle
class ElectricVehicle extends Vehicle {
    private int batteryCapacity;

    // Constructor
    public ElectricVehicle(String model, int maxSpeed, int batteryCapacity) {
        super(model, maxSpeed);
        this.batteryCapacity = batteryCapacity;
    }

    // Method to charge the vehicle
    public void charge() {
        System.out.println("Charging the electric vehicle with " + batteryCapacity + " kWh capacity.");
    }

    // Method to display role
    public void displayRole() {
        System.out.println("Type: Electric Vehicle");
    }
}

// Subclass: PetrolVehicle
class PetrolVehicle extends Vehicle implements Refuelable {
    private int fuelCapacity;

    // Constructor
    public PetrolVehicle(String model, int maxSpeed, int fuelCapacity) {
        super(model, maxSpeed);
        this.fuelCapacity = fuelCapacity;
    }

    @Override
    public void refuel() {
        System.out.println("Refueling petrol vehicle with " + fuelCapacity + " liters capacity.");
    }

    // Method to display role
    public void displayRole() {
        System.out.println("Type: Petrol Vehicle");
    }
}

// Main class
public class VehicleManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creating and displaying an Electric Vehicle
        System.out.print("Enter Electric Vehicle Model: ");
        String evModel = sc.nextLine();
        System.out.print("Enter Electric Vehicle Max Speed: ");
        int evMaxSpeed = sc.nextInt();
        System.out.print("Enter Battery Capacity (kWh): ");
        int batteryCapacity = sc.nextInt();
        sc.nextLine(); // Consume newline
        ElectricVehicle ev = new ElectricVehicle(evModel, evMaxSpeed, batteryCapacity);
        ev.displayDetails();
        ev.displayRole();
        ev.charge();

        // Creating and displaying a Petrol Vehicle
        System.out.print("\nEnter Petrol Vehicle Model: ");
        String pvModel = sc.nextLine();
        System.out.print("Enter Petrol Vehicle Max Speed: ");
        int pvMaxSpeed = sc.nextInt();
        System.out.print("Enter Fuel Capacity (liters): ");
        int fuelCapacity = sc.nextInt();
        PetrolVehicle pv = new PetrolVehicle(pvModel, pvMaxSpeed, fuelCapacity);
        pv.displayDetails();
        pv.displayRole();
        pv.refuel();
    }
}


/*
I/P->
Enter Electric Vehicle Model: UV4500
Enter Electric Vehicle Max Speed: 120
Enter Battery Capacity (kWh): 5

O/P->
Model: UV4500
Max Speed: 120 km/h
Type: Electric Vehicle
Charging the electric vehicle with 5 kWh capacity.


I/P->
Enter Petrol Vehicle Model: MRX360
Enter Petrol Vehicle Max Speed: 120
Enter Fuel Capacity (liters): 8

O/P->
Model: MRX360
Max Speed: 120 km/h
Type: Petrol Vehicle
Refueling petrol vehicle with 8 liters capacity.
 */