package LEETCODE_Q.Heap.Questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Q12_1337_Kth_WeakestRow {
    public static int[] kWeakestRows(int[][] mat, int k) {
        int[] res = new int[k];
        HashMap<Integer,Integer> r = new HashMap<>();
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(
                (a, b) -> a.getValue() != b.getValue() ? Integer.compare(a.getValue(), b.getValue()) : Integer.compare(a.getKey(), b.getKey())
        );

        for (int i=0; i< mat.length; i++){
            int sum=0;
            for (int j=0; j<mat[i].length; j++){
                sum += mat[i][j];
            }
            r.put(i,sum);
        }
        pq.addAll(r.entrySet());
        System.out.println(r);
        System.out.println(pq);
        for (int i=0; i<k; i++){
            res[i] = pq.poll().getKey();
        }
        System.out.println(Arrays.toString(res));
        return res;
    }
    public static void main(String[] args) {
        kWeakestRows(new int[][]{{1,1,0,0,0},
                                 {1,1,1,1,0},
                                 {1,0,0,0,0},
                                 {1,1,0,0,0},
                                 {1,1,1,1,1}},
                               3);
    }
}
