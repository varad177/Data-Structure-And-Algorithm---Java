public class v_3_reverse_string {

    public static void main(String[] args) {

        String str = "varad";
        String rev = "";

        int len = str.length();

        for (int i = len - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        System.out.println(rev);

    }

}
