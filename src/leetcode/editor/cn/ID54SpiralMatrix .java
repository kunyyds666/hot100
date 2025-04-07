package leetcode.editor.cn;

import java.util.*;
class ID54SpiralMatrix{
	public static void main(String[] args) {
		Solution solution = new ID54SpiralMatrix().new Solution();
        int[][] m = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(solution.spiralOrder(m));
		
		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length;

        int top = 0, bottom = n - 1;
        int left = 0, right = m - 1;

        while (ans.size() < n * m) {
            // 向右
            for (int j = left; j <= right && ans.size() < n * m; j++) {
                ans.add(matrix[top][j]);
            }
            top++;

            // 向下
            for (int i = top; i <= bottom && ans.size() < n * m; i++) {
                ans.add(matrix[i][right]);
            }
            right--;

            // 向左
            for (int j = right; j >= left && ans.size() < n * m; j--) {
                ans.add(matrix[bottom][j]);
            }
            bottom--;

            // 向上
            for (int i = bottom; i >= top && ans.size() < n * m; i--) {
                ans.add(matrix[i][left]);
            }
            left++;
        }

        return ans;
    }

}
//leetcode submit region end(Prohibit modification and deletion)
/*
public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length;
        int i = 0, j = 0;
        int to = 1;
        int length1 = m;
        int length2 = n;
        int length3 = m;
        int length4 = n;
        while(ans.size() < m*n){
            if(to == 1){
                while (j < length3){
                    ans.add(matrix[i][j]);
                    j++;
                }
                to = 2;
                length4 = length4 -1;
            }
            if (to == 2){
                while (i < length4){
                    ans.add(matrix[i][j]);
                    i++;
                }
                to = 3;
                length1 = length1 -1;
            }
            if (to == 3){
                while (j < length1){
                    ans.add(matrix[i][j]);
                    j--;
                }
                to = 4;
                length2 = length2 -1;
            }
            if (to == 4){
                while (i < length2){
                    ans.add(matrix[i][j]);
                    i--;
                }
                to = 1;
                length3 = length3 -1;
            }



        }


        return null;
    }
 */
}
