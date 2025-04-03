package leetcode.editor.cn;

import java.util.*;
class ID49GroupAnagrams{
	public static void main(String[] args) {
		Solution solution = new ID49GroupAnagrams().new Solution();
		System.out.println(solution);
		
		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);
            List<String> list = map.getOrDefault(key, new ArrayList<String>());
            list.add(str);
            map.put(key, list);
        }
        return new ArrayList<List<String>>(map.values());
        
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
