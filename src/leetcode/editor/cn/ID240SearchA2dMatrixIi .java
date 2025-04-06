package leetcode.editor.cn;

import java.util.*;
class ID240SearchA2dMatrixIi{
	public static void main(String[] args) {
		Solution solution = new ID240SearchA2dMatrixIi().new Solution();
		System.out.println(solution);
		
		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int row = 0;
        int col = n - 1;

        while (row < m && col >= 0) {
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] > target) {
                col--; // 往左
            } else {
                row++; // 往下
            }
        }
        return false;
    }
}

//leetcode submit region end(Prohibit modification and deletion)

}
//一开始思路是从左上开始,有问题往左变大,往下也变大 ,直接从右上开始,往左变小往下变大更方便
//1, 暴力,2右上,3二分查找