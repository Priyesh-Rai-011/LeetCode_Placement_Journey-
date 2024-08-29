package LEETCODE_Q.Heap.Questions;

import java.util.PriorityQueue;

// Q Link : https://www.geeksforgeeks.org/connect-n-ropes-minimum-cost/
public class Q9_MinCost_ConnectNRopes {
    static int minCost(int[] ropes){
        int result=0;
        PriorityQueue<Integer> heap = new PriorityQueue<>();
//        PriorityQueue<Integer> heap = new PriorityQueue<>((a,b)->b-a);
        for (int rope: ropes){
            heap.offer(rope);
        }
        int sum;
        while (heap.size()>1){
            sum = heap.poll() + heap.poll();
            heap.offer(sum);
            result+=sum;
//            System.out.println("-->"+heap);
        }
//        System.out.println(heap);
        return result;
    }
    public static void main(String[] args) {
        System.out.println(minCost(new int[]{1,2,3,4,5,6,7}));
        System.out.println(minCost(new int[]{4,3,2,6}));
//        System.out.println(minCost(new int[]{7,5,4,9,1,4,5}));
//        System.out.println(minCost(new int[]{2,4,5,3,1,6,7}));
    }
}
