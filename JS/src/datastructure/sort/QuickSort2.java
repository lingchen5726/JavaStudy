package datastructure.sort;

public class QuickSort2 extends Sort {

    @Override
    public void start() {
        // TODO Auto-generated method stub
        p("QuickSort seperate the records to 2 groups, all the left <=pivot<= all the right");
        p("QuickSort1 added median3 to try to keep the low is nearly the median of the sub sequence.");
        p("QuickSort2 replace swap as set to decrease the swap of pivot. 592 -> 259, just need set high & low, then set low as l(0)");
        QSort(1, len());
    }

    private void QSort(int low, int high) {
        // TODO Auto-generated method stub
        int pivot = 0;
        if(low<high) {
            pivot = partition(low, high);
            QSort(low,pivot-1);
            QSort(pivot+1, high);
        }
    }
    
    private int partition(int low, int high) {
        // TODO Auto-generated method stub
        int pivotkey;
        medianThree(low, high);
        pivotkey = l(low);
        setl(0, pivotkey);
        
        //This while is because 2 single swap won't cover all the scan.
        while(low<high) {
            //This while is to --high to an adequate value
            while (low<high && l(high)>=pivotkey) {
                high--;
            }
            //swap(low, high);
            setl(low, l(high));
            //This while is to ++low to an adequate value
            while (low<high && l(low)<=pivotkey) {
                low++;
            }
            //swap(low, high);
            setl(high, l(low));
        }
        
        //low = high, return one of them is ok.
        //Only after loop can set back the pivotkey to low
        setl(low, l(0));
        return high;
        //return low;
    }

    //It could be changed to medianNine for large scale sort.
    private void medianThree(int low, int high) {
        // TODO Auto-generated method stub
        //use it but not (high+low)/2 to avoid overflow & the 2 is easy to change.
        int m = low+(high-low)/2;
        if(l(low)>l(high)) {
            swap(low, high);
        }
        if(l(m)>l(high)) {
            swap(m, high);
        }
        if(l(m)>l(low)) {
            swap(m, low);
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
        Sort qs2 = new QuickSort2();
        qs2.execute();
    }

}
