package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class Dervied extends Base {

    //private String dname = "dervied";
    private String name = "dervied";

    public Dervied() {
        tellName();
        printName();
    }
    
    public void tellName() {
        System.out.println("Dervied tell name: " + name);
    }
    
    public void printName() {
        System.out.println("Dervied print name: " + name);
    }

    @SuppressWarnings("unused")
    public static void main(String[] args){
        
        Dervied d = new Dervied();
        System.out.println(d.name+","+d.name);
        System.out.println();
        Base b = new Dervied();
        //Here the b.dname is unvisible
        System.out.println(b.name);  //base
        b.tellName(); //But the overrided method will still be the overrided : Dervied tell name: dervied
        System.out.println();
        
        //ArrayList<String> al = new ArrayList<String>();
        //Iterator<String> iter = al.iterator();
        HashMap<String, String> m = new HashMap<String, String>();
        m.put("1", "11");
        //new LinkedList();
        //Vector is synchronized
        //Vector<String> v = new Vector<String>();
        //HashSet<String> hs = new HashSet<String>();
    }
}

class Base {
    //protected String bname = "base";
    protected String name = "base";

    public Base() {
        tellName();
        printName();
    }
    
    public void tellName() {
        System.out.println("Base tell name: " + name);
    }
    
    public void printName() {
        System.out.println("Base print name: " + name);
    }
}
