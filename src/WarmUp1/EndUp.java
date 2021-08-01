package WarmUp1;

public class EndUp {
    /*Given a string, return a new string where the last 3 chars are now in upper case.
    If the string has less than 3 chars, uppercase whatever is there.
    Note that str.toUpperCase() returns the uppercase version of a string.

    endUp("Hello") → "HeLLO"
    endUp("hi there") → "hi thERE"
    endUp("hi") → "HI"*/

    public static void main(String[] args) {

    }


    public String endUp(String str) {
        if(str.length()<3) return str.toUpperCase();
        else return str.substring(0,str.length()-3) + str.substring(str.length()-3).toUpperCase();
    }







//    public String endUp(String str) {
//        if(str.length()<3) return str.toUpperCase();
//        else return str.substring(0,str.length()-3) + str.substring(str.length()-3).toUpperCase();
//// Short Solution :
////        return (str.length()<3) ? str.toUpperCase() : str.substring(0,str.length()-3) + str.substring(str.length()-3).toUpperCase();
//
//    }

}
