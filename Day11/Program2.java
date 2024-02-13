import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program2 {
    public static void main(String[] args) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("hello.txt"))){
            // writer.write("This is testing");
            for(int i = 0; i<3; i++){
                writer.write("This is testing\n");
            }
        }catch(IOException err){
            err.printStackTrace();
        }
    }
}
