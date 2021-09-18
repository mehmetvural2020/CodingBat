package Logic1;

import javax.management.StringValueExp;

public class Logic2630 {
    public static void main(String[] args) {

    }

    public int redTicket(int a, int b, int c) {
    /*You have a red lottery ticket showing ints a, b, and c, each of which is 0, 1, or 2.
    If they are all the value 2, the result is 10.
    Otherwise if they are all the same, the result is 5.
    Otherwise so long as both b and c are different from a, the result is 1.
    Otherwise the result is 0.

    redTicket(2, 2, 2) → 10
    redTicket(2, 2, 1) → 0
    redTicket(0, 0, 0) → 5*/
        if(a==2 && b==2 && c==2) return 10;
        if (a==b && b==c) return 5;
        if (a!=b && a!=c)
            return 1;
        else return 0;


    }

    public int greenTicket(int a, int b, int c) {
    /*You have a green lottery ticket, with ints a, b, and c on it.
    If the numbers are all different from each other, the result is 0.
    If all of the numbers are the same, the result is 20.
    If two of the numbers are the same, the result is 10.

    greenTicket(1, 2, 3) → 0
    greenTicket(2, 2, 2) → 20
    greenTicket(1, 1, 2) → 10*/

        if ((a==b) && (b==c)) return 20;
        if ((a==b) || (b==c) || (a==c)) return 10;
        return 0;
    }



    public int blueTicket(int a, int b, int c) {
    /*You have a blue lottery ticket, with ints a, b, and c on it.
    This makes three pairs, which we'll call ab, bc, and ac.
    Consider the sum of the numbers in each pair.
    If any pair sums to exactly 10, the result is 10.
    Otherwise if the ab sum is exactly 10 more than either bc or ac sums, the result is 5.
    Otherwise the result is 0.

    blueTicket(9, 1, 0) → 10
    blueTicket(9, 2, 0) → 0
    blueTicket(6, 1, 4) → 10*/

        if(a+b==10 || a+c==10 || b+c==10) return 10;
        if(a+b==10+b+c || a+b==10+a+c) return 5;

        return 0;
    }


    public boolean shareDigit(int a, int b) {
    /*Given two ints, each in the range 10..99,
    return true if there is a digit that appears in both numbers,
    such as the 2 in 12 and 23.
    (Note: division, e.g. n/10, gives the left digit while the % "mod" n%10 gives the right digit.)

    shareDigit(12, 23) → true
    shareDigit(12, 43) → false
    shareDigit(12, 44) → false*/
        int aLeft = a/10;
        int aRight = a%10;
        int bLeft = b/10;
        int bRight = b%10;


        if(aLeft==bLeft || aLeft==bRight || aRight==bLeft || aRight==bRight) return true;

//        if(a/10==b/10 || a/10==b%10 || a%10==b/10 || a%10==b%10) return true;
        return false;
    }


    public int sumLimit(int a, int b) {
    /*Given 2 non-negative ints, a and b, return their sum, so long as the sum has the same number of digits as a.
    If the sum has more digits than a, just return a without b.
    (Note: one way to compute the number of digits of a non-negative int n is to convert it to a string with String.
    valueOf(n) and then check the length of the string.)

    sumLimit(2, 3) → 5
    sumLimit(8, 3) → 8
    sumLimit(8, 1) → 9*/
        int sumab = a+b;

        String sumStr = String.valueOf(sumab);
        String aString = String.valueOf(a);
        if(sumStr.length() == aString.length()) return sumab;
//        else if(aString.length()<sumStr.length()) return a;
        return a;
    }




}
