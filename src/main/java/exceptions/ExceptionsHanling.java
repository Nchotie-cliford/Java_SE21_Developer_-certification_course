package exceptions;

import java.io.File;
import java.io.IOException;

public class ExceptionsHanling {

    public static void main(String[] args) {
        File file = new File("resources/nonexistent.txt");
         try{
             file.createNewFile();
         } catch (IOException e) {
             System.out.println("Error creating file" + e.getMessage());
         }
    }
}
