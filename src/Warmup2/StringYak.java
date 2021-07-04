package Warmup2;

public class StringYak {
    /*
    Suppose the string "yak" is unlucky. Given a string,
    return a version where all the "yak" are removed, but the "a" can be any char.
    The "yak" strings will not overlap.

    stringYak("yakpak") → "pak"
    stringYak("pakyak") → "pak"
    stringYak("yak123ya") → "123ya"*/

    public static void main(String[] args) {
        System.out.println(stringYak("ybkyaknews"));

    }

    public static String stringYak(String str) {
        //Solution 1
//        String result="";
//        for(int i = 0; i < str.length(); i++){
//            if((str.length()> i + 2) && (str.charAt(i)=='y') && (str.charAt(i+2)=='k')) i = i + 2;
//            else
//                result = result + str.charAt(i);   // pak
//        }
//        return result;
        //Solution 2
//        String result="";
//        for (int i=0;i<str.length();i++){
//            if((str.length()>i+2)&&((str.substring(i,i+1).equals("y"))) && ((str.substring(i+2,i+3).equals("k"))))
//                i=i+2;
//
//            else
//                result=result+ str.substring(i,i+1);
//        }
//        return result;

        //Solution 3
//        if(str.contains("yak")){
//            return str.replaceAll("y.k","");
//            // Yukaridaki kod da tirnak icerisindeki . Nokta nin manasi
//            // herhangi bir karekter oldugunda demektir.
//        }
//        return str;

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if ((str.length() > i + 2) && ((str.substring(i, i + 1).equals("y"))) && ((str.substring(i + 2, i + 3).equals("k"))))
                result.deleteCharAt(i+(i+1)+(i+2));

        }
        return result.toString();


    }

}
