package strings;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import strings.Rotation;
public class RotationTest {

    @Test
    public void testIsRotation() {
        // Test case 1: Rotated string
        assertTrue(Rotation.isRotation("JavaJ2eeStrutsHibernate", "StrutsHibernateJavaJ2ee"));

        // Test case 2: Not a rotated string
        assertFalse(Rotation.isRotation("Hello", "World"));

        // Test case 3: Empty strings
        assertFalse(Rotation.isRotation("", ""));

        // Test case 4: Unequal lengths
        assertFalse(Rotation.isRotation("abc", "abcd"));

        // Test case 5: Null strings
        assertFalse(Rotation.isRotation(" ", "test"));

        // Test case 6: Null strings
        assertFalse(Rotation.isRotation("test", " "));
    }
}
