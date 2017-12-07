package InterviewBitAssignments.Week2;

/**
 * Created by akshaymathur on 12/7/17.
 */
public class SwapListNodeInPairs {
    class ListNode {
        public int val;
        public ListNode next;
        ListNode(int x) { val = x; next = null; }
    }

    public ListNode swapPairs(ListNode a) {
        ListNode org = a.next;
        ListNode head = a;
        ListNode second = head.next;
        ListNode loop = new ListNode(0);
        loop.next = head;

        while(loop!=null && loop.next!=null) {
            ListNode tmp = second.next;
            second.next = head;
            head.next = tmp;
            loop.next = second;


            loop = loop.next.next;
            head = loop.next;
            if(loop.next==null){
                break;
            }
            second = loop.next.next;


        }

        return org;

    }
}
