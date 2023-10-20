public class a_3_array_as_function_input {

    //so basically arrays are call by reference 



    public static void Update_marks(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 1;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" "); //100 86 66
        }



    }

    public static void main(String[] args) {

        int marks[] = { 99, 85, 65 };
         Update_marks(marks);

        System.out.println();
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i]+" "); //100 86 66
        }

    }

}
