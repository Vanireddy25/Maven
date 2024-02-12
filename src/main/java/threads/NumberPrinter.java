package threads;
public class NumberPrinter {
    public static void printEvenNumbers() {
        for (int i = 2; i <= 6; i += 2) {
            System.out.println("Even: " + i);
        }
    }

    public static void printOddNumbers() {
        for (int i = 1; i <= 5; i += 2) {
            System.out.println("Odd: " + i);
        }
    }
}