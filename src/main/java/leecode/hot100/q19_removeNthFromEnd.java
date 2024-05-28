package leecode.hot100;

import leecode.ds.ListNode;

/**
 * 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
 */
public class q19_removeNthFromEnd {

    // 设定前后两个指针的举例一直保持为n，当后一个指针到最后，前一个即是结果
    // 需要考虑设置预先指针，保证有头有尾
    // 由头，设置预先指针
    // 有尾:删除倒数第一的情况
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode pre = new ListNode(0);
        pre.next = head;


        ListNode left = pre;
        ListNode right = pre;

        while (n != 0) {
            right = right.next;
            n--;
        }
        while (right.next != null) {
            left = left.next;
            right = right.next;
        }
        // 删除
        left.next = left.next.next;
        return pre.next;
    }
}
