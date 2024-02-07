package streams;
import java.util.Arrays;
public class StringswithVowels {
    public static void printStringsWithVowels(String[] strings) {
        Arrays.stream(strings)
                .filter(str -> countVowels(str) > 0)
                .forEach(str -> System.out.println("String: " + str + ", Number of Vowels: " + countVowels(str)));
    }
    private static long countVowels(String str) {
        return str.toLowerCase().chars()
                .filter(ch -> isVowel((char) ch))
                .count();
    }

    private static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
