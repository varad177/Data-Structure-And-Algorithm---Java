public class s_3_insertion_sort {

    //pick an element from the unsorted part and place it in the 
    //right position in the sorted plant 


    //tc = n^2

    public static void insertion_sort(int arr[]){
        for(int i = 1 ; i < arr.length ; i++){
            int curr = arr[i] ;
            int prev = i-1;

            //finding the curr position to insert

            while(prev >=0 && arr[prev] > curr){ //for decending do <
                arr[prev+1] = arr[prev];
                prev--;

            }
            //insertion
            arr[prev+1] = curr;
        }
        printArr(arr);
    }

    public static void printArr(int arr[]) {
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.print(" ]");
        System.out.println();
    }
    public static void main(String[] args) {
        
        int arr[] = { 5, 4, 1, 3, 2 };

        insertion_sort(arr);


    }
    
}
