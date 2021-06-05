package Array1;

public class Unlucky1 {
    /*We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1.
    Return true if the given array contains an unlucky 1 in the first 2 or last 2 positions in the array.

    unlucky1([1, 3, 4, 5]) → true
    unlucky1([2, 1, 3, 4, 5]) → true
    unlucky1([1, 1, 1]) → false*/
    private static boolean unlucky1(int[] numbers) {


        return true;
    }
    public static void main(String[] args) {
        int[] numbers = {};
        boolean result = unlucky1(numbers);//→ true
        System.out.println(result);
//        unlucky1([2, 1, 3, 4, 5]); //→ true
//        unlucky1([1, 1, 1]); //→ false
    }




//    public static boolean unlucky1(int[] nums) {
//        boolean result = false;
//
//        if(nums.length < 3) result = false;
//        else if((nums[0] == 1 & nums[1] == 3 ) || (nums[1] == 1 & nums[2] == 3 )
//                || (nums[nums.length - 1] == 3 & nums[nums.length - 2] == 1 ))
//        result = true;
//
//        if(nums.length < 2) result = false;
//        else if((nums.length == 2  ) & (nums[0] == 1 & nums[1] == 3 )) result = true;
//
//        return result;
//    }

}
