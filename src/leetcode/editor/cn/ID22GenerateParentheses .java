package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

class ID22GenerateParentheses {
    public static void main(String[] args) {
        Solution solution = new ID22GenerateParentheses().new Solution();
        System.out.println(solution.generateParenthesis(8));


    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<String> generateParenthesis(int n) {
            List<String> result = new ArrayList<>();
            backTracking(result, 0, 0, n, new StringBuilder());
            return result;
        }

        private void backTracking(List<String> result, int left, int right, int n, StringBuilder sb) {
            if (left == right && right == n) {
                result.add(sb.toString());
                return;
            }

            if (right > left) {
                return;
            }

            if (left < n) {
                sb.append('(');
                backTracking(result, left + 1, right, n, sb);
                sb.deleteCharAt(sb.length() - 1);
            }

            if (left > right) {
                sb.append(')');
                backTracking(result, left, right + 1, n, sb);
                sb.deleteCharAt(sb.length() - 1);
            }
        }


    }
//leetcode submit region end(Prohibit modification and deletion)

}
