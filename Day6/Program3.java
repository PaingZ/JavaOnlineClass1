import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean status = true;
        while (status) {
            System.out.print("Enter text : ");
            int number = input.nextInt();

            if(number == 0){
                status = false;
            }

        }
    }
}
