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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) {
            return null;
        }
        ListNode mergeHead = null;
        ListNode curr = new ListNode();
        ListNode next;
        while (list1 != null || list2 != null) {
            if (list1 != null && list2 != null) {
                if (list1.val <= list2.val) {
                    next = new ListNode(list1.val);
                    if (mergeHead == null) {
                        mergeHead = next;
                    } 
                    curr.next = next;
                    curr = curr.next;
                    list1 = list1.next;
                } else {
                    next = new ListNode(list2.val);
                    if (mergeHead == null) {
                        mergeHead = next;
                    } 
                    curr.next = next;
                    curr = curr.next;
                    list2 = list2.next;
                }
            } else if (list1 != null) {
                next = new ListNode(list1.val);
                if (mergeHead == null) {
                    mergeHead = next;
                } 
                curr.next = next;
                curr = curr.next;
                list1 = list1.next;
            } else if (list2 != null) {
                next = new ListNode(list2.val);
                if (mergeHead == null) {
                    mergeHead = next;
                } 
                curr.next = next;
                curr = curr.next;
                list2 = list2.next;
            }
        }
        return mergeHead;

        
    }
}