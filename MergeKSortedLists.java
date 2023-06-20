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
    public ListNode mergeKLists(ListNode[] lists) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(ListNode list : lists){
             while(list != null){
                pq.add(list.val);
                list=list.next;
            }
        }
        ListNode answer = new ListNode(0);
        ListNode cursor = answer;
        System.out.println(pq.size());
        while(!pq.isEmpty()){
            ListNode newNode = new ListNode(pq.poll());
            cursor.next = newNode;
            cursor=cursor.next;
        }
        return answer.next;
    }
}
