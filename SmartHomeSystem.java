import java.util.Scanner;

// Superclass: Device
class Device {
    protected String deviceId;
    protected String status;

    // Constructor
    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        setStatus(status); // Using the setter to validate status
    }

    // Setter to validate status
    public void setStatus(String status) {
        if (status.equalsIgnoreCase("On") || status.equalsIgnoreCase("Off")) {
            this.status = status;
        } else {
            System.out.println("Invalid status! Setting status to 'Off' by default.");
            this.status = "Off";
        }
    }

    // Method to display device status
    public void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }
}

// Subclass: Thermostat
class Thermostat extends Device {
    private int temperatureSetting;

    // Constructor
    public Thermostat(String deviceId, String status, int temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    // Overriding displayStatus method to include temperature setting
    @Override
    public void displayStatus() {
        super.displayStatus();
        if (status.equalsIgnoreCase("On")) {
            System.out.println("Temperature Setting: " + temperatureSetting + "°C");
        } else {
            System.out.println("Thermostat is Off — no temperature setting available.");
        }
    }
}

// Main class
public class SmartHomeSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Getting input for thermostat
        System.out.print("Enter Thermostat Device ID: ");
        String deviceId = sc.nextLine();
        System.out.print("Enter Thermostat Status (On/Off): ");
        String status = sc.nextLine();
        System.out.print("Enter Temperature Setting: ");
        int temperatureSetting = sc.nextInt();

        // Creating a Thermostat object
        Thermostat thermostat = new Thermostat(deviceId, status, temperatureSetting);

        // Displaying the device status
        System.out.println("\nDevice Information:");
        thermostat.displayStatus();

    }
}

/*
I/P ->
Enter Thermostat Device ID: 1234
Enter Thermostat Status (On/Off): Off
Enter Temperature Setting: 32

O/P->
Device Information:
Device ID: 1234
Status: Off
Thermostat is Off — no temperature setting available.

 */