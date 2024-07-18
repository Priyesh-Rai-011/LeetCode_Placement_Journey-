package MathsForDSA.V2;

import java.util.Scanner;

// Finding the square root of a given number
// Round it to the lowest near value
public class Q3_Finding_sqrt_ofANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");   int num = sc.nextInt();
        System.out.print("Precision : ");   int p = sc.nextInt();
        System.out.println(sqrt(num,p));
    }
    static int sqrt(int n, int p){
        int s=0, e=n;
        double root = 0.0;

    //we will do simple binary search
        while (s<=e){
            int m = s+(e-s)/2;
            if ((m*m) == n){
                root=m;   return (int)root;
            }
            else if ((m*m) > n) { e=m-1; }
            else                { s=m+1; }
        }
        double incr = 0.1;
    // checking for the precision of the number
        for (int i=0; i<p; i++){
            while (root*root <= n){
                root += incr;
            }
            root -= incr;
            incr /= 10;
        }
        return (int)root;
    }
}

//          Signed Right Shift Operator
//int x = -8;
//int result = x >> 1;
// Binary representation of -8 is                11111111111111111111111111111000
// After the signed right shift by 1, it becomes 11111111111111111111111111111100
// which is equivalent to -4


//         Unsigned Right Shift Operator
//int x = -8;
//int result = x >>> 1;
// Binary representation of -8 is                  11111111111111111111111111111000
// After the unsigned right shift by 1, it becomes 01111111111111111111111111111100
// which is equivalent to 2147483644