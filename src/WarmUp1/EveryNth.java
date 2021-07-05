package WarmUp1;

public class EveryNth {
    /*Given a non-empty string and an int N, return the string made starting with char 0,
    and then every Nth char of the string.
    So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.

    everyNth("Miracle", 2) → "Mrce"
    everyNth("abcdefg", 2) → "aceg"
    everyNth("abcdefg", 3) → "adg"*/

    public static void main(String[] args) {

    }

    public static String everyNth(String str, int n) {
        String newStr = "";
        for(int i = 0; i < str.length(); i=i+n){
            newStr = newStr + str.charAt(i);  //str.substring(i,i+1);
        }

        return newStr;
    }

}
