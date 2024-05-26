package leecode.hot100;

import leecode.ds.ListNode;

//给你一个单链表的头节点 head ，请你判断该链表是否为回文链表
// 如果是，返回 true ；否则，返回 false 。
public class q234_n_isPalindrome {

    // 反转之后是否相等即可
    // 有问题
    public boolean isPalindrome(ListNode head) {
        ListNode reHead = reverseList(head);
        while (head != null){
            if (reHead.val != head.val){
                return false;
            }
            head = head.next;
            reHead = reHead.next;
        }
        return true;
    }

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode n1 = head;
        ListNode n2 = head.next;

        n1.next = null;
        while (n2 != null) {
            head = n2;
            n2 = n2.next;
            head.next = n1;
            n1 = head;
        }
        return head;
    }
}
