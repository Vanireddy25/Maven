package strings;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class VowelsTest {


    @Test
    public void testCountVowels() {
        // Test case 1: String with no vowels
        assertEquals(0, Vowels.countVowels("xyz"));

        // Test case 2: String with all vowels
        assertEquals(5, Vowels.countVowels("aeiou"));

        // Test case 3: String with a mix of vowels and consonants
        assertEquals(2, Vowels.countVowels("hello"));


        // Test case 4: Empty string
        assertEquals(0, Vowels.countVowels(""));

        // Test case 5: String with uppercase and lowercase vowels
        assertEquals(10, Vowels.countVowels("aAEeIiOoUu"));

        // Test case 6: String with numbers and special characters
        assertEquals(1, Vowels.countVowels("h3llo!"));

        // Test case 7: String with spaces
        assertEquals(3, Vowels.countVowels("hello world"));

        // Test case 8: String with only spaces
        assertEquals(0, Vowels.countVowels("   "));

        // Test case 9: String with non-alphabetic characters
        assertEquals(0, Vowels.countVowels("12345"));

        // Test case 10: String with non-English characters
        assertEquals(0, Vowels.countVowels("áéî"));
    }
}
