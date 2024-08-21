package LEETCODE_Q.Heap;

import java.util.PriorityQueue;

public class T2_Kth_SmallestElement {
    static void kth_Smallest_MinHeap(int[] arr, int k) {

        PriorityQueue<Integer> pq= new PriorityQueue<>();
        int n = arr.length  ;

        for (int i = 0; i < n; i++) {
            pq.add(arr[i])  ;

            if(k-1 > 0){
                pq.poll();
                k--;
            }
        }

//        int f = k - 1 ;
//
//        while (f > 0) {
//            pq.remove()  ;
//            f-- ;
//        }

        System.out.println(k+"th Smallest element "+pq.peek())  ;
    }
    public static void main(String[] args) {
        kth_Smallest_MinHeap(new int[]{7,10,4,3,20,15},4);
    }
}
