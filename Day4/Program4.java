import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1, number2, sum;
        System.out.print("Enter number1 : ");
        number1 = input.nextInt();

        System.out.print("Enter number2 : ");
        number2 = input.nextInt();

        sum = number1 + number2;

        // System.out.println("The sum of two numbers : " + sum);
        //10 + 20 = 30
        System.out.printf("%d + %d = %d", number1, number2, sum);

        


    }
}
