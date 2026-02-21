public class Errors {

    public static String checkError(int errorCode)
    {
        // Error codes for debugging
        if (errorCode == 100) { return "Incorrect Password";}
        else if (errorCode == 101) { return "Max attempts reached";}
        else{return "";}

    }



}