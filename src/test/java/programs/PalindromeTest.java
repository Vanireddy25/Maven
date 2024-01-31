package programs;
import programs.Palindrome;
import org.junit.Test;
import static org.junit.Assert.*;
public class PalindromeTest {

        @Test
        public void testIsPalindromeTrue() {
            assertTrue(programs.Palindrome.isPalindrome(1221));
        }

        @Test
        public void testIsPalindromeFalse() {
            assertFalse(programs.Palindrome.isPalindrome(12345));
        }
    }

