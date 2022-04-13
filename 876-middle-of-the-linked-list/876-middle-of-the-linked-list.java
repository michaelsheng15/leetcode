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
    public ListNode middleNode(ListNode head) {
        ListNode countHead = head;
        int numNodes = 0;
        int mid = 0;
        int count = 0;
        
        while(countHead != null){
            countHead = countHead.next;
            numNodes++;
        }
        
        mid = numNodes/2;
       
        
        
        
        while(count != mid){
            head = head.next;
            count++;
        }
        
        return head;
        
    }
}