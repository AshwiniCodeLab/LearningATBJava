package JavaBasics;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab042_FileReadExmaple {
    public static void main(String[] args) {
        File f= new File("C://Users//ADMIN//Desktop//hello.txt");
        try {
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine()) {
                String data = sc.nextLine();
                System.out.println(data);
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println(e.getMessage());
        }

    }
}
