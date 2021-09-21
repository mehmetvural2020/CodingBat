package Logic2;

public class Logic6and9 {
    public static void main(String[] args) {

    }

    public boolean closeFar(int a, int b, int c) {
    /*Given three ints, a b c, return true if one of b or c is "close"
    (differing from a by at most 1),
    while the other is "far", differing from both other values by 2 or more.
    Note: Math.abs(num) computes the absolute value of a number.

    closeFar(1, 2, 10) → true
    closeFar(1, 2, 3) → false
    closeFar(1, 4, 2) → true
    closeFar(4, 1, 3) → true*/
        if(Math.abs(a-b)<=1 && Math.abs(a-c)>=2 && Math.abs(b-c)>=2) return true;
        if(Math.abs(a-c)<=1 && Math.abs(a-b)>=2 && Math.abs(b-c)>=2) return true;

        return false;
    }

    public int blackjack(int a, int b) {
    /*Given 2 int values greater than 0,
    return whichever value is nearest to 21 without going over.
    Return 0 if they both go over.
    1,2,3,4.....19,20,  21,   22,23,24

    blackjack(19, 21) → 21
    blackjack(21, 19) → 21
    blackjack(19, 22) → 19*/

        // int result;

        // if(a>21) result = b;
        // else if (b> 21) result = a;
        // else if(21-a < 21-b) result = a;
        // else result = b;

        // if((a == 21) ||(b == 21)) result = 21;

        // if(a>21 & b>21) result = 0;

        // return result;

//        Solution 2 :
//        if(a>21 && b>21) return 0;
//
//        if ((a <= 21 && (Math.abs(21-a) <= Math.abs(21-b))) || (a<=21 && b > 21)) {
//            return a;
//        }
//        if ((b <= 21 && Math.abs(21-b) <= Math.abs(21-a)) || (b<=21 && a > 21)) {
//            return b;
//        }
//        return 0;

//        Solution 3:
        if(a > 21 && b > 21) return 0;
        else if (a <= 21 && a > b || b > 21) return a;
        return b;
    }


    public boolean evenlySpaced(int a, int b, int c) {
        /*Given three ints, a b c, one of them is small,
        one is medium and one is large.
        Return true if the three values are evenly spaced,
        so the difference between small and medium is the same
        as the difference between medium and large.

    evenlySpaced(2, 4, 6) → true
    evenlySpaced(4, 6, 2) → true
    evenlySpaced(4, 6, 3) → false*/
        int small = Math.min(a,Math.min(b,c));
        int big = Math.max(a,Math.max(b,c));

        int medium = (a > small && a < big) ? a : (b > small && b < big) ? b : c;

        return medium - small ==  big - medium; // 2 - 4 - 6

    }



}
