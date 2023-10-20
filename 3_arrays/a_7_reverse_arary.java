public class a_7_reverse_arary {

    public static void reverse(int arr[]) {
        int rarr[] = new int[arr.length];
        int j = arr.length-1;
        int i = 0;

        while (i <=j ) {
            rarr[j] = arr[i];
        }

        printArr(rarr);

    }

    public static void printArr(int arr[]) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.print("]");
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 11, 12, 13, 15, 18 };

        reverse(arr);

    }

}
