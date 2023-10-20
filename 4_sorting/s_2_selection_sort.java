public class s_2_selection_sort {

    // in this
    // ham ek small element nikalte hai
    // use start me push krte hai
    // fir usase bada nikalkar uske aage push karte hai
    // aur aise ham sort karte hai
    // in short -> pick the smallest from unsorted and put in at the beginning

    public static void SelectionSort(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) { // turns
            // here i (turns) -2 becaused the last one is always sorted
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {

                // compare
                if (arr[minPos] > arr[j]) {
                // if (arr[minPos] < arr[j]) { // for reverse 
                    minPos = j;

                }

            }

            // swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;

        }

        printArr(arr);

    }

    public static void printArr(int arr[]) {
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.print(" ]");
        System.out.println();
    }

    public static void main(String[] args) {

        int arr[] = { 5, 4, 1, 3, 2 };

        SelectionSort(arr);

    }
}