package Medium;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    public static void main(String[] args) {
        MyStack obj = new MyStack();
        obj.push(2);
        obj.push(3);
        obj.pop();
        obj.pop();
        obj.top();
        obj.empty();
    }
}

class MyStack {
    Queue<Integer> queue1=new LinkedList<>();
    Queue<Integer> queue2=new LinkedList<>();
    Queue<Integer> temp;
    public void push(int x) {
        queue2.add(x);
        while(!queue1.isEmpty()){
            queue2.add(queue1.poll());
            //queue1.remove();
        }
        temp=queue2;
        queue2=queue1;
        queue1=temp;
    }

    public int pop() {
        return queue1.remove();
    }

    public int top() {
        return queue1.peek();
    }

    public boolean empty() {
        return queue1.isEmpty();
    }
}

/* USING SINGLE QUEUE
 public MyStack() {
    }

    public void push(int x) {
        q.add(x);
        for(int i = 0;i<q.size()-1;i++){
            q.add(q.remove());
        }
    }

    public int pop() {
        return q.remove();
    }

    public int top() {
        return q.peek();
    }

    public boolean empty() {
        return q.isEmpty();
    }
 */
