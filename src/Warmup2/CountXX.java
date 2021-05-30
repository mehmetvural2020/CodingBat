package Warmup2;

public class CountXX {
    /*Count the number of "xx" in the given string.
    We'll say that overlapping is allowed, so "xxx" contains 2 "xx".

    countXX("abcxx") → 1
    countXX("xxx") → 2
    countXX("xxxx") → 3*/

    public static void main(String[] args) {
        int result = countXX("abcxx");   // → 1

        System.out.println(result);
    }
    //Solution - 1
    public static int countXX(String str) {
        int count=0;
        for(int i=0; i<str.length()-1; i++){
            if (str.substring(i,i+2).equals("xx")){
                count++;
            }
        }
        return count;
    }

    //Solution - 2

    /*public static int countXX(String str) {
        int countx = 0;
        for(int i = 0; i < str.length()-1; i++) {
            if(str.charAt(i) == 'x' & str.charAt(i+1) == 'x') countx++;
        }
        return countx;
    }*/

























    public static int countXX1(String str) {
        int count = 0;
        if(str == "") return count;
        if(str.charAt(0) == 'x');
        for(int i = 0; i < str.length()-1; i++){
            if((str.charAt(i) == 'x') & (str.charAt(i+1) == 'x')) {
                count++;
            }
        }
        return count;
    }
}
