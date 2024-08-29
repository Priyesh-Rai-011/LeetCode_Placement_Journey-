package LEETCODE_Q.Heap.Questions;

import java.util.*;

public class Q3_1636_FrequencySort_Ascending {
    public static int[] frequencySort_asc(int[] nums) {
        HashMap<Integer,Integer> freqMap = new HashMap<>();
        for (int num : nums){
            freqMap.put(num, freqMap.getOrDefault(num,0)+1);
        }
//        System.out.println("-->"+freqMap);

        PriorityQueue<Integer> heap = new PriorityQueue<>(
                (a,b)->freqMap.get(a).equals(freqMap.get(b)) ? b-a : freqMap.get(a)-freqMap.get(b)
        );

        for (int n : freqMap.keySet()){
            heap.offer(n);
        }
//        System.out.println("-->"+heap);
        List<Integer> result = new ArrayList<>();
        while (!heap.isEmpty()){
            int num = heap.poll();
            int freq = freqMap.get(num);
            for (int i=0; i<freq; i++){
                result.add(num);
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(frequencySort_asc(new int[]{-1,1,-6,4,5,-6,1,4,1})));
    }
}
