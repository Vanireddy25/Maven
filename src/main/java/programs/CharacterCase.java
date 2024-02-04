package programs;

public class CharacterCase {

    public static String convertCase(String input) {
        char[] charArray = input.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];
            if (Character.isLowerCase(ch)) {
                charArray[i] = Character.toUpperCase(ch);
            } else if (Character.isUpperCase(ch)) {
                charArray[i] = Character.toLowerCase(ch);
            }
        }

        return new String(charArray);
    }
}
