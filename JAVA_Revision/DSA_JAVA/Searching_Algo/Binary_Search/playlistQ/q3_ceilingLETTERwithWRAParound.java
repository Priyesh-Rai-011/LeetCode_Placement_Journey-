package Searching_Algo.Binary_Search.playlistQ;

import java.util.Arrays;
import java.util.Scanner;

public class q3_ceilingLETTERwithWRAParound {
    public static void main(String[] args) {
        System.out.println("FIND CEILING VALUE OF THE INPUT LETTER (IF THE ARRAY IS WRAPPED)\n\n");

        char[] arr = new char[] {'b','c','d','f','j'};
        Arrays.sort(arr);
        System.out.println("The array is : "+ Arrays.toString(arr));

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the target element : ");    char target = sc.next().charAt(0);
        System.out.println(ceilingLetter(arr,target));
    }

//    ---------------    1ST APPROACH  (  BEST  )    ---------------

//    static char ceilingLetter(char[] arr, char target){
//        int l=0,  u=(arr.length-1);
//
//        while (l<=u){
//            int mid_index = l+(u-l)/2;
//            if (target < arr[mid_index]){u = mid_index-1;}
//            else {l = mid_index+1;}
//        }
//        return arr[(l) % (arr.length)];
//    }

//                       2ND APPROACH
    static char ceilingLetter(char[] letters, char target){
        int l = 0,  u = letters.length-1;
        if (target >= letters[letters.length-1]){return letters[0];}
        else if (target < letters[0]){return letters[0];}
        while (l<=u){
            int mid_index = l + (u-l)/2;

            if (target == letters[mid_index]){
                return letters[mid_index+1];
            }
            else if (target < letters[mid_index]){
                u = mid_index-1;
            }
            else {
                l = mid_index+1;
            }
        }
        return letters[l];
    }
}
