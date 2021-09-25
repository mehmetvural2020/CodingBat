package String2;

public class String1and5 {
    public static void main(String[] args) {

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




}
