public class Program1{
    static int[] number_arr = {1,2,3,4,5,6,7,8,9,10};
    public static void main(String[] args) {
        //sorted data
        //searching algorithm
        //Linear Search
        
        int found = LinearSearch(50);
        if(found != -1){
            System.out.printf("Data found at index %d\n", found);
        }else{
            System.out.println("Data not found");
        }

    }

    static int LinearSearch(int searchValue){
        for(int i = 0; i<number_arr.length; i++){
            if(number_arr[i] == searchValue){
                return i;
            }
        }

        return -1;
    }
}