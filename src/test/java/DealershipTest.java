import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;
    Vehicle vehicle, car, bike;
    Engine engine;
    Light headLight;

    @Before
    public void before(){
        dealership = new Dealership("Barry", 0);
        car = new Car(400, "Red");
        bike = new Bike(800, "Blue");
    }

    @Test
    public void canCheckVehiclesNumber(){
        assertEquals(0, dealership.vehiclesNumber());
    }

    @Test
    public void canAddVehicle(){
        dealership.addVehicle(vehicle);
        assertEquals(1, dealership.vehiclesNumber());
    }

}
