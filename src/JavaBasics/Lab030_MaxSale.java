package JavaBasics;

public class Lab030_MaxSale {
    public static void main(String[] args) {
        int[] sale= {100,20,300,450,432};
        int max= sale[0];
        for(int num:sale){
            if(num>max){
                max=num;
            }
        }
        System.out.println("Max is: "+max);
    }
}
