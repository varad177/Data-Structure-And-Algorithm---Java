import java.util.Scanner;

public class f_5_factorial {

    public static int facto(int n) {
        if(n<0){
        System.out.println("enter valid num");
        }

        if(n==0 || n==1){
            return 1;
        }
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter  no");
        int n = sc.nextInt();

        System.out.println("the factorial is " + facto(n));
    }

}
