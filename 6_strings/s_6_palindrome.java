public class s_6_palindrome {
    //TM is o(n)

    public static boolean palindrome(String s) {

        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt((s.length() - 1) - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        // palindrome --> madam , noon , racecar

        String st = "madam";

        if (palindrome(st)) {
            System.out.println("parindrome");

        } else {
            System.out.println("not palindrome");
        }

    }
}
