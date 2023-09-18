import com.codebase.Calculator;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;
    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Test
    public void canAdd() {
        assertEquals(3, calculator.add(1,2));
    }

    @Test
    public void canSubtract(){
        assertEquals(7, calculator.subtract(10, 3));
    }

    @Test
    public void canMultiply(){
        assertEquals(9, calculator.multiply(3,3));
    }

    @Test
    public void canDivide() {
        assertEquals(12, calculator.divide(24, 2), 0.0);
    }
}
