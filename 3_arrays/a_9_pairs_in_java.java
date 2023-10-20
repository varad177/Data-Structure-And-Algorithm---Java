public class a_9_pairs_in_java {

    public static void PairJava(int arr[]) {

        for (int i = 0; i <= arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ")" + ", ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        int arr[] = { 2 , 4,6,8,10};

        PairJava(arr);

    }
}