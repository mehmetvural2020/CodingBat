package Warmup2;

public class StringMatch {
    /*Given 2 strings, a and b,
    return the number of the positions where they contain the same length 2 substring.
    So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings
    appear in the same place in both strings.

    stringMatch("xxcaazz", "xxbaaz") → 3
    stringMatch("abc", "abc") → 2
    stringMatch("abc", "axc") → 0*/

    public static void main(String[] args) {

    }

    public static int stringMatch(String a, String b) {
        //Solution 1-
//        int count = b.length();
//        int count2 = 0;
//        if(a.length()<b.length())count = a.length();
//
//        for(int i = 0; i < count-1; i++ ){
//            if(a.substring(i,i+2).equals(b.substring(i,i+2)))count2++;
//        }
//
//        return count2;

        //Solution 2-

        int count=0;
        for(int i=0; i<Math.min(a.length(),b.length())-1; i++){
            if (a.substring(i,i+2).equals(b.substring(i,i+2))){
                count++;
            }
        }
        return count;
    }
}
