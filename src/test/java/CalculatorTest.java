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

    @Test
    public void testMultiply(){
        // GIVEN
        Calculator calculator = new Calculator();
        int a = 3;
        int b = 2;
        int expected = 6;

        // WHEN
        int actual = calculator.multiply(a, b);

        // THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSubtract(){
        // GIVEN
        Calculator calculator = new Calculator();
        int a = 3;
        int b = 2;
        int expected = 1;

        // WHEN
        int actual = calculator.subtract(a, b);

        // THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testDivide(){
        // GIVEN
        Calculator calculator = new Calculator();
        int a = 4;
        int b = 2;
        int expected = 2;

        // WHEN
        int actual = calculator.subtract(a, b);

        // THEN
        Assert.assertEquals(expected, actual);
    }
}
