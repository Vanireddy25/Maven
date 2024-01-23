package arrays;

public class Bubblesort {
        public static void main(String[] args) {
            int[] arr = {49,64,96,13,62,73,14};

            // Sort the array using Bubble Sort
            bubbleSort(arr);

            // Display the sorted array
            System.out.println("Sorted Array:");
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }

        // Method to perform Bubble Sort on the given array
        private static void bubbleSort(int[] arr) {
            int length = arr.length;

            for (int i = 0; i < length - 1; i++) {
                for (int j = 0; j < length - 1 - i; j++) {
                    // Swap if the element found is greater than the next element
                    if (arr[j] > arr[j + 1]) {
                        // Swap arr[j] and arr[j+1]
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }}}
