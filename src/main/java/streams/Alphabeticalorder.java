package streams;
 import java.util.Arrays;
import java.util.stream.Collectors;

    public class Alphabeticalorder {
        public static void main(String[] args) {
            // Sample array of strings
            String[] stringsArray = {"apple", "banana", "orange", "grape", "kiwi"};

            // Using streams and lambdas to capitalize the first letter
            // and print the strings in alphabetical order
            Arrays.stream(stringsArray)
                    .map(s -> Character.toUpperCase(s.charAt(0)) + s.substring(1))
                    .sorted()
                    .forEach(System.out::println);
        }
    }

