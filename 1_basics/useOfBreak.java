import java.util.Scanner;

public class useOfBreak {

    public static void main(String[] args) {

        // for (int i = 0; i < 5; i++) {

        // if (i == 3) {
        // break;
        // }
        // System.out.println(i);
        // }
        // System.out.println(" i am out of the loop");

        Scanner sc = new Scanner(System.in);
        ;

        while (true) {
            System.out.println("enter the number");
            int n = sc.nextInt();
            if (n % 10 == 0) {
                break;
            }
            System.out.println(n);
        }

        System.out.println("out of the break statement");

    }
}
