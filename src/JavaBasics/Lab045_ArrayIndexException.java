package JavaBasics;

public class Lab045_ArrayIndexException {
    public static void main(String[] args) {
        try{
            int []arr={10,20,30,40};
            System.out.println(arr[5]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("The exception is: "+e.getMessage());
        }
    }
}
