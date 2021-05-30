package Warmup2;

public class AltPairs {
    public static void main(String[] args) {
        String testWord = altPairs2("Chocolate");
        System.out.println(testWord);
    }

    //Solution-1
    public static String altPairs1(String str){
        if(str.length()==0) return str;
        String result="";
        for(int i = 0; i < str.length(); i=i+4){
            result = result + str.charAt(i);
            if(i+1<str.length()){
                result = result + str.charAt(i+1);
            }
        }
        return result;
    }

    //Solution-2
    public static String altPairs2(String str){
        if(str.length()==0) return str;
        char[] stringChars = str.toCharArray();
        String result="";
        for(int i = 0; i < stringChars.length; i=i+4){
            result = result + stringChars[i];
            if(i+1 < stringChars.length)
                result = result + stringChars[i+1];
        }
        return result;
    }

}
