package week1day4.P2ListNode;


/*
* Use the given ListNode structure below to solve below questions.
* a. Merge two sorted LinkedList
* ListNode merge(ListNode list1, ListNode list2)
*
* b. Remove ListNode with odd value from a LinkedList
* ListNode removeOdd(ListNode head)
* */
public class ListNode {
    int val;
    ListNode next;

    ListNode() {

    }
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode merge(ListNode list1, ListNode list2){
        ListNode dummy = new ListNode();
        ListNode p1 = list1;
        ListNode p2 = list2;
        ListNode p = dummy;
        while(p1 != null && p2 != null){
            if(p1.val < p2.val){
                p.next = p1;
                p1 = p1.next;
            }else{
                p.next = p2;
                p2 = p2.next;
            }
            p = p.next;
        }
        while(p1 != null){
            p.next = p1;
            p1 = p1.next;
            p = p.next;
        }
        while(p2 != null){
            p.next = p2;
            p2 = p2.next;
            p = p.next;
        }
        return dummy.next;
    }

    public static ListNode removeOdd(ListNode head){
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode p = dummy;
        while(p.next != null){
            if(p.next.val % 2 != 0){
                p.next = p.next.next;
            }
            p = p.next;
        }
        return dummy.next;
    }
}
