package Practice;

import java.util.Scanner;

public class P001_ExtractVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        //char []arr={'a','e','i','o','u'};
        for (int i=0;i<name.length();i++) {
            if (name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o' || name.charAt(i) == 'u') {
                System.out.print(name.charAt(i)+" ");
            }
        }

    }
}

