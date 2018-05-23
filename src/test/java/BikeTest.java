import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BikeTest {

    Bike bike;
    Engine engine;

    @Before
    public void before(){
        bike = new Bike(2000,"Black");
        engine = new Engine(300, false);
    }

    @Test
    public void canChangeStatus(){
        engine.operate();
        assertEquals(true, engine.getStatus());
    }
}
