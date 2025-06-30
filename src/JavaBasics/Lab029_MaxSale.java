package JavaBasics;

public class Lab029_MaxSale {
    public static void main(String[] args) {
        int[] sale={999,33,22,11,234,552,55,5,5};
        int max=0;
        for(int i:sale){
            if(i>max)
                max=i;
        }
        System.out.println("The max of sale is: "+max);
    }
}
