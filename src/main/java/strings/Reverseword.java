package strings;
public class Reverseword {
    public static void main(String[] args) {
        // Input sentence
        String inputSentence = "Java J2EE Reverse Me";

        // Reverse each word in the sentence
        String reversedSentence = reverseWords(inputSentence);

        // Display the result
        System.out.println("Original Sentence: " + inputSentence);
        System.out.println("Reversed Sentence: " + reversedSentence);
    }
    // Function to reverse each word in a sentence
    public static String reverseWords(String sentence) {
        String[] words = sentence.split("\\s+");
        StringBuilder reversedSentence = new StringBuilder();

        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word).reverse();
            reversedSentence.append(reversedWord).append(" ");
        }
        // Remove the trailing space
        return reversedSentence.toString().trim();
    }
}
