package PrefixSum;
public class RangeSumQuery {
    private int[] prefixA;

    // Constructor
    public RangeSumQuery(int[] nums) {
        int n = nums.length;
        prefixA = new int[n];
        prefixA[0] = nums[0];

        for (int i = 1; i < n; i++) {
            prefixA[i] = prefixA[i - 1] + nums[i];
        }
    }

    // Method to get sum in range [left, right]
    public int sumRange(int left, int right) {
        if (left == 0) {
            return prefixA[right];
        }
        return prefixA[right] - prefixA[left - 1];
    }

    // Driver code (main method)
    public static void main(String[] args) {
        int[] nums = {3, 1, 4, 2, 5};

        RangeSumQuery obj = new RangeSumQuery(nums);

        System.out.println("Sum of range [0, 2]: " + obj.sumRange(0, 2)); // Output: 8
        System.out.println("Sum of range [1, 3]: " + obj.sumRange(1, 3)); // Output: 7
        System.out.println("Sum of range [2, 4]: " + obj.sumRange(2, 4)); // Output: 11
    }
}
