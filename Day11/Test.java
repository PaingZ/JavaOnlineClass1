import java.util.Scanner;
public class Test {
    static Scanner input = new Scanner(System.in);
    static Data[] user = new Data[100];
    static int userCount = 0;

    public static void main(String[] args) {
        while (true) {
            System.out.print("Enter Option(Login or Register or show or exit):");
            String Option = input.nextLine();

            if (Option.equals("Login")) {
                System.out.println("Login");
            } else if (Option.equals("Register")) {
                register_sec();
            } else if (Option.equals("show")) {
                show_sec();
            } else if (Option.equals("exit")) {
                System.out.println("Program exited");
                break;
            } else {
                System.out.println("Invalid Option");
            }
        }
    }

    static void register_sec() {
        System.out.print("Enter your name : ");
        String name = input.nextLine();
        System.out.print("Enter your email : ");
        String email = input.nextLine();
        System.out.print("Enter your password : ");
        String password = input.nextLine();

        int id = userCount + 1001;

        user[userCount] = new Data(id, name, email, password);
        userCount++;

    }


    static void login_sec() {
        int x = -1;
        System.out.print("Enter your email: ");
        String l_email = input.nextLine();
        for (int j = 0; j < userCount; j++) {
            if (l_email.equals(user[j].email)) {
                x = j;
                break;
            }
        }
        if (x == -1) {
            System.out.println("Email not found");
        } else {
            System.out.print("Enter your password: ");
            String l_password = input.nextLine();

            if (user[x].password.equals(l_password)) {
                System.out.println("Login success!");
            } else {
                System.out.println("Login failed!");
            }
        }
    }

    static void show_sec() {
        try{
            if (userCount != 0) {
                for (int i = 0; i < userCount; i++) {
                    System.out.printf("%d ,%s , %s , %s", user[i].id, user[i].name, user[i].email, user[i].password);
                }
            } else {
                System.out.println("There is no user.");
            }
        }catch (Exception e){
//            System.out.println("Error occour at show_sec");
            e.printStackTrace();
        }
    }
}

class Data{
    int id;
    String name;
    String email;
    String password;

    Data(int id,String name, String email, String password){
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }
}