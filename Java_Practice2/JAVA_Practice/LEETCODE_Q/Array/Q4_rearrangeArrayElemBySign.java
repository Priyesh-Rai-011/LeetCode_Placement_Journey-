package LEETCODE_Q.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class Q4_rearrangeArrayElemBySign {
    public static int[] rearrangeArray(int[] nums) {
//        int[] pos_nums = new int[]{};   int[] neg_nums = new int[]{};
        ArrayList<Integer> pos_nums = new ArrayList<>();
        ArrayList<Integer> neg_nums = new ArrayList<>();

        for (int num : nums) {
            if (num > 0) {
                pos_nums.add(num);
            } else {
                neg_nums.add(num);
            }
        }
        int[] final_nums = new int[pos_nums.size()+neg_nums.size()];

// Iterate through both ArrayLists and add elements to the combined array
        for (int i = 0, j = 0, k = 0; i < pos_nums.size() && j < neg_nums.size(); i++, j++, k=k+2) {
            final_nums[k] = pos_nums.get(i);
            final_nums[k + 1] = neg_nums.get(j);
        }
//        int pos = 0;
//        for (int i=0, j=0; i<pos_nums.size() && j<neg_nums.size(); i++,j++){
//            final_nums[pos] = pos_nums.get(i);
//            final_nums[pos+1] = neg_nums.get(j);
//            pos=pos+2;
//        }
//        System.out.println(Arrays.toString(final_nums));

        return final_nums;
    }
    public static void main(String[] args) {
        int[] arr = {3,1,-2,-5,2,-4};
        System.out.println("Given Array : "+Arrays.toString(arr));
        System.out.println("Rearrange array elements by signs : ");
        System.out.println(Arrays.toString(rearrangeArray(arr)));
    }
}
