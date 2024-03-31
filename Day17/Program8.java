import java.util.Scanner;

public class Program8 {
    static Scanner input;//static variable
    static int var;
    public static void main(String[] args) {
        input = new Scanner(System.in);
        int a;
        var = 10;
    }

    static void hello(){//static method
        int b = input.nextInt();
        var = 20;
    }
}
