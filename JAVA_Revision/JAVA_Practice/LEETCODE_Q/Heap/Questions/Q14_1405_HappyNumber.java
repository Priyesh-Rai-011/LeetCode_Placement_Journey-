package LEETCODE_Q.Heap.Questions;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Q14_1405_HappyNumber {
    public static String longestDiverseString(int a, int b, int c) {
        HashMap<Character,Integer> map = new LinkedHashMap<>();
//        HashMap<Character,Integer> map = new HashMap<>();
        map.put('a',a);map.put('b',b);map.put('c',c);

        PriorityQueue<Map.Entry<Character,Integer>> heap = new PriorityQueue<>((n1,n2)->n2.getValue()-n1.getValue());
        heap.addAll(map.entrySet());
//        System.out.println("map : "+map);
//        System.out.println("heap : "+heap);
        StringBuilder res = new StringBuilder();
        while (!heap.isEmpty()){
            res.append(heap.peek());
//            map.put(heap.poll(map.entrySet()));
        }


        return res.toString();
    }
    public static void main(String[] args) {
        System.out.println(longestDiverseString(1,8,11));
    }
}
