package tjpl;

public class PrintServer implements Runnable {
    private final PrintQueue requests = new PrintQueue();
    private boolean flag = true;
    
    public PrintServer(String serverName) {
        new Thread(this, serverName).start();
    }
    
    public void print(PrintJob job) {
        requests.add(job);
    }
    
    private void realPrint(PrintJob job) {
        if (null!=job) {
            System.out.println("Printing the job: "+job.getName());
        } else {
            System.out.println("Print job cleared.");
        }
    }
    
    public void stopRun() {
        this.flag = false;
    }
    
    @Override
    public void run() {
        // TODO Auto-generated method stub
        while (flag) {
            try {
                realPrint(requests.remove());
            } catch (InterruptedException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
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
        Runtime rt = Runtime.getRuntime();
        int availableProcessors = rt.availableProcessors();
        System.out.println("The available processors num is: "+availableProcessors);
        PrintServer ps = new PrintServer("Ling's printer server");
        PrintJob job1 = new PrintJob("Job1");
        PrintJob job2 = new PrintJob("Job2");
        ps.print(job1);
        try {
            Thread.sleep(0);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        ps.print(job2);
    }

}
