package Logic1;

public class WithoutDoubles {
    /*Return the sum of two 6-sided dice rolls, each in the range 1..6.
    However, if noDoubles is true, if the two dice show the same value,
        increment one die to the next value,
    wrapping around to 1 if its value was 6.

    withoutDoubles(2, 3, true) → 5
    withoutDoubles(3, 3, true) → 7
    withoutDoubles(3, 3, false) → 6*/

    public static int withoutDoubles(int die1, int die2, boolean noDoubles) {
        if((die1 == 6) & (die2 == 6) & noDoubles) return 7;
        if((die1 == die2 ) & noDoubles ) return die1 + die2 + 1;

        return die1 + die2;
    }


    public static void main(String[] args) {
        System.out.println(withoutDoubles(2, 3, true));
        System.out.println(withoutDoubles(3, 3, true));
        System.out.println(withoutDoubles(3, 3, false));
    }




//    public static int withoutDoubles(int die1, int die2, boolean noDoubles) {
//        int result = die1 + die2;
//        if((die1 == die2) & (die1 == 6) & (noDoubles)) result = die1+1;
//        else if((die1 == die2) & (noDoubles)) result += 1;
//
//        return result;
//    }
}
