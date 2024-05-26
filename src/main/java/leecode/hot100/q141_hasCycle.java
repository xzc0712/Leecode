package leecode.hot100;

import leecode.ds.ListNode;

public class q141_hasCycle {
    public boolean hasCycle(ListNode head) {
        // 快慢指针，如果出现相同的情况，则说明有环
        if (head == null || head .next ==null){
            return false;
        }
        ListNode n1 = head;
        ListNode n2 = head;
        while (n2!=null ){
            if(n2.next == null){
                return false;
            }
            n1 = n1.next;
            n2 = n2.next.next;
            if (n1 == n2){
                return true;
            }
            head = head.next;
        }
        return false;
    }
}
