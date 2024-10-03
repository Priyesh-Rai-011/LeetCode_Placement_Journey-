package LEETCODE_Q.Array;

public class Q20_1497_ArrayPairDivByK {
    public static boolean canArrange(int[] arr, int k) {
            for (int i=0; i< arr.length; i++){
                int sum=0;
                sum+=arr[i];
                if (sum / k == 0){
                    return true;
                }
            }
        for (int i=0; i<(arr.length)/2; i++){
            if (arr.length==2 && (arr[0]+arr[1])/k==0){
                return true;
            }
            if (Math.abs(arr[i] + arr[arr.length-i-1]) / k == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(canArrange(new int[]{1,2,3,4,5,10,6,7,8,9}, 5));
        System.out.println(canArrange(new int[]{1,2,3,4,5,6}, 7));
        System.out.println(canArrange(new int[]{1,2,3,4,5,6}, 10));
        System.out.println(canArrange(new int[]{-10,10}, 2));
    }
}
