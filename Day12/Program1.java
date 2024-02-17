import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program1 {
    public static void main(String[] args) {
        //persistance
        //file read
        try(BufferedReader reader = new BufferedReader(new FileReader("data.txt"))){
            // System.out.println(reader.readLine());
            // System.out.println(reader.readLine());
            String text = reader.readLine();
            // for(int i = 0; text != null;  i++){
            //     System.out.println(text);
            //     text = reader.readLine();
            // }
            while(text != null){
                System.out.println(text);
                text = reader.readLine();
            }
        } catch (IOException err) {
            // System.out.println();
            err.printStackTrace();
        }
    }
}