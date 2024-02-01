package programs;
import programs.SwapIntegers;
import static org.junit.Assert.*;
import org.junit.Test;
public class SwapIntegersTest {

        @Test
        public void testSwapIntegers() {
            int a = 5;
            int b = 10;

            // Perform the swap
            a = a + b;
            b = a - b;
            a = a - b;

            // Test the swapped values
            assertEquals(10, a);
            assertEquals(5, b);
        }

        @Test
        public void testSwapIntegersNegativeValues() {
            int a = -8;
            int b = 3;

            // Perform the swap
            a = a + b;
            b = a - b;
            a = a - b;

            // Test the swapped values
            assertEquals(3, a);
            assertEquals(-8, b);
        }
    }
