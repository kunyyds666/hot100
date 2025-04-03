package leetcode.editor.cn;

import java.util.*;
class ID70ClimbingStairs{
	public static void main(String[] args) {
		Solution solution = new ID70ClimbingStairs().new Solution();
		System.out.println(solution.climbStairs(5));
		
		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int climbStairs(int n) {

        int a = 1,b = 1 ,sum;
        for (int i = 0; i < n -1; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
        
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
