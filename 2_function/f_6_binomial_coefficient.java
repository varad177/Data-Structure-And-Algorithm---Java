import java.util.Scanner;

public class f_6_binomial_coefficient {

    public static int facto(int n) {
        if (n < 0) {
            System.out.println("enter valid num");
        }

        if (n == 0 || n == 1) {
            return 1;
        }
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static int Binomial_coff(int n, int r) {
        int fact_of_n = facto(n);
        int fact_of_r = facto(r);
        int n_minus_r = facto(n - r);
        return (fact_of_n / (fact_of_r * n_minus_r));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter  n");
        int n = sc.nextInt();
        System.out.println("enter  r");
        int r = sc.nextInt();

        System.out.println("Binomial coefficient is " + Binomial_coff( n, r));

    }

}
