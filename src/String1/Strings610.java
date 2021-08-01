package String1;

public class Strings610 {

    /*Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".


    firstHalf("WooHoo") → "Woo"
    firstHalf("HelloThere") → "Hello"
    firstHalf("abcdef") → "abc"
*/

    public static String firstHalf(String str) {

        return str.substring(0,str.length()/2);
    }

    /*Given a string, return a version without the first and last char,
    so "Hello" yields "ell". The string length will be at least 2.

    withoutEnd("Hello") → "ell"
    withoutEnd("java") → "av"
    withoutEnd("coding") → "odin"*/


    public static String withoutEnd(String str) {


        return str.substring(1,str.length()-1);
    }

    /*Given 2 strings, a and b, return a string of the form short+long+short,
    with the shorter string on the outside and the longer string on the inside.
    The strings will not be the same length, but they may be empty (length 0).

    comboString("Hello", "hi") → "hiHellohi"
    comboString("hi", "Hello") → "hiHellohi"
    comboString("aaa", "b") → "baaab"*/

    public static String comboString(String a, String b) {
        if(a.length()>b.length()) return b+a+b;
        else return a+b+a;

    }

    /*Given 2 strings, return their concatenation,
    except omit the first char of each. The strings will be at least length 1.

    nonStart("Hello", "There") → "ellohere"
    nonStart("java", "code") → "avaode"
    nonStart("shotl", "java") → "hotlava"*/

    public static String nonStart(String a, String b) {

        return a.substring(1) + b.substring(1);
    }
}
