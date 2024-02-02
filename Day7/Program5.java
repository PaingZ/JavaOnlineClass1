import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner input = new Scanner(System.in);

        for(int i = 0; i<numbers.length; i++){
            System.out.printf("Enter the value of index %d : ", i);
            numbers[i] = input.nextInt();   
        }

        System.out.println("The numbers array : ");
        for(int i = 0; i<numbers.length; i++){
            System.out.printf("%d ", numbers[i]);
        }

    }
}
