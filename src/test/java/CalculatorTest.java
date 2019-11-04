import org.junit.Before;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {
    Calculator myCalculator;

    @Before
    public void before() { myCalculator = new Calculator(); }

    @Test
    public void canAdd() {
        assertEquals(2.0, myCalculator.add(1.0, 1.0), 0.01);
    }

    @Test
    public void canSubtract() {
        assertEquals(1.5, myCalculator.subtract(4.0, 2.5), 0.01);
    }

    @Test
    public void canMultiply() {
        assertEquals(9.9, myCalculator.multiply(3.3, 3.0), 0.01);
    }

    @Test
    public void canDivide() {
        assertEquals(4.4, myCalculator.divide(8.8, 2.0), 0.01);
    }

}
