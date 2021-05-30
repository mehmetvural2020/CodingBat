package Warmup2;

public class Last2 {
    public static void main(String[] args) {
        int result = last2("xxaxxaxxaxx");

        System.out.println("Result : " + result);
    }

























    public static int last2(String str) {
        int count =0;
        String last2 = "";
        int length = str.length();

        if(length <= 1) count = 0;
        else last2 = str.substring(length-2,length);

        for(int i = 0; i < length-2; i++) {
            String checkstr = str.substring(i, i+2);
            if(checkstr.equalsIgnoreCase(last2)) count++;
        }
        return count;
    }
}
