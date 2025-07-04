package JavaControlStmts;
//Login Authentication
public class Lab016_elseIf {
    public static void main(String[] args) {
        String username="admin";
        String password="w28793";

        if(username=="admin"){
            if(password=="w28783"){
                System.out.println("Logged in successful.");
            }else {
                System.out.println("The password is wrong...");
            }
        }else {
            System.out.println("Invalid username");
        }

    }
}
