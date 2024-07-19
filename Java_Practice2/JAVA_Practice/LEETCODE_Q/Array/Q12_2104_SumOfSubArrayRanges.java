package LEETCODE_Q.Array;

public class Q12_2104_SumOfSubArrayRanges {
//    public static long subArrayRanges(int[] nums) {
//        long answer=0;
//        for (int i=0; i<nums.length; i++){
//            for (int j=i+1; j< nums.length; j++){
//                answer += ( (nums[j]>nums[i]) ? (nums[j]-nums[i]) : (nums[i]-nums[j]) );
//            }
//        }
//        return answer;
//    }
    public static long subArrayRanges(int[] nums) {
        long ans = 0;
        int n = nums.length;
        for (int i=0; i<n; i++) {
            int mi = nums[i], mx = nums[i];
            for (int j=i; j<n; j++) {
                mi = Math.min(mi, nums[j]);
                mx = Math.max(mx, nums[j]);
//                System.out.println(i+"-"+j+"___("+mx+")-("+mi+")____"+(mx-mi));
                ans += (mx - mi);
            }
//            System.out.println(ans+"-------------");
        }
        return ans;
    }
    public static void main(String[] args) {
//        int[] nums = new int[]{1,2,3};
//        int[] nums = new int[]{1,3,3};
        int[] nums = new int[]{4,-2,-3,4,1};
        System.out.println(subArrayRanges(nums));
    }
}
