package LEETCODE_Q.String;

import java.util.Arrays;

public class Q10_WateringPlants2 {
    public static int minimumRefill(int[] plants, int capacityA, int capacityB) {
        int refills=0,   capA=capacityA,capB=capacityB;
        int a = 0, b = plants.length-1;
        while (a<b){
            if (capA<plants[a]){
                refills++;
                capA=capacityA;
            }
            if (capB<plants[b]){
                refills++;
                capB=capacityB;
            }
//            System.out.print("a"+a+"-"+capacityA+"  ");
                capA-=plants[a++];
//            System.out.println("b"+b+"-"+capacityB);
                capB-=plants[b--];
//            System.out.println("refills"+refills+"");
        }
        if(a==b && Math.max(capA,capB)<plants[a]){
//            System.out.println(    a+"-"+capacityA);
            refills++;
        }

        return refills;
    }
    public static void main(String[] args) {
        int[] plants = new int[]{2, 2, 4, 4, 3};
//        int[] plants = new int[]{5};
        System.out.println(Arrays.toString(plants));
        System.out.println(minimumRefill(plants, 2, 4));
//        System.out.println(minimumRefill(plants,10,8));
    }
}
