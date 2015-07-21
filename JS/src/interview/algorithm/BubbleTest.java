package interview.algorithm;

public class BubbleTest {

    /**
     * FIXME: <A brief description of what the method does.> 
     * FIXME: Algorithm: <MUST exist if the method is more than 10 lines. Remove if it is simple.>
     * <An Algorithm in pure English, describing the logic used in the implementation. 
     * This should not contain to any Syntax of Java, in fact, it should be language independent, 
     * and should be targeted to any new comer in the maintenance of the code.>
     *
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int a[] = new int[]{5,1,9,8,2,3,7,6,4};
        show(a);
        //bubble1(a, 0, a.length-1);
        bubble2(a, 0, a.length-1);
        show(a);
        
        int c=3,d=5;
        swap2(c,d);
        System.out.println("c:"+c+",d:"+d);
    }
    
    private static void bubble2(int[] a, int start, int end) {
        // TODO Auto-generated method stub
        boolean flag = true;
        for (int i=start;i<end && flag;i++) {
            flag = false;
            for (int j=end;j>i;j--) {
                if (a[j]<a[j-1]) {
                    swap(a,j-1,j);
                    flag = true;
                }
            }
        }
    }

    private static void bubble1(int a[], int start, int end) {
        // TODO Auto-generated method stub
        for (int i=start;i<end;i++) {
            for (int j=i+1;j<=end;j++) {
                if (a[i]>a[j]) {
                    swap(a,i,j);
                }
            }
        }
    }

    private static void swap(int[] a, int low, int high) {
        // TODO Auto-generated method stub
        if (low!=high) {
            int temp = a[low];
            a[low] = a[high];
            a[high] = temp;
        }
    }
    
    public static void swap2(int a, int b) {
        a ^=b;
        b ^=a;
        a ^=b;
        System.out.println("c:"+a+",d:"+b);
    }

    public static void show(int a[]) {
        for (int i=0;i<a.length;i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

}
