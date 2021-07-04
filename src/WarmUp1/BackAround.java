package WarmUp1;

public class BackAround {
    /*Given a string, take the last char and return a new string with the last char added at the front and back,
    so "cat" yields "tcatt". The original string will be length 1 or more.

    backAround("cat") → "tcatt"
    backAround("Hello") → "oHelloo"
    backAround("a") → "aaa"*/

    public static void main(String[] args) {
        System.out.println(backAround("cat"));
        System.out.println(backAround("Hello"));
        System.out.println(backAround("a"));

    }

    public static String backAround(String str) {
//        String result= "";
//        result = Character.toString(str.charAt(str.length()-1)) + str + Character.toString(str.charAt(str.length()-1));
//
//        return result;

        return str.charAt(str.length()-1) + str + str.charAt(str.length()-1);
    }
}
