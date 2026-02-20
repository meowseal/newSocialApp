package appObjects;
import java.util.Date;
@SuppressWarnings("unused")

public class User {
  
  // Initialize Variables for User Object
  private String username;
  private String password;
  private String email;
  private String phoneNumber;
  private Date joinDate;

  // Data for user
  private String bio;
  private String pronouns;
  private Date birthday;


  // password setting
  private int passwordAttempts = 0;
  private int maxAttempts = 5;
  private boolean loggedIn = false;


  // Constructer
  public User(String username, String password) 
  {
    this.username = username;
    this.password = password;
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

// Attempt to login to the account
  public void accountLogin(String attemptedPassword)
  {
    if ( passwordAttempts < maxAttempts)
    {
      if (attemptedPassword.equals(password))
      {
        // reset password attempts and end statement
        passwordAttempts = 0;
        System.out.println("Logged into account " + getUsername());
        loggedIn = true;
      }

      else
      {
        // Incriment attempts and tell user how many left
        passwordAttempts ++;
        System.out.println("Incorrect password " + (maxAttempts - passwordAttempts) + " remain...");

        if (passwordAttempts == maxAttempts)
        {
            System.out.println("You have reached the maximum amount of attempts...");
        }
        
      }
    }

    else
    {
      System.out.println("You have reached the maximum amount of attempts...");
    }

  }


// Update user settings

    public void updateUsername(String username, String password)
    {

        // Make it so it logs out when you reach max attempts
        if (this.password == password)
        {
            this.username = username;
            System.out.println("Username updated successfully...");
        }
        else
        {
            System.out.println("Incorrect Password...");
        }


    }


    // set bio if logged in
    public void updateBio(String bio)
    {
        if (loggedIn)
        {
            this.bio = bio;
            System.out.println("Updated bio successfully...");
        }

        else
        {
            System.out.println("Not logged in...");
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

        else
        {
            System.out.println("Not logged in...");
        }
    }

    // set birthday if logged in
    public void updateBirthday (Date birthday)
    {
        if (loggedIn)
        {
            this.birthday = birthday;
            System.out.println("Updated birthdya successfully...");
        }

        else
        {
            System.out.println("Not logged in...");
        }

    }

    public String toString() {
      return "Username: " + getUsername() + "\n Pronouns: " + getPronouns() + "\n Bio: " + getBio();
    }

}
