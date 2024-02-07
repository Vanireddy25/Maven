package programs;
import java.util.HashMap;
import java.util.Map;

public class RepeatedDigitsFinder {

    public static void findRepeatedDigits(int number) {
        Map<Integer, Integer> digitFrequency = new HashMap<>();

        // Convert the number to a string for easy digit extraction
        String numberStr = String.valueOf(number);

        // Count the frequency of each digit
        for (char digitChar : numberStr.toCharArray()) {
            int digit = Character.getNumericValue(digitChar);
            digitFrequency.put(digit, digitFrequency.getOrDefault(digit, 0) + 1);
        }

        // Print the repeated digits
        System.out.println("Repeated digits in the number:");
        for (Map.Entry<Integer, Integer> entry : digitFrequency.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }
    }
}