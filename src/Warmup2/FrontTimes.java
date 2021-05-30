package Warmup2;

public class FrontTimes {

    /*Given a string and a non-negative int n,
    we'll say that the front of the string is the first 3 chars,
    or whatever is there if the string is less than length 3. Return n copies of the front;


    frontTimes("Chocolate", 2) → "ChoCho"
    frontTimes("Chocolate", 3) → "ChoChoCho"
    frontTimes("Abc", 3) → "AbcAbcAbc"
    */
    public static void main(String[] args) {
        String result;
        result = frontTimes("A",4);
        System.out.println("Result : " + result);
//        frontTimes("Chocolate", 2); //→ "ChoCho"
//        frontTimes("Chocolate", 3); //→ "ChoChoCho"
//        frontTimes("Abc", 3);   //→ "AbcAbcAbc"
////        frontTimes("Ab", 4);
//        frontTimes("A", 4);
//        frontTimes("", 4);
//        frontTimes("Abc", 0);
    }
    public static String frontTimes(String str, int n) {
        String result ="";
        String chr = "";

        if(str.length() <=3) chr += str;
        else{
            chr += str.substring(0,3);
        }
        for(int i=0; i<n; i++){
            result += chr;
        }

        return result;
    }





















    public static String frontTimes1(String str, int n) {
        int number = 3;
        if(str.length() < 3) number = str.length();

        String chr3 = str.substring(0,number);
        str.substring(3,str.length());

        String text = "";
        for(int i = 0; i < n; i++){
            text += chr3;
        }
        return text;
    }
}
