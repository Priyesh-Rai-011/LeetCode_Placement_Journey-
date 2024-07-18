package LEETCODE_Q.Stack.MonotonicStack_Theory;

import java.util.Arrays;

public class T8_RainWaterTrapping {
    public static int trap(int[] height) {
        int vol=0, n= height.length;
        int[] lmax = new int[n];    lmax[0]=height[0];
        int[] rmax = new int[n];    rmax[n-1]=height[n-1];
        for (int i=1; i<n; i++){
            lmax[i] = Math.max(height[i], lmax[i - 1]);
        }
        for (int i=n-2; i>=0; i--){
            rmax[i] = Math.max(height[i],rmax[i+1]);
        }
//        System.out.println(Arrays.toString(height));
//        System.out.println(Arrays.toString(lmax));
//        System.out.println(Arrays.toString(rmax));
        for (int i=0; i<n; i++){
            vol+=Math.min(lmax[i],rmax[i])-height[i];
//            System.out.print(vol+"-");
        }
        return vol;
    }
    public static void main(String[] args) {
        System.out.println(trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
    }
}
