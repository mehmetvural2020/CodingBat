package Warmup2;

public class StringSplosion {
    public static void main(String[] args) {
        String result = stringSplosion("Code");

        System.out.println(result);
    }
























    public static String stringSplosion(String str) {
        String newstr = "";
        for(int i = 0; i < str.length(); i++) {
            newstr += str.substring(0,i+1);
        }
        return newstr;
    }

}
