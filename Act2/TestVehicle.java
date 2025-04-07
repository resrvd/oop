package Act2;

import java.util.Scanner;

// Base Class Vehicle

class Vehicle{
    private String brand;
    private double speed;
    private String fuelType;

    // Constructor
    public Vehicle(String brand, double speed, String fuelType) {
        this.brand = brand;
        this.speed = speed;
        this.fuelType = fuelType;
    }

    // Ecapsulation: Getter and Setter methods for brand, speed, and fuelType
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public double getSpeed() {
        return speed;
    }
    public void setSpeed(double speed) {
        this.speed = speed;
    }
    public String getFuelType() {
        return fuelType;
    }
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    // Method to display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Fuel Type: " + fuelType);
    }
    // Car Subclass
    class car extends Vehicle{
        private int numDoors;

        // Constructor
        public car(String brand, double speed, String fuelType, int numDoors) {
            super(brand, speed, fuelType);
            this.numDoors = numDoors;
        }

        // Encapsulation: Getter and Setter methods for numberOfDoors
        public int getnumDoors() {
            return numDoors;
        }
        public void setnumDoors(int numDoors) {
            this.numDoors = numDoors;
        }

        // Method to display car details
        // Polymorphism
        @Override
        public void displayVehicleDetails() {
            super.displayVehicleDetails();
            System.out.println("Number of Doors: " + numDoors);
        }
    }
    // Motorcycle Subclass
    class motorcycle extends Vehicle{
        private boolean hasSidecar;

        // Constructor
        public motorcycle(String brand, double speed, String fuelType, boolean hasSidecar) {
            super(brand, speed, fuelType);
            this.hasSidecar = hasSidecar;
        }

        // Encapsulation: Getter and Setter methods for hasSidecar
        public boolean gethasSidecar() {
            return hasSidecar;
        }
        public void sethasSidecar(boolean hasSidecar) {
            this.hasSidecar = hasSidecar;
        }

        // Method to display motorcycle details
        // Polymorphism
        @Override
        public void displayVehicleDetails() {
            super.displayVehicleDetails();
            System.out.println("Has Sidecar: " + (hasSidecar ? "Yes" : "No"));
        }
    }

    // Implement the TestVehicle Class (Main Method)
    public static void main(String[] args) {
        Scanner poops = new Scanner(System.in);

        // Enter Car Details
        System.out.println("Enter Car Details:");
        System.out.print("Brand: ");
        String carBrand = poops.nextLine();
        System.out.print("Speed (km/h): ");
        double carSpeed = poops.nextDouble();
        System.out.print("Fuel Type: ");
        String carFuelType = poops.next();
        System.out.print("Number of Doors: ");
        int carNumDoors = poops.nextInt();

        // Enter Motorcycle Details
        System.out.println("\nEnter Motorcycle Details:");
        System.out.print("Brand: ");
        String motorcycleBrand = poops.next();
        System.out.print("Speed (km/h): ");
        double motorcycleSpeed = poops.nextDouble();
        System.out.print("Fuel Type: ");
        String motorcycleFuelType = poops.next();
        System.out.print("Has Sidecar (true/false): ");
        boolean motorcycleHasSidecar = poops.nextBoolean();

        // Create Car and Motorcycle objects
        Vehicle.car car = new Vehicle(motorcycleFuelType, motorcycleSpeed, motorcycleFuelType).new car(carBrand, carSpeed, carFuelType, carNumDoors);
        Vehicle.motorcycle motorcycle = new Vehicle(motorcycleFuelType, motorcycleSpeed, motorcycleFuelType).new motorcycle(motorcycleBrand, motorcycleSpeed, motorcycleFuelType, motorcycleHasSidecar);

        // Display Car and Motorcycle details
        System.out.println("\nCar Details:");
        car.displayVehicleDetails();
        System.out.println("\nMotorcycle Details:");
        motorcycle.displayVehicleDetails();

        // Close the scanner
        poops.close();
    }
}