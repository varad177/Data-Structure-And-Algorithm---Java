public class s_8_sunstrings {
    
    public static String stringSub(String str , int st, int ed){
        String substr= "";
        for(int i = st ; i< ed ;i++){

            substr = substr +str.charAt(i);

        }
        return substr;
    }

    public static void main(String[] args) {
        
        String s1 = "varad ";


        System.out.println(stringSub(s1, 0, 2));
        System.out.println(s1.substring( 0, 2));


    }

}
