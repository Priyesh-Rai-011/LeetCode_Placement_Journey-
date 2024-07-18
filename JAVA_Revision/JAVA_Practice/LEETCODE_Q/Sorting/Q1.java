package LEETCODE_Q.Sorting;

import java.util.Scanner;

//  Q Link : https://leetcode.com/problems/largest-number-after-digit-swaps-by-parity/
//  Leet-code 2231
//  You are given a positive integer num.
//  You may swap any two digits of num that have the same parity (i.e. both odd digits or both even digits).
//  Return the largest possible value of num after any number of swaps.
public class Q1 {
    public static int largestInteger(int num){
        int ans,n=0;
        int temp=num;
        while (temp!=0){//for counting the number of digits in number
            temp/=10;
            n++;
        }
        //Converting the number in an array of individual digits
        int[] numArr = new int[n]; temp=num;
        for (int i=n-1; i>=0; i--){
            numArr[i] = temp%10;
            temp/=10;
        }       // int : 65875 --> array : 5,7,6,5,6
        for (int i=0; i<numArr.length; i++){
            for (int j=i+1; j<numArr.length; j++){
                if (numArr[j] > numArr[i]){
                    if (numArr[i]%2==0 && numArr[j]%2==0){
                        temp = numArr[i];
                        numArr[i] = numArr[j];
                        numArr[j] = temp;
                    }
                    if (numArr[i]%2!=0 && numArr[j]%2!=0){
                        temp = numArr[i];
                        numArr[i] = numArr[j];
                        numArr[j] = temp;
                    }
                }
            }
        }
        ans = intArrToInt(numArr);
        return ans;
    }
    public static int intArrToInt(int[] intArr){
        int n=0;
        for (int i=0; i<intArr.length; i++){
            n=n*10+intArr[i];
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        System.out.println("Largest possible value after swapping is : "+largestInteger(num));
    }
}
