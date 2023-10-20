
import java.util.*;

public class primeNoOrNot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();

        if (n == 2) {
            System.out.println("no is prime");
        }

        boolean isPrime = true;

        // for (int i = 2; i < n - 1; i++) {
        for (int i = 2; i <Math.sqrt(n); i++) {

            if (n % i == 0) {
                isPrime = false;

            }
        }

        if (isPrime) {

            System.out.println("no is prime");
        } else {
            System.out.println("no is not prime");

        }

    }

}
