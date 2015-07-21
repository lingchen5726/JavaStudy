package tjpl;

import java.util.EmptyStackException;
import java.util.Stack;

public class PrintQueue {
    private Stack<PrintJob> queue = new Stack<PrintJob>();
    
    public Stack<PrintJob> getList() {
        return queue;
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
        PrintQueue requests = new PrintQueue();
        PrintJob job1 = new PrintJob("Job1");
        PrintJob job2 = new PrintJob("Job2");
        requests.add(job1);
        requests.add(job2);
        Stack<PrintJob> jobList = requests.getList();
        System.out.println("Current job list is: ");
        for (PrintJob job: jobList) {
            System.out.println(job.getName());
        }
        PrintJob removedJob = null;
        try {
            removedJob = requests.remove();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        if (null!=removedJob) {
            System.out.println("Removed job name is:"+removedJob.getName());
        }
        
    }

    public synchronized void add(PrintJob job) {
        // TODO Auto-generated method stub
        queue.push(job);
        notifyAll(); //Tell waiters: print job added
    }


    public synchronized PrintJob remove() throws InterruptedException {
        // TODO Auto-generated method stub
        // In this way, the thread won't be busy-wait try removing, only after new job was added to the queue.
        while (queue.empty())
            wait();
        return queue.pop();
        /*
        //The printServer will always busy-wait to try to remove the queue.
        PrintJob job = null;
        if (!queue.empty()) {
            job = queue.pop();
        }
        return job;
        */
    }

}
