public class f_10_decimal_binary {

    public static void decimal_to_binary(int n) {

        int pow = 0;
        int ans = 0;

        while (n > 0) {

            int rem = n % 2;
            ans = ans + (rem * (int) Math.pow(10, pow));
            pow++;
            n = n / 2;

        }

        System.out.println(ans);

    }

    public static void main(String[] args) {

        int a = 8;
        decimal_to_binary(a);

    }
}
