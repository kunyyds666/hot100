package leetcode.editor.cn;

import leetcode.editor.util.ListNode;

import java.util.*;
class ID160IntersectionOfTwoLinkedLists{
	public static void main(String[] args) {
		Solution solution = new ID160IntersectionOfTwoLinkedLists().new Solution();
		System.out.println(solution);
		
		
	}
//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode pA = headA, pB = headB;
        while (pA != pB) {
            pA = pA == null ? headB : pA.next;
            pB = pB == null ? headA : pB.next;
        }
        return pA;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
