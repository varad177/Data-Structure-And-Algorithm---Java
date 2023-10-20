
public class f_9_binary_decimal {

    public static void Binary_to_decimal(int n) {
        int decN = 0;
        int pow = 0;

        while (n > 0) {
            int ld = n % 10; // last degit
            int a = (int) Math.pow(2, pow);
            pow++;
            n = n / 10;
            int b = ld * a;
            decN = decN + b;
        }
        System.out.println("the number is " + decN);

    }

    public static void main(String[] args) {
        int a = 1000;

        Binary_to_decimal(a);
    }
}
