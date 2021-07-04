package WarmUp1;

public class icyHot {
    /*Given two temperatures, return true if one is less than 0
    and the other is greater than 100.

    WarmUp1.icyHot(120, -1) → true
    WarmUp1.icyHot(-1, 120) → true
    WarmUp1.icyHot(2, 120) → false */

    public static void main(String[] args) {

    }

    public static boolean icyHot(int temp1, int temp2) {
        if((temp1 < 0 && temp2 > 100) || (temp2 < 0 && temp1 > 100) ) return true;

        return false;
    }
}
