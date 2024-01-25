import java.util.Scanner;

public class v_9_prime {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("emter the num");

        int num = sc.nextInt();
        int count = 0;

        if (num > 1) {

            for (int i = 1; i <= num; i++) {

                if (num % i == 0) {
                    count++;

                }

            }

        } else {
            System.out.println("");
        }

        if (count == 2) {
            System.out.println("prime num");

        } else {
            System.out.println("not prime nu");
        }

    }

}
