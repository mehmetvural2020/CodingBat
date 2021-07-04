package WarmUp1;

public class Makes10 {
    //
//  Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
//
//
//  makes10(9, 10) → true
//  makes10(9, 9) → false
//  makes10(1, 9) → true

    public static void main(String[] args) {
        System.out.println(makes10(9,10));
        System.out.println(makes10(9,9));
        System.out.println(makes10(9,1));
    }

    public static boolean makes10(int a, int b) {
        // if ((a == 10) || (b == 10) || (a+b == 10)) {
        //   return true;
        // }
        // else {
        //   return false;
        // }

        // Solution -2
        // if (a == 10 || b == 10 || (a+b) == 10) return true;

        //     return false;

        // Solution -3
        return (a == 10 || b == 10 || (a+b) == 10);


    }
}
