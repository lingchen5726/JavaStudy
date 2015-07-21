package prototype;

import java.util.ArrayList;
import java.util.Iterator;


public class DeepCopy implements Cloneable{

    /**
     * FIXME: <A brief description of what the method does.> 
     * FIXME: Algorithm: <MUST exist if the method is more than 10 lines. Remove if it is simple.>
     * <An Algorithm in pure English, describing the logic used in the implementation. 
     * This should not contain to any Syntax of Java, in fact, it should be language independent, 
     * and should be targeted to any new comer in the maintenance of the code.>
     *
     * @param args
     */
    String Name = "";
    int age = 0;
    
    ArrayList<String> arr = new ArrayList<String>();
    
    public DeepCopy getClone() {
        DeepCopy s = null;
        try {
            s = (DeepCopy)this.clone();
            ArrayList<String> arr = new ArrayList<String>();
            for (String str:s.getArr()) {
                //System.out.println(str);
                arr.add(str);
            }
            s.setArr(arr);
        } catch (CloneNotSupportedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return s;
    }
    
    public String getName() {
        return Name;
    }

    public void setName(String strName) {
        this.Name = strName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<String> getArr() {
        return arr;
    }

    public void setArr(ArrayList<String> arr) {
        this.arr = arr;
    }

    public void show() {
        System.out.println(this.toString());
        System.out.println("Name is "+this.getName());
        System.out.println("Age is "+this.getAge());
        Iterator<String> iter = this.getArr().iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        DeepCopy a = new DeepCopy();
        a.setName("Robert");
        a.setAge(35);
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("Married");
        a.setArr(arr);
        a.show();
        DeepCopy b = a.getClone();
        b.show();
        arr.set(0, "Single");
        a.setArr(arr);
        a.show();
        b.show();
    }

}
