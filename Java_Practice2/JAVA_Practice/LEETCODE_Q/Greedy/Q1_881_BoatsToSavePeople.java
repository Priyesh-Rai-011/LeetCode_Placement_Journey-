package LEETCODE_Q.Greedy;

import java.util.Arrays;

public class Q1_881_BoatsToSavePeople {
    public static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int ans = 0;
        for (int i = 0, j = people.length - 1; i <= j; j--) {
            if (people[i] + people[j] <= limit) {
                i++;
            }
            ans++;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(numRescueBoats(new int[]{1, 2},3));
        System.out.println(numRescueBoats(new int[]{3, 2, 2, 1},3));
        System.out.println(numRescueBoats(new int[]{3, 5, 3, 4},5));
        System.out.println(numRescueBoats(new int[]{3, 6, 4, 5},6));
    }
}
