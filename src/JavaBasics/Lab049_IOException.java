package JavaBasics;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Lab049_IOException {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("/invalid/path/output.txt");
            fw.write("Hello");
            fw.close();
        } catch (IOException e) {
            System.out.println("I/O Error: " + e.getMessage());
        }
    }
}