import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ListNode curNode = listNode;
        
        while(curNode != null){
            list.add(0,curNode.val);
            curNode = curNode.next;
        }
        
        return list;
    }
}