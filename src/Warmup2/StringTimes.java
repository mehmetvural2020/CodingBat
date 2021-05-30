package Warmup2;

public class StringTimes {

    /*Given a string and a non-negative int n,
    return a larger string that is n copies of the original string.


    stringTimes("Hi", 2) → "HiHi"
    stringTimes("Hi", 3) → "HiHiHi"
    stringTimes("Hi", 1) → "Hi"*/

    public static void main(String[] args) {
        String result;
        result = stringTimes1("Hi", 5); //→ "HiHi"
        stringTimes1("Hi", 3); //→ "HiHiHi"
        stringTimes1("Hi", 1); //→ "Hi"

        System.out.println("Result : " + result);
    }
    public static String stringTimes1(String str, int n) {
        String result = "";
        for(int i =0; i < n; i++){
            result += str;
        }

        return result;
    }




















    public static String stringTimes(String str, int n) {
        String text = "";
        for (int i = 0; i < n; i++) {
            text += str;
        }
        return text;

    }
}