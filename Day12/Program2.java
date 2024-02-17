import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("hello.txt"))){
            // writer.write("Hello world");
            Scanner input = new Scanner(System.in);
            System.out.print("Enter any text: ");
            String text = input.nextLine();
            writer.write(text);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
