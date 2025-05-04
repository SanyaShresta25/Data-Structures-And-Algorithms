package SlidingWindow;
public class LongestRep424 {

    public int characterReplacement(String s, int k) {
    int[] freq = new int[26];
    int maxFreq = 0, left = 0, maxLen = 0;
    for (int right = 0; right < s.length(); right++) {
        maxFreq = Math.max(maxFreq, ++freq[s.charAt(right) - 'A']);
        if (right - left + 1 - maxFreq > k)
            freq[s.charAt(left++) - 'A']--;
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
