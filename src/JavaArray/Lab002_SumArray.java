package JavaArray;

public class Lab002_SumArray {
    public static void main(String[] args) {
        int [] marks={11,22,34,5,5,67,89};
        int sum=0;
        for(int mark : marks){
            sum+=mark;
        }
        System.out.println("The total marks are: "+sum);
    }
}
