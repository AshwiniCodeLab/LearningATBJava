package JavaControlStmts;
//Table print 1-10
public class Lab024_FLPrintTable {
    public static void main(String[] args) {
        int i,j;

        for(i=1;i<=10;i++){
            System.out.print("The table of "+i+" is: " );
            for(j=1;j<=10;j++){
                System.out.print(i*j+" ");
            }
            System.out.println();
        }
    }
}
