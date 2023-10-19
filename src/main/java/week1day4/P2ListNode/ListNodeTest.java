package week1day4.P2ListNode;

public class ListNodeTest {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode p1 = listNode1;
        ListNode p2 = listNode2;
        for(int i = 3; i < 10; i += 2){
            p1.next = new ListNode(i);
            p1 = p1.next;
        }
        p1 = listNode1;
        System.out.println("List1: ");
        while(p1 != null){
            System.out.print(p1.val + " ");
            p1 = p1.next;
        }
        System.out.println();
        for(int i = 4; i <= 15; i += 2){
            p2.next = new ListNode(i);
            p2 = p2.next;
        }
        p2 = listNode2;
        System.out.println("List2: ");
        while(p2 != null){
            System.out.print(p2.val + " ");
            p2 = p2.next;
        }
        System.out.println();
        ListNode mergeNode = ListNode.merge(listNode1, listNode2);
        ListNode ptrMerge = mergeNode;
        System.out.println("Merge List1 and List2: ");
        while(ptrMerge != null){
            System.out.print(ptrMerge.val + " ");
            ptrMerge = ptrMerge.next;
        }
        System.out.println();
        System.out.println("Remove ListNode with odd value from the merged list: ");
        ListNode removeOddNode = ListNode.removeOdd(mergeNode);
        while(removeOddNode != null){
            System.out.print(removeOddNode.val + " ");
            removeOddNode = removeOddNode.next;
        }
    }
}
