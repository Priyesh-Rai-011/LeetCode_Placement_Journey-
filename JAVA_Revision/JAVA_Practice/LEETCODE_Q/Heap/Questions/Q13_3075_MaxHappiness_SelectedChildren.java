package LEETCODE_Q.Heap.Questions;

import java.util.List;
import java.util.PriorityQueue;

public class Q13_3075_MaxHappiness_SelectedChildren {
    public static long maximumHappinessSum(int[] happiness, int k) {
        // Use a max heap (priority queue) to store the happiness values
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);

        // Add all happiness values to the max heap
        for (int h : happiness) {
            maxHeap.offer(h);
        }
        long ans = 0;

        for (int i = 0; i < k; ++i) {
            int x = maxHeap.poll() - i; // Adjust for index
            ans += Math.max(x, 0); // Add to answer, ensuring no negative contributions
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(maximumHappinessSum(new int[]{2,3,4,5},2));
    }
}
