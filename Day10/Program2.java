import java.util.Scanner;

public class Program2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Person[] person = new Person[100];
        //0 1 2 3 4 5 
        //1001 1002 1003 1004

        for(int i = 0; i<3; i++){
            System.out.print("Enter your name : ");
            String name = input.nextLine();
            System.out.print("Enter your email : ");
            String email = input.nextLine();
            System.out.print("Enter your password : ");
            String password = input.nextLine();

            int id = i + 1001;

            person[i] = new Person(id, name, email, password);
 
        }

        for(int i = 0; i<3; i++){
            System.out.printf("%d %s %s %s\n", person[i].id, person[i].name, person[i].email, person[i].password);
        }

    }
}

class Person{
    int id;
    String name;
    String email;
    String password;

    Person(int id, String name, String email, String password){
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }
}