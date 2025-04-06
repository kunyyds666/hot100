package leetcode.editor.cn;

import java.util.*;
class ID139WordBreak{
	public static void main(String[] args) {
		Solution solution = new ID139WordBreak().new Solution();
		System.out.println(solution.wordBreak("leetcode", List.of(new String[]{"leet", "code"})));
		
		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordSet = new HashSet<>(wordDict);  // 转为集合方便查找
        return dfs(s, 0, wordSet, new Boolean[s.length()]);
    }

    private boolean dfs(String s, int offset, Set<String> wordSet, Boolean[] memo) {
        // 如果已到达字符串末尾
        if (offset == s.length()) {
            return true;
        }
        // 如果已经计算过该位置
        if (memo[offset] != null) {
            return memo[offset];
        }

        // 尝试每个可能的拆分
        for (int i = offset + 1; i <= s.length(); i++) {
            String word = s.substring(offset, i);
            if (wordSet.contains(word) && dfs(s, i, wordSet, memo)) {
                memo[offset] = true;
                return true;
            }
        }

        memo[offset] = false;
        return false;
    }

}
//leetcode submit region end(Prohibit modification and deletion)
//思考过程 回溯
//    public boolean wordBreak(String s, List<String> wordDict) {
//
//
//
//        return dfs("",s,0,wordDict);
//    }
//
//    public boolean dfs(String path , String s,int offset,List<String> wordDict){
//        if(Objects.equals(path, s)){
//            return true;
//        }else {
//            for (int i = 0; i < wordDict.size(); i++) {
//                if (s.startsWith(wordDict.get(i), offset)){
//                    path = path + wordDict.get(i);
//                    dfs(path,s,offset+wordDict.get(i).length(),wordDict);
//                }
//
//            }
//        }
//        return true;
//    }

}
