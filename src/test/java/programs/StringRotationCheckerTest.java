package programs;
import static org.junit.Assert.*;
import programs.StringRotationChecker;
import org.junit.Test;
public class StringRotationCheckerTest {
    @Test
    public void testIsRotationTrue() {
        String str1 = "waterbottle";
        String str2 = "erbottlewat";
        assertTrue(StringRotationChecker.isRotation(str1, str2));
    }
    @Test
    public void testIsRotationFalse() {
        String str1 = "hello";
        String str2 = "world";
        assertFalse(StringRotationChecker.isRotation(str1, str2));
    }
    @Test
    public void testIsRotationSameString() {
        String str1 = "abcde";
        assertTrue(StringRotationChecker.isRotation(str1, str1));
    }
    @Test
    public void testIsRotationEmptyString() {
        String str1 = "";
        String str2 = "";
        assertTrue(StringRotationChecker.isRotation(str1, str2));
    }
    @Test
    public void testIsRotationNullString() {
        String str1 = null;
        String str2 = null;
        assertFalse(StringRotationChecker.isRotation(str1, str2));
    }
}
