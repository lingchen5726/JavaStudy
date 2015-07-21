package interview.algorithm;

public class MergeTest {

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
        /*Test merge
        int b[] = new int[]{1,3,5,7,9,2,4,6,8};
        int result[] = new int[b.length];
        show(b);
        merge(b,result,0,4,8);
        show(result);
        */
        int[] result = new int[a.length];
        show(a);
        msort(a, result, 0, (a.length)-1);
        show(result);
    }

    private static void msort(int[] a, int[] result, int start, int end) {
        // TODO Auto-generated method stub
        int temp[] = new int[a.length+1];
        // TODO initilize temp
        //With the if will call infinite 
        if (start==end) {
            result[start] = a[start];
        } else {
            int m = (start+end)/2;
            msort(a, temp, start,m);
            msort(a, temp, m+1, end);
            merge(temp, result, start, m, end);
        }
    }

    private static void merge(int[] t, int[] result, int start, int m, int end) {
        // TODO Auto-generated method stub
        //Compare the current element in 2 parts, move to result and oneOfThePart++
        int i=start,j=m+1,k=start;
        for (;i<=m && j<=end;k++) {
            if(t[i]<t[j]) {
                result[k] = t[i];
                i++;
            } else {
                result[k] = t[j];
                j++;
            }
        }
        //Once meet end of one part, copy whole rest of another part to result
        System.out.println("i:"+i+",j:"+j+",k:"+k);
        if (i>m) {
            for (;k<=end;k++) {
                result[k]=t[j];
                j++;
            }
        } else if(j>end) {
            for (;k<=end;k++) {
                result[k]=t[i];
                i++;
            }
        }
        
    }
    
    public static void show(int a[]) {
        for (int i=0;i<a.length;i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

}
