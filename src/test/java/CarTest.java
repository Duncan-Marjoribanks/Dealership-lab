import behaviours.Icomponent;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    Car car;
    Engine engine;

    @Before
    public void before(){
        car = new Car(5000,"Blue");
        engine = new Engine( 150, false);
    }

    @Test
    public void canAddEngine(){
        car.addComponent(engine);
        assertEquals(1, car.checkNumberOfComponents());
    }

    @Test
    public void canCheckEngineStatus(){
        assertEquals(false, this.engine.getStatus());
    }

    @Test
    public void canChangeEngineStatus(){
        engine.operate();
        assertEquals(true, this.engine.getStatus());
    }




}
