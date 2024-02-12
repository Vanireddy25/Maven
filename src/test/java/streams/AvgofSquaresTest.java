package streams;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class AvgofSquaresTest {
    @Test
    public void test() {
        int[] numbers1 = {1, 2, 3, 4, 5};
        assertEquals(11.66666, AvgofSquares.AvgofSqofOdd(numbers1), 0.0001);

        int[] numbers2 = {2, 4, 6, 8, 10};
        assertEquals(0.0, AvgofSquares.AvgofSqofOdd(numbers2), 0.0001);

        int[] numbers3 = {1, 3, 5, 7, 9};
        assertEquals(33.0, AvgofSquares.AvgofSqofOdd(numbers3), 0.0001);

        int[] numbers4 = {2, 3, 4, 5, 6};
        assertEquals(17.0, AvgofSquares.AvgofSqofOdd(numbers4), 0.0001);

        int[] numbers5 = {1, 1, 1, 1, 1};
        assertEquals(1.0, AvgofSquares.AvgofSqofOdd(numbers5), 0.0001);
    }
}