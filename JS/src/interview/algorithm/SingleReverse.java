package interview.algorithm;

import java.util.Stack;

public class SingleReverse {

    /**
     * FIXME: <A brief description of what the method does.> 
     * FIXME: Algorithm: <MUST exist if the method is more than 10 lines. Remove if it is simple.>
     * <An Algorithm in pure English, describing the logic used in the implementation. 
     * This should not contain to any Syntax of Java, in fact, it should be language independent, 
     * and should be targeted to any new comer in the maintenance of the code.>
     *
     * @param args
     */
    private static UnidirectionNode myHead = null;
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        UnidirectionNode head = new UnidirectionNode(1);
        UnidirectionNode node2 = new UnidirectionNode(2);
        head.setNext(node2);
        UnidirectionNode node3 = new UnidirectionNode(3);
        node2.setNext(node3);
        showUnidirectionLinkList(head);
        System.out.println();
        //reverseShowUnidirectionLinkList(head);
        //Using stack to reverse
        //showUnidirectionLinkList(reverseStack(head));
        /*Recursively reverse it at the same place.
        UnidirectionNode last = reverseSamePlace(head);
        last.setNext(null);
        System.out.println("3's next is "+node3.getNext().getData());
        System.out.println("2's next is "+node2.getNext().getData());
        System.out.println("1's next is "+head.getNext());
        //System.out.println("reversedHead is "+reversedHead);
        System.out.println("myHead is "+myHead);
        showUnidirectionLinkList(myHead);
        */
        //
        UnidirectionNode reversedHeadObj = new UnidirectionNode(99);
        UnidirectionNode last = reverseSamePlace(head, reversedHeadObj);
        UnidirectionNode newHead = reversedHeadObj.getNext();
        last.setNext(null);
        System.out.println("3's next is "+node3.getNext().getData());
        System.out.println("2's next is "+node2.getNext().getData());
        System.out.println("1's next is "+head.getNext());
        System.out.println("reversedHead is "+newHead);
        showUnidirectionLinkList(newHead);
    }

    public static UnidirectionNode reverseStack(UnidirectionNode head) {
        Stack<UnidirectionNode> stack = new Stack<UnidirectionNode>();
        for (UnidirectionNode current = head;current!=null;current=current.getNext()) {
            stack.push(current);
        }
        
        UnidirectionNode reversedHead = null, previous = null, current = null;
        boolean topFlag = true;
        while (!stack.empty()) {
            current = stack.pop();
            if (true==topFlag) {
                topFlag = false;
                reversedHead = current;
                previous = reversedHead;
            } else {
                if (null!=previous) {
                    previous.setNext(current);
                }
                previous = current;
            }
        }
        current.setNext(null);
        return reversedHead;
    }
    
    public static UnidirectionNode reverseSamePlace(UnidirectionNode current, UnidirectionNode reversedHead) {
        
        if (null==current) {
            return null;
        } else if (null==current.getNext()) {
            System.out.println(current.getData()+", next is null");
            //As it's different with C, we need to share a variable between the recursive function and the main function. e.g. a class variable 
            reversedHead.setNext(current);
            System.out.println("reversedHead's data will be "+current.getData());
            return current;
        } else {
            System.out.println(current.getData()+", next is not null, try to reverse its next");
            UnidirectionNode node = reverseSamePlace(current.getNext(), reversedHead);
            node.setNext(current);
            //If this is the first node, its next still be 2nd. need set it to null after call the recursive function.
            return current;
        }
        
    }
    
    public static void showUnidirectionLinkList(UnidirectionNode head) {
        for (UnidirectionNode current = head;current!=null;current=current.getNext()) {
            System.out.println(current.getData());
        }
    }
    
    public static void reverseShowUnidirectionLinkList(UnidirectionNode head) {
        if (null!=head) {
            reverseShowUnidirectionLinkList(head.getNext());
            System.out.println(head.getData());
        }
    }
    
    public static UnidirectionNode reverseSamePlace(UnidirectionNode current) {
        
        if (null==current) {
            return null;
        } else if (null==current.getNext()) {
            System.out.println(current.getData()+", next is null");
            //As it's different with C, we need to share a variable between the recursive function and the main function. e.g. a class variable 
            myHead = current;
            System.out.println("reversedHead's data will be "+myHead.getData());
            return current;
        } else {
            System.out.println(current.getData()+", next is not null, try to reverse its next");
            UnidirectionNode node = reverseSamePlace(current.getNext());
            node.setNext(current);
            //If this is the first node, its next still be 2nd. need set it to null after call the recursive function.
            return current;
        }
        
    }

}

class UnidirectionNode {
    int data;
    UnidirectionNode next;
    
    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
        this.next = null;
    }

    public UnidirectionNode getNext() {
        return next;
    }

    public void setNext(UnidirectionNode next) {
        this.next = next;
    }

    public UnidirectionNode(int data) {
        this.data = data;
    }
    
    
}