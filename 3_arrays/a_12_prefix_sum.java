public class a_12_prefix_sum {

    // now we will see the sum of subarray by prefix rule
    //here only 2 for loop is used so the time complexity is o(n^2)

    public static void preFixSum(int arr[]) {
        int prefix[] = new int[arr.length];
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        prefix[0] = arr[0];
        // calculating prefix
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];

        }

        for (int i = 0; i < arr.length; i++) {
            int st = i;
            for (int j = i; j < arr.length; j++) {
                int ed = j;

                currSum = st == 0 ? prefix[ed] : prefix[ed] + prefix[st - 1];

                if (maxSum < currSum) {
                    maxSum = currSum;
                }

            }
        }
        System.out.println("The max value is " + maxSum);

    }

    public static void PrintSubArr(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            int st = i;
            for (int j = i; j < arr.length; j++) {
                int ed = j;

                for (int k = st; k <= ed; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }

    }

    public static void main(String[] args) {

        int arr[] = { 1, -2, 6, -1, 3 };

        preFixSum(arr);

    }
}
