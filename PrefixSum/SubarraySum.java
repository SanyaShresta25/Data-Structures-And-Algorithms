package PrefixSum;

import java.util.HashMap;

public class SubarraySum {

    public int subarraySum(int[] nums, int k) {
        // Map to store prefix sums and their frequencies
        HashMap<Integer, Integer> prefixMap = new HashMap<>();
        prefixMap.put(0, 1); // Base case: prefix sum 0 occurs once

        int count = 0;
        int prefixSum = 0;

        for (int num : nums) {
            prefixSum += num;

            // If (prefixSum - k) exists in map, we found a subarray
            if (prefixMap.containsKey(prefixSum - k)) {
                count += prefixMap.get(prefixSum - k);
            }

            // Add/update current prefixSum in map
            prefixMap.put(prefixSum, prefixMap.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        SubarraySum obj = new SubarraySum();

        int[] nums = {1, 2, 3};
        int k = 3;

        int result = obj.subarraySum(nums, k);
        System.out.println("Total subarrays with sum " + k + ": " + result); // Output: 2
    }
}

