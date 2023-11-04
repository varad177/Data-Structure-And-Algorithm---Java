public class s_7_comparison {

    public static void main(String[] args) {

        String s1 = "varad";
        String s2 = "varad";
        String s3 = new String("varad");

        if (s1 == s2) {
            System.out.println("strings are equal");
        } else {
            System.out.println("strings are not equal");
        }
        if (s1 == s3) {
            System.out.println("strings are equal");
        } else {
            System.out.println("strings are not equal");
        }

        if(s1.equals(s3)){
            System.out.println("Strings are equal");
        }else{
            System.out.println("not equals");
        }

    }
}
