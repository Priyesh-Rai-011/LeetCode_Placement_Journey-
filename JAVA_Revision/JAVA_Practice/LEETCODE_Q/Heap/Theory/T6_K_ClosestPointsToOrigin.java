package LEETCODE_Q.Heap.Theory;

import java.util.Arrays;
import java.util.PriorityQueue;

public class T6_K_ClosestPointsToOrigin {
    public static int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> ((a[0]*a[0] + a[1]*a[1]) - (b[0]*b[0] + b[1]*b[1])));
        for (int[] point : points){
            heap.offer(point);
        }
//        System.out.println(heap);
        int[][] result = new int[k][2];
        for (int i=0; i<k; i++){
            result[i] = heap.poll();
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.deepToString(kClosest(new int[][]{{3, 3}, {5, -1}, {-2, 4}}, 2)));
    }
}
