package week2day1mock.P3SumOfLinkedList;

public class P3SumOfLinkedList {

    public static void main(String[] args) {

    }


    static int myTest3(ListNode l1, ListNode l2){
        ListNode p1  = l1;
        ListNode p2 = l2;
        StringBuilder sb = new StringBuilder();
        while(p1!= null){
            sb.append(p1.val);
            p1  = p1.next;
        }
        String stringNum1 =  sb.toString();
        int num1 = Integer.parseInt(stringNum1);
        sb = new StringBuilder();
        while(p2 != null){
            sb.append(p2.val);
            p2 = p2.next;
        }
        String stringNum2 =  sb.toString();
        int num2 = Integer.parseInt(stringNum2);
        return num1 + num2;
    }
}
