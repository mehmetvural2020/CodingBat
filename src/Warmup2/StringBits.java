package Warmup2;

public class StringBits {
    public static void main(String[] args) {
        String result = stringBits("Hello");    // → "Hlo"
        stringBits("Hi");   // → "H"
        stringBits("Heeololeo");    // → "Hello"
    }
























    public static String stringBits(String str) {
        String newstr = "";

        for(int i = 0; i < str.length(); i= i + 2){
            newstr += Character.toString(str.charAt(i));
        }

        return newstr;
    }

}
