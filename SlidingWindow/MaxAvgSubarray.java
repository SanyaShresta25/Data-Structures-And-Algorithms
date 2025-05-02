package SlidingWindow;

public class MaxAvgSubarray {

    public double findMaxAverage(int[] nums, int k) {
        // Set up the initial window of size k
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int maxSum = sum;

        // Slide the window across the array
        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, sum);
        }

        return (double) maxSum / k;
    }

    public static void main(String[] args) {
        MaxAvgSubarray solution = new MaxAvgSubarray();

        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;

        double result = solution.findMaxAverage(nums, k);

        System.out.println("Maximum average of subarray of length " + k + " is: " + result);
        // Expected Output: 12.75
    }
}
