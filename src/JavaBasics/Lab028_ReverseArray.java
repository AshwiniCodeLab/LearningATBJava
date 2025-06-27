package JavaBasics;
// Print Array in Reverse (↩ Last Orders First)
public class Lab028_ReverseArray {
    public static void main(String[] args) {
        int[] arr={12,13,14,15,16,17};
        System.out.println(arr.length);
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
