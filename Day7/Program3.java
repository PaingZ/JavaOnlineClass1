public class Program3 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        arr[2] = 100;
        // int []arr;   
        // int arr[];
        // int number = 10;

        // System.out.printf("%d", arr[2]);

        //0 1 2 3 4            5 
        for(int i = 0; i<arr.length; i++){
            System.out.printf("%d", arr[i]);
            if(i == arr.length-1){
                break;
            }
            System.out.print(", ");
        }
        // System.out.println(arr.length);
    }
}
