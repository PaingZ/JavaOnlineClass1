public class Program6 {
    public static void main(String[] args) {
        //Algorithm
        int[] arr = {10,20,30,40,50,60,70,80,90,100};

        boolean result = false;
        //Searching Algorithm
        //Linear Search
        //Jump Search
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == 500){
                result = true;
                break;
            }
        }

        if(result){
            System.out.println("Data found!");
        }else{
            System.out.println("Data not found!");
        }


    }
}
