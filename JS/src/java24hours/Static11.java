package java24hours;

public class Static11 {

    /**
     * FIXME: <A brief description of what the method does.> 
     * FIXME: Algorithm: <MUST exist if the method is more than 10 lines. Remove if it is simple.>
     * <An Algorithm in pure English, describing the logic used in the implementation. 
     * This should not contain to any Syntax of Java, in fact, it should be language independent, 
     * and should be targeted to any new comer in the maintenance of the code.>
     *
     * @param args
     */
    static {
        i=20;
    }
    static int i=10;
    
    
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(i); 
    }

}

/*
 * D:\Users\Robert\workspace\JS\bin\java24hours>javap -c Static11.class
Compiled from "Static11.java"
public class java24hours.Static11 {
  static int i;

  static {};
    Code:
       0: bipush        20
       2: putstatic     #10                 // Field i:I
       5: bipush        10
       7: putstatic     #10                 // Field i:I
      10: return

  public java24hours.Static11();
    Code:
       0: aload_0
       1: invokespecial #15                 // Method java/lang/Object."<init>":()V
       4: return

  public static void main(java.lang.String[]);
    Code:
       0: getstatic     #21                 // Field java/lang/System.out:Ljava/io/PrintStream;
       3: getstatic     #10                 // Field i:I
       6: invokevirtual #27                 // Method java/io/PrintStream.println:(I)V
       9: return
}
 * */
