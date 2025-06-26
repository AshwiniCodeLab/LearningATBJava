package JavaBasics;
import java.io.*;
public class Lab022_CreateFileExample {
    public static void main(String[] args) {
        try {
            File f = new File("C://Users//ADMIN//Desktop//Test.txt");
            if (f.createNewFile()) {
                System.out.println("File is created" + f);
            } else {
                System.out.println("File is already exists");
            }
        }
            catch(IOException e){
                System.out.println("An error is occurred.");
                e.printStackTrace();
            }
        }

}
