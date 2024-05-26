package leecode.hot100;

import leecode.ds.ListNode;

//给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
public class q206_reverseList {
    public ListNode reverseList(ListNode head) {
        if (head == null){
            return null;
        }
        ListNode n1 = head;
        ListNode n2 = head.next;

        n1.next = null;
        while(n2 != null){
            head = n2;
            n2 = n2.next;
            head.next = n1;
            n1 = head;
        }
        return head;
    }
}
