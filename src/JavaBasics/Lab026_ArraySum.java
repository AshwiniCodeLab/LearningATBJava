package JavaBasics;
// Use Case: You have an array of order amounts, and you want to find the total.
public class Lab026_ArraySum {
    public static void main(String[] args) {
        int[] orders ={100,200,300,340};
        int sum=0;
        for(int total:orders){
            sum+=total;
        }
        System.out.println("Total order amount is: "+sum);
    }
}
