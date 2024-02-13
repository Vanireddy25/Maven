package streams;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;
public class SumOfSquaresTest {

    @Test
    void testCalculateSumOfSquares() {
        List<Integer> numbers = Arrays.asList(1, -2, 3, -4, 5, -6, 7, -8, 9);
        int expected = 165; // (1^2 + 3^2 + 5^2 + 7^2 + 9^2) = 165

        int actual = SumOfSquares.calculateSumOfSquares(numbers);

        assertEquals(expected, actual);
    }

    @Test
    void testCalculateSumOfSquaresEmptyList() {
        List<Integer> numbers = Arrays.asList();
        int expected = 0; // No positive numbers in an empty list

        int actual = SumOfSquares.calculateSumOfSquares(numbers);

        assertEquals(expected, actual);
    }

    @Test
    void testCalculateSumOfSquaresNoPositiveNumbers() {
        List<Integer> numbers = Arrays.asList(-2, -4, -6, -8);
        int expected = 0; // No positive numbers in the list

        int actual = SumOfSquares.calculateSumOfSquares(numbers);

        assertEquals(expected, actual);
    }
}