package streams;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
 public class AlphabeticalorderTest {

        @Test
        public void testStringManipulation() {
            // Redirect System.out for testing
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            System.setOut(new PrintStream(outputStream));

            // Sample array of strings
            String[] stringsArray = {"apple", "banana", "orange", "grape", "kiwi"};

            // Call the main method with the sample array
            Alphabeticalorder.main(new String[]{});

            // Expected result after capitalizing and sorting
            Collectors Collectors = null;
            String expectedResult = Arrays.stream(stringsArray)
                    .map(s -> Character.toUpperCase(s.charAt(0)) + s.substring(1))
                    .sorted()
                    .collect(Collectors.joining(System.lineSeparator())) + System.lineSeparator();
            // Reset System.out
            System.setOut(System.out);

            // Verify the output matches the expected result
            assertEquals(expectedResult, outputStream.toString());
        }
    }
