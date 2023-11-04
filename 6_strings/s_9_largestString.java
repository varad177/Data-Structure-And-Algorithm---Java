public class s_9_largestString {

    // lexiographically largest string
    // for that we will use the compare to

    //TC = o(x*n)

    public static String stringCompare(String[] s1) {

        String bigStr = "";

        for (int i = 1; i < s1.length; i++) {

            if (s1[i - 1].compareToIgnoreCase(s1[i]) == 0) {
                System.out.println("equal");
            } else if (s1[i - 1].compareToIgnoreCase(s1[i]) < 0) {
                bigStr = s1[i];
            } else {
                bigStr = s1[i - 1];
            }
        }

        return bigStr;

    }

    public static void main(String[] args) {

        String frts[] = { "banana", "apple", "mongo" };

        System.out.println(stringCompare(frts));

    }

}
