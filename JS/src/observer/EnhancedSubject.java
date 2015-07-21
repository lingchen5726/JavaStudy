package observer;

import java.util.Observable;

public class EnhancedSubject extends Observable {

    /**
     * FIXME: <A brief description of what the method does.> 
     * FIXME: Algorithm: <MUST exist if the method is more than 10 lines. Remove if it is simple.>
     * <An Algorithm in pure English, describing the logic used in the implementation. 
     * This should not contain to any Syntax of Java, in fact, it should be language independent, 
     * and should be targeted to any new comer in the maintenance of the code.>
     *
     * @param args
     * Good article: 
     * http://blog.csdn.net/bearray123/article/details/6175480
     * 
     * About why synchronized vector. 
     * http://blog.sina.com.cn/s/blog_55fc875c0100qs3o.html
     */
    public void doBusiness() {
        if (true) {
            super.setChanged();
        }
        notifyObservers("Wolf!");
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        EnhancedSubject s = new EnhancedSubject();
        EnhancedObserverMail om = new EnhancedObserverMail();
        EnhancedObserverJMS oj = new EnhancedObserverJMS();
        s.addObserver(om);
        s.addObserver(oj);
        s.doBusiness();
    }

}
