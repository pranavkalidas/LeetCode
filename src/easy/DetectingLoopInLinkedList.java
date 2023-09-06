package easy;

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}

public class DetectingLoopInLinkedList {
    public static boolean detectLoop(Node head){
        if(head==null || head.next==null){
            return false;
        }
        Node node1 = head;
        Node node2 = head.next.next;
        while(node2!=null && node2.next!=null ) {
            if(node1 == node2){
                return true;
            }
            node1 = node1.next;
            node2 = node2.next.next;
        }
        System.gc();
        return false;
    }

//    public static boolean detectLoop(Node head){
//        int count=0;
//        while(head!=null)
//        {
//            count++;
//            head=head.next;
//            if(count>100004) return true;
//        }
//        return false;
//    }
//
//    public static boolean detectLoop(Node head){
//        //ListNode cur = head;
//        Set<Node> set = new HashSet();
//
//        while(head != null){
//            if(!set.add(head)){
//                return true;
//            }
//
//            head = head.next;
//        }
//
//        return false;
//    }

}
