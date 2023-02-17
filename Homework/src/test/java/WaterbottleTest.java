import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;


public class WaterbottleTest {

    Waterbottle waterbottle;

    @Before
    public void before(){
        waterbottle = new Waterbottle(100);
    }

    @Test
    public void getVolume(){
        assertEquals(100, waterbottle.getVolume());
    }

    @Test
    public void remove10FromVolume(){
        assertEquals(90, waterbottle.remove10FromVolume());
    }

    @Test
    public void emptyVolume(){
        assertEquals(0, waterbottle.emptyVolume());
    }
    @Test
    public void fillVolume(){
        assertEquals(100, waterbottle.fillVolume());
    }
}
