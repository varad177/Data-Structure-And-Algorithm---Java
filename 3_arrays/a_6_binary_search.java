public class a_6_binary_search {

    //time complexity is log(n)
    //or o(log(n))

    public static int binarySearch(int arr[], int val) {

        int st = 0;
        int ed = arr.length -1;

        while (st <= ed) {
            int mid = (st + ed) / 2;
            if (arr[mid] == val) {
                return mid;
            } else if (val < arr[mid]) {
                ed = mid;
            } else {
                st = mid;
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        int arr[] = { 11, 12, 13, 15, 18 };
        int val = 15;

        int lg = binarySearch(arr, val);

        if (lg ==  - 1) {

            System.out.println("not present");
        } else {
            System.out.println("the val " + val + "  is present at " + lg);
        }
    }

}
