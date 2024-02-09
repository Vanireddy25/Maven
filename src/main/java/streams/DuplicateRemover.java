package streams;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateRemover {

    public static List<Integer> removeDuplicates(List<Integer> list) {
        return list.stream()
                .distinct()
                .collect(Collectors.toList());
    }
}