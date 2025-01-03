abstract class Appliances {
    String brand;
    boolean isOn;

    // Constructor
    Appliances(String brand) {
        this.brand = brand;
        this.isOn = false;
    }

    // Abstract method to be implemented by subclasses
    abstract void operate();

    // Method to turn on the appliance
    void turnOn() {
        isOn = true;
        System.out.println("The appliance is now ON.");
    }

    // Method to turn off the appliance
    void turnOff() {
        isOn = false;
        System.out.println("The appliance is now OFF.");
    }
}

class WashingMachine extends Appliances {

    // Constructor
    WashingMachine(String brand) {
        super(brand);
    }

    // Implementing the operate method
    @Override
    void operate() {
        System.out.println("The washing machine is washing clothes.");
    }
}

class Refrigerator extends Appliances {

    // Constructor
    Refrigerator(String brand) {
        super(brand);
    }

    // Implementing the operate method
    @Override
    void operate() {
        System.out.println("The refrigerator is cooling food.");
    }
}

public class AppliancesMain {
    public static void main(String[] args) {
        // Create objects for appliances
        WashingMachine wm = new WashingMachine("Samsung");
        Refrigerator rf = new Refrigerator("LG");

        // Test WashingMachine
        wm.turnOn();
        wm.operate();
        wm.turnOff();

        // Test Refrigerator
        rf.turnOn();
        rf.operate();
        rf.turnOff();
    }
}
