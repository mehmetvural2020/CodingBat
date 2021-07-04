package WarmUp1;

public class LoneTeen {
    /*We'll say that a number is "teen" if it is in the range 13..19 inclusive.
    Given 2 int values, return true if one or the other is teen, but not both.

    loneTeen(13, 99) → true
    loneTeen(21, 19) → true
    loneTeen(13, 13) → false*/

    public static void main(String[] args) {

    }

    public static boolean loneTeen(int a, int b) {
        //Solution 1 :

//        if((a>=13 && a<=19) && (b>=13 && b<=19)) return false;
//        else if((b>=13 && b<=19) || (a>=13 && a<=19)) return true;
//        return false;

        //Solution 2 :
//        if((a >= 13 && a <= 19) && !(b >= 13 && b <= 19) ||
//                !(a >= 13 && a <= 19) && (b >= 13 && b <= 19)){
//            return true;
//        }return false;

        //Solution 3 :

        boolean aTeen = (13<=a && a<=19);
        boolean bTeen = (13<=b && b<=19);
        return (aTeen&&!bTeen) || (!aTeen&&bTeen);
    }
}
