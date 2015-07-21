package multithread;

import java.util.ArrayList;  
import java.util.HashMap;  
import java.util.List;  
import java.util.concurrent.ExecutorService;  
import java.util.concurrent.Executors;  
import java.util.concurrent.locks.Condition;  
import java.util.concurrent.locks.Lock;  
import java.util.concurrent.locks.ReentrantLock; 

public class ABCD1234 {
    static int index = 0;  
    static int max = 4 * 2;  
    static HashMap<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();  
    static {  
        for (int i = 0; i < 4; i++) {  
            map.put(i, new ArrayList<Integer>());  
        }  
    }  
    static boolean isRunning = true;  
  
    public static class MyRunnable implements Runnable {  
        int name;  
        Lock lock;  
        Condition condition;  
  
        private MyRunnable(int name, Lock lock, Condition condition) {  
            super();  
            this.name = name;  
            this.lock = lock;  
            this.condition = condition;  
        }  
  
        public boolean isMyName(int index) {  
  
            while (index != name) {  
                myWait();  
                if(!isRunning)return false;  
                return true;  
                  
            }  
            return false;  
        }  
  
        public void myWait() {  
            lock.lock();  
            try {  
                condition.await();  
            } catch (InterruptedException e) {  
                // TODO Auto-generated catch block  
                e.printStackTrace();  
            }  
            lock.unlock();  
        }  
  
        public void myNotifyAll() {  
            lock.lock();  
            condition.signalAll();  
            lock.unlock();  
        }  
  
        @Override  
        public void run() {  
            // TODO Auto-generated method stub  
            while (isRunning) {  
                while (isMyName(index % 4)) {  
          
                }     
                if(!isRunning)return;  
                for (int i = 0, arrIndex = index; i < 4; i++) {  
                    try {  
                        if (arrIndex-- < 0) {  
                            break;  
                        }  
                        List<Integer> list = map.get(i);  
                        if (list.size() < max) {  
                            list.add(name + 1);  
                        }  
                    } catch (Exception e) {  
                    }  
                }  
  
                System.err.println("A:" + map.get(0));  
                System.err.println("B:" + map.get(1));  
                System.err.println("C:" + map.get(2));  
                System.err.println("D:" + map.get(3));  
                System.err.println("-----------------------");  
                if (map.get(map.size() - 1).size() == max) {              
                    isRunning = false;  
                      
                    myNotifyAll();  
                    return;  
                } else {  
                    index++;  
                }     
                myNotifyAll();  
                  
              
            }  
  
        }  
  
    }  
  
    public static void main(String[] args) {  
        // TODO Auto-generated method stub  
        final Lock lock = new ReentrantLock();  
        final Condition condition = lock.newCondition();  
        ExecutorService threadPool = Executors.newCachedThreadPool();  
        for (int i = 0; i < 4; i++) {  
            threadPool.execute(new MyRunnable(i, lock, condition));  
        }  
         threadPool.shutdown();  
    }  
  
}  