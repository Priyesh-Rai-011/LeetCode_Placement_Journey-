package LEETCODE_Q.Math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Q9_2553_SeperateDigits_inArray {
    public static int[] separateDigits(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
//        for (int i=0; i<nums.length; i++){
        for (int i=nums.length-1; i>=0; i--){
//            ArrayList<Integer> sub = new ArrayList<>();
            while (nums[i]>0){
//                sub.add(nums[i]%10);
                ans.add(nums[i]%10);
                nums[i] = nums[i]/10;
            }
//            Collections.reverse(sub);
//            ans.addAll(sub);
        }
        int[] intArray = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            intArray[i] = ans.get(ans.size()-i-1); // Autoboxing occurs here
        }
        return intArray;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new int[]{13, 25, 83, 77}));
        System.out.println(Arrays.toString(separateDigits(new int[]{13, 25, 83, 77})));
//        System.out.println(Arrays.toString(separateDigits(new int[]{13, 12, 14, 15})));
//        System.out.println(Arrays.toString(separateDigits(new int[]{13, 12, 14, 15})));
    }
}
