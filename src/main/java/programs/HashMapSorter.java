package programs;
import java.util.*;

public class HashMapSorter {

    public Map<Integer, String> sortHashMap(Map<Integer, String> unsortedMap) {
        // Convert HashMap to List of Map.Entry objects
        List<Map.Entry<Integer, String>> list = new LinkedList<>(unsortedMap.entrySet());

        // Sort the list based on values using a custom comparator
        Collections.sort(list, new Comparator<Map.Entry<Integer, String>>() {
            public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });

        // Create a LinkedHashMap to maintain the order of insertion
        Map<Integer, String> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<Integer, String> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
    }
}
