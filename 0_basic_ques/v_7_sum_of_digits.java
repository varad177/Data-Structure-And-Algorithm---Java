public class v_7_sum_of_digits {

    public static void main(String[] args) {

        int num = 1234;

        int sum = 0;

        while (num > 0) {

            int rem = num % 10;
            sum = sum + rem;
            num /= 10;

        }

        System.out.println("the sum is " + sum);

    }

}
