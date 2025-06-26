package JavaBasics;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Lab024_ReadFile {
    public static void main(String[] args) {
        try{
            File f= new File("C://Users//ADMIN//Desktop//Test.txt");
            Scanner sc= new Scanner(f);
            while (sc.hasNextLine()){
                String data= sc.nextLine();
                System.out.println(data);
            }
            sc.close();
        }
        catch (IOException e){
            System.out.println(e);
        }
    }
}
