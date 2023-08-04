package Vehicle;

public class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String make, int year, boolean hasSidecar) {
        super(make, year);
        this.hasSidecar = hasSidecar;
    }

    public void displayDetails(){

    }

}
