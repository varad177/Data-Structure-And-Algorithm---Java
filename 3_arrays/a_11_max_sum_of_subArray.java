public class a_11_max_sum_of_subArray {


    //method by brute force

    // we have use the 3 for loop so the time complexity is n cube

    public static int sumOfSubArray(int arr[]) {
        int MaxSum = Integer.MIN_VALUE;
        ;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {
                int currSum = 0;
                for (int k = i; k <= j; k++) {
                    currSum = currSum + arr[k];

                }
                System.out.println(currSum);
                if (MaxSum < currSum) {
                    MaxSum = currSum;
                }

            }
        }

        return MaxSum;

    }

  

    public static void main(String[] args) {

        // int arr[] = { 2, 4, 6, 8, 10 };
        int arr[] = { 1 ,-2,6,-1,3 };

        int ans = sumOfSubArray(arr);
        System.out.println("max is " + ans);

    }
}