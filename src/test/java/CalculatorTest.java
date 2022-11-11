import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void testSum(){
        // GIVEN
        Calculator calculator = new Calculator();
        int a = 2;
        int b = 2;
        int expected = 4;

        // WHEN
        int actual = calculator.sum(a, b);

        // THEN
        Assert.assertEquals(expected, actual);
    }
}
