package Medium;

import java.util.HashMap;

public class CopyListWithRandomPointer {
}
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

class NodeSolution {
    public Node copyRandomList(Node head) {
        HashMap<Node,Node> map = new HashMap<>();
        Node temp = head;
        while(temp!=null){
            Node copyNode = new Node(temp.val);
            map.put(temp,copyNode);
            temp = temp.next;
        }
        temp = head;
        while(temp!=null){
            Node copyNode = map.get(temp);
            copyNode.next = map.get(temp.next);
            copyNode.random = map.get(temp.random);
            temp = temp.next;
        }
        return map.get(head);
    }
}
