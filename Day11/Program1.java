import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program1{
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("data.txt"))){
            //file read
            // String text = reader.readLine();
            // System.out.println(text);
            // for(int i=0; i<2; i++){
            //     String text = reader.readLine();
            //     System.out.println(text);
            // }
            String text = reader.readLine();
            while(text != null){
                System.out.println(text);
                text = reader.readLine();
            }
        }catch(IOException err){//IO => Input Output
            // System.out.println("Error reading file");
            err.printStackTrace();
        }

        System.out.println("This is reading file program");
    }
}

// class Data{
//     int number;
//     Data(int number){
//         this.number = number;
//     }
// }