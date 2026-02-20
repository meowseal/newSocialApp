public class Errors {

    public static String checkError(int errorCode)
    {
        // All error codes replace with enum
        if (errorCode == 100) { return "Incorrect Password";}
        else if (errorCode == 101) { return "Max attempts reached";}
        else{return "";}

    }



}