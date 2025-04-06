package leetcode.editor.cn;

import java.util.*;
class ID78Subsets{
	public static void main(String[] args) {
		Solution solution = new ID78Subsets().new Solution();
		System.out.println(solution);
		
		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>(), res);
        return res;
    }

    // 回溯函数
    private void backtrack(int[] nums, int start, List<Integer> path, List<List<Integer>> res) {
        res.add(new ArrayList<>(path)); // 收集当前子集

        for (int i = start; i < nums.length; i++) {
            path.add(nums[i]);          // 做选择
            backtrack(nums, i + 1, path, res); // 递归
            path.remove(path.size() - 1); // 撤销选择
        }
    }


}
//leetcode submit region end(Prohibit modification and deletion)

//    public static List<List<Integer>> binaryBit(int[] nums) {
//        List<List<Integer>> res = new ArrayList<List<Integer>>();
//        for (int i = 0; i < (1 << nums.length); i++) {
//            List<Integer> sub = new ArrayList<Integer>();
//            for (int j = 0; j < nums.length; j++)
//                if (((i >> j) & 1) == 1) sub.add(nums[j]);
//            res.add(sub);
//        }
//        return res;
//    }

}
