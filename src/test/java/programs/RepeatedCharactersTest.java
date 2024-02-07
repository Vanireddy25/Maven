package programs;
import programs.RepeatedCharacters;
import static org.junit.Assert.*;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class RepeatedCharactersTest {

    @Test
    public void testPrintRepeatedCharacters() {
        String str = "programming";
        String expectedOutput = "Repeated Characters:\r\nr - 2\r\ng - 2\r\nm - 2";
        assertEquals(expectedOutput, getPrintedOutput(str));
    }

    @Test
    public void testPrintRepeatedCharactersNoRepeats() {
        String str = "abcdef";
        String expectedOutput = "Repeated Characters:";
        assertEquals(expectedOutput, getPrintedOutput(str));
    }

    private String getPrintedOutput(String str) {
        // Redirect standard output to capture printed output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        // Invoke the method to be tested
        RepeatedCharacters.printRepeatedCharacters(str);

        // Reset standard output
        System.out.flush();
        System.setOut(originalOut);

        return outputStream.toString().trim();
    }
}
