package tjpl;

public class Chp14d82 extends Thread{
    private String result;

    public String getResult() {
        return result;
    }
    
    public void run() {
        result = calculate();
    }

    private String calculate() {
        // TODO Auto-generated method stub
        for (int i=0;i<3;i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                Thread.currentThread().interrupt();
            }
        }
        return "Done";
    }

    class UncaughtExceptionHandlerA implements UncaughtExceptionHandler {

        @Override
        public void uncaughtException(Thread t, Throwable e) {
            // TODO Auto-generated method stub
            System.out.println("UncaughtExceptionHandlerA:"+e.getMessage());
        }
    }

    public static void main(String args[]) {
        Chp14d82 calc = new Chp14d82();
        UncaughtExceptionHandlerA eh = null;
        calc.setUncaughtExceptionHandler(eh);
        calc.start();
        ThreadGroup tg = calc.getThreadGroup();
        try {
            tg.checkAccess();
        } catch (SecurityException e) {
            e.printStackTrace();
        }
        System.out.println("activeCount():"+tg.activeCount()+", name:"+tg.getName()+", ParentName:"+tg.getParent().getName()+", toString():"+tg.toString());
        Thread[] list = new Thread[10];
        int threadsNum = tg.enumerate(list);
        for (int i=0;i<threadsNum;i++) {
            System.out.println("Thread["+i+"]:"+list[i].getName()+", id:"+list[i].getId()+", state:"+list[i].getState());
        }
        tg.list();
        StackTraceElement[] stackTraces = new StackTraceElement[10];
        stackTraces = calc.getStackTrace();
        for (StackTraceElement ste: stackTraces) {
            System.out.println("Calling "+ste.getClassName()+"."+ste.getMethodName());
        }
        for (int j=0;j<5;j++) {
            System.out.println("Do something else, waiting for the calc result");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        try {
            calc.join();
            System.out.println("Finally the calc done, the result is "+calc.getResult());
        } catch (InterruptedException e) {
            System.out.println("No answer got for interrupted.");
        }
        for (int j=0;j<10;j++) {
            System.out.println("Continue using the calc result");
        }
        
    }

    
}

