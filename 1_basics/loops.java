
// loops are of 3 types 
//while loop , for loop , do while loop

import java.util.*;

public class loops {
    public static void main(String[] args) {

        // int i = 1;
        // while (i <= 10) {
        //     System.out.println(i);
        //     i++;
        // }


        //print the n numners

        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter the number");
        // int n = sc.nextInt();
        // int i =1;
        // while (i <= n) {
        //     System.out.println(i);
        //     i++;
        // }

        //sum of n natural numbers

         Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        // System.out.println((n*(n+1))/2); //by formula
        int i = 1;
        int sum = 0;

        while(i<=n){
            sum = sum+i;
            i++;
        }

        System.out.println(sum);

    }
}