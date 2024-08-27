package LEETCODE_Q.Heap.Theory;

import java.util.PriorityQueue;

// Q: Finding the Kth largest element in an unsorted array.
/*
* Approach 1: largest element --> min heap implementation (ADITYA VERMA)
* Approach 2: largest element --> max heap implementation (GENERAL - Striver)
* */
public class T1_Kth_LargestElement {
//                        =====  Approach 1 =====
//                        =====  Using Min-Heap (Aditya Verma) =====
//    static int kth_largest_app1(int[] nums, int k){
//        PriorityQueue<Integer> hp = new PriorityQueue<>();
//        for(int i=0; i< nums.length; i++){
//            hp.add(nums[i]);
//            if (hp.size() > k){
//                hp.poll();
//            }
//        }
//        return hp.peek();
//    }
//                        =====  Approach 2 =====
//                        =====  Using Max-Heap (Striver Approach) =====
static int kth_largest_app2(int[] arr, int k) {
    PriorityQueue<Integer>pq= new PriorityQueue<>((a,b)->b-a);
    for (int i = 0; i < arr.length; i++) {
        pq.offer(arr[i])  ;
    }
    int f = k - 1 ;
    for(int i=0; i<f; i++){
        pq.poll()  ;
    }

    System.out.println(k+"th Largest element "+pq.peek())  ;
    return pq.peek();
}
    public static void main(String[] args) {
        int[] nums = { 11, 3, 2, 1, 15, 5, 4, 45, 88, 96, 50, 45 };
//        System.out.println(kth_largest_app1(nums,3));
        System.out.println(kth_largest_app2(nums,3));
    }
}
