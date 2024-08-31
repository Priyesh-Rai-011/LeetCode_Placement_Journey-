package Leetcode_GOOD_QUESTIONS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

public class Q9_621_TaskScheduler {
    public static int leastInterval(char[] tasks, int n) {
        int result=0;
//  Calculating the number of occurrences of the tasks
        HashMap<Character,Integer> freqMap = new HashMap<>();
        for (char task : tasks){
            freqMap.put(task, freqMap.getOrDefault(task,0)+1);
        }
//  Arranging teh tasks according Max - Heap
        PriorityQueue<Character> heap = new PriorityQueue<>((a,b) -> freqMap.get(b)- freqMap.get(a));
        for (char task : freqMap.keySet()){  heap.offer(task);  }
//        System.out.println("-->"+heap);
//        Process teh tasks until the heap is empty
        while (!heap.isEmpty()){
            int cycle = n+1;//no. of slots in a cycle
            List<Character> temp = new ArrayList<>();// Temp array to store the tasks processed in a cycle.
            while (cycle-- > 0 && !heap.isEmpty()) {
                temp.add(heap.poll());
            }
            for (char task : temp){
                int freq = freqMap.get(task)-1;
                if (freq>0){// Re-Insert the task , back into the heap - if there are further occurrences
                    freqMap.put(task,freq);
                    heap.offer(task);
                }
            }
            result += (heap.isEmpty()) ? temp.size() : n+1;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(leastInterval(new char[]{'A','C','A','B','D','B'},1));
    }
}
