package MathsForDSA.V1;

import java.util.Arrays;

// Q). There is an array in which every element occurs odd number of times
//     one element occurs only 1 time
//     Find that number
// Eg :- arr=[7,6,2,8,2,7,3,2,3,9,7,6,3,6]
//       ans: [8]
//------------------------------------------------
//let's take 3 occurrences as an example
//------------------------------------------------
public class Q2_2_SingleOccurredElement_InArray_OtherElementsOccurs_OddTimes {
    public static void main(String[] args) {
        int[] arr = new int[]{7,6,2,8,8,8,2002,2,7,3,2,3,7,6,3,6};
        System.out.println("The array is : "+ Arrays.toString(arr));

        System.out.println("The element with the single occurance is : "+singleElem(arr));
    }
    static int singleElem(int[] arr){
        int result = 0;
        int x, sum;

        // Iterate through every bit
        for (int i = 0; i < 32; i++) {
            // Find sum of set bits at ith position in all -> array elements
            sum = 0;
            x = (1 << i);
            for (int j = 0; j < arr.length; j++) {
                if ((arr[j] & x) != 0)
                    sum++;
            }
            // The bits with sum not multiple of 3, are the->bits of element with single occurrence.
            if ((sum % 3) != 0)
                result |= x;
        }
        return result;
    }
}
