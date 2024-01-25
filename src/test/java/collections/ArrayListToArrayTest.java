package collections;

import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.assertArrayEquals;

public class ArrayListToArrayTest {

    @Test
    public void testConvertToArray() {
        // Create an ArrayList of Strings
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Orange");

        // Test converting ArrayList to array
        ArrayListToArray converter = new ArrayListToArray();  // create an instance of Convert class
        String[] expectedArray = {"Apple", "Banana", "Orange"};
        String[] actualArray = converter.convertToArray(stringList);

        // Verify the converted array
        assertArrayEquals(expectedArray, actualArray);
    }
}