import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class EngineTest {

    Engine engine;

    @Before
    public void before(){
        engine = new Engine(150, false);
    }

    @Test
    public void canGethp(){
        assertEquals(150, engine.gethp());
    }

    @Test
    public void canGetEngineStatus(){
        assertEquals(false, engine.getStatus());
    }

    @Test
    public void canOperate(){
        engine.operate();
        assertEquals(true, engine.getStatus());

    }
}
