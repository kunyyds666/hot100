package leetcode.editor.cn;

import java.util.*;
class ID131PalindromePartitioning{
	public static void main(String[] args) {
		Solution solution = new ID131PalindromePartitioning().new Solution();
		System.out.println(solution.partition("abbbacbc"));
		
		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    List<List<String>> res = new ArrayList<>();
    List<String> path = new ArrayList<>();
    public List<List<String>> partition(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        for (int j = 0; j < n; j++) {
            for (int i = 0; i <= j; i++) {
                if(s.charAt(i) == s.charAt(j) && (j - i <= 2 || dp[i + 1][j - 1])){
                    dp[i][j] = true;

                }
            }
        }
        backtracking(s, 0, dp);



        return res;
    }

    public void backtracking(String s, int startIndex, boolean[][] dp) {
        if (startIndex == s.length()) {
            res.add(new ArrayList<>(path)); // 收集结果
            return;
        }

        for (int i = startIndex; i < s.length(); i++) {
            if (dp[startIndex][i]) {  // 剪枝优化：只切回文串
                path.add(s.substring(startIndex, i + 1));  // 加入路径
                backtracking(s, i + 1, dp);  // 递归搜索
                path.remove(path.size() - 1); // 回溯撤销
            }
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
