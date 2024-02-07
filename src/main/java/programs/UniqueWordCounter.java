package programs;
import java.util.HashMap;
import java.util.Map;
public class UniqueWordCounter {
    public static int countUniqueWords(String str) {
        // Remove leading and trailing whitespaces and split the string into words
        String[] words = str.trim().split("\\s+");

        // Create a HashMap to store word frequencies
        Map<String, Integer> wordFrequencyMap = new HashMap<>();

        // Count the frequency of each word
        for (String word : words) {
            wordFrequencyMap.put(word, wordFrequencyMap.getOrDefault(word, 0) + 1);
        }

        // Count the number of unique words (entries with frequency 1)
        int uniqueWordCount = 0;
        for (Map.Entry<String, Integer> entry : wordFrequencyMap.entrySet()) {
            if (entry.getValue() == 1) {
                uniqueWordCount++;
            }
        }

        return uniqueWordCount;
    }
}