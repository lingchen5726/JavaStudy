package interview;

public class QueueTest {
    private Node first;
    private Node last;

    /**
     * FIXME: <A brief description of what the method does.> 
     * FIXME: Algorithm: <MUST exist if the method is more than 10 lines. Remove if it is simple.>
     * <An Algorithm in pure English, describing the logic used in the implementation. 
     * This should not contain to any Syntax of Java, in fact, it should be language independent, 
     * and should be targeted to any new comer in the maintenance of the code.>
     *
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        QueueTest qt = new QueueTest();
        
        for (int i=0;i<3;i++) {
            Node node = new Node(i);
            qt.enqueue(node);
        }
        for (int i=0;i<3;i++) {
            Node node = qt.dequeue();
            if (null!=node) {
                node.show();
            }
        }
    }

    public Node dequeue() {
        // TODO Auto-generated method stub
        if (null==first) {
            return null;
        } else {
            Node temp = first;
            first = first.next;
            return temp;
        }
    }

    public void enqueue(Node node) {
        // TODO Auto-generated method stub
        if (null==first) {
            first = node;
            last = first;
        } else {
            last.next = node;
            last = node;
        }
    }

}
