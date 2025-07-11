package JavaArray;

public class Lab005_ReverseArray {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};
        System.out.print("The array reverse: ");
        for(int i=nums.length-1;i>=0;i--){
            System.out.print(nums[i]+" ");
        }
    }
}
