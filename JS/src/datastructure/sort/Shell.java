package datastructure.sort;

public class Shell extends Sort {

    @Override
    public void start() {
        // TODO Auto-generated method stub
        p("Shell is enhanced insert, using leaps to keep partially sorted, O(n3/2)");
        int increment = len();
        do {
            //increment = (int)Math.sqrt(increment);
            increment = increment/3+1;
            int i,j;
            /*Because of we start from the most right, so it's i<=len,*/
            for (i=increment+1;i<=len();i+=increment) {
                if (l(i)<l(i-increment)) {
                    setl(0,l(i));
                    for(j=i-increment;(j>0) && (l(j)>l(0));j-=increment) {
                        setl(j+increment, l(j));
                    }
                    /*Often failed to use setl(j,l(0))*/
                    setl(j+increment, l(0));
                }
            }
        }while (increment>1);
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
        Sort sh = new Shell();
        sh.execute();
    }

}
