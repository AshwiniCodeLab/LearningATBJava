package JavaString;
//1) String str="Learning automation is easy"; //given a string, output the count of each vowel
public class Lab018_VowelCount {
    public static void main(String[] args) {
        String str="Learning automation is easy";
        int acount=0, ecount=0, icount=0,ocount=0, ucount=0;
        String str1= str.toLowerCase();
        char[] ch=str1.toCharArray();
        for(char str2: ch){
            if(str2=='a'){
                acount++;
            } else if (str2=='e') {
                ecount++;
            } else if (str2=='i') {
                icount++;

            } else if (str2=='o') {
                ocount++;

            }else if(str2=='u'){
                ucount++;
            }
        }
        System.out.println("the count of vowels a: "+acount+"\n"+"count of vowel e: "+ecount+"\n"+ "i: "+icount+ " o count: "+ocount+" u count: "+ucount+".");
    }
}
