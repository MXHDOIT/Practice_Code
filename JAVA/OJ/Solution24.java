//24.两两交换链表中的节点
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode newHead = new ListNode(-1);
        ListNode tail = newHead;
        ListNode cur = head;
        tail.next = head;
        while(cur != null && cur.next != null){
            ListNode curNext = cur.next;
            tail.next = curNext;

            cur.next = curNext.next;
            curNext.next = cur;
            tail = cur;
            cur = cur.next;
        }

        return newHead.next;
    }
}