package strings;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import strings.Anagrams;
public class AnagramsTest {

    @Test
    public void testCheckAnagrams() {
        // Test case 1: Anagrams
        assertTrue(Anagrams.checkAnagrams("listen", "silent"));

        // Test case 2: Not Anagrams
        assertFalse(Anagrams.checkAnagrams("hello", "world"));

        // Test case 3: Anagrams with different case
        assertTrue(Anagrams.checkAnagrams("Act", "Cat"));

        // Test case 4: Anagrams with spaces
        assertTrue(Anagrams.checkAnagrams("astronomer", "moon starer"));

        // Test case 5: Anagrams with special characters
        assertTrue(Anagrams.checkAnagrams("debit card", "bad credit"));

        // Test case 6: Not Anagrams with different lengths
        assertFalse(Anagrams.checkAnagrams("cat", "tacooo"));

        // Test case 7: Anagrams with repeated characters
        assertTrue(Anagrams.checkAnagrams("aab", "aba"));

        // Add more test cases as needed
    }
}
