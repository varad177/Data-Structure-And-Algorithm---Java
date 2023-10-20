import java.util.*;
public class switchPractise {


    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);
         System.out.println("enter the number");
         int n = sc.nextInt();


         switch (n){
            case 1 : System.out.println("mango"); break;
            case 2 : System.out.println("orange"); break;
            case 3 : System.out.println("banana"); break;
            default : System.out.println("nothing"); break;
            
         }



    }
}