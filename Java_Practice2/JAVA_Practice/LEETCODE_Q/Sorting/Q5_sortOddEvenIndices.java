package LEETCODE_Q.Sorting;

import java.util.ArrayList;

public class Q5_sortOddEvenIndices {
    public static int[] sortEvenOdd(int[] nums) {
        ArrayList<Integer> oddIndexElem = new ArrayList<>();
        ArrayList<Integer> evenIndexElem = new ArrayList<>();
        for (int i=0,j=0,k=0; i< nums.length; i=i+2,j++,k++){
            oddIndexElem.add(nums[i]);
            evenIndexElem.add(nums[i+1]);
        }
//        System.out.println(oddIndexElem);
//        System.out.println(evenIndexElem);

        return new int[]{};
    }
    public static void main(String[] args) {
        int[] nums = {4,1,2,3};
        sortEvenOdd(nums);
    }
}
