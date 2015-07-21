package java24hours;

import java.awt.Point;

public class Point3D extends Point{

    /**
     * FIXME: <A brief description of what the method does.> 
     * FIXME: Algorithm: <MUST exist if the method is more than 10 lines. Remove if it is simple.>
     * <An Algorithm in pure English, describing the logic used in the implementation. 
     * This should not contain to any Syntax of Java, in fact, it should be language independent, 
     * and should be targeted to any new comer in the maintenance of the code.>
     *
     * @param args
     */
    private int z;
    
    public Point3D(int x, int y, int z) {
        super(x,y);
        this.z = z;
    }
    
    public void move(int x, int y, int z) {
        this.z = z;
        super.move(x, y);
    }
    
    public void translate(int x, int y, int z) {
        this.z += z;
        super.translate(x, y);
    }
    
    public void show() {
        System.out.println("x:"+x+",y:"+y+",z:"+z);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Point3D p3 = new Point3D(1,2,3);
        p3.show();
        p3.move(4,5,6);
        p3.show();
        p3.translate(1,2,3);
        p3.show();
    }
}
