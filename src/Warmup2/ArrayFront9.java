package Warmup2;

public class ArrayFront9 {
    /*Given an array of ints, return true if one of the first 4 elements in the array is a 9.
    The array length may be less than 4.

    arrayFront9([1, 2, 9, 3, 4]) → true
    arrayFront9([1, 2, 3, 4, 9]) → false
    arrayFront9([1, 2, 3, 4, 5]) → false*/

    public static void main(String[] args) {

    }

    public static boolean arrayFront9(int[] nums) {
        int count =0;

        if(nums.length > 0) {
            if(nums.length > 4) count = 4;
            else count = nums.length;
            for(int i = 0; i < count; i++){
                if(nums[i]==9) return true;
            }
        }
        return false;
    }
}
