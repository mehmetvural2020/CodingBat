package WarmUp1;

public class Front22 {
    /* Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back,
    so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there.

    front22("kitten") → "kikittenki"
    front22("Ha") → "HaHaHa"
    front22("abc") → "ababcab"*/

    public static void main(String[] args) {

    }
    public static String front22(String str) {
        String result ="";
        if(str.length() < 2) result = str + str + str;
        else {
            result = str.substring(0,2) +  str + str.substring(0,2);
        }
        return result;
    }

}
