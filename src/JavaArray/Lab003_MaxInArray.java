package JavaArray;

public class Lab003_MaxInArray {
    public static void main(String[] args) {
        int[] marks={22,344,567,878,32,56};
        int max=0;
        for (int mark: marks){
            if(max<mark){
                max=mark;
            }
        }
        System.out.println("The max is: "+max);
    }
}
