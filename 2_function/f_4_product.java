import java.util.Scanner;

public class f_4_product {
    public static int mul(int a, int b) {
        int ans = a * b;
        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter first no");
        int a = sc.nextInt();
        System.out.println("enter second no");
        int b = sc.nextInt();

        int ans = mul(a, b);
        System.out.println(a + "*" + b + "=" + ans);

    }
}
