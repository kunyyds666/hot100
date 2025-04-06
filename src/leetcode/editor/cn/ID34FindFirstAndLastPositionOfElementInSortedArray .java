package leetcode.editor.cn;

import java.util.*;
class ID34FindFirstAndLastPositionOfElementInSortedArray{
	public static void main(String[] args) {
		Solution solution = new ID34FindFirstAndLastPositionOfElementInSortedArray().new Solution();
		System.out.println(Arrays.toString(solution.searchRange(new int[]{5,7,7,8,8,10}, 8)));
		
		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = findLeft(nums, target);
        int right = findRight(nums, target);
        return new int[]{left, right};
    }

    public int findLeft(int[] nums, int target){
        int left = 0, right = nums.length - 1;
        int ans = -1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] >= target){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
            if(nums[mid] == target) ans = mid;
        }
        return ans;
    }

    public int findRight(int[] nums, int target){
        int left = 0, right = nums.length - 1;
        int ans = -1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] <= target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
            if(nums[mid] == target) ans = mid;
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
