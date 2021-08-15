package String1;

public class String2630 {
    public static void main(String[] args) {

    }

    /*Given a string, return true if the first 2 chars in the string
    also appear at the end of the string, such as with "edited".

    frontAgain("edited") → true
    frontAgain("edit") → false
    frontAgain("ed") → true*/

    public static boolean frontAgain(String str) {
// if((str.length()>=2) && str.substring(0,2).equals(str.substring(str.length()-2))) return true;
        // return false;

        // Solution 2 :
        return ((str.length()>=2) && str.substring(0,2).equals(str.substring(str.length()-2)));
    }

    /*Given two strings, append them together (known as "concatenation")
    and return the result. However, if the strings are different lengths,
    omit chars from the longer string so it is the same length as the shorter string.
    So "Hello" and "Hi" yield "loHi". The strings may be any length.


    minCat("Hello", "Hi") → "loHi"       5 - 2 = 3
    minCat("Hello", "java") → "ellojava"
    minCat("java", "Hello") → "javaello"   5-4 = 1
    Hi He   Hi Hello
    */

    public static String minCat(String a, String b) {
        if(a.length()<b.length()) return a + b.substring(b.length()-a.length());
        else if(a.length()>b.length()) return a.substring(a.length()-b.length()) + b;

        return a+b;
    }

   /*Given a string, return a new string made of 3 copies of the first 2 chars of the original string.
   The string may be any length. If there are fewer than 2 chars, use whatever is there.


    extraFront("Hello") → "HeHeHe"
    extraFront("ab") → "ababab"
    extraFront("H") → "HHH"*/

    public static String extraFront(String str) {
        // if(str.length()<=2) return str+str+str;

//       return str.substring(0,2)+str.substring(0,2)+str.substring(0,2);

        // Solution 2 :
        if(str.length()>=2) str = str.substring(0,2);;
        return str+str+str;
    }

    /*Given a string, if a length 2 substring appears at both its beginning and end,
    return a string without the substring at the beginning, so "HelloHe" yields "lloHe".
    The substring may overlap with itself, so "Hi" yields "".
    Otherwise, return the original string unchanged.


    without2("HelloHe") → "lloHe"
    without2("HelloHi") → "HelloHi"
    without2("Hi") → ""

    HiH  Hi == iH
    hhh
    */

    public static String without2(String str) {
        if(str.length()==2) return "";
        else if((str.length()>=3) &&
                str.substring(0,2).equals(str.substring(str.length()-2))) return str.substring(2);
        return str;
    }

    /*Given a string, return a version without the first 2 chars.
    Except keep the first char if it is 'a' and keep the second char if it is 'b'.
    The string may be any length. Harder than it looks.


    deFront("Hello") → "llo"
    deFront("java") → "va"
    deFront("away") → "aay"*/

    public static String deFront(String str) {

        return str;
    }





}
