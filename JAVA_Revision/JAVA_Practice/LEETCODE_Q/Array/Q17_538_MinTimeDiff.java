package LEETCODE_Q.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q17_538_MinTimeDiff {
    public static int findMinDifference(List<String> timePoints) {
        System.out.println(timePoints);
        int res = 1<<30;
        int[] nums = new int[timePoints.size()+1];
        for (int i=0; i<timePoints.size(); i++){
            String t = timePoints.get(i);
            int h = Integer.parseInt(t.substring(0,2));
            int m = Integer.parseInt(t.substring(3,5));
            int time = h*60+m;
            nums[i] = time;
//            System.out.println(t);
//            System.out.println(nums);
        }
        Arrays.sort(nums,0,timePoints.size());
        nums[timePoints.size()] = nums[0] + 1440;
//        int ans = 1 << 30;
        for (int i = 1; i <= timePoints.size(); ++i) {
            res = Math.min(res, nums[i] - nums[i - 1]);
        }
//        System.out.println(Arrays.toString(nums));
        return res;
    }
    public static void main(String[] args) {
        List<String> time = new ArrayList<>();
        time.add("00:00");
        time.add("23:59");
        time.add("20:30");
//        System.out.println(time);
        System.out.println(findMinDifference(time));
    }
}
