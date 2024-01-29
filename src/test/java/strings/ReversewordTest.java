package strings;

import org.junit.jupiter.api.Test;
//import strings.ReverseString;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class ReversewordTest{

    @Test
    public void testReverseWords() {
        // Test case 1: Basic reversal
        assertEquals("123!#@ dcba", Reverseword.reverseWords("@#!321 abcd"));

        assertEquals("avaJ EE2J esreveR eM", Reverseword.reverseWords("Java J2EE Reverse Me"));

        // Test case 2: Reversal with different lengths and spaces
        assertEquals("edoc taht a peek I", Reverseword.reverseWords("code that a keep I"));

        // Test case 3: Reversal with numbers and special characters

        // Test case 4: Empty input
        assertEquals("", Reverseword.reverseWords(""));

        // Test case 5: Null input
        assertEquals("llun", Reverseword.reverseWords("null"));

        // Add more test cases as needed
    }
}
