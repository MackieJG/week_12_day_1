import org.junit.Test;

import static org.junit.Assert.assertEquals;



public class CalculatorTest {

    @Test
    public void add(){
        Calculator sum = new Calculator();
        assertEquals(10,sum.add(4,6));
    }

    @Test
    public void subtract(){
        Calculator sum = new Calculator();
        assertEquals(5, sum.subtract(10,5));
    }
    @Test
    public void multiply(){
        Calculator sum = new Calculator();
        assertEquals(200, sum.multiply(20,10));
    }
    @Test
    public void divide(){
        Calculator sum = new Calculator();
        assertEquals(4.6976744186046515,sum.divide(50.5,10.75), 0.0);
    }

}
