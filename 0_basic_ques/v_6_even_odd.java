public class v_6_even_odd {

    public static void main(String[] args) {

        int num = 12345;

        int counteven = 0;
        int countodd = 0;

        while (num > 0) {

            int rem = num % 10;
            if (rem % 2 == 0) {
                counteven++;
            } else {
                countodd++;
            }

            num = num / 10;

        }

        System.out.println("event: " + counteven + " odd : " + countodd);
        

    }

}
