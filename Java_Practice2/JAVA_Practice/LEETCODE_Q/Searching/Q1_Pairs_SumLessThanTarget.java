package LEETCODE_Q.Searching;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q1_Pairs_SumLessThanTarget {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();
        System.out.print("Enter array size : "); int size = sc.nextInt();
        System.out.println("Enter elements : ");
        for (int i=0; i<size; i++){
            arr.add(sc.nextInt());
        }
        System.out.println("Array is : "+arr);
        System.out.print("----------- \nEnter target element : "); int target = sc.nextInt();
        System.out.println("No. of pairs whose sum < "+target+" : "+countPairs(arr,target));
    }
    static int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int ans = 0;
        for (int j = 0; j < nums.size(); ++j) {
            int x=nums.get(j);
            int i=search(nums,target-x,j);
            ans=ans+i;
        }
        return ans;
    }

    private static int search(List<Integer> nums, int x, int j) {
        int l=0;int u=j;
        while (l<u){
            int mid = l+(u-l)>>2;
            if (nums.get(mid) >= x){
                u=mid;
            }
            else {
                l=mid+1;
            }
        }
        return l;
    }
}
