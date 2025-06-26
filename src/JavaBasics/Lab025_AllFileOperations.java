package JavaBasics;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Lab025_AllFileOperations {
    public static void main(String[] args) {
        try {
            File f = new File("C://Users//ADMIN//Desktop//test.txt");
            if (f.createNewFile()) {
                System.out.println("File successfully created.");
            } else {
                System.out.println("File is already exist");
            }

            FileWriter writer = new FileWriter(f, true);
            writer.write("\n ashwni u can d it ...");
            System.out.println("File appended successfully");
            writer.close();

            Scanner sc= new Scanner(f);
            while (sc.hasNextLine()){
                String FileData= sc.nextLine();
                System.out.println(FileData);
            }

            sc.close();
            System.out.println(f.getName());
            if(f.delete()){
                System.out.println("File is deleted");
            }else System.out.println("File is not exist");
        }
            catch(IOException e){
                System.out.println("The error is:"+e);

        }

    }
}
