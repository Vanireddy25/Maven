package streams;
import streams.DuplicateRemover;
import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;

public class DuplicateRemoverTest {

    @Test
    public void testRemoveDuplicates_NoDuplicates() {
        List<Integer> inputList = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> result = DuplicateRemover.removeDuplicates(inputList);
        assertEquals(inputList, result);
    }

    @Test
    public void testRemoveDuplicates_WithDuplicates() {
        List<Integer> inputList = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> result = DuplicateRemover.removeDuplicates(inputList);
        assertEquals(expected, result);
    }
}