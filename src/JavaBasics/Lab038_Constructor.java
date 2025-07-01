package JavaBasics;
//student
public class Lab038_Constructor {
    String name;
    int age;

    public  Lab038_Constructor(String sname, int sage){
        name=sname;
        age=sage;
    }

    void showDetails(){
        System.out.println("The name of student is: "+name+" and age is: "+age);
    }

    public static void main(String[] args) {
        Lab038_Constructor lb= new Lab038_Constructor("Ashwini",30);
        lb.showDetails();
    }

}
