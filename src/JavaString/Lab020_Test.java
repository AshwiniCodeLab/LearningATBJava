package JavaString;
//2) Print out the indices of duplicate elements in the array
//int[] arr={1,1,4,5,7,4,6,1};
public class Lab020_Test {
    public static void main(String[] args) {
        int[] arr={1,1,4,5,7,4,6,1};
        for (int i=0; i<=arr.length-1;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println("The duplicat element: "+arr[i]+" indices are: "+j);
                }
            }
        }
    }
}
