package leecode.hot100;

import leecode.ds.ListNode;

import java.awt.*;

public class q2_addTwoNumbers {
    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        int count = 0;
        ListNode res = new ListNode();
        ListNode cur = res;
        while (l1 != null || l2 != null) {
            if (l1 != null) {
                count = count + l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                count = count + l2.val;
                l2 = l2.next;
            }
            cur.next = new ListNode(count % 10);
            cur = cur.next;
            count /= 10;
        }
        if (count == 1) {
            cur.next = new ListNode(count);
        }
        return res.next;

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int count = 0;
        int num = 0;
        ListNode res = new ListNode();
        ListNode cur = res;
        while (true) {
            if (l1.next == null && l2.next == null) {
                break;
            } else if (l1.next != null && l2.next == null) {
                l2.next = new ListNode(0);
                l2 = l2.next;
            } else {
                l1.next = new ListNode(0);
                l1 = l1.next;
            }
            num = (l1.val + l2.val + count) % 10;
            cur.next = new ListNode(num);
            cur = cur.next;
            if (l1.val + l2.val + count >= 10) {
                count = 1;
            } else {
                count = 0;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        if (count == 1) {
            cur.next = new ListNode(count);
        }
        return res.next;

    }
}
