import java.util.Scanner;

public class Aaa {

    static String [] name;
    static String [] email;
    static String [] address;
    static int [] id;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        name = new String[50];
        email = new String[50];
        address = new String[50];
        id = new int[50];
        int i = 0;
        int a = 1001;

        while (true){
            System.out.println("1. Create ");
            System.out.println("2. Read ");
            System.out.println("3. Exit ");
            System.out.print("Enter your option: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            if(option == 1){
                id[i]= a;
                System.out.print("Enter your name: ");
                String user = scanner.nextLine();
                name[i] = user;
                System.out.print("Enter your email: " );
                String mail = scanner.nextLine();
                email[i]= mail;
                System.out.print("Enter your address: ");
                String add = scanner.nextLine();
                address[i] = add;
                i++;
                a++;
            } else if (option == 2) {
                for (int j = 0; j<i ; j++){
                    System.out.println(id[j] + " " + name[j] + " " + email[j] + " " + address[j] );

                }
            } else if (option == 3) {
                System.out.println("Program exit");
                break;
            }
        }




    }
}
