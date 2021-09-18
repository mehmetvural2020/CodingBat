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
    deFront("aw ay") → "aay"*/

    public static String deFront(String str) {
//        String newStr = "";
//        if(str.charAt(0)=='a')
//            newStr += 'a';        ///  a
//        if(str.charAt(1)=='b')
//           newStr += 'b';
//        newStr += str.substring(2);   /// aay

        // Solution 2 :
        String  newStr = str.substring(2);
        if(str.charAt(1)=='b') newStr = 'b' + newStr;
        if(str.charAt(0)=='a') newStr = 'a' + newStr;

        return newStr;
    }

    /*Given a string and a second "word" string, we'll say that the word matches the string
    if it appears at the front of the string, except its first char does not need to match exactly.
     On a match, return the front of the string, or otherwise return the empty string.
     So, so with the string "hippo" the word "hi" returns "hi" and "xip" returns "hip".
     The word will be at least length 1.


    startWord("hippo", "hi") → "hi"
    startWord("hippo", "xip") → "hip"
    startWord("h", "i") → "h"*/

    public static String startWord(String str, String word) {
        // if(str.length()>1 && str.substring(1,word.length()).equals(word.substring(1))) return str.substring(0,word.length());
        // if(str.length()==1 && word.length()==1) return str;

        // return "";

        //Solution 2 :
        if(str.length()>1 && str.substring(1,word.length()).startsWith(word.substring(1))) return str.substring(0,word.length());
        if(str.length()==1 && word.length()==1) return str;

        return "";
    }

    /*Given a string, if the first or last chars are 'x',
    return the string without those 'x' chars, and otherwise return the string unchanged.


    withoutX("xHix") → "Hi"
    withoutX("xHi") → "Hi"
    withoutX("Hxix") → "Hxi"*/

    public static String withoutX(String str) {
        if(str.length()>0 && str.charAt(0)=='x') str = str.substring(1);
        if(str.length()>=1 && str.charAt(str.length()-1)=='x') str = str.substring(0,str.length()-1);
        return str;
    }

    /*Given a string, if one or both of the first 2 chars is 'x',
    return the string without those 'x' chars, and otherwise return the string unchanged.
    This is a little harder than it looks.

    withoutX2("xHi") → "Hi"
    withoutX2("Hx i") → "Hi"
    withoutX2("Hi c") → "Hi"*/
//    Hello   -> He     llo

    public static String withoutX2(String str) {
//        String newStr = "";
//
//        if(str.length()>1 && str.charAt(1) != 'x') newStr = str.charAt(1) + newStr;  // e + llo
//
//        if(str.length()>0 && str.charAt(0) != 'x' ) newStr = str.charAt(0) + newStr;  // H + ello
//
//        if(str.length()>2) newStr = newStr + str.substring(2); // llo
//                return newStr;  // Hello

        // Solution 2 :
        String word = "";
        for(int i=0; i<str.length(); i++)
        {
            if((i==0||i==1) && str.charAt(i)=='x')
                continue;
            word += str.charAt(i);  // 0-C 1-o 2-d   3-i  4-n...
        }
        return word;


    }



}
