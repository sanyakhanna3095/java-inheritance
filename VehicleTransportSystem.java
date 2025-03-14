import java.util.Scanner;

// Superclass: Vehicle
class Vehicle {
    protected int maxSpeed;
    protected String fuelType;

    public Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    public void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed + " km/h");
        System.out.println("Fuel Type: " + fuelType);
    }
}

// Subclass: Car
class Car extends Vehicle {
    private int seatCapacity;

    public Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Seat Capacity: " + seatCapacity);
    }
}

// Subclass: Truck
class Truck extends Vehicle {
    private int loadCapacity;

    public Truck(int maxSpeed, String fuelType, int loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
}

// Subclass: Motorcycle
class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(int maxSpeed, String fuelType, boolean hasSidecar) {
        super(maxSpeed, fuelType);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Has Sidecar: " + (hasSidecar ? "Yes" : "No"));
    }
}

// Main class
public class VehicleTransportSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Take user input
        System.out.println("Enter Car details:");
        System.out.print("Max Speed: ");
        int carSpeed = sc.nextInt();
        sc.nextLine();
        System.out.print("Fuel Type: ");
        String carFuel = sc.nextLine();
        System.out.print("Seat Capacity: ");
        int seatCapacity = sc.nextInt();

        System.out.println("\nEnter Truck details:");
        System.out.print("Max Speed: ");
        int truckSpeed = sc.nextInt();
        sc.nextLine();
        System.out.print("Fuel Type: ");
        String truckFuel = sc.nextLine();
        System.out.print("Load Capacity (tons): ");
        int loadCapacity = sc.nextInt();

        System.out.println("\nEnter Motorcycle details:");
        System.out.print("Max Speed: ");
        int bikeSpeed = sc.nextInt();
        sc.nextLine();
        System.out.print("Fuel Type: ");
        String bikeFuel = sc.nextLine();
        System.out.print("Has Sidecar (true/false): ");
        boolean hasSidecar = sc.nextBoolean();

        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Car(carSpeed, carFuel, seatCapacity);
        vehicles[1] = new Truck(truckSpeed, truckFuel, loadCapacity);
        vehicles[2] = new Motorcycle(bikeSpeed, bikeFuel, hasSidecar);

        System.out.println("\nVehicle Information:");
        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
            System.out.println("--------------------");
        }

    }
}


/*
I/P ->
Enter Car details:
Max Speed: 90
Fuel Type: Petrol
Seat Capacity: 4

Enter Truck details:
Max Speed: 50
Fuel Type: Petrol
Load Capacity (tons): 520

Enter Motorcycle details:
Max Speed: 40
Fuel Type: Gas
Has Sidecar (true/false): false


O/P ->
Vehicle Information:
Max Speed: 90 km/h
Fuel Type: Petrol
Seat Capacity: 4
--------------------
Max Speed: 50 km/h
Fuel Type: Petrol
Load Capacity: 520 tons
--------------------
Max Speed: 40 km/h
Fuel Type: Gas
Has Sidecar: No
--------------------

 */