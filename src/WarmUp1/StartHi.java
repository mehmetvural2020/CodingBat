package WarmUp1;

public class StartHi {
    /*Given a string, return true if the string starts with "hi" and false otherwise.


    startHi("hi there") → true
    startHi("hi") → true
    startHi("hello hi") → false*/
    public static void main(String[] args) {

    }

    public static boolean startHi(String str) {
        if((str.length()>1) && (str.substring(0,2).equalsIgnoreCase("hi"))) return true;

        return false;
    }

}
