package LEETCODE_Q.Array;

import java.util.Arrays;

public class Q15_RevealingCardsInReverseOrder {
    public static int[] deckRevealedIncreasing(int[] deck) {
        int[] result = new int[deck.length];
        Arrays.fill(result,0);
        System.out.println(Arrays.toString(result));
        int n = deck.length;
        Arrays.sort(deck);
        System.out.println(Arrays.toString(deck));
        int j=0;
        for (int i=0; i<n; i++,j++){
            result[i] = (i%2 == 0) ? deck[(i/2)] : deck[(n/2)+(--j)+1];
        }

        return result;
    }
    public static void main(String[] args) {
        int[] deck = {17, 13, 11, 2, 3, 5, 7};
//        System.out.println("=======================");
//        int[] deck2 = {17, 13, 11, 10, 2, 3, 5, 7};
        System.out.println(Arrays.toString(deckRevealedIncreasing(deck)));
//        System.out.println(Arrays.toString(deckRevealedIncreasing(deck2)));
    }
}
