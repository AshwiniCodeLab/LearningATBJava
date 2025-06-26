package JavaBasics;

import java.io.File;
import java.io.IOException;

public class Lab020_FileTest {
    public static void main(String[] args) {
        try {
            File f = new File("C://Users//ADMIN//Desktop//photo//File.txt");
            if (f.createNewFile()) {
                System.out.println("File is created");
            } else {
                System.out.println("File is not created");
            }
        }
        catch (IOException e){
            System.out.println("Exception"+e);
        }
    }
}
