
//continue is used for the skip the iteration 

import java.util.Scanner;

public class useOfContinue {
    public static void main(String[] args) {
        // for (int i = 0; i <= 5; i++) {
        // if (i == 3) {
        // continue;
        // }
        // System.out.println(i);
        // }

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("enter the number");
            int n = sc.nextInt();
            if (n % 10 == 0) {
                continue;
            }
            System.out.println(n);
        } while (true);
    }

}
