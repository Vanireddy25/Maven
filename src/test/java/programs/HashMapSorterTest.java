package programs;
import programs.HashMapSorter;
import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class HashMapSorterTest {
    @Test
    public void testSortHashMap() {
        HashMapSorter sorter = new HashMapSorter();
        Map<Integer, String> unsortedMap = new HashMap<>();
        unsortedMap.put(3, "Three");
        unsortedMap.put(1, "One");
        unsortedMap.put(2, "Two");
        unsortedMap.put(4, "Four");

        Map<Integer, String> sortedMap = sorter.sortHashMap(unsortedMap);

        assertEquals("Four", sortedMap.get(4));
        assertEquals("One", sortedMap.get(1));
        assertEquals("Three", sortedMap.get(3));
        assertEquals("Two", sortedMap.get(2));
    }
    @Test
    public void testEmptyHashMap() {
        HashMapSorter sorter = new HashMapSorter();
        Map<Integer, String> unsortedMap = new HashMap<>();

        Map<Integer, String> sortedMap = sorter.sortHashMap(unsortedMap);

        assertEquals(0, sortedMap.size());
    }
}
