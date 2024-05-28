package leecode.hot100;

import leecode.ds.ListNode;

/**
 * 给你一个链表，两两交换其中相邻的节点，并返回交换后链表的头节点。你必须在不修改节点内部的值的情况下完成本题（即，只能进行节点交换）。
 */
public class q24_n_swapPairs {
    public ListNode swapPairs(ListNode head) {
        if (head.next == null){
            return head;
        }
        ListNode left = head;
        ListNode right = head.next;
        ListNode pre = new ListNode();
        pre.next = head.next;

        while (right!=null){
            left.next = right.next;
            right.next = left;
            left = left.next ;
            if (left == null){
                break;
            }
            right = left.next;

        }
        return pre.next;
    }
}
