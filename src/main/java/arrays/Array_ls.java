package arrays;
public class Array_ls {
    public static void main(String[] args) {
            int[] numbers = {1,7,9,19,14,36,29};
            int i, largest=numbers[0], smallest=numbers[0];

            for(i = 1; i < numbers.length;i++) {
                if( numbers [i] > largest) {
                    largest = numbers[i];
                }else if( numbers [i] < smallest) {
                    smallest = numbers[i];
                }
            }
            System.out.println("The smallest number in an array is: " + smallest);
            System.out.println("The largest number in an array is: " + largest);
        }
    }

