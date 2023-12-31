package Medium;

public class ReversedLinkedList {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        node5.next=node6;

        ListNode ansHead = reverseBetween(node1,3,5);
        while (ansHead!=null){
            System.out.print(ansHead.val+" -> ");
            ansHead=ansHead.next;
        }

    }

    public static ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode newHead = new ListNode(head.val);
        ListNode currNode = newHead;
        while(head.val!=left){
            ListNode temp = new ListNode(head.val);
            currNode.next = temp;
            currNode = currNode.next;
            head=head.next;
        }
        return newHead.next;
    }
}

class ListNode {
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
}

