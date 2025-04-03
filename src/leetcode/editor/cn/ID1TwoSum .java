package leetcode.editor.cn;

import java.util.*;
class ID1TwoSum{
	public static void main(String[] args) {
		Solution solution = new ID1TwoSum().new Solution();
		System.out.println(solution);
		
		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int a = target - nums[i];
            if(map.containsKey(a)){
                return new int[]{map.get(a),i};
            }
            map.put(nums[i],i);
        }
        return null;
        
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
