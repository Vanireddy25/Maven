package streams;
import java.util.List;
public class SumOfSquares {
    // Method to calculate the sum of squares of all positive integers in a given list
    public static int calculateSumOfSquares(List<Integer> numbers) {
        // Using streams to process the list
        return numbers.stream()
                // Filtering out negative numbers
                .filter(n -> n > 0)
                // Mapping each number to its square
                .mapToInt(n -> n * n)
                // Calculating the sum of squares
                .sum();
    }
}