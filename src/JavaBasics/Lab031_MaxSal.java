package JavaBasics;

public class Lab031_MaxSal {
    public static void main(String[] args) {
        int[] sale={77,9999,11,22,33,44,55,666};
        int max=0;
        for(int i=0;i<sale.length;i++) {
            if (max < sale[i]) {
                max = sale[i];
            }
        }
        System.out.println("The max of sale is: "+max);
    }
}
