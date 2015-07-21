package datastructure.sort;

public class BubbleSort1 extends Sort {
    
    @Override
    public void start() {
        // TODO Auto-generated method stub
        p("\tBubble sort1: Just swap the first element");
        for (int i=1;i<len();i++) {
            for (int j=i+1;j<=len();j++) {
                if (l(i)>l(j)) {
                    swap(i,j);
                }
            }
        }
    }

    public static void main(String[] args) {
        Sort bs1 = new BubbleSort1();
        bs1.execute();
    }
   
}
