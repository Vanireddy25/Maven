package programs;

import static org.junit.Assert.*;

import programs.FactorialCalculator;
import org.junit.Test;

public class FactorialCalculatorTest {

    @Test
    public void testCalculateFactorial() {
        int number = 5;
        long expectedFactorial = 120; // Expected factorial of 5
        long factorial = FactorialCalculator.calculateFactorial(number);
        assertEquals(expectedFactorial, factorial);
    }

    @Test
    public void testCalculateFactorialZero() {
        int number = 0;
        long expectedFactorial = 1; // Expected factorial of 0
        long factorial = FactorialCalculator.calculateFactorial(number);
        assertEquals(expectedFactorial, factorial);
    }
}