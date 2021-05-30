package Warmup2;

public class DoubleX {
    /*Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".


    doubleX("axxbb") → true
    doubleX("axaxax") → false
    doubleX("xxxxx") → true*/

    public static void main(String[] args) {
        boolean result = doubleX("axxbb");   // → true
        doubleX("axaxax");  // → false
        doubleX("");  // → false

        System.out.println("Result : " + result);
    }

    public static boolean doubleX(String str) {

        return false;
    }






















    public static boolean doubleX1(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            if ((str.charAt(i) == 'x') & !(str.charAt(i + 1) == 'x')) return false;

            else if ((str.charAt(i) == 'x') & (str.charAt(i + 1) == 'x')) return true;

        }
        return false;
    }
}
