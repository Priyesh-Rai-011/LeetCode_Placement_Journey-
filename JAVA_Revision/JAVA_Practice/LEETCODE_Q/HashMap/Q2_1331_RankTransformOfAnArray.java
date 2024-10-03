package LEETCODE_Q.HashMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Q2_1331_RankTransformOfAnArray {
    public static int[] arrayRankTransform(int[] arr) {
        int[] res = new int[arr.length];
        int[] arr2 = arr.clone();     Arrays.sort(arr2);

        Map<Integer,Integer> map = new LinkedHashMap<>();
        int rank=1;
        for (int j : arr2) {
            if (map.containsKey(j)){
                rank--;
            }
            map.put(j, rank);
            rank++;
        }
//        System.out.println(map);
        for (int i=0; i<res.length; i++){
            res[i] = map.get(arr[i]);
        }
//        System.out.println(Arrays.toString(res));

        return res;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayRankTransform(new int[]{37,12,28,9,100,56,80,5,12})));
    }
}
