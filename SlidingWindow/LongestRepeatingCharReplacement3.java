package SlidingWindow;

public class LongestRepeatingCharReplacement3 {

    public int characterReplacement(String s, int k) {
        char[] c = s.toCharArray();
        int maxFreq = 0, ans = 0;
        int[] hash = new int[26]; // Frequency of characters
        int l = 0, r = 0; // Two pointers

        while (r < c.length) {
            hash[c[r] - 'A']++; // Count character at r
            maxFreq = Math.max(maxFreq, hash[c[r] - 'A']);

            // If we need to replace more than k chars → shrink from left
            if ((r - l + 1) - maxFreq > k) {
                hash[c[l] - 'A']--; // Remove char at l
                l++;
            }

            // Update answer if current window is valid
            if ((r - l + 1) - maxFreq <= k) {
                ans = Math.max(ans, r - l + 1);
            }

            r++;
        }

        return ans;
    }

    public static void main(String[] args) {
        LongestRepeatingCharReplacement3 solution = new LongestRepeatingCharReplacement3();

        String s = "AABABBA";
        int k = 1;

        int result = solution.characterReplacement(s, k);
        System.out.println("Longest repeating character replacement length: " + result); // Expected: 4
    }
}
