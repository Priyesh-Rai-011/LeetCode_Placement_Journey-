package LEETCODE_Q.Array;

import java.util.Arrays;

// Link : https://leetcode.com/problems/minimum-time-visiting-all-points/description/
// Leet-code Q1226 :
// On a 2D plane, there are n points with integer coordinates points[i] = [xi, yi].
// Return the minimum time in seconds to visit all the points in the order given by points.
public class MinMovesToReachAllPoints {
    public static int minTimeToVisitAllPoints(int[][] points) {
        int ans = 0;
        int count=0;
        for (int i = 1; i < points.length; i++) {
//            System.out.println(points[i][0]+","+points[i][1]);
            if (points[i][0] == points[i-1][0]){
                count = count + (points[i][1] - points[i-1][1]);
            }
            else if (points[i][1] == points[i-1][1]) {
                count = count + (points[i][0] - points[i-1][0]);
            }
            else {
                int dx = Math.abs(points[i][0] - points[i-1][0]);
                int dy = Math.abs(points[i][1] - points[i-1][1]);
                count = count + Math.abs(Math.max(dx,dy));
            }
        }
        ans=Math.abs(count);
        return ans;
    }
    public static void main(String[] args) {
        System.out.println("Finding the minimum distance to cover all the coordinates in order");
        int[][] points1 = new int[][]{{1,1},{3,4},{-1,0},{2,3}};
        int[][] points2 = new int[][]{{3,2},{-2,2}};
        int[][] points3 = new int[][]{{1,1},{3,4},{-1,0}};
        System.out.println("The coordinates are : "+ Arrays.deepToString(points2));
//        System.out.println("  "+minTimeToVisitAllPoints(points1));
        System.out.println(minTimeToVisitAllPoints(points2));
    }
}
