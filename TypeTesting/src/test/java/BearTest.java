import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

public class BearTest {

    private Bear bear;

    @Before
    public void setup(){
        bear = new Bear("Fernie", 6, 95.62, 'f');
    }

    @Test
    public void bearHasAName() {
        assertEquals("Fernie", bear.getName());
    }

    @Test
    public void bearHasAnAge() {
        assertEquals(6, bear.getAge());
    }

    @Test
    public void bearHasAnWeight() {
        assertEquals(95.62, bear.getWeight(), 0.0);
    }

    @Test
    public void bearIsReadyToHibernateIfGreaterThan80() {
        assertEquals(true, bear.readyToHibernate());
    }

    @Test
    public void bearIsNotReadyToHibernateIfLessThan80() {
        Bear lightBear = new Bear("Davidos", 30, 45.23, 'f');
        assertEquals(false, lightBear.readyToHibernate());
    }

    @Test
    public void BearHasASex() {
        assertEquals('f', bear.getSex());
    }

}
