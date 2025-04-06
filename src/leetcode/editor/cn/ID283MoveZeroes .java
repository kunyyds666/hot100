package leetcode.editor.cn;

class ID283MoveZeroes {
    public static void main(String[] args) {
        Solution solution = new ID283MoveZeroes().new Solution();
        solution.moveZeroes(new int[]{0, 1, 0, 3, 12});


    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public void moveZeroes(int[] nums) {
            int j = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    int tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j++] = tmp;
                }
            }


        }
    }
//leetcode submit region end(Prohibit modification and deletion)


}

/*      一开始想到的两个循环
        public void moveZeroes(int[] nums) {
            int n = 0;

            for (int i = 0; i < nums.length; i++) {

                if (nums[i - n] == 0) {

                    for (int j = i -n + 1; j < nums.length; j++) {
                        nums[j-1] = nums[j];
                        //1,0,3,12
                    }
                    nums[nums.length-1-n]=0;
                    n++;

                }

            }
            System.out.println(Arrays.toString(nums));

        }
        */
