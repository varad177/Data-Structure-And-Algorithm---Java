import java.util.Scanner;

public class f_8_prime_in_rrange {

    public static boolean prime(int n) {

        if(n==1 || n==2){
            return false;
        }

        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
            else{
                return true;
            }
        }
return f
        
    }

    public static void Prime_range(int f, int l) {
        for (int i = f; i <= l; i++) {
            if (prime(i)) {
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter  first");
        int f = sc.nextInt();
        System.out.println("enter  last");
        int l = sc.nextInt();

        Prime_range(f, l);
    }
}
