package leetcode.f0001_0100.e0001_two_sum;

import java.util.HashMap;
import java.util.Map;

public final class TwoSum {
        public static int[] calculate(int[] nums, int target) {
            Map<Integer, Integer> numbers = new HashMap<>();

            for (int i = 0; i < nums.length; i++) {
                numbers.put(nums[i], i);
            }

            for (int i = 0; i < nums.length; i++) {
                int complement = target - nums[i];
                if (numbers.containsKey(complement) && numbers.get(complement) != i) {
                    return new int[]{i, numbers.get(complement)};
                }
            }

            return new int[]{};
        }
}
