package leetcode.editor.cn;

import java.util.*;
class ID11ContainerWithMostWater{
	public static void main(String[] args) {
		Solution solution = new ID11ContainerWithMostWater().new Solution();

		System.out.println(solution.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
		
		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length -1;
        int res = 0;
        while(left < right){
            if (height[left] > height[right]){
                res = Math.max(res , height[right] *(right - left));
                right--;
            }else {
                res = Math.max(res , height[left] *(right - left));
                left++;
            }
        }
        return res;

    }

}
//leetcode submit region end(Prohibit modification and deletion)

    /*
    暴力
    public int maxArea(int[] height) {
        int res = 0;
        for (int i = 0; i <height.length -1 ; i++) {
            for (int j = i + 1; j < height.length; j++) {

                if(res < (j - i) * height[i] && res < (j - i) * height[j] ){
                    res = Math.min(height[i] * (j - i), height[j] * (j - i));
                }
            }
        }
        return res;

    }



    int left = 0;
        int right = 1;
        int res = 0;
        List<Integer> temp = new ArrayList<>();
        while(left <= right && left < height.length && right < height.length){
            temp.add(height[right]);

            if (height[right] >= height[left]){
                res =(height[left] - 1) * temp.size() + res;
                temp.clear();
                left = right;
            }

                right++;

        }
        res =(height[left] ) * temp.size() + res;

        return res;
    */
}
