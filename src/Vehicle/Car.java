package Vehicle;

import java.util.Scanner;

public class Car extends Vehicle {
    Scanner sc = new Scanner(System.in);
    private int numOfDoor;

    public Car(String make, int year, int numOfDoor) {
        super(make, year);
        this.numOfDoor = numOfDoor;
    }

    public void displayDetails() {

        System.out.println("Enter the number of doors: ");
        numOfDoor = sc.nextInt();

    }

    @Override
    public String toString() {
        return "Car{" +
                "sc=" + sc +
                ", numOfDoor=" + numOfDoor +
                ", sc=" + sc +
                '}';
    }
}



