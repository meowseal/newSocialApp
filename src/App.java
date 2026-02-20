import java.util.Scanner;
import appObjects.User;
public class App {
    public static void main(String[] args) throws Exception {
        User gaymerboy = new User("Gaymer_boy", "skibidi");


        gaymerboy.updatePronouns("He/They");
        System.out.println("Attempting correct password...");
        gaymerboy.accountLogin("skibidi");
        gaymerboy.updatePronouns("she/her");
        gaymerboy.updateBio("Im TRANS now giggles");
        gaymerboy.updateUsername("gaymerGIRL", "skibidi");
        System.out.println("Display Profile: ");
        System.out.println(gaymerboy);
        


    }
}
