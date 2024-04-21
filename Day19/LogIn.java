import java.util.Scanner;

public class LogIn {
    static Scanner scanner = new Scanner(System.in);
    static String [] name = new String[50];
    static int [] id = new int[50];
    static String [] email = new String[50];
    static String [] password = new String[50];
    static int i = 0;
    static int a = 1001;
    public static void main(String[] args) {
        while(true){
            System.out.println("***********");
            System.out.println("1. Login");
            System.out.println("2. Register");
            System.out.println("0. Exit");
            System.out.println("***********");
            System.out.print("Enter your option: ");
            int option = scanner.nextInt();
            scanner.nextLine();
            System.out.println();
            if(option == 1){
                login();
            } else if (option == 2) {
                register();
            } else if (option == 0) {
                System.out.println("program exit");
                break;
            }

        }
    }
    static void login(){
        System.out.println("*************");
        System.out.println("Login section");
        System.out.println("*************");
        System.out.print("Enter your email: ");
        String gmail = scanner.nextLine();
        System.out.print("Enter your password: ");
        String pas = scanner.nextLine();

        for(int j=0 ; j<i; j++){
            if (email[j].equals(gmail) && password[j].equals(pas)){
                System.out.println("Welcome! " + name[j] );
            }else {
                System.out.println("Account not found!");
            }
        }System.out.println();
    }
    static void register(){
        System.out.println("****************");
        System.out.println("Register section");
        System.out.println("****************");
        System.out.print("Enter your name: ");
        String user = scanner.nextLine();
        name[i] = user;
        System.out.print("Enter your email: ");
        String mail = scanner.nextLine();
        email[i] = mail;
        System.out.print("Enter your password: ");
        String pass = scanner.nextLine();
        password[i] = pass;
        System.out.println("******************");
        System.out.println("*Register success*");
        System.out.println("******************");
        System.out.println();
        id[i] = a;
        i++;
        a++;

    }

    gmail Valid
    password valid
}
