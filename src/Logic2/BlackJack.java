package Logic2;

//import static java.lang.Math.abs;

import static java.lang.Math.abs;

public class BlackJack {
    /*Given 2 int values greater than 0,
    return whichever value is nearest to 21 without going over.
    Return 0 if they both go over.

    blackjack(19, 21) → 21
    blackjack(21, 19) → 21
    blackjack(19, 22) → 19*/

    public static int blackjack(int a, int b) {
        if((a == 21) || (b == 21)) return 21;

        if(a>21 & b>21) return 0;

        if(a>21 & b<21) return b;
        else if(a<21 & b>21) return a;
        else if(21-a < 21-b) return a;
        else return b;


    }

    public static void main(String[] args) {
        int result = blackjack(19, 21);
        System.out.println(result);
    }


//    public static int blackjack(int a, int b) {
//        int result;
//
//        if(a>21) result = b;
//        else if (b> 21) result = a;
//        else if(21-a < 21-b) result = a;
//        else result = b;
//
//        if((a == 21) ||(b == 21)) result = 21;
//
//        if(a>21 & b>21) result = 0;
//
//        return result;
//    }

}
