package leetcode.editor.cn;

import java.util.*;
class ID73SetMatrixZeroes{
	public static void main(String[] args) {
		Solution solution = new ID73SetMatrixZeroes().new Solution();
		System.out.println(solution);
		
		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];
        // 第一次遍历记录0的位置
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        // 第二次遍历置0
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (row[i] || col[j]) {
                    matrix[i][j] = 0;
                }
            }
        }

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
