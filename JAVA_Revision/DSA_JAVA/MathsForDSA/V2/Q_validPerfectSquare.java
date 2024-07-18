package MathsForDSA.V2;
// LeetCode Q link : https://leetcode.com/problems/valid-perfect-square/description/
//  Given a positive integer num, return true if num is a perfect square or false otherwise.
//
//  Example 1:  Input: num = 16
//              Output: true
//              Explanation: true because 4 * 4 = 16 and 4 is an integer.
//  Example 2:  Input: num = 14
//              Output: false
//              Explanation: false because 3.742 * 3.742 = 14 and 3.742 is not an integer.
public class Q_validPerfectSquare {
    public static void main(String[] args) {

    }
    public boolean isPerfectSquare(int num) {
        double root = sqrt(num);
        boolean isPS = true;
        //now
        double floorVal = Math.floor(root);
        if (root != floorVal){isPS = false;}

        return isPS;
    }

    static double sqrt(int n){
        int s=0, e=n;
        double root = 0.0;

        //we will do simple binary search
        while (s<=e){
            int m = s+(e-s)/2;
            if ((m*m) == n){ root=m;   return root;}
            else if ((m*m) > n) { e=m-1; }
            else                { s=m+1; }
        }
        double incr = 0.1;
        // checking for the precision of the number
        for (int i=0; i<3; i++){
            while (root*root <= n){root += incr;}
            root -= incr;
            incr /= 10;
        }
        return root;
    }
}
