package JavaArray;

public class Lab007_CountEvenOdd {
    public static void main(String[] args) {
        int[] arr = {10, 15, 20, 25, 30};
        int evenCount=0, oddCount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                evenCount++;
            }else{
                oddCount++;
            }
        }
        System.out.println("The evencount of elements in array is: "+evenCount +" and odd count is: "+oddCount);
    }
}
