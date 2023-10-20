
import java.util.*;
public class a_5_largest_in_arr {

    public static int largest(int arr[]) {
        int large = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > large) {
                large = arr[i];
            }
        }

        return large;
    }

    public static void main(String[] args) {

        int arr[] = { 11, 12, 131, 15, 18 };

      int lg  =   largest(arr);
      System.out.println("the largest val is "+ lg);
    }

}
