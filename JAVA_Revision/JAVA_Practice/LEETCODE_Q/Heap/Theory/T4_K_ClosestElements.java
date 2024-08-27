package LEETCODE_Q.Heap.Theory;

import java.util.*;

public class T4_K_ClosestElements {
    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> result = new ArrayList<>();
        PriorityQueue<Integer> heap = new PriorityQueue<>((a,b)->{
            int diffA = Math.abs(a - x);
            int diffB = Math.abs(b - x);
            // If the distances are not equal, return the smaller element
            if (diffA != diffB) {
                return diffA - diffB; // Smaller distance comes first
            }
            return a - b; // If distances are equal, prefer the smaller number
        });
        for (int j : arr) {
            heap.offer(j);
        }
        System.out.println("-->"+heap);
        int f=k-1;
        for (int i=0; i<k; i++){
            result.add(heap.poll());
        }
        System.out.println("-->"+heap);

        Collections.sort(result);
        return result;
    }
    public static void main(String[] args) {
        System.out.println(findClosestElements(new int[]{1,2,3,4,5},4,3));
    }
}
