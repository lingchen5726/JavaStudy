package interview.algorithm;

public class UniDirectionLinkedList {

    JieDian head;
    
    public UniDirectionLinkedList(int n) {
        // TODO Auto-generated constructor stub
        JieDian previous = null;
        JieDian current = null;
        for (int i=n;i>0;i--) {
            current = new JieDian(i);
            current.setNext(previous);
            previous = current;
        }
        setHead(current);
    }
    
    public JieDian getHead() {
        return head;
    }

    public void setHead(JieDian head) {
        this.head = head;
    }

    public void show() {
        JieDian current = getHead();
        while (null!=current) {
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }

    public JieDian reverse(JieDian head) {
        if (null==head) {
            return null;
        } else if (null==head.getNext()) {
            setHead(head);
            return head;
        } else {
            JieDian tail = reverse(head.getNext());
            tail.setNext(head);
            return head;
        }
        
    }
    
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
        UniDirectionLinkedList udll = new UniDirectionLinkedList(5);
        //System.out.println(udll.getHead().getValue());
        udll.show();
        System.out.println();
        JieDian tail = udll.reverse(udll.getHead());
        tail.setNext(null);
        udll.show();
    }

}

class JieDian {
    int value;
    JieDian next;
    
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public JieDian getNext() {
        return next;
    }

    public void setNext(JieDian next) {
        this.next = next;
    }

    public JieDian(int i) {
        value = i;
        next = null;
    }
}