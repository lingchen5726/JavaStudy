package interview.algorithm;

public class BiDirectionLinkList {

    /**
     * FIXME: <A brief description of what the method does.> 
     * FIXME: Algorithm: <MUST exist if the method is more than 10 lines. Remove if it is simple.>
     * <An Algorithm in pure English, describing the logic used in the implementation. 
     * This should not contain to any Syntax of Java, in fact, it should be language independent, 
     * and should be targeted to any new comer in the maintenance of the code.>
     *
     * @param args
     */
    private int data;
    private BiDirectionLinkList previous;
    private BiDirectionLinkList next;
    
    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }


    public BiDirectionLinkList getPrevious() {
        return previous;
    }


    public void setPrevious(BiDirectionLinkList previous) {
        this.previous = previous;
    }


    public BiDirectionLinkList getNext() {
        return next;
    }


    public void setNext(BiDirectionLinkList next) {
        this.next = next;
    }

    public BiDirectionLinkList(int data) {
        this.data = data;
        this.previous = null;
        this.next = null;
    }
    
    public static void showFromHeadLoop(BiDirectionLinkList head) {
        BiDirectionLinkList next = head;
        boolean first = true;
        while(null!=next) {
            if (head==next) {
                if (first) {
                    first = false;
                } else {
                    return;
                }
            } 
            System.out.println(next.getData());
            next = next.getNext();
        }
    }

    public static void showFromHead(BiDirectionLinkList head) {
        while(null!=head) {
            System.out.println(head.getData());
            head = head.next;
        }
    }

    public static void showFromTail(BiDirectionLinkList tail) {
        while(null!=tail) {
            System.out.println(tail.getData());
            tail = tail.previous;
        }
    }
    
    public static BiDirectionLinkList reverseFromHead(BiDirectionLinkList head) {
        BiDirectionLinkList previous = head;
        BiDirectionLinkList current = head;
        BiDirectionLinkList next = null;
        if (null!=head) {
            next = head.getNext();
            head.setNext(null);
        }
        while (null!=next) {
            current = next;
            next = next.getNext();
            current.setNext(previous);
            previous.setPrevious(current);
            previous = current;
        }
        //The tail will be the new next.
        return current;
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int a[] = new int[]{1,2,3};
        BiDirectionLinkList head = null;
        BiDirectionLinkList tail = null;
        BiDirectionLinkList previous = null;
        BiDirectionLinkList current = null;
        
        boolean first = true;
        for (int i=0;i<a.length;i++) {
            BiDirectionLinkList node = new BiDirectionLinkList(a[i]);
            current = node;
            if (first) {
                first = false;
                head = node;
            } else {
                current.previous = previous;
                if (null!=previous) {
                    previous.next = current;
                }
            }
            previous = node;
        }
        tail = current;
        /*If need a loop biDirectionLinkedList*/
        //tail.next = head;
        //head.previous = tail;
        /**/
        /*
        showFromHead(head);
        System.out.println();
        showFromTail(tail);
        */
        //showFromHeadLoop(head);
        //System.out.println();
        //showFromTail(tail);
        showFromHead(head);
        System.out.println();
        BiDirectionLinkList reversedHead = reverseFromHead(head);
        showFromHead(reversedHead);
        System.out.println();
    }

}
