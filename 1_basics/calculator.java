


import java.util.*;
public class calculator {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
        int a = sc.nextInt();
        System.out.println("enter the first number");
        int b = sc.nextInt();
        System.out.println("enter oparator");
        char o = sc.next().charAt(0);

        switch (o){
            case '+' : System.out.println("the sum is "+ (a + b));
            break;
            case '-' : System.out.println("the sum is "+ (a - b));
            break;
            case '*' : System.out.println("the mul is "+ (a * b));
            break;
            case '/' : System.out.println("the div is "+ (a / b));
            break;
            case '%' : System.out.println("the mod is "+ (a % b));
            break;
        }





    }
    
}
