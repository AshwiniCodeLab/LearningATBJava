package JavaArray;

public class Lab006_MinInArray {
    public static void main(String[] args) {
        int[] arr = {10, 3, 56, 22, 5};
        int min=arr[0];
        for(int a: arr){
            if(min>a){
                min=a;
            }
        }
        System.out.println("The min of array: "+min);
    }
}
