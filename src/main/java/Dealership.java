import java.util.ArrayList;

public class Dealership {

    private String dealer;
    private int till;
    private ArrayList<Vehicle> vehicles;

    public Dealership(String dealer, int till){
        this.dealer = dealer;
        this.till = till;
        this.vehicles = new ArrayList<>();
    }


    public int vehiclesNumber() {
        return this.vehicles.size();
    }

    public void addVehicle(Vehicle vehicle){
        this.vehicles.add(vehicle);
    }
}
