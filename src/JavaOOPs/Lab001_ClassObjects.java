package JavaOOPs;
//student class
public class Lab001_ClassObjects {
    String name;
    int age;

    Lab001_ClassObjects(String name, int age){
        this.name= name;
        this.age= age;
    }
    public  void  display(){
        System.out.println("The Information of student");
        System.out.println("The student name is "+name+" and age "+age);
    }
    public static void main(String[] args) {
        Lab001_ClassObjects lb= new Lab001_ClassObjects("Ashwini", 19);
        Lab001_ClassObjects lb1=new Lab001_ClassObjects("Sona", 29);
        lb.display();
        lb1.display();
    }


}
