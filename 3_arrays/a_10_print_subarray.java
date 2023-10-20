public class a_10_print_subarray {

    // printing the sub array
    // in this we first find the start , then last
    // and then we will print the elements which are present in between this

    // for that we have to use the 3 for loop

    public static void PrintSubArr(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            int st = i;
            for (int j = i ; j < arr.length; j++) {
                int ed = j;

                for (int k = st; k <= ed; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }

    }

    public static void main(String[] args) {

        int arr[] = { 2,4,6,8,10};

        PrintSubArr(arr);

    }
}
