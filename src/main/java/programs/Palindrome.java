package programs;
public class Palindrome {
    public static boolean isPalindrome(int num) {
            int original = num;
            int reversed = 0;

            while (num > 0) {
                int lastDigit = num % 10;
                reversed = reversed * 10 + lastDigit;
                num /= 10;
            }

            return original == reversed;
        }
}
