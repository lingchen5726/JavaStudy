package datastructure.sort;

public class DirectInsert extends Sort {

    public void dInsert(int low, int high) {
        for (int i=low+1;i<=high;i++) {
            if(l(i)<l(i-1)) {
                setl(0, l(i));
                int j = 0;
                for(j=i-1;j>0 && (l(j)>l(0));j--) {
                    setl(j+1, l(j));
                }
                setl(j+1,l(0));
            }
        }
    }
    
    @Override
    public void start() {
        // TODO Auto-generated method stub
        p("直接插入保证每轮之后，左边的都比自己小，右边的第一个比自己大，从而收敛。注意j会多移动一位，插回时要做+1");
        for (int i=2;i<=len();i++) {
            if(l(i)<l(i-1)) {
                setl(0, l(i));
                int j = 0;
                for(j=i-1;j>0 && (l(j)>l(0));j--) {
                    setl(j+1, l(j));
                }
                setl(j+1,l(0));
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
        Sort di = new DirectInsert();
        di.execute();
    }

}
