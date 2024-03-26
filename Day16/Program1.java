import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program1{
    public static void main(String[] args) {
        //file handling
        //persistance store

        //read, write

        try(BufferedReader reader = new BufferedReader(new FileReader("data.txt"))){
            // String text = reader.readLine();
            // System.out.println(text);

            // text = reader.readLine();
            // System.out.println(text);

            // text = reader.readLine();
            // System.out.println(text);
            // String text;
            // for(int i = 0; i<5; i++){
            //     text = reader.readLine();
            //     System.out.println(text);
            // }

            // String text = reader.readLine();
            // while (text != null) {
            //     System.out.println(text);
            //     text = reader.readLine();
            // }

            String text;
            while ((text = reader.readLine()) != null) {
                System.out.println(text);
            }
            
        }catch(IOException err){
            System.out.println(err.getMessage());
        }
        //try catch
    }
}