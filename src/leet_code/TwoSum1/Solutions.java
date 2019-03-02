package leet_code.TwoSum1;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}


public class Solutions {
    private ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode dummy = head;
        int carry_forward = 0;
        while(l1!=null || l2!=null){
            if (l1!=null){
                carry_forward += l1.val;
                l1=l1.next;
            }
            if (l2!=null){
                carry_forward += l2.val;
                l2=l2.next;
            }
            dummy.next=new ListNode(carry_forward%10);
            dummy=dummy.next;
            carry_forward=carry_forward/10;
        }
        if (carry_forward>0){
            dummy.next=new ListNode(carry_forward);
        }
        return head.next;
    }

    public static void main(String[] args){
        Solutions solutions = new Solutions();
        ListNode result = solutions.addTwoNumbers(new ListNode(9), new ListNode(9));
        while(result!=null){
            System.out.println(result.val);
            result=result.next;
        }

    }
}