package datastructure.sort;

public class BubbleSort2 extends Sort {

    @Override
    public void start() {
        // TODO Auto-generated method stub
        p("\tBubble sort2: Swap the adjacent 2 records");
        for (int i=1;i<len();i++) {
            for (int j=len()-1;j>=i;j--) {
                if (l(j)>l(j+1)) {
                    swap(j,j+1);
                }
            }
        }
    }

    public static void main(String[] args) {
        Sort bs2 = new BubbleSort2();
        bs2.execute();
    }
    
}
