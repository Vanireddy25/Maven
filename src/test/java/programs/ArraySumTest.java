
package programs;
import programs.ArraySum;
import static org.junit.Assert.*;
import org.junit.Test;

public class ArraySumTest {

    @Test
    public void testCalculateSum() {
        int[] arr = {1, 2, 3, 4, 5};
        int expected = 15;
        assertEquals(expected, ArraySum.calculateSum(arr));
    }

    @Test
    public void testCalculateSumEmptyArray() {
        int[] arr = {};
        int expected = 0;
        assertEquals(expected, ArraySum.calculateSum(arr));
    }
}