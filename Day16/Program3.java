import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program3 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new FileReader("data.txt"))){
            String txt;
            while((txt = br.readLine()) != null){
                String[] words = txt.split(" ");
                // System.out.println(txt);
                // System.out.println("\nWord by Word");
                for(String word: words){
                    System.out.print(word + ",");
                }
                System.out.println();
            }
        }catch(IOException error){
            System.out.println(error.getMessage());
        }

    }
}

/*

note
to
/to
from
/from
/note


 */