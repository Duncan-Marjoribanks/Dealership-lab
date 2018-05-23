import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LightTest {

    Light headlight;

    @Before
    public void before(){
        headlight = new Light("Headlight", "Lights are off");

    }

    @Test
    public void canGetStatus(){
        assertEquals("Lights are off", headlight.getStatus());
    }

    @Test
    public void canChangeStatus(){
        headlight.operate();
        assertEquals("Lights are on", headlight.getStatus());
    }
}
