package Logic1;

public class Logic1520 {
    public static void main(String[] args) {

    }

    public static int teaParty(int tea, int candy) {

        /*We are having a party with amounts of tea and candy.
        Return the int outcome of the party encoded as 0=bad, 1=good, or 2=great.
        A party is good (1) if both tea and candy are at least 5.
        However, if either tea or candy is at least double the amount of the other one, the party is great (2).
        However, in all cases, if either tea or candy is less than 5, the party is always bad (0).

    teaParty(6, 8) → 1
    teaParty(3, 8) → 0
    teaParty(20, 6) → 2*/
        if(tea<5 || candy<5) return 0;
        else if(tea >= candy *2 || candy >= tea *2) return 2;

        return 1;
    }


    public static String fizzString(String str) {
        /*Given a string str, if the string starts with "f" return "Fizz".
        If the string ends with "b" return "Buzz". If both the "f" and "b" conditions are true, return "FizzBuzz".
        In all other cases, return the string unchanged. (See also: FizzBuzz Code)

        fizzString("fig") → "Fizz"
        fizzString("dib") → "Buzz"
        fizzString("fib") → "FizzBuzz"*/
        if(str.charAt(0) == 'f' && str.charAt(str.length()-1) == 'b') return "FizzBuzz";
        else if(str.charAt(0) == 'f') return "Fizz";
        else if(str.charAt(str.length()-1) == 'b') return "Buzz";

        return str;
    }

    public static String fizzString2(int n) {
        /*Given an int n, return the string form of the number followed by "!".
        So the int 6 yields "6!".
        Except if the number is divisible by 3 use "Fizz" instead of the number,
        and if the number is divisible by 5 use "Buzz",
        and if divisible by both 3 and 5, use "FizzBuzz".
        Note: the % "mod" operator computes the remainder after division, so 23 % 10 yields 3.
        What will the remainder be when one number divides evenly into another?
        (See also: FizzBuzz Code and Introduction to Mod)

        fizzString2(1) → "1!"
        fizzString2(2) → "2!"
        fizzString2(3) → "Fizz!"*/


//        if ((n % 3 == 0) && (n % 5 == 0)) return "FizzBuzz!";
        if (n % 15  == 0) return "FizzBuzz!";
        else if(n % 3 == 0) return "Fizz!";
        else if(n % 5 == 0) return "Buzz!";

        return n + "!";

    }

    public static boolean twoAsOne(int a, int b, int c) {
        /*Given three ints, a b c,
        return true if it is possible to add two of the ints to get the third.

        twoAsOne(1, 2, 3) → true
        twoAsOne(3, 1, 2) → true
        twoAsOne(3, 2, 2) → false*/
        return (a+b==c || a+c==b || b+c==a);
    }

    public static boolean inOrder(int a, int b, int c, boolean bOk) {
        /*Given three ints, a b c,
        return true if b is greater than a, and c is greater than b. -> b>a && c>b
        However, with the exception that if "bOk" is true,
        b does not need to be greater than a.   -> c>b

        inOrder(1, 2, 4, false) → true
        inOrder(1, 2, 1, false) → false
        inOrder(1, 1, 2, true) → true*/

        return (bOk && c>b)||(b>a && c>b);

    }




}
