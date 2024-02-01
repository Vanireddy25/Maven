package programs;
public class SwapIntegers {
    public static void swapIntegersWithoutTemp(int a, int b) {
        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swap the values without using a third variable
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
