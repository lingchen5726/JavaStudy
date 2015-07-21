package datastructure.sort;

public class BubbleSort3 extends Sort {

    @Override
    public void start() {
        // TODO Auto-generated method stub
        boolean flag = true;
        p("\tBubble sort3: Swap the adjacent 2 records, and if there is no swap in a round, stop sorting.");
        for (int i=1;i<len() && flag;i++) {
            flag = false;
            for (int j=len()-1;j>=i;j--) {
                if (l(j)>l(j+1)) {
                    swap(j,j+1);
                    flag = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        Sort bs3 = new BubbleSort3();
        bs3.execute();
    }
    
}
