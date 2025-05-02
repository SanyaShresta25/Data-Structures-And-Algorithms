package TwoPointers;
import java.util.Arrays;

public class TwoSum2 {

    public int[] twoSum(int[] numbers, int target) {
        int a = 0;
        int b = numbers.length - 1;

        while (a <= b) {
            int sum = numbers[a] + numbers[b];

            if (sum > target) {
                b--;
            } else if (sum < target) {
                a++;
            } else {
                return new int[]{a + 1, b + 1}; // 1-based index
            }
        }

        return new int[]{-1, -1}; // fallback (shouldn’t happen in valid input)
    }

    public static void main(String[] args) {
        TwoSum2 solution = new TwoSum2();

        int[] numbers = {2, 7, 11, 15};
        int target = 9;

        int[] result = solution.twoSum(numbers, target);

        System.out.println("Indices (1-based): " + Arrays.toString(result)); // Output: [1, 2]
    }
}
