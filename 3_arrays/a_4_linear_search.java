public class a_4_linear_search {

    public static int LenearSearch(int arr[], int val) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == val) {
                return i;
            }

        }

        return -1;
    }

    public static void main(String[] args) {

        int arr[] = { 11, 12, 13, 15, 18 };
        int val = 73;

        int v = LenearSearch(arr, val);
        if (v != -1) {
            System.out.println("the " + val + " is at " + v);
        } else {
            System.out.println("val is not present");
        }
    }

}
