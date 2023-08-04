package Vehicle;

import java.util.Scanner;

public class Vehicle {
Scanner sc = new Scanner(System.in);
    private String make;
    private int year;

    public Vehicle(String make, int year) {
        this.make = make;
        this.year = year;
    }

    public void displayDetails(){
        System.out.println("Enter the manufacturer of the vehicle: ");
        make = sc.nextLine();

        System.out.println("Enter the year of the vehicle: ");
        year = sc.nextInt();
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "sc=" + sc +
                ", make='" + make + '\'' +
                ", year=" + year +
                '}';
    }
}
