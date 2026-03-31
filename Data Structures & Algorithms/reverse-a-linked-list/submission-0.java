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
    public ListNode reverseList(ListNode head) {
        if(head == null) {
            return null;
        }
        ListNode curr = new ListNode(head.val);
        ListNode next = curr;
        while(head.next != null) {
            next = new ListNode(head.next.val);
            next.next = curr;
            curr = next;
            head = head.next;
        }
        //Input: head = [0,1,2,3]
        //Output: [3,2,1,0]
        return curr;
    }
}
