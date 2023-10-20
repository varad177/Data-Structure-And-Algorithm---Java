import java.util.Arrays;
import java.util.Collections;

public class s_4_inbuild_sort {

    //time complexity = nlogn

    public static void printArr(int arr[]) {
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.print("]");
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        // Integer arr[] = { 5, 4, 1, 3, 2 };
        // Arrays.sort(arr); // 12345
        // Arrays.sort(arr , 0 ,3); //14532

        //for reverse
    //    Arrays.sort(arr ,Collections.reverseOrder());
    //collections works on object so make Integer Insted of int

        printArr(arr);
    }
}
