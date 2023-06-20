/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        // Set<ListNode> hashTable = new HashSet<>();
        // while(head != null){
        //     if(hashTable.contains(head)){
        //         return true;
        //     }
        //     else{
        //         hashTable.add(head);
        //     }
        //     head = head.next;
        // }
        // return false;
        if(head == null){
            return false;
        }
        
        ListNode slowCursor = head;
        ListNode fastCursor = head.next;
        
        while(slowCursor != fastCursor){
            if(fastCursor == null || fastCursor.next == null){
                return false;
            }
            slowCursor=slowCursor.next;
            fastCursor=fastCursor.next.next;
        }
        return true;
        
    }
}
