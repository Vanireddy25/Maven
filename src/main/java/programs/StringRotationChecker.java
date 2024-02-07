package programs;
public class StringRotationChecker {

    public static boolean isRotation(String str1, String str2) {
        // Check if both strings are not null and have the same length
        if (str1 == null || str2 == null || str1.length() != str2.length()) {
            return false;
        }

        // Concatenate str1 with itself to create a potential rotation
        String concatenatedStr = str1 + str1;

        // Check if str2 is a substring of the concatenated string
        return concatenatedStr.contains(str2);
    }
}
