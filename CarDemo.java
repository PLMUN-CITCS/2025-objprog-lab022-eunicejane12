// Car class definition
class Car {
    // Attributes of the Car class
    String make;
    String model;
    int year;

    // Method to display the car's information
    public void displayInfo() {
        // Printing the car details in the format: Car: [year] [make] [model]
        System.out.println("Car: " + year + " " + make + " " + model);
    }
}

// Main class to run the program
public class CarDemo {
    public static void main(String[] args) {
        // Create an object of the Car class
        Car myCar = new Car();

        // Assign values to the attributes of the myCar object
        myCar.make = "Toyota";
        myCar.model = "Corolla";
        myCar.year = 2020;

        // Call the displayInfo method to print car information
        myCar.displayInfo();
    }
}
