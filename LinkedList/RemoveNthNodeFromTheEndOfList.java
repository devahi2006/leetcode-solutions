//medium
//prbl.no:19
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy=new ListNode(1);
        dummy.next=head;
        ListNode front=dummy;
        ListNode end=dummy;
        for(int i=0;i<=n;i++){
            front=front.next;
        }
        while(front!=null){
            front=front.next;
            end=end.next;
        }
        end.next=end.next.next;
        return dummy.next;
    }
}
