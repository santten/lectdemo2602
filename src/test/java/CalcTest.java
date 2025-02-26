import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalcTest {
    @Test
    public void testSum(){
        assertEquals(5, Calc.add(2, 3));
    }

    @Test
    public void testSubtract(){
        assertEquals(5, Calc.subtract(8, 3));
    }

    @Test
    public void testMultiply(){
        assertEquals(24, Calc.multiply(8, 3));
    }

    @Test
    public void testDivide(){
        assertEquals(5, Calc.divide(15, 3));
    }
}
