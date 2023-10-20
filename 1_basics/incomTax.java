


import java.util.*;
public class incomTax {

    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Income");
        int i = sc.nextInt();


        if(i < 500000){
            int tax = 0 ;
            System.out.println(tax);

        }else if (i >= 500000 && i <1000000){
            int tax = (int) (i*(0.2));
            System.out.println(tax);
        }
        else{
              int tax = (int) (i*(0.3));
            System.out.println(tax);
        }


    }
    
}
