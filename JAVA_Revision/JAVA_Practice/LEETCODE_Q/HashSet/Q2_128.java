package LEETCODE_Q.HashSet;

import java.util.HashSet;
import java.util.Set;

public class Q2_128 {
    public static int longestConsecutive(int[] nums) {
        Set<Integer> n = new HashSet<>();
        for (int num : nums) {
            n.add(num);
        }
        int l_strk=0;
        for (int num : nums) {
            if (!n.contains(num - 1)) {
                int curr_num = num;
                int curr_strk = 1;

                while (n.contains(curr_num + 1)) {
                    curr_num++;
                    curr_strk++;
                    System.out.print(curr_num + ", ");
                }
                System.out.println();
                l_strk = Math.max(l_strk, curr_strk);
            }
        }
        return l_strk;
    }
    public static void main(String[] args) {
        System.out.println(longestConsecutive(new int[]{101,1,2,100,5,102,3,4,103}));
    }
}
