package interview;

import java.util.Stack;

public class StackTest {

    /**
     * FIXME: <A brief description of what the method does.> 
     * FIXME: Algorithm: <MUST exist if the method is more than 10 lines. Remove if it is simple.>
     * <An Algorithm in pure English, describing the logic used in the implementation. 
     * This should not contain to any Syntax of Java, in fact, it should be language independent, 
     * and should be targeted to any new comer in the maintenance of the code.>
     *
     * @param args
     */
    Node top = null;
    
    public Node peek() {
        return top;
    }
    
    public int pop() throws StackEmpty{
        // TODO Auto-generated method stub
        if (null==top) {
            throw new StackEmpty();
        } else {
            Node temp = top;
            int val = temp.val;
            top = top.next;
            temp = null;
            return val;
        }
    }

    public void push(int val) {
        // TODO Auto-generated method stub
        Node node = new Node(val);
        node.next = top;
        top = node;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Stack<String> ss = new Stack<String>();
        
        StackTest st = new StackTest();
        
        for (int i=0;i<3;i++) {
            st.push(i);
        }
        for (int i=0;i<4;i++) {
            try {
                System.out.println(st.pop()); 
            } catch (StackEmpty e) {
                // TODO Auto-generated catch block
                System.out.println("Stack Empty");
            }
        }
        
    }

}

class Node {
    int val;
    Node next;
    
    public Node(int x) {
        this.val = x;
        next = null;
    }
    
    public void show() {
        System.out.println(val);
    }
}

class StackEmpty extends Exception {

    /**
     * FIXME: <A few word of description of what it is about.> 
     */
    private static final long serialVersionUID = -1383176157057801446L;
    
}
