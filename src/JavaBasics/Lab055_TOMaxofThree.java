package JavaBasics;

public class Lab055_TOMaxofThree {
    public static void main(String[] args) {

        int n1 = 10, n2 = 25, n3 = 30;
        int max = (n1 > n2) ? n1 :(n2>n3? n2:n3);
        System.out.println(max);

    }
}