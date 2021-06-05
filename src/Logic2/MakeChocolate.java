package Logic2;

public class MakeChocolate {
    /*We want make a package of goal kilos of chocolate.
    We have small bars (1 kilo each) and big bars (5 kilos each).
    Return the number of small bars to use, assuming we always use big bars before small bars.
    Return -1 if it can't be done.

    makeChocolate(4, 1, 9) → 4
    makeChocolate(4, 1, 10) → -1
    makeChocolate(4, 1, 7) → 2*/

    public static void main(String[] args) {

    }

    public static int makeChocolate(int small, int big, int goal) {
        int result, bigx = 0;
        int n = 0;
        // 5x + n = goal
        // (goal / 5) < big x = big - (goal/5)
        // goal - 5x = n
        // if n = small result small
        // if n > small result -1
        // if n < small result small - n
        if((goal/5) < big) bigx = big - (goal/5);
        else if((goal/5) == big) bigx = big;

        if(goal - (bigx*5) == small) result = small;
        else if((goal - bigx*5) > small) result = -1;
        else result = small - (goal-bigx*5);

//        int result, bigx, n = 0;
        // 5x + n = goal
        // (goal / 5) < big x = big - (goal/5)
        // goal - 5x = n
        // if n = small result small
        // if n > small result -1
        // if n < small result small - n

        if((goal/5) < big) bigx = big - (goal/5);
        else if((goal/5) == big) bigx = big;

        n = goal - (5 * bigx);
        if(n == small) result = small;
        else if(n > small) result = -1;
        else result = small - n;

        return result;
//        if(small + big * 5 == goal) result = small;
//        else if(goal - (big*5) > small) result = -1;
//        else result = goal - (big*5) - small;
//
//        if((goal % 5 == small) & (small + big * 5 == goal)) result = small;

//        return result;
    }

}
