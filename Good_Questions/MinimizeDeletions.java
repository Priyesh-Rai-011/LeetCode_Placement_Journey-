import java.util.Arrays;

public class MinimizeDeletions {
    public static int minimizeDeletions(int[] nums) {
        if (nums == null || nums.length < 3) {
            return 0; // Not enough elements to remove min and max
        }

        int n = nums.length;
        int minIndex = 0;
        int maxIndex = 0;

        // Find the minimum and maximum indices
        for (int i = 1; i < n; i++) {
            if (nums[i] < nums[minIndex]) {
                minIndex = i;
            } else if (nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
        }

        // Calculate how many elements to remove from the front and back
        int deletionsFront = Math.min(minIndex, n - 1 - maxIndex);
        int deletionsBack = Math.min(maxIndex, n - 1 - minIndex);

        // The total number of deletions is the minimum of deletions from the front and back

        return Math.min(deletionsFront, deletionsBack);
    }

    public static void main(String[] args) {
        int[] nums = {0, -4, 19, 1, 8, -2, -3, 5};
        int deletions = minimizeDeletions(nums);

        System.out.println("Original Array: " + Arrays.toString(nums));
        System.out.println("Minimum deletions to remove min and max: " + deletions);
    }
}
