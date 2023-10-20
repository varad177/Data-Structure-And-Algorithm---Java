
import java.util.*;
public class ternary {
    

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
         System.out.println("enter the number");
         int a = sc.nextInt();

         String type = (a%2==0) ? "even" : "odd";
         System.out.println(type);
    }
}
