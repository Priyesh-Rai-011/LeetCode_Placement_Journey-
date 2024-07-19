package LEETCODE_Q.Stack.Monotonous_Stack;

public class Q1_496_NextGreaterElement1 {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            int targ = nums1[i];
            for (int j = 0; j < nums2.length; j++) {
                if (nums2[j] > targ) {
                    nums1[i] = j + 1;
                } else {
                    nums1[i] = -1;
                }
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {

    }
}
