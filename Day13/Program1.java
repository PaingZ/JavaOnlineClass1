import java.util.Scanner;

public class Program1{

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        main_section();
    }

    static void main_section()
    {
        System.out.print("Enter an option(register, login, exit) : ");
        String options = input.nextLine();

        if(options.equals("register")){
            register_section();
        }else if(options.equals("login")){
            login_section();
        }else if(options.equals("exit")){
            System.out.println("Program exit...");
            System.exit(0);
        }else{
            System.out.println("Invalid Options");
        }
        main_section();
    }

    static void register_section()
    {
        System.out.println("register");
    }

    static void login_section()
    {
        System.out.println("login");
    }
}