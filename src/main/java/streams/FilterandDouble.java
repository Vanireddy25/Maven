package streams;
import java.util.List;
import java.util.stream.Collectors;

public class FilterandDouble {
    // Method to filter out even numbers and double each remaining number using streams
    public static List<Integer> filterAndDouble(List<Integer> numbers) {
        // Using streams to process the list
        return numbers.stream()
                // Filtering out even numbers
                .filter(n -> n % 2 != 0)
                // Doubling each remaining number
                .map(n -> n * 2)
                // Collecting the results into a new list
                .collect(Collectors.toList());
    }
}
