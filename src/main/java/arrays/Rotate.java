package arrays;
import java.util.Arrays;
public class Rotate {
    public static void main(String[] args) {

        int [] rotated = {1, 2, 3, 4, 5, 6, 7};
        int[] newarray = new int[rotated.length];

        for (int i = 2; i < rotated.length; i++) {

            newarray[i-2] = rotated[i];

        }
        for(int i = 0; i < 2; i++) {
            newarray[rotated.length-2+i] = rotated[i];
        }

        System.out.println(Arrays.toString(newarray));
    }

}
