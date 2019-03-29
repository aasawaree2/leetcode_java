package leet_code.MergeTwoList21;

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
}

public class Solutions {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }
        ListNode head = new ListNode(0);
        ListNode current = head;
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                current.next = l1;
                l1=l1.next;
            }else{
                current.next = l2;
                l2=l2.next;
            }
            current = current.next;
        }

        if(l1!=null){
            current.next=l1;
        }
        if(l2!=null){
            current.next=l2;
        }
        return head.next;
    }

    public ListNode mergeTwoLists1(ListNode l1, ListNode l2){
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        if(l1.val < l2.val){
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else{
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }


    public static void main(String[] args){
        Solutions solutions = new Solutions();
        ListNode a = solutions.mergeTwoLists(new ListNode(0),new ListNode(1));
        ListNode b = solutions.mergeTwoLists1(new ListNode(0),new ListNode(1));
    }
}