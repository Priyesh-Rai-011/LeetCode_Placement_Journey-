package LEETCODE_Q.Heap.Questions;

import java.util.PriorityQueue;

public class Q10_SumBtw_K1K2_Elements {
    static int sumBetweenTwoKth(int[] arr, int k1, int k2){
        int count=0, sum=0;
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int n : arr){
            heap.offer(n);
        }
        while(count < k2-1){
            count++;
            int val = heap.poll();
            if (count>k1){
                sum+=val;
                System.out.println("->"+val);
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumBetweenTwoKth(new int[]{20,8,22,4,12,10,14},3,6));
    }
}
