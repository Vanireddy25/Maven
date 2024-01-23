package arrays;
public class Search {
        public static int search(int[] arr, int x) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == x) {
                    return i;
                }
            }
            return -1;
        }
        public static void main(String[] args) {
            int[] arr = {12, 3, 4, 10, 20};
            int x = 20;
            int result = search(arr, x);

            if (result == -1) {
                System.out.println("Element is not present in array");
            } else {
                System.out.println("Element is present in index " + result);
            }
        }

    }
