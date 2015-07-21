package datastructure.sort;

public abstract class Sort {
    int[] list = null;

    public Sort() {
        this.list = new int[]{0,9,1,5,8,3,7,4,6,2};
    }
    
    public Sort(int[] l) {
        this.list = l;
    }
    
    public int l(int index) {
        int rtn = 0;
        if (null!=list) {
            rtn = list[index];
        }
        return rtn;
    }
    
    public void setl(int index, int input) {
        list[index] = input;
    }
    
    public void swap(int i, int j) {
        int t = list[i];
        list[i] = list[j];
        list[j] = t;
    }
    
    public int len() {
        int length = 0;
        if (null!=list && list.length>1) {
            length = list.length-1;
        }
        return length;
    }
    
    public void p(Object o) {
        System.out.println(o);
    } 
    
    public void show() {
        if (null!=list) {
            for (int i=1;i<=len();i++) {
                System.out.print(" "+list[i]);
            }
            System.out.println();
        }
    }
    
    public void execute() {
        p("Sort "+len()+" records -->>>");
        show();
        start();
        show();
        p("------End of sort------");
        p("");
    }
    
    public abstract void start();
    
    public static void main(String[] args) {
        Sort bs1 = new BubbleSort1();
        bs1.execute();
        Sort bs2 = new BubbleSort2();
        bs2.execute();
        Sort bs3 = new BubbleSort3();
        bs3.execute();
        Sort ss = new SimpleSelect();
        ss.execute();
        Sort di = new DirectInsert();
        di.execute();
        Sort sh = new Shell();
        sh.execute();
        Sort qs = new QuickSort();
        qs.execute();
        Sort qs1 = new QuickSort1();
        qs1.execute();
        Sort qs2 = new QuickSort2();
        qs2.execute();
        Sort qs3 = new QuickSort3();
        qs3.execute();
        Sort qs4 = new QuickSort4();
        qs4.execute();
        Sort heap = new Heap();
        heap.execute();
        Sort merge = new Merge();
        merge.execute();
    }
    
}
