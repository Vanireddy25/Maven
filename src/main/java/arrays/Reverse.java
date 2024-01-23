package arrays;
public class Reverse {
        public static void main(String[] args) {
            int[] a = {4,7,13,26,2,19};
            int i = 0, j = a.length - 1, temp;
            while (i < j) {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
            System.out.print(a[0] + " " + a[1] + " " + a[2] + " " + a[3] + " " + a[4] + " " + a[5]);
        }
    }
