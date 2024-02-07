package programs;
import programs.ArrayListReversal;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

public class ArrayListReversalTest {

    @Test
    public void testReverseArrayList() {
        List<Integer> originalList = new ArrayList<>();
        originalList.add(1);
        originalList.add(2);
        originalList.add(3);
        originalList.add(4);

        List<Integer> reversedList = ArrayListReversal.reverseArrayList(originalList);

        List<Integer> expectedList = new ArrayList<>();
        expectedList.add(4);
        expectedList.add(3);
        expectedList.add(2);
        expectedList.add(1);

        Assertions.assertEquals(expectedList, reversedList);
    }

    @Test
    public void testReverseArrayListEmptyList() {
        List<Integer> originalList = new ArrayList<>();

        List<Integer> reversedList = ArrayListReversal.reverseArrayList(originalList);

        List<Integer> expectedList = new ArrayList<>();

        Assertions.assertEquals(expectedList, reversedList);
    }
}
