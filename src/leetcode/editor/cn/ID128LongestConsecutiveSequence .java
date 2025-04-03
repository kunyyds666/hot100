package leetcode.editor.cn;

import java.util.*;
class ID128LongestConsecutiveSequence{
	public static void main(String[] args) {
		Solution solution = new ID128LongestConsecutiveSequence().new Solution();

        int[] nums = new int[]{1,2,44,4,4,5,6,0};
		//执行测试

		System.out.println(solution.longestConsecutive(nums));
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int longestConsecutive(int[] nums) {

        Set<Integer> num_set = new HashSet<Integer>();
        for (int num : nums) {
            num_set.add(num);
        }

        int longestStreak = 0;
        for (int num : num_set) {
            if (!num_set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (num_set.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }




        return longestStreak;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
