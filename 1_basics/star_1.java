public class star_1 {
    public static void main(String[] args) {



        // for (int i = 1; i <= 4; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //inverted

        for(int i = 4 ; i>-1 ; i--){
            for(int j = 1 ; j<=i ; j++){
                System.out.print("+");
            }
            System.out.println();
        }
    }
}
