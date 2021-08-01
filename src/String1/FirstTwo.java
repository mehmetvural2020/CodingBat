package String1;

public class FirstTwo {
    /*Given a string, return the string made of its first two chars, so the String "Hello" yields "He".
    If the string is shorter than length 2, return whatever there is,
    o "X" yields "X", and the empty string "" yields the empty string "".
    Note that str.length() returns the length of a string.

    firstTwo("Hello") → "He"
    firstTwo("abcdefg") → "ab"
    firstTwo("ab") → "ab"*/

    public static void main(String[] args) {

    }

    public static String firstTwo(String str){
//        if(str.length()<2) return str;
//        return str.substring(0,2);
     return (str.length()<2) ? str : str.substring(0,2);
    }

}








//if(str.length() >= 2) return str.substring(0,2);
//        return str;
//Solution -2 :
//        return (str.length() >= 2) ? str.substring(0,2) : str;