public class operator {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;


        // arithmentic operation
        System.out.println("add " + (a+b));
        System.out.println("sub " + (a-b));
        System.out.println("mul " + (a*b));
        System.out.println("div " + (a/b));
        System.out.println("mod " + (a%b));


        // unary oparatorts 
        // a++ and ++a

        //relational oparation s
        // == != <= >= == 

        System.out.println(a==b); // false

        //logical operators 

        // && -> logical and 
        //|| -> logical or 
        // ! -> logical not 

        System.out.println((3>2) && (2==2)); // true
        System.out.println(!((3>2) && (2==2))); // false
    


        //assignment operators

        // = ->  a=a+10 ==> a+=10



    }

}