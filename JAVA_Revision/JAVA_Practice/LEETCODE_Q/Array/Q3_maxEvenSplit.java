package LEETCODE_Q.Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q3_maxEvenSplit {
        public static List<Long> maximumEvenSplit(long finalSum) {
            if (finalSum % 2 != 0) return new ArrayList<>(); // Early return for odd sum

            List<Long> ans = new ArrayList<>();
            for (long i = 2; i <= finalSum; i += 2) {
                ans.add(i);
                finalSum = finalSum - i;
            }
            // Add remaining sum to the last element
            //IMPORTANT part
            ans.add(ans.remove(ans.size()-1) +  finalSum);
            return ans;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Final Sum : ");     long finalSum = sc.nextLong();
        System.out.println("The maximum even split is : "+maximumEvenSplit(finalSum));
    }
}
