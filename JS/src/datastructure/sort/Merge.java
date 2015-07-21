package datastructure.sort;

public class Merge extends Sort {

    @Override
    public void start() {
        // TODO Auto-generated method stub
        p("Merge splits array to 2 sorted sub arrays & merge them before return of the recursive call.");
        msort(list, list, 1, len());
    }

    private void msort(int[] source, int[] result, int start, int end) {
        // TODO Auto-generated method stub
        int m;
        int[] temp = new int[len()+1];
        if (start == end) {
            result[start] = source[start];
        } else {
            m = (start+end)/2;
            msort(source, temp, start, m);
            msort(source, temp, m+1, end);
            merge(temp, result, start, m, end);
        }
    }

    private void merge(int[] temp, int[] result, int start, int m, int end) {
        // TODO Auto-generated method stub
        int i,j,k,l;
        for (i=start, j=m+1, k=start;i<=m && j<=end;k++) {
            if(temp[i]<temp[j]) {
                result[k]=temp[i++];
            } else {
                result[k]=temp[j++];
            }
        }
        if (i<=m) {
            for (l=0;l<=m-i;l++) {
                result[k+l] = temp[i+l];
            }
        } else if (j<=end) {
            for (l=0;l<=end-j;l++) {
                result[k+l] = temp[j+l];
            }
        }
    }

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
        Sort merge = new Merge();
        merge.execute();
    }

}
