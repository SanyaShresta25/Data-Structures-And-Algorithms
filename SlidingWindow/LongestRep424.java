package SlidingWindow;

public class LongestRep424 {

    public int characterReplacement(String s, int k) {
        int[] freq = new int[26]; // To count frequency of each character
        int maxFreq = 0; // Highest frequency of any char in current window
        int left = 0;    // Left pointer of sliding window
        int maxLen = 0;  // Result

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            freq[ch - 'A']++; // Update freq for this character

            // Track the most frequent character count in the window
            maxFreq = Math.max(maxFreq, freq[ch - 'A']);

            // Window size = right - left + 1
            // If we need to replace more than k characters → shrink window
            if ((right - left + 1) - maxFreq > k) {
                freq[s.charAt(left) - 'A']--; // remove leftmost char from window
                left++;
            }

            // Update result with current valid window size
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        LongestRep424 solution = new LongestRep424();

        String s = "AABABBA";
        int k = 1;

        int result = solution.characterReplacement(s, k);
        System.out.println("Longest substring length: " + result); // Output: 4
    }
}
