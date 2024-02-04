import java.util.Scanner;

public class Program2 {

    static Scanner input = new Scanner(System.in);

    static void register_section(){
        System.out.println("Register section\n****************");
        System.out.print("Enter your register name : ");
        String r_name = input.nextLine();
        System.out.print("Enter your register email : ");
        String r_email = input.nextLine();
        System.out.print("Enter your register password : ");
        String r_password = input.nextLine();
    }

    static void login_section(){
        System.out.println("Login Section");
        //code
    }

    public static void main(String[] args) {
        
        //register => name, email, password
        //login => email, password
        String[] name_arr = new String[10];
        String[] email_arr = new String[10];
        String[] password_arr = new String[10];

        while(true){
            System.out.println("Welcome to System\n*****************");
            System.out.print("Enter your text (login, register, exit) : ");
            String text = input.nextLine();

            if(text.equals("register")){

                register_section();
                
            }else if(text.equals("login")){
                
                login_section();

            }else if(text.equals("exit")){
                System.out.println("Program exit...");
                break;
            }else{
                System.out.println("Invalid option! Try again!");
            }

        }
    }
}
