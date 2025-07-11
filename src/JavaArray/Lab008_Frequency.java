package JavaArray;

public class Lab008_Frequency {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 30, 40, 20};
        int num=20;
        int fre=0;
        for(int a: arr){
            if (a==num){
                fre++;
            }
        }
        System.out.println("The frequency of number 20 is: "+fre);
    }
}
