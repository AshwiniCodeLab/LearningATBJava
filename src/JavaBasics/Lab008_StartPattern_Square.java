package JavaBasics;

public class Lab008_StartPattern_Square {
    public static void main(String[] args) {


        //make square of 5*5
        int sq = 5;
        for(int i = 0; i < sq; i++) {
            for (int j=0;j<5;j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
