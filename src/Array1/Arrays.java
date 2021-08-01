package Array1;

public class Arrays {
    public static void main(String[] args) {

    }

    /* Given an int array, return true if the array contains 2 twice, or 3 twice.
    The array will be length 0, 1, or 2.

    double23([2, 2]) → true
    double23([3, 3]) → true
    double23([2, 3]) → false
    */
    public static boolean double23(int[] nums) {
        if(nums.length==2) return (nums[0]==2 && nums[1]==2) || (nums[0]==3 && nums[1]==3);
        return false;
    }

    /*Given an int array length 3, if there is a 2 in the array immediately followed by a 3,
    set the 3 element to 0. Return the changed array.

    fix23([1, 2, 3]) → [1, 2, 0]
    fix23([2, 3, 5]) → [2, 0, 5]
    fix23([1, 2, 1]) → [1, 2, 1]*/

    public int[] fix23(int[] nums) {
        // Solution-1 :
//        if((nums[0]==2) && (nums[1]==3)) nums[1]=0;
//        if((nums[1]==2) && (nums[2]==3)) nums[2]=0;
//
//        return nums;

        // Solution -2 :
        if (nums[0] == 2 && nums[1] == 3)
            nums[1] = 0;
        if (nums[1] == 2 && nums[2] == 3)
            nums[2] = 0;

        return nums; //new int[] {nums[0],nums[1],nums[2]};
    }

    /* Start with 2 int arrays, a and b, of any length.
    Return how many of the arrays have 1 as their first element.

    start1([1, 2, 3], [1, 3]) → 2
    start1([7, 2, 3], [1]) → 1
    start1([1, 2], []) → 1*/

    public static int start1(int[] a, int[] b) {
        int count=0;
        if(a.length > 0 && a[0]==1) count++;
        if(b.length > 0 && b[0]==1)count++;

        return count;
    }

    /*Start with 2 int arrays, a and b, each length 2.
    Consider the sum of the values in each array.
    Return the array which has the largest sum.
    In event of a tie, return a.

    biggerTwo([1, 2], [3, 4]) → [3, 4]
    biggerTwo([3, 4], [1, 2]) → [3, 4]
    biggerTwo([1, 1], [1, 2]) → [1, 2]*/

    public static int[] biggerTwo(int[] a, int[] b) {
        if(b[0]+b[1] > a[0]+a[1]) return b;
        return a;

    }


    /*Given 2 int arrays, a and b, of any length, return a new array with the first element of each array.
    If either array is length 0, ignore that array.


    front11([1, 2, 3], [7, 9, 8]) → [1, 7]
    front11([1], [2]) → [1, 2]
    front11([1, 7], []) → [1]*/

    public static int[] front11(int[] a, int[] b) {
        if(a.length==0 && b.length==0) return a;
        else if(a.length==0) return new int []{b[0]};
        else if(b.length==0) return new int []{a[0]};

        return new int[] {a[0], b[0]};
    }
    public int[] front111(int[] a, int[] b) {
        if (a.length>=1) {
            if (b.length>=1){
                return new int[] {a[0], b[0]};
            }else{
                return new int[] {a[0]};
            }
        }else if (b.length>=1){
            return new int[] {b[0]};
        }else{
            return new int [] {};
        }
    }

}










//      if(a.length<1 && b.length<1) return a;
//        else if(b.length<1) return new int[] {a[0]};
//        else if(a.length < 1) return new int[] {b[0]};
//
//        return new int[] {a[0], b[0]};