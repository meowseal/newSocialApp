package appObjects;
import java.util.Scanner;
import appObjects.User;


@SuppressWarnings("unused")

public class AccountHandler {

    // Objects
    Scanner input = new Scanner(System.in);


    // Private Variables for sensitive user data
    private int accountID;



    // Private Variables for the Object
    private int createdAccounts;


    // Constructer
    public AccountHandler()
    {
        accountID = 1;

    }


    // Create Account
    public User createUser()
    {
        // Asks user for user and password to sign up
        System.out.println("Sign up to chat: ");
        System.out.print("Username: ");
        String username = input.nextLine();
        System.out.print("\nPassword: ");
        String password = input.nextLine();

        User newUser = new User(username,password, accountID);
        accountID ++;

        return newUser;

    }


    // Create Account automatically
    public User createUser(String username, String password)
    {
        User newUser = new User(username,password,accountID);
        accountID ++;
        return newUser;

    }

    // log into an account
    public void login(User account)
    {
        // Asks user for user and password to log in
        System.out.println("Login in to your account: ");

        System.out.print("\nPassword: ");
        String password = input.nextLine();

        int possibleError = account.accountLogin(password);

        while (possibleError != 0)
        {
            System.out.print("\nPassword: ");
            password = input.nextLine();
            possibleError = account.accountLogin(password);

            if (possibleError == 101)
            {
                break;
            }
        }

    }


}