package interview;

public class ChangeValue {

    /**
     * FIXME: <A brief description of what the method does.> 
     * FIXME: Algorithm: <MUST exist if the method is more than 10 lines. Remove if it is simple.>
     * <An Algorithm in pure English, describing the logic used in the implementation. 
     * This should not contain to any Syntax of Java, in fact, it should be language independent, 
     * and should be targeted to any new comer in the maintenance of the code.>
     *
     * @param args
     */
    String str = new String("good");
    char[] ch = {'a', 'b', 'c'};
    private String name;
    private String sex;
    
    public ChangeValue() {
        
    }
    
    public ChangeValue(String x, String y) {
        this.name = x;
        this.sex = y;
    }
    
    public String toString() {
        return name + " " + sex;
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ChangeValue ex = new ChangeValue();
        ex.change(ex.str, ex.ch);
        System.out.print(ex.str+" and ");
        System.out.print(ex.ch);
        
        ChangeValue[] arraya = new ChangeValue[2];
        ChangeValue[] arrayb = new ChangeValue[2];
        arraya[0] = new ChangeValue("Alexia", "female");
        arraya[1] = new ChangeValue("Edward", "male");
        arrayb[0] = new ChangeValue("jmwang", "female");
        arrayb[1] = new ChangeValue("hwu", "male");
        
        int[] a = new int[2];
        int[] b = new int[2];
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
            b[i] = i + 1;
        }
        
        System.out.println('\n' + "基本类型数组交换前：a[0] = " + a[0] + ", a[1] = " + a[1]);
        System.out.println("基本类型数组交换前：b[0] = " + b[0] + ", b[1] = " + b[1]);
        
        ChangeValue.changeObjectArray(arraya, arrayb);
        System.out.println('\n' + "对象数组内容交换并改变后：arraya[1] = " + arraya[1].toString());
        System.out.println("对象数组内容交换并改变后：arrayb[1] = " + arrayb[1].toString());
        
        ChangeValue.changeIntArray(a, b);
        System.out.println('\n' + "基本类型数组内容交换并改变后：a[1] = " + a[1]);
        System.out.println("基本类型数组内容交换并改变后：b[1] = " + b[1]);
    }
    
    public static void changeObjectArray(ChangeValue[] p1, ChangeValue[] p2) {
        ChangeValue tmp = p1[1];
        p1[1] = p2[1];
        p2[1] = tmp;
        
        ChangeValue p = new ChangeValue("cl", "male");
        p1[1] = p;
    } 

    public static void changeIntArray(int[] x, int[] y) {
        /*
        int tmp = x[1];
        x[1] = y[1];
        y[1] = tmp;
        */
        int[] tmp = x;
        x = y;
        y = tmp;

        System.out.println("In changeIntArray: x[0]="+x[0]+", x[1]="+x[1]+", y[0]="+y[0]+", y[1]="+y[1]);
        x[1] = 5;
    }
    
    private void change(String str2, char[] ch2) {
        // TODO Auto-generated method stub
        str2 = "test ok";
        ch[0] = 'g';
    }

}
