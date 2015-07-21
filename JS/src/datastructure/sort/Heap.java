package datastructure.sort;

public class Heap extends Sort {

	@Override
	public void start() {
		// TODO Auto-generated method stub
        p("Heap uses full bi-tree which the parent is always greater than its children, l(i)'s children will be 2s & 2s+1, O(nlog(n))");
		int i=0;
		for (i=len()/2;i>0;i--) {
			heapAdjust(i,len());
		}
		for (i=len();i>1;i--) {
			swap(1,i);
			heapAdjust(1,i-1);
		}
	}

	private void heapAdjust(int i, int len) {
		// TODO Auto-generated method stub
		int temp = l(i);
		int j=0;
		for (j=2*i;j<=len;j*=2) {
			if (j<len && l(j)<l(j+1)) {
				j++;
			}
			// How to guarantee if (1,3,7) this will become 3,7,1
			if (temp>=l(j)) {
				break;
			}
			setl(i,l(j));
			i=j;
		}
		setl(i,temp);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Sort heap = new Heap();
        heap.execute();
	}

}
