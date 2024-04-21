import java.util.Scanner;
public class Gmailvalidate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your email address: ");
        String email = scanner.nextLine();

        if (isValidEmail(email)) {
            System.out.println("Valid email address.");
        } else {
            System.out.println("Invalid email address.");
        }

        scanner.close();
    }

    static boolean isValidEmail(String email) {
        // !true => false
        // !false =>true
        // @
        String[] sEmail = email.split("");
        int atCount = 0;
        if(!email.contains(" ")){
            for(int i = 0; i<email.length(); i++){
                if(sEmail[i] == "@"){
                    atCount++;
                }
            }

            if(atCount == 1){
                return email.endsWith("@gmail.com");
            }else{
                return false;
            }

        }else{
            return false;
        }

        
    }
}


