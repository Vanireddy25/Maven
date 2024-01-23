package strings;
import java.util.Arrays;
public class Anagrams {
    public static void main(String[] args) {
            // Input two strings
            String str1 = "Cat";
            String str2 = "Act";

            // Check if the strings are anagrams
            boolean areAnagrams = checkAnagrams(str1, str2);

            // Display the result
            if (areAnagrams) {
                System.out.println(str1 + " and " + str2 + " are anagrams.");
            } else {
                System.out.println(str1 + " and " + str2 + " are not anagrams.");
            }
        }

        // Function to check if two strings are anagrams
        public static boolean checkAnagrams(String s1, String s2) {
            // Remove spaces and convert to lowercase for case-insensitive comparison
            s1 = s1.replaceAll("\\s", "").toLowerCase();
            s2 = s2.replaceAll("\\s", "").toLowerCase();

            // Check if the lengths are different
            if (s1.length() != s2.length()) {
                return false;
            }

            // Convert strings to char arrays and sort them
            char[] charArray1 = s1.toCharArray();
            char[] charArray2 = s2.toCharArray();

            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            // Compare sorted char arrays
            return Arrays.equals(charArray1, charArray2);
        }
    }