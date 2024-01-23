package arrays;
import java.util.Arrays;
public class Relativeorder {
        public static void moveZeros(int[] nums) {
            int nonZeroIndex = 0;
            for (int i = 0; i < nums.length; i++)// moving non-zero elements to front
            {
                if (nums[i] != 0) {
                    nums[nonZeroIndex] = nums[i];
                    nonZeroIndex++;
                }}
            for (int i = nonZeroIndex; i < nums.length; i++) {
                nums[i] = 0;
            }
        }
        public static void main(String[] args) {
            int[] nums = {0, 1, 0, 3, 12};
            System.out.println("Original Array: " + Arrays.toString(nums));
            moveZeros(nums);
            System.out.println("Array after moving zeros: " + Arrays.toString(nums));
        }
    }

