package appObjects;
import java.util.Date;


@SuppressWarnings("all")


public class User {



    // Initialize Variables for User Object
    private String username;
    private String password;
    private String email;
    private String phoneNumber;
    private Date joinDate;

    // Data for user
    private String bio = "";
    private String pronouns = "";
    private Date birthday;
    private int id;

    // password setting
    private int passwordAttempts = 0;
    private int maxAttempts = 5;
    private boolean loggedIn = false;


    // Constructer
    public User(String username, String password, int id)
    {
        this.username = username;
        this.password = password;
        this.id = id;
    }

    // getters
    public String getUsername() {
        return username;
    }

    public String getBio()
    {
        return bio;
    }

    public String getPronouns() {
        return pronouns;
    }

    public int getid() {
        return id;
    }

    // Attempt to login to the account
    public int accountLogin(String attemptedPassword)
    {
        if ( passwordAttempts < maxAttempts)
        {
            if (attemptedPassword.equals(password))
            {
                // reset password attempts and end statement
                passwordAttempts = 0;
                System.out.println("Logged into account " + getUsername());
                loggedIn = true;
                return 0;
            }

            else
            {
                // Incriment attempts and tell user how many attempts are left
                passwordAttempts ++;
                System.out.println("Incorrect password " + (maxAttempts - passwordAttempts) + " remain...");


                if (passwordAttempts == maxAttempts)
                {
                    System.out.println("You have reached the maximum amount of attempts...");
                    return 101;
                }

                else
                {
                    return 100;
                }

            }


        }

        else
        {
            System.out.println("You have reached the maximum amount of attempts...");
            return 101;
        }

    }


// Update user settings

    public int setUsername(String username, String password)
    {

        // Make it so it logs out when you reach max attempts
        if (this.password == password)
        {
            this.username = username;
            System.out.println("Username updated successfully...");
            return 0;
        }
        else
        {
            System.out.println("Incorrect Password...");
            return 100;
        }


    }


    // set bio if logged in
    public void setBio(String bio)
    {
        if (loggedIn)
        {
            this.bio = bio;
        }



    }


    // set pronouns if logged in
    public void updatePronouns (String pronouns)
    {
        if (loggedIn)
        {
            this.pronouns = pronouns;
            System.out.println("Updated pronouns successfully...");
        }
    }

    // set birthday if logged in
    public void setBirthday (Date birthday)
    {
        if (loggedIn)
        {
            this.birthday = birthday;
            System.out.println("Updated birthdya successfully...");
        }

    }

    public String toString() {
        String returnString = ("Username: " + getUsername());

        if (!(pronouns == ""))
        {
            returnString += "\nPronouns: " + pronouns;
        }

        if (!(bio == ""))
        {
            returnString += "\n" + bio;
        }

        return returnString;
    }

}