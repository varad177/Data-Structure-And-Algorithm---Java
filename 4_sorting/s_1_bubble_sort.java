
public class s_1_bubble_sort {

    // bubble sort
    // large element comes to the end of the arrays
    // by swapping with adjacent element

    // 2 for loop so time complexity id n^2
    // if sorted array then also TC is n^2
    public static void bubbleSort(int arr[]) {

        for (int turn = 0; turn < arr.length - 1; turn++) {
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }

        }
        ptintArr(arr);
    }

    public static void ptintArr(int arr[]) {
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.print(" ]");
        System.out.println();
    }

    public static void main(String[] args) {

        int arr[] = { 5, 4, 1, 3, 2 };

        bubbleSort(arr);

    }
}