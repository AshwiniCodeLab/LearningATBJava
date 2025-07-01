package JavaBasics;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Lab042_FileWriteExample {
    public static void main(String[] args) {
        try {
            File f = new File("C://Users//ADMIN//Desktop//hello.txt");
            if (f.createNewFile()) {
                System.out.println("File is created");
            } else {
                System.out.println("File is already there");
            }
            FileWriter wr = new FileWriter(f);
            wr.write("Hello! This is a file writing test.\n");
            wr.write("Welcome to Java File Handling.");
            wr.close();
            System.out.println("File written successfully");
        }
        catch (IOException e){
            System.out.println(e);
        }
    }
}
