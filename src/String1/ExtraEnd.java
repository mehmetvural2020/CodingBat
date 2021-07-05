package String1;

public class ExtraEnd {
    /*Given a string, return a new string made of 3 copies of the last 2 chars of the original string.
    The string length will be at least 2.

    extraEnd("Hello") → "lololo"
    extraEnd("ab") → "ababab"
    extraEnd("Hi") → "HiHiHi"*/

    public static void main(String[] args) {

    }

    public static String extraEnd(String str) {
        String newStr = "";
        for(int i = 0; i < 3; i++){
            newStr = newStr + str.substring(str.length()-1);
        }

        return newStr;
    }
}
