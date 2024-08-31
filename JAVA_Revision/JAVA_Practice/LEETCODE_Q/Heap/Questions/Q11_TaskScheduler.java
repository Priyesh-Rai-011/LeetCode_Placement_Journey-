package LEETCODE_Q.Heap.Questions;

import java.util.HashMap;
import java.util.PriorityQueue;

public class Q11_TaskScheduler {
    public static int leastInterval(char[] tasks, int n) {
        int result=0;
//  Calculating the number of occurrences of the tasks
        HashMap<Character,Integer> freqMap = new HashMap<>();
        for (char task : tasks){
            freqMap.put(task, freqMap.getOrDefault(task,0)+1);
        }
//  Arranging teh tasks according Max - Heap
        PriorityQueue<Character> heap = new PriorityQueue<>((a,b) -> freqMap.get(b)- freqMap.get(a));

        for (char task : freqMap.keySet()){
            heap.offer(task);
        }
        System.out.println("-->"+heap);
        return result;
    }
    public static void main(String[] args) {
        System.out.println(leastInterval(new char[]{'A','C','A','B','D','B'},1));
    }
}
