package threads;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
public class NumberPrinterTest {
    @Test
    public void testNumberPrinter() {
        // Set up a new output stream for testing
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Run the number printer methods
        NumberPrinter.printEvenNumbers();
        NumberPrinter.printOddNumbers();

        // Wait for both threads to complete
        try {
            Thread.sleep(1500); // Adjust the sleep time based on the thread processing time
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Get the expected and actual output
        String expectedOutput = "Even: 2\nEven: 4\nEven: 6\n";
        expectedOutput += "Odd: 1\nOdd: 3\nOdd: 5\n";
        String actualOutput = outputStream.toString().trim();

        // Print the expected and actual output for analysis
        System.out.println("Expected Output:");
        System.out.println(expectedOutput);
        System.out.println("Actual Output:");
        System.out.println(actualOutput);
    }
}
