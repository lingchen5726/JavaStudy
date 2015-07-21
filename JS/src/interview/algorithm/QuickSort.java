package interview.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QuickSort {

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
        int a[] = new int[]{5,1,9,8,2,3,7,6,4};
        show(a);
        int high = (a.length)-1;
        //sort(a, 0, high);
        show(a);
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(9);
        list.add(5);
        list.add(1);
        Collections.sort(list);
        for (Integer i: list) {
            System.out.println(i);
        }
    }

    public static void sort(int a[], int low, int high) {
        int pivot = 0;
        //The low<high judgement is very important, or will dead loop
        if (low<high) {
            pivot = partition(a, low, high);
            sort(a, 0, pivot-1);
            sort(a, pivot+1, high);
        }
    }
    
    private static int partition(int a[], int low, int high) {
        // TODO Auto-generated method stub
        int pivotkey = a[low];
        System.out.println("Round: low:"+low+",high:"+high+", pivotkey:"+pivotkey);
       
        while(low<high) {
            while(low<high && pivotkey<a[high])
                high--;
            swap(a, low, high);
            System.out.println("Swaped low:"+low+" with high:"+high+", according to pivotkey:"+pivotkey);
            show(a);
            while(low<high && pivotkey>a[low])
                low++;
            swap(a, low, high);
            System.out.println("Swaped low:"+low+" with high:"+high+", according to pivotkey:"+pivotkey);
            show(a);
        }
        return high;
    }

    private static void swap(int[] a, int low, int high) {
        // TODO Auto-generated method stub
        if (low!=high) {
            int temp = a[low];
            a[low] = a[high];
            a[high] = temp;
        }
    }

    public static void show(int a[]) {
        for (int i=0;i<a.length;i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
