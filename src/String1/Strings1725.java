package String1;

public class Strings1725 {
    public static void main(String[] args) {

    }


    /*Given a string and an int n, return a string made of the first and last n chars from the string.
    The string length will be at least n.

    nTwice("Hello", 2) → "Helo"
    nTwice("Chocolate", 3) → "Choate"
    nTwice("Chocolate", 1) → "Ce"
    nTwice("end", 3) → "endend"

    */

    public static String nTwice(String str, int n) {

        return str.substring(0,n) + str.substring(str.length()-n);
    }

    /*Given a string and an index, return a string length 2 starting at the given index.
    If the index is too big or too small to define a string length 2, use the first 2 chars.
    The string length will be at least 2.


    twoChar("java", 0) → "ja"
    twoChar("java", 2) → "va"
    twoChar("java", 3) → "ja"*/

    public static String twoChar(String str, int index) {
        if(index < 0 || str.length()-2 < index) return str.substring(0,2);
        else return str.substring(index, index+2);
    }

    /*Given a string of odd length, return the string length 3 from its middle,
    so "Candy" yields "and". The string length will be at least 3.


    middleThree("Candy") → "and"   length/2 = (3-2, +1)     length/2 = 2  (2-1,+2)
    middleThree("and") → "and"
    middleThree("solving") → "lvi"*/

    public static String middleThree(String str) {

        return str.substring(str.length()/2-1,str.length()/2+2);
    }

    /*Given a string, return true if "bad" appears starting at index 0 or 1 in the string,
    such as with "badxxx" or "xbadxx" but not "xxbadxx".
    The string may be any length, including 0. Note: use .equals() to compare 2 strings.

    hasBad("badxx") → true
    hasBad("xbadxx") → true
    hasBad("xxbadxx") → false*/

    public static boolean hasBad(String str) {
        if(str.length()<3) return false;
        else if(str.length()>3 && str.substring(1,4).equals("bad")
                       ||str.substring(0,3).equals("bad")) return true;

        return false;

        // Solution 2 :
//        return (str.length()>3 && str.substring(1,4).equals("bad")
//                ||str.length()>=3 && str.substring(0,3).equals("bad"));
    }


    //    Sunday August 8, 2021

    /*Given a string, return a string length 2 made of its first 2 chars.
    If the string length is less than 2, use '@' for the missing chars.

    atFirst("hello") → "he"
    atFirst("hi") → "hi"
    atFirst("h") → "h@"*/

    public static String atFirst(String str) {
        if(str.length()==0) str = "@@";
        else if(str.length()==1) str = str + "@";
        else str = str.substring(0,2);

        return str;
    }


    /*Given 2 strings, a and b, return a new string made of the first char of a and the last char of b,
    so "yo" and "java" yields "ya". If either string is length 0, use '@' for its missing char.

    lastChars("last", "chars") → "ls"
    lastChars("yo", "java") → "ya"
    lastChars("hi", "") → "h@"*/

    public static String lastChars(String a, String b) {
//        if(a.length()==0 && b.length()==0) a="@@";
//        else if(a.length()==0) a = "@" + b.charAt(b.length()-1);
//        else if(b.length()==0) a = a.charAt(0) + "@";
//        else a = a.charAt(0) + b.substring(b.length()-1);
//
//        return a;

    // Solution 2 :
        String first = "@";
        String last = "@";;

        if(a.length() > 0)
            first = a.substring(0,1);

        if(b.length() > 0)
            last = b.substring(b.length() - 1);

        return first + last;
    }


    /*Given two strings, append them together (known as "concatenation")
    and return the result. However, if the concatenation creates a double-char,
    then omit one of the chars, so "abc" and "cat" yields "abcat".  --> abcat


    conCat("abc", "cat") → "abcat"
    conCat("dog", "cat") → "dogcat"
    conCat("abc", "") → "abc"*/

    public static String conCat(String a, String b) {
        // if(a.length()==0) return b;
        //       else if(b.length()==0) return a;
        //       else if(a.charAt(a.length()-1)==b.charAt(0)) return a + b.substring(1);
        //       else return a+b;

        // Solution 2 :
        if(a.length()>0 && b.length()>0
                && a.charAt(a.length()-1)==b.charAt(0)) return a + b.substring(1);
        else return a+b;
    }

    /*Given a string of any length, return a new string where the last 2 chars, if present, are swapped,
    so "coding" yields "codign".


    lastTwo("coding") → "codi + g + n"
    lastTwo("cat") → "cta"
    lastTwo("ab") → "ba"*/

    public static String lastTwo(String str) {

        if(str.length()>1) return str.substring(0,str.length()-2) + str.charAt(str.length()-1) + str.charAt(str.length()-2);
        return str;
    }

    /*Given a string, if the string begins with "red" or "blue" return that color string, otherwise return the empty string.


    seeColor("redxx") → "red"
    seeColor("xxred") → ""
    seeColor("blueTimes") → "blue"*/

    public static String seeColor(String str) {
        if(str.length()>=3 && str.substring(0,3).equals("red")) return "red";
        else if(str.length()>=4 && str.substring(0,4).equals("blue")) return "blue";
        return "";
    }








}
