package LEETCODE_Q.Array;

import java.util.ArrayList;
import java.util.List;

public class Q11_1431 {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> answer = new ArrayList<>(candies.length);
        int max_candy=candies[0];
        for (int candy : candies) {
            if (candy >= max_candy) {
                max_candy = candy;
            }
        }
        for (int i=0; i<candies.length; i++){
            if (candies[i]+extraCandies >= max_candy){
                answer.add(true);
            }
            else {
                answer.add(false);
            }
        }
        System.out.println(max_candy);
        return answer;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{2,3,5,1,3};
        System.out.println(kidsWithCandies(arr,3));
    }
}
