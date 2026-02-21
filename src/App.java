import java.util.Scanner;
import appObjects.User;
import appObjects.AccountHandler;

public class App {
    public static void main(String[] args) throws Exception {

        //
        AccountHandler handler = new AccountHandler();

        User user1 = handler.createUser("User1", "pass1");
        User user2 = handler.createUser("User2","pass2");
        handler.login(user1);
        user1.setBio("Hello welcome to my profile!!");
        user1.setPronouns("he/him");


        System.out.println("User1 id: " + user1.getid());
        System.out.println("User2 id: " + user2.getid());
        System.out.println("\n" + user1);
        System.out.println(user2);






    }
}