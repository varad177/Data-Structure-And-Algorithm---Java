public class s_5_counting_sort {
    // counting sort used when numbers are small
    // or
    // if range of number are small
    // in this we first make count array

    public static void countingSort(int arr[]) {
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest + 1];

        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        int j = 0;
        for (int i = 0; i < count.length; i++) {

            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;

            }

        }

        printArr(arr);
    }

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

        countingSort(arr);

    }
}
