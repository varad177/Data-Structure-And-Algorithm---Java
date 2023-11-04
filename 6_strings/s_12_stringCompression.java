public class s_12_stringCompression {

    // compony -> amazon
    // string compression -->
    // aaabbbccddd => a3b3c2d3
    // not aaa-> a1b1c1 bcoz it will de compression

  //Tc - 0(n)
  //two loop but the in while loop there is the increment of i 
  // so same oparation will be perform 
  // so the TC is linear

    public static String compress(String str) {
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
           //aabbbcc
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {

                count++;
                i++;

            }

            newStr += str.charAt(i);

            if (count > 1) {
                newStr += count.toString();

            }

        }
        return newStr;
    }

    public static void main(String[] args) {

        String str = "aabbbcc";
        System.out.println(compress(str));

    }

}
