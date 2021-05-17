import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void canAdd(){
        assertEquals(4, calculator.add(2,2));
    }

    @Test
    public void canSubtract(){
        assertEquals(4, calculator.subtract(8,4));
    }

    @Test
    public void canMultiply(){
        assertEquals(16, calculator.multiply(4,4));
    }

    @Test
    public void canDivide(){
        assertEquals(16.00, calculator.divide(32.00,2.00), 0.0);
    }

}
