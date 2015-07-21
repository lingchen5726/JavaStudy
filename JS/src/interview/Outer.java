package interview;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import interview.Outer.Inner1;
import interview.Outer.Inner2;
import interview.Outer.Inner3;

public class Outer<E> implements Collection<E>{
    private int instanceField;
    private static int staticField;
    
    {
        int localVirable1 = 0;
        final int localVirable2 = 1;
        //local class can not have privilege modifier
        class localMemberClass {
            public localMemberClass() {
                Outer.staticField = 1;
                //Strange, seems doesn't work: Outer.this.instanceField = 2;
                System.out.println(localVirable2);
                //Must be final: System.out.println(localVirable1);
            }
        }
    }
    
    static {
        class LocalstaticInner {
            public LocalstaticInner() {
                staticField = 1;
                //instanceField = 2;
            }
        }
    }
    
    public static void staticMethod() {
        class StaticLocalMemberClass {
            public StaticLocalMemberClass() {
                staticField = 2;
            }
        }
        //Illegal: Interface I {};
    }
    
    public void instanceMethod() {
    }
    
    
    public void instanceMethod2() {
        MyAction action = new MyAction() {
            public void doAction() {
                System.out.println("");
            }
        };
        
        new BaseClass(5) {
            public void printData() {
                System.out.println("data:"+getData());
            }
        }.printData();
        File f = new File("xx");
        String[] filelist = f.list(new FilenameFilter() {

            @Override
            public boolean accept(File dir, String name) {
                // TODO Auto-generated method stub
                return name.endsWith(".java");
            }
            
        });
    }
    
    
    public static class Inner1 {
        public Inner1() {
            staticMethod();
            //instanceMethod();
        }
    }
    
    static class Inner2 {
        
    }
    
    static class Inner3 {
        private static class Inner4 {
            
        }
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean contains(Object o) {
        // TODO Auto-generated method stub
        return false;
    }

    private class Itr implements Iterator<E> {

        @Override
        public boolean hasNext() {
            // TODO Auto-generated method stub
            return false;
        }

        @Override
        public E next() {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public void remove() {
            // TODO Auto-generated method stub
            
        }
        
    }
    
    @Override
    public Iterator<E> iterator() {
        // TODO Auto-generated method stub
        return new Itr();
    }

    @Override
    public Object[] toArray() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Object[] toArray(Object[] a) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean add(Object e) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean remove(Object o) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean retainAll(Collection c) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub
        
    }

    public static void main(String[] args) {
        Outer.Inner1 i1 = new Inner1();
        Outer.Inner2 i2 = new Inner2();
        //Outer.Inner3 i3 = new Inner3();
        HashMap<String, String> hm = new HashMap<String, String>();
        hm.put(null, null);
        hm.put(null, "1");
        String str = hm.get(null);
        System.out.println("hm.get(null) is: "+str);
        Hashtable<String, String> ht = new Hashtable<String, String>();
        
        //ht.put(null, null);
        List<Integer> alstr = new ArrayList<Integer>();
        int size = 5;
        Random r = new Random(25);
        
        for (int i=0;i<size;i++) {
            double d = r.nextDouble()*3;
            //double d = Math.random()*10;
            System.out.println("original alstr["+i+"]:"+d);
            alstr.add((int)d);
        }
        for (int i=0;i<size;i++) {
            System.out.println("alstr["+i+"]:"+alstr.get(i));
        }
        Collections.sort(alstr);
        System.out.println("After Collections.sort");
        for (int i=0;i<size;i++) {
            System.out.println("alstr["+i+"]:"+alstr.get(i));
        }
        int index = Collections.binarySearch(alstr, 2);
        System.out.println("index:"+index);
    }

}

interface MyAction {
    void doAction();
};

class BaseClass {
    private int data;
    public BaseClass (int data) {
        this.data = data;
    }
    public int getData() {
        return data;
    }
    
}

class Test {
    public static void main(String[] args) {
        Outer.Inner1 i1 = new Inner1();
        Outer.Inner2 i2 = new Inner2();
        //Outer.Inner3 i3 = new Inner3();
    }
}

