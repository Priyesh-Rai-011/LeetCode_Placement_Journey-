package LEETCODE_Q.HashSet;

import java.util.ArrayList;
import java.util.HashSet;

public class deep_shallowCopy {
    public static void main(String[] args) {
        ArrayList<String> originalList = new ArrayList<>();
        originalList.add("Apple");
        // Create a shallow copy using the clone method
        ArrayList<String> shallowCopy = (ArrayList<String>) originalList.clone();

// Modify the shallow copy
        shallowCopy.add("Cherry");

// Display both lists
        System.out.println("Original List: " + originalList); // Output: [Apple, Banana]
        System.out.println("Shallow Copy: " + shallowCopy);   // Output: [Apple, Banana, Cherry]

//        int[] int_arr = new int[]{8,7,5,98,7,6,5,6,4,5,3,4,2,4,3,5,4};
        System.out.println("---------------------");
        ArrayList<Integer> int_arrlst = new ArrayList<>();
        int_arrlst.add(1);
        int_arrlst.add(2);
        int_arrlst.add(3);
        int_arrlst.add(4);
        int_arrlst.add(6);
        int_arrlst.add(7);
        int_arrlst.add(9);
        int_arrlst.add(1);
        int_arrlst.add(2);
        int_arrlst.add(4);
        int_arrlst.add(0);
        int_arrlst.add(3);
        int_arrlst.add(6);
        int_arrlst.add(7);
        int_arrlst.add(2);
        int_arrlst.add(10);
        int_arrlst.add(12);
        int_arrlst.add(11);
        System.out.println(int_arrlst);
        HashSet<Integer> int_set = new HashSet<>(int_arrlst);
        System.out.println(int_set);
    }
}
