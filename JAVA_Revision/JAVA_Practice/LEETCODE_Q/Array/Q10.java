package LEETCODE_Q.Array;

public class Q10 {
    public static int addedInteger(int[] nums1, int[] nums2) {
        int min1=nums1[0], min2=nums2[0];
        for (int j : nums1) {
            if (j < min1) {
                min1 = j;
            }
        }
        for (int j : nums2) {
            if (j < min2) {
                min2 = j;
            }
        }
//        System.out.println(min1+"  "+min2);
        return min2-min1;
    }
    public static void main(String[] args) {
        int[] n1={1,2,3};
        int[] n2={6,7,5};
        System.out.println(addedInteger(n1,n2));
    }
}
