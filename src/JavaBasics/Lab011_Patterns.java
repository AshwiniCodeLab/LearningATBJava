package JavaBasics;

public class Lab011_Patterns {
    public static void main(String[] args) {
      int n=5;
      for(int i=1;i<=5;i++){
          System.out.print(" ".repeat(n-i));
          System.out.println(" *".repeat(i));
      }
    }
}
