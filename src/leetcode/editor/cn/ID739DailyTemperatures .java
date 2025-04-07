package leetcode.editor.cn;

import java.util.*;
class ID739DailyTemperatures{
	public static void main(String[] args) {
		Solution solution = new ID739DailyTemperatures().new Solution();
		System.out.println(Arrays.toString(solution.dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73})));
		
		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[n];
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()] ){
                int idx = stack.pop();
                ans[idx] = i -idx;
            }
            stack.push(i);
        }
        return ans;


    }
}
//leetcode submit region end(Prohibit modification and deletion)

    /*   1 超时 时间复杂度为O(n^2)
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];

        for (int i = 0; i < temperatures.length; i++) {
            int stack = 0;
            for (int j = i; j < temperatures.length ; j++) {
                if(temperatures[i] < temperatures[j]){
                    ans[i] = stack;
                    break;
                }
                stack ++;

            }
        }


        return ans;
    }

    2,
    Integer[] ans = new Integer[temperatures.length];
        int max = 0;
        int maxIdx = 0;
        for (int i = 1; i < temperatures.length; i++) {
            if(temperatures[i] > temperatures[i-1]){
                ans[i-1]++;
            } else if (temperatures[i] < temperatures[i-1]) {
                max = temperatures[i];
                ans[maxIdx] = i - maxIdx;
                maxIdx = i;

            }
        }


        return ans;
     */

}
