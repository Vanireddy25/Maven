package streams;
import streams.StringswithVowels;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class StringswithVowelsTest {

    @Test
    public void testPrintStringsWithVowels() {
        // Redirect standard output to capture printed content
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Test input
        String[] inputStrings = {"Hello", "World", "Java", "Programming"};

        // Call the method to be tested
        StringswithVowels.printStringsWithVowels(inputStrings);

        // Verify the output
        assertEquals("String: Hello, Number of Vowels: 2\r\nString: World, Number of Vowels: 1\r\nString: Java, Number of Vowels: 2\r\nString: Programming, Number of Vowels: 3\r\n", outContent.toString());

        // Reset standard output
        System.setOut(System.out);
    }

    @Test
    public void testPrintStringsWithVowelsNoVowels() {
        // Redirect standard output to capture printed content
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Test input
        String[] inputStrings = {"Fly", "Sky", "Dry"};

        // Call the method to be tested
        StringswithVowels.printStringsWithVowels(inputStrings);

        // Verify the output
        assertEquals("", outContent.toString());

        // Reset standard output
        System.setOut(System.out);
    }
}
