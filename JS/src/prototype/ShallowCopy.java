package prototype;

import java.util.ArrayList;


public class ShallowCopy implements Cloneable{

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
    
    public ShallowCopy getClone() {
        ShallowCopy s = null;
        try {
            s = (ShallowCopy)this.clone();
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
        for (int i=0;i<this.getArr().size();i++) {
            System.out.println("Status is "+this.getArr().get(i));
        }
        
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ShallowCopy a = new ShallowCopy();
        a.setName("Robert");
        a.setAge(35);
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("Married");
        a.setArr(arr);
        a.show();
        ShallowCopy b = a.getClone();
        b.show();
        arr.set(0, "Single");
        a.setArr(arr);
        a.show();
        b.show();
    }

}
