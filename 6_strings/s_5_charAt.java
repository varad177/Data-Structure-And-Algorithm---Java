public class s_5_charAt {
    public static void printsLetters(String s) {
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
    }

    public static void main(String[] args) {

        String name = "viha";

        // System.out.println(name.charAt(2));
        printsLetters(name);

    }
}
