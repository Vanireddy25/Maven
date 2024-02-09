package streams;
import java.util.*;
import java.util.stream.Collectors;
public class StringLengthGrouper {

    public static Map<Integer, List<String>> groupByLength(List<String> strings) {
        return strings.stream()
                .collect(Collectors.groupingBy(String::length));
    }
}
