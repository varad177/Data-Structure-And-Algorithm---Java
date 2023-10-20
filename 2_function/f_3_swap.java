public class f_3_swap {

    public static void swap(int x, int y) {
        // x = x - y;
        // y = x + y;
        // x = y + x;

        int t = x;
        x = y;
        y = t;
         System.out.println("x is : " + x);
        System.out.println("y is : " + y);

    }

    public static void main(String[] args) {

        int x = 10;
        int y = 20;
        System.out.println("x is : " + x);
        System.out.println("y is : " + y);
        System.out.println("after awapping ");
        swap(x, y);


    }
}
