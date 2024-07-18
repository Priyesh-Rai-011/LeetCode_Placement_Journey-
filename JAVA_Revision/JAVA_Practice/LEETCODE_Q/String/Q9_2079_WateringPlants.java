package LEETCODE_Q.String;

import java.util.Arrays;
import java.util.Scanner;

public class Q9_2079_WateringPlants {
    public static int wateringPlants(int[] plants, int capacity) {
        int steps=0,initialCapacity=capacity;
        for (int i=0; i<plants.length; i++){

            if (plants[i]>capacity) {
                steps=steps+(i)+(i+1);
                capacity=initialCapacity-plants[i];
            }
            else {
                steps++;
                capacity-=plants[i];
            }
        }
        return steps;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] plants = {2,2,3,3};
        System.out.println("Plants : "+ Arrays.toString(plants));
        System.out.println("Steps  : "+wateringPlants(plants,5));
    }
}
