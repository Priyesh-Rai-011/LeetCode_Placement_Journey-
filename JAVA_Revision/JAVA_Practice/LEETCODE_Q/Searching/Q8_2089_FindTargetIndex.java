package LEETCODE_Q.Searching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q8_2089_FindTargetIndex {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> res = new ArrayList<>();

        Arrays.sort(nums);
        int idx=0;
        int l=nums[0], r=nums[nums.length-1];
        while (l<r){
            int mid = l+(l+r)>>1;
            if (nums[mid]==target){
                idx=mid;
            }
            else if (nums[mid] > target) {
                r=mid-1;
            }
            else {
                l=mid+1;
            }
        }

        if (idx==-1){
            return res;
        }
        for (int i=idx; i>=0 && nums[i]==target; i--){
            res.add(i);
        }
        for (int i=idx;i<nums.length && nums[i]==target;i++){
            res.add(i);
        }

        res.sort(Integer::compareTo);

        return res;
    }
    public static void main(String[] args) {

    }
}
