class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(n <0||head == null){
            return null;
        }

        ListNode fast = head;
        while(n-1 > 0){
            fast = fast.next;
            if(fast == null){
                System.out.println("长度越界");
                break;
            }
            n--;
        }
     
        ListNode slow = head;
        ListNode cur = slow;
        while(fast.next != null){
            cur = slow;
            fast= fast.next;
            slow = slow.next;
        }

        if(slow == head){
            head = head.next;
        }else{
            cur.next = slow.next;
        }

        return head;


    }
}