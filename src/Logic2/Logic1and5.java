package Logic2;

public class Logic1and5 {
    public static void main(String[] args) {

    }

    public boolean makeBricks(int small, int big, int goal) {
    /*We want to make a row of bricks that is goal inches long.
    We have a number of small bricks (1 inch each) and big bricks (5 inches each).
    Return true if it is possible to make the goal by choosing from the given bricks.
     This is a little harder than it looks and can be done without any loops.
     See also: Introduction to MakeBricks

    makeBricks(3, 1, 8) → true
    makeBricks(3, 1, 9) → false
    makeBricks(3, 2, 10) → true
*/
        //small : 1X    // big : 5y
        // 1x + 5y = goal

//        Solution 1 :
        // int y,x;
        //       y = goal / 5;  // -> 2
        //       x = goal % 5;  // -> 1
        //       if(y>big) {
        //           x = x + (y-big)*5;
        //           if(small>=x) return true;
        //       }

        //       if(big>=y && small >=x) return true;

        //       return false;

//        Solution 2 :

//        int neededBig,neededSmall;
//
//        neededBig = goal / 5;  // -> 2y - neededBig = neededBig
//        neededSmall = goal % 5;  // -> 1
//        if(neededBig>big) {
//            neededSmall = neededSmall + (neededBig-big)*5; // neededSmall? = 1 + (2-1)*5 = 1+1*5 =6
//            if(small>=neededSmall) return true;
//        }
//
//        if(big>=neededBig && small >=neededSmall) return true;
//
//        return false;

        //        Solution 3 :
        return goal % 5 <= small && big * 5 + small >= goal;

//      makeBricks(6, 1, 11) → true


    }

    public int loneSum(int a, int b, int c) {
    /*Given 3 int values, a b c, return their sum.
    However, if one of the values is the same as another of the values,
    it does not count towards the sum.

    loneSum(1, 2, 3) → 6
    loneSum(3, 2, 3) → 2
    loneSum(3, 3, 3) → 0*/

        // Solution 1 :
//        int sum = a+b+c;
//        if(a==b && b==c) return 0;
//        if(a==b) sum=c;
//        if(a==c) sum=b;
//        if(b==c) sum=a; //3
//
//        return sum;

        // Solution 2 :
//        if (a==b && a==c) return 0;
//        if (a==b) return c ;
//        else if (a == c) return b;
//        else if (b==c) return a;
//
//        return a+b+c;

        // Solution 3 :
        return (a==b && a==c) ? 0
                : (a==c) ? b
                : (a==b) ? c
                : (b==c) ? a
                : a+b+c;
    }


    public int luckySum(int a, int b, int c) {
    /*Given 3 int values, a b c, return their sum.
    However, if one of the values is 13 then it does not count towards the sum
    and values to its right do not count.
    So for example, if b is 13, then both b and c do not count.

    luckySum(1, 2, 3) → 6
    luckySum(1, 2, 13) → 3
    luckySum(1, 13, 3) → 1*/
//        if(a==13) return 0;
//        else if(b==13) return a;
//        else if(c==13) return a+b;
//
//        return a+b+c;

        // Solution 2 :
        return (a==13) ? 0
                : (b==13) ? a
                : (c==13) ? a+b
                : a+b+c;
    }

    public int noTeenSum(int a, int b, int c) {
    /*Given 3 int values, a b c, return their sum.
    However, if any of the values is a teen -- in the range 13..19 inclusive --
    then that value counts as 0, except 15 and 16 do not count as a teens.
    Write a separate helper "public int fixTeen(int n)
    {"that takes in an int value and returns that value fixed for the teen rule.
    In this way, you avoid repeating the teen code 3 times (i.e. "decomposition").
    Define the helper below and at the same indent level as the main noTeenSum().

    noTeenSum(1, 2, 3) → 6
    noTeenSum(2, 13, 1) → 3
    noTeenSum(2, 1, 14) → 3*/
        a = fixTeen(a);
        b = fixTeen(b);
        c = fixTeen(c);

        return a+b+c;

//        Solution 2 :
//        return fixTeen(a) + fixTeen(b) + fixTeen(c);
    }

    public int fixTeen(int n){
        if((n>=13 && n<=19) && (n!=15 && n!=16)) return 0;
        return n;
    }


    public int roundSum(int a, int b, int c) {
    /*For this problem, we'll round an int value up to the next multiple of 10
    if its rightmost digit is 5 or more, so 15 rounds up to 20.
    Alternately, round down to the previous multiple of 10
    if its rightmost digit is less than 5, so 12 rounds down to 10.
    Given 3 ints, a b c, return the sum of their rounded values.
    To avoid code repetition, write a separate helper "public int round10(int num)
    {" and call it 3 times. Write the helper entirely below
    and at the same indent level as roundSum().


    roundSum(16, 17, 18) → 60
    roundSum(12, 13, 14) → 30
    roundSum(6, 4, 4) → 10*/


        return round10(a) + round10(b) + round10(c);
    }

    public int round10(int num){
        if(num % 10 < 5) num = num - num % 10;
        else num = num - (num % 10) + 10;

        return num;
    }


}
