//hard
//prbl.no=25
class Solution {

    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode ptr = head;
        ListNode ktail = null;
        ListNode newHead = null;

        while (ptr != null) {

            int count = 0;
            ptr = head;
            while (count < k && ptr != null) {
                ptr = ptr.next;
                count++;
            }

            if (count == k) {

                ListNode revHead = reverseLinkedList(head, k);

                if (newHead == null) {
                    newHead = revHead;
                }

                if (ktail != null) {
                    ktail.next = revHead;
                }

                ktail = head;
                head = ptr;
            } else {
                break;
            }
        }

        if (ktail != null) {
            ktail.next = head;
        }

        return newHead == null ? head : newHead;
    }

    public ListNode reverseLinkedList(ListNode head, int k) {

        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;

        while (k > 0) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            k--;
        }

        return prev;
    }
}
