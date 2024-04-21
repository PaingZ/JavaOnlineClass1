import java.util.Scanner;

public class PasswordValidate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password;
        while(true){
            System.out.print("Enter your password :");
            password = scanner.nextLine();

            if(isPasswordValid(password)){
                System.out.println("Valid password");
            }else{
                System.out.println("Invalid password");
            }

        }
    }

    static boolean isPasswordValid(String password){

        char[] cPassword = password.toCharArray();

        if(password.length() >= 8){
            int capCount = 0;
            int smCount = 0;
            int numCount = 0;

            for(int i=0; i<password.length(); i++){
                //check capital letter
                if(cPassword[i] >= 'A' && cPassword[i] <= 'Z'){ 
                    capCount++;
                }

                //check small letter
                if(cPassword[i] >= 'a' && cPassword[i] <= 'z'){
                    smCount++;
                }

                //number check
                if(cPassword[i] >= '0' && cPassword[i] <= '9'){
                    numCount++;
                }
            }

            if(capCount != 0 && smCount != 0 && numCount != 0){
                return true;
            }else{
                return false;
            }

        }else{
            return false;
        }
    }

}
