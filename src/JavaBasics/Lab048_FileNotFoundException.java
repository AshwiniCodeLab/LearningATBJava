package JavaBasics;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab048_FileNotFoundException {
    public static void main(String[] args) {
        try{
                File f= new File("C://User//admin//desktop//helloo.txt");
                Scanner sc= new Scanner(f);

                }catch(FileNotFoundException e){
        System.out.println("The exception is: "+e.getMessage()  );
    }

    }
}
