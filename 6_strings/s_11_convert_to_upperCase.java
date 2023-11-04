public class s_11_convert_to_upperCase {

    // compony --> code nation
    // we will use the to upper case
    //tc is 0(n)

    public static String toupperCase(String str) {
        StringBuilder st = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));

        st.append(ch);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                st.append(str.charAt(i));
                i++;
                st.append(Character.toUpperCase(str.charAt(i)));

            } else {
                st.append(str.charAt(i));
            }
        }
        return st.toString();
    }

    public static void main(String[] args) {

        String s = "hii i am varad a b c";
        System.out.println(toupperCase(s));

    }

}
