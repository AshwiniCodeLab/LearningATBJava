package JavaArray;
// Count Even Numbers in the Array
public class Lab004_CountEven {
    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 7, 8};
        int count=0;
        for(int num: nums){
            if(num%2==0){
                count++;
            }
        }
        System.out.println("The Count Even Numbers in the Array: "+count);
    }
}
