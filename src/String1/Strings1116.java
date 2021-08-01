package String1;

public class Strings1116 {
    public static void main(String[] args) {

    }

    /*Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end.
    The string length will be at least 2.


    left2("Hello") → "lloHe"
    left2("java") → "vaja"
    left2("Hi") → "Hi"*/

    public static String left2(String str) {
        return str.substring(2) + str.substring(0,2);

    }
    /*Given a string, return a "rotated right 2" version
    where the last 2 chars are moved to the start.
    The string length will be at least 2.


    right2("Hello") → "loHel"
    right2("java") → "vaja"
    right2("Hi") → "Hi"*/

    public static String right2(String str) {

        return str.substring(str.length()-2) + str.substring(0,str.length()-2);
    }

    /*Given a string, return a string length 1 from its front,
    unless front is false, in which case return a string length 1 from its back.
    The string will be non-empty.


    theEnd("Hello", true) → "H"
    theEnd("Hello", false) → "o"
    theEnd("oh", true) → "o"*/

    public static String theEnd(String str, boolean front) {
        if(front) return str.substring(0,1);
        else return str.substring(str.length()-1);
//
//        Solution 2 :
//        return (front) ? str.substring(0,1) : str.substring(str.length()-1);
    }

    /*Given a string, return a version without both the first
    and last char of the string. The string may be any length,
    including 0.

    withouEnd2("Hello") → "ell"
    withouEnd2("abc") → "b"
    withouEnd2("ab") → ""*/

    public static String withouEnd2(String str) {
        if(str.length()<=2) return "";
        else return str.substring(1,str.length()-1);
    }

    /*Given a string of even length, return a string made of the middle two chars,
    so the string "string" yields "ri". The string length will be at least 2.

    middleTwo("string") → "ri"
    middleTwo("co de") → "od"  // (str.length()/2)-1 -> 2-1=1
    middleTwo("Prac tice") → "ct"*/

    public static String middleTwo(String str) {
        return str.substring(str.length()/2-1,str.length()/2+1);
    }

    /*Given a string, return true if it ends in "ly".


    endsLy("oddly") → true
    endsLy("y") → false
    endsLy("oddy") → false*/

    public static boolean endsLy(String str) {
        if(str.length()<2) return false;
        else return str.substring(str.length()-2).contains("ly");
    }
}
