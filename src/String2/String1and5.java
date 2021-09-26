package String2;

import java.util.Locale;

public class String1and5 {
    public static void main(String[] args) {
        String str = "catxxdogxxxdog";
        for(int i = 0; i < str.length(); i++){
            System.out.println(str.charAt(i));
//            System.out.println(str.charAt(i+1));
        }

        System.out.println(str.replace("dog", ""));
        System.out.println(str.replace("dog", "").length());
        System.out.println(str.replace("cat", ""));
        System.out.println(str.replace("cat", "").length());
    }

    public String doubleChar(String str) {
    /*Given a string, return a string where for every char in the original, there are two chars.

    doubleChar("The") → "TThhee"
    doubleChar("AAbb") → "AAAAbbbb"
    doubleChar("Hi-There") → "HHii--TThheerree"*/
        String newStr="";

        for(int i = 0; i < str.length(); i++){
            newStr = newStr + str.charAt(i) + str.charAt(i); // i = 0 -> T + T
        }

        return newStr;
    }


    public int countHi(String str) {
    /*Return the number of times that the string "hi" appears anywhere in the given string.

    countHi("abc hi ho") → 1
    countHi("ABChi hi") → 2
    countHi("hihi") → 2
*/
        int count = 0;
        for(int i = 0; i < str.length()-1; i++){
            if(str.substring(i,i+2).equals("hi")) count++;
        }

        return count;
    }

    public boolean catDog(String str) {
    /*Return true if the string "cat" and "dog" appear the same number of times in the given string.

    catDog("catdog") → true // str.length()-1  = son index numarasini = 5 yani g harfi
    catDog("catcat") → false
    catDog("1cat1cadodog") → true*/

        //Solution 1 :
//        int countDog = 0;
//        int countCat = 0;
//        for(int i = 0; i < str.length()-2; i++){
//            if(str.substring(i,i+3).equals("cat")) countCat++;
//            if(str.substring(i,i+3).equals("dog")) countDog++;
//        }
//        return (countCat == countDog);

        // if(countCat == countDog) return true;
        // return false;

        // Solution 2 :
        return str.replace("dog", "").length() == str.replace("cat", "").length();

        // catxdogxdogxca
        // erase "dog" catxxxca -> 8
        // erase "cat" xdogxdogxca -> 11

    }


    public int countCode(String str) {
    /*Return the number of times that the string "code" appears anywhere in the given string,
    except we'll accept any letter for the 'd', so "cope" and "cooe" count.

    countCode("aaacodebbb") → 1
    countCode("codexxcode") → 2
    countCode("cozexxcope") → 2*/
        int count = 0;
        // co + * + e
        for(int i = 0; i < str.length()-3; i++){
            if(str.substring(i,i+2).equals("co") && str.charAt(i+3)=='e') count++;
        }
        return count;
    }



    public boolean endOther(String a, String b) {
    /*Given two strings, return true if either of the strings appears at the very end of the other string,
    ignoring upper/lower case differences (in other words, the computation should not be "case sensitive").
    Note: str.toLowerCase() returns the lowercase version of a string.

    endOther("Hiabc", "abc") → true
    endOther("AbC", "HiaBc") → true
    endOther("abc", "abXabc") → true*/

        a = a.toLowerCase(Locale.ROOT);
        b = b.toLowerCase(Locale.ROOT);
        if(a.length()>b.length() && a.endsWith(b)) return true;
        return b.length() >= a.length() && b.endsWith(a);
    }



    public boolean xyzThere(String str) {
    /*Return true if the given string contains an appearance of "xyz"
    where the xyz is not directly preceeded by a period (.).
    So "xxyz" counts but "x.xyz" does not.

    xyzThere("abcxyz") → true
    xyzThere("abc.xyz") → false
    xyzThere("xyz.abc") → true */





        return false;
    }


    public boolean bobThere(String str) {
    /*Return true if the given string contains a "bob" string,
    but where the middle 'o' char can be any char.

    bobThere("abcbob") → true
    bobThere("b9b") → true
    bobThere("bac") → false*/



        return false;
    }



    public boolean xyBalance(String str) {
    /*We'll say that a String is xy-balanced if for all the 'x' chars in the string,
    there exists a 'y' char somewhere later in the string. So "xxy" is balanced,
    but "xyx" is not. One 'y' can balance multiple 'x's.
    Return true if the given string is xy-balanced.

    xyBalance("aaxbby") → true
    xyBalance("aaxbb") → false
    xyBalance("yaaxbb") → false*/

        return false;
    }


    public String mixString(String a, String b) {
    /*Given two strings, a and b, create a bigger string made of the first char of a,
    the first char of b, the second char of a, the second char of b, and so on.
    Any leftover chars go at the end of the result.

    mixString("abc", "xyz") → "axbycz"
    mixString("Hi", "There") → "HTihere"
    mixString("xxxx", "There") → "xTxhxexre" */




        return a;
    }

    public String repeatEnd(String str, int n) {
    /*Given a string and an int n,
    return a string made of n repetitions of the last n characters of the string.
    You may assume that n is between 0 and the length of the string, inclusive.

    repeatEnd("Hello", 3) → "llollollo"
    repeatEnd("Hello", 2) → "lolo"
    repeatEnd("Hello", 1) → "o"*/


        return str;
    }


}
