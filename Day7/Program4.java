public class Program4 {
    public static void main(String[] args) {
        int[] number_arr = new int[5];
        number_arr[0] = 10;
        number_arr[1] = 20;
        number_arr[2] = 30;
        // number_arr[3] = 40;//garbage value
        // number_arr[4] = 50;
        // number_arr[5] = 60;

        for(int i = 0; i<number_arr.length; i++){
            System.out.printf("%d ", number_arr[i]);
        }
    }
}
