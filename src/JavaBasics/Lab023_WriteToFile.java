package JavaBasics;

import javax.imageio.IIOException;
import java.io.FileWriter;
import java.io.IOException;

public class Lab023_WriteToFile {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("C://Users//ADMIN//Desktop//Test.txt");
            writer.write("I am here...");
            writer.close();
            System.out.println("File wrote successfully..");
        }catch (IOException e){
            System.out.println("An error occurred"+e);
        }

        }
    }

