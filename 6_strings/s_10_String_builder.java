public class s_10_String_builder {

    public static void main(String[] args) {

        StringBuilder s1 = new StringBuilder("varad");

        System.out.println(s1.toString());

        StringBuilder s2 = new StringBuilder("");

        for (char ch = 'a'; ch <= 'z'; ch++) {

            s2.append(ch);
            System.out.println(s2);
            System.out.println(s2.length());

        }
        //Tc = n(26)
        //if we do it without string builder , then we will get the TC of o(n^2)
        //because we will copy the string the for each new append 

        System.out.println(s2);
    }

}
