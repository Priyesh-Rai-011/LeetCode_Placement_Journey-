package LEETCODE_Q.Heap.Questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

public class Q2_347_K_frequentElem {
    public static int[] topKFrequent(int[] nums, int k) {
//  Creating a Hash-Map to store the frequency of the elements
        HashMap<Integer,Integer> freqMap = new HashMap<>();
        for (int num : nums){
            freqMap.put(num, freqMap.getOrDefault(num,0)+1);
        }
//        System.out.println(freqMap);
//  Creating a Heap to arrange the elements in decreasing order (Max-Heap)
        PriorityQueue<Integer> heap = new PriorityQueue<>((a,b)->freqMap.get(b) - freqMap.get(a));
        for (int num : freqMap.keySet()){
            heap.offer(num);
        }
//        System.out.println(heap);
//  Inserting the elements to an array accordingly
        int[] result = new int[k];
        for (int i=0; i<k; i++){
            result[i] = heap.poll();
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(topKFrequent(new int[]{1,1,2,3,1,2,3,4,5,2,3,1,2,3,1,1,3},3)));
        System.out.println("---------------------------");
        System.out.println(Arrays.toString(topKFrequent(new int[]{1,1,2,3,1,2,3,4,5,2,3,1,2,3,1,1,3,4,4,4,4,4,4,4,4},3)));
    }
}
