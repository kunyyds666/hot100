package leetcode.editor.cn;

import java.util.*;
class ID239SlidingWindowMaximum{
	public static void main(String[] args) {
		Solution solution = new ID239SlidingWindowMaximum().new Solution();
		System.out.println(Arrays.toString(solution.maxSlidingWindow(new int[]{1, 3, 6, 1, 3, 2, 1}, 3)));
		
		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums == null || nums.length < 2) return nums;
        // 双向队列 保存当前窗口最大值的数组位置 保证队列中数组位置的数值按从大到小排序
        LinkedList<Integer> queue = new LinkedList();
        // 结果数组
        int[] result = new int[nums.length-k+1];
        // 遍历nums数组
        for(int i = 0;i < nums.length;i++){
            // 保证从大到小 如果前面数小则需要依次弹出，直至满足要求
            while(!queue.isEmpty() && nums[queue.peekLast()] <= nums[i]){
                queue.pollLast();
            }
            // 添加当前值对应的数组下标
            queue.addLast(i);
            // 判断当前队列中队首的值是否有效
            if(queue.peek() <= i-k){
                queue.poll();
            }
            // 当窗口长度为k时 保存当前窗口中最大值
            if(i+1 >= k){
                result[i+1-k] = nums[queue.peek()];
            }
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    /*   超时
    class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] ans = new int[nums.length - k + 1];
        for (int i = 0; i < nums.length - k + 1 ; i++) {
            int[] sw = Arrays.copyOfRange(nums,i,i + k);//b:[3,9]
            ans[i] = maxSW(sw);
        }

        return ans;
    }
    public int maxSW(int[] sw){
        int max = -10000;
        for (int j : sw) {
            max = Math.max(max, j);

        }
        return max;
    }
}
    */
}
