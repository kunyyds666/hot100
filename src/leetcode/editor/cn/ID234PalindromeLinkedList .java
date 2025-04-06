package leetcode.editor.cn;

import leetcode.editor.util.ListNode;

import java.util.*;
class ID234PalindromeLinkedList{
	public static void main(String[] args) {
		Solution solution = new ID234PalindromeLinkedList().new Solution();
		System.out.println(solution);
		
		
	}
//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {

        int length = getLength(head);

        for (int i = 0; i < length/2; i++) {
            if (getVal(head,i) !=getVal(head,length-1-i)){
                return false;
            }
        }
        return true;

    }

    public int getLength(ListNode head){
        int length = 0;
        while (head.next != null){
            head = head.next;
            length++;
        }
        return length;

    }
    public int getVal(ListNode head,int index){
        int val = head.val;
        for (int i = 0; i < index; i++) {
            head = head.next;
            val = head.val;
        }
        return val;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
