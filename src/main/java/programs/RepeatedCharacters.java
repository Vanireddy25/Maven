package programs;
import java.util.HashMap;
import java.util.Map;
public class RepeatedCharacters {

    public static void printRepeatedCharacters(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Count occurrences of each character in the string
        for (char ch : str.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        // Print repeated characters
        System.out.println("Repeated Characters:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        }
    }
}
