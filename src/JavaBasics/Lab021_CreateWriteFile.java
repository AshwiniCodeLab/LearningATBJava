package JavaBasics;

import java.io.*;

public class Lab021_CreateWriteFile {
    public static void main(String[] args) {
        try{
            File F=  new File("C://Users//ADMIN//Desktop//Test.txt");
            FileWriter write= new FileWriter(F);
            write.write("Testdata");
           write.close();

        }catch (IOException e){
            System.out.println("The occurred exception is:"+e);
        }
    }
}
