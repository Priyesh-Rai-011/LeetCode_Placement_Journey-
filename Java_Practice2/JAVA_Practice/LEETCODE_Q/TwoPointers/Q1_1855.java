package LEETCODE_Q.TwoPointers;

public class Q1_1855 {
    public static int maxDistance(int[] nums1, int[] nums2) {
        int pair_dist = 0;//int pair_dist=0;
        int n1 = nums1.length, n2 = nums2.length;//int n1= nums1.length, n2= nums2.length;
        for (int i = 0; i < n1; i++) {//for (int i=0; i<n1; i++){
            int l = i, r = n2 - 1;//int l=i,   r=n2-1;
            while (l < r) {
//                int mid = l + (r - l) / 2;
                int mid = (l+r+1)/2;
                System.out.println("("+l+"-"+r+")-"+mid);
                if (nums2[mid] >= nums1[i]) {
                    l = mid;
                } else {
                    r = mid - 1;
                }
            }
            pair_dist = Math.max(pair_dist, l - i);
        }
        return pair_dist;
    }
    public static void main(String[] args) {
        System.out.println(maxDistance(new int[]{55,30,5,4,2},new int[]{100,20,10,10,5}));
    }
}
