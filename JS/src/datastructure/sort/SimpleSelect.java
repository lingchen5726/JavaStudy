package datastructure.sort;

public class SimpleSelect extends Sort {

    @Override
    public void start() {
        // TODO Auto-generated method stub
        p("\tSimple select: Just remember the index of the min in current round, then swap at the end of the round");
        for (int i=1;i<len();i++) {
            int min = i;
            for(int j=i+1;j<=len();j++) {
                if (l(min)>l(j)) {
                    min = j;
                }
            }
            if (i!=min) {
                swap(i,min);
            }
        }
        p("Less swap, but always compare even if it's sorted.");
    }

    public static void main(String[] args) {
        Sort ss = new SimpleSelect();
        ss.execute();
    }
}
