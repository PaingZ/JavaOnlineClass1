public class Program2 {
    public static void main(String[] args) {
        //for, while, do while, foreach => array

        int[] arr = {10,20,30, 40,50};

        // for(int i = 0; i<arr.length; i++){
        //     System.out.print(arr[i] + " ");
        // }

        for(int value:arr){
            System.out.println(value);
        }
    }
}
