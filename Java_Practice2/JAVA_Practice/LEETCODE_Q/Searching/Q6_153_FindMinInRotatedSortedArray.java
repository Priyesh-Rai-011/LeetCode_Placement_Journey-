package LEETCODE_Q.Searching;

public class Q6_153_FindMinInRotatedSortedArray {
    public static int findMin(int[] arr) {
            int l = 0;
            int u = arr.length - 1;

            while (l <= u) {
                if (l==u) {  return arr[l];  }
                if (arr[l]==arr[u]){l++;u--;}
                int mid = l+(u-l)/2;

                if (mid > 0 && arr[mid] < arr[mid - 1]) {
                    return arr[mid];
                }
                if (mid < arr.length - 1 && arr[mid] > arr[mid + 1]) {
                    return arr[mid+1];
                }
                if (arr[l] <= arr[mid]) {
                    u = mid - 1;
                } else {
                    l = mid + 1;
                }
            }

            return arr[0]; // No pivot element found
    }
    public static void main(String[] args) {
//        int[] arr = new int[]{3,3,3,1};
        int[] arr = new int[]{10,1,10,10,10};
//        int[] arr = new int[]{5,6,7,8,9,0,1,2,3,4};
//        int[] arr = new int[]{6,7,8,9,0,1,2,3,4,5};
//        int[] arr = new int[]{3,4,5,6,7,8,9,0,1,2};
//        int[] arr = new int[]{8,9,0,1,2,3,4,5,6,7};
        System.out.println(findMin(arr));
    }
}
