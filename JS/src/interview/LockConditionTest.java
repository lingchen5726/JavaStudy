package interview;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class LockConditionTest {

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
        final ShareAccount account = new ShareAccount("", 0);
        ExecutorService fixedPool = Executors.newFixedThreadPool(2);
        fixedPool.submit(new Thread(new Runnable() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                for (int i=0;i<10;i++) {
                    double cashNum = Math.random()*1000;
                    account.deposit((int)cashNum);
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            }}, "Husband"));
        
        fixedPool.submit(new Thread(new Runnable() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                for (int i=0;i<10;i++) {
                    account.withdraw(1000);
                }
            }}, "Wife"));
        fixedPool.shutdown();
    }

}

class ShareAccount {

    private String accountName;
    private int balance;
    
    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    ReentrantLock lock = new ReentrantLock();
    Condition condition = lock.newCondition();
    
    public ShareAccount(String accountName, int balance) {
        // TODO Auto-generated constructor stub
        this.accountName = accountName;
        this.balance = balance;
    }
    
    public void deposit(int cash) {
        lock.lock();
        //try {
            setBalance(getBalance() + cash);
            System.out.println(Thread.currentThread().getName()+": deposit "+cash+", now has "+getBalance());
            condition.signal();
        //} finally {
            lock.unlock();
        //}
    }
    
    public void withdraw(int cash) {
        lock.lock();
        try {
            while (getBalance()<cash) {
                System.out.println(Thread.currentThread().getName()+": Calling husband to deposit, only "+getBalance()+" left.");
                condition.await(5000, TimeUnit.MILLISECONDS);
                // TODO Auto-generated catch block
            }
            setBalance(getBalance() - cash);
            System.out.println(Thread.currentThread().getName()+": After withdraw "+cash+", left "+getBalance());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }// finally {
            lock.unlock();
        //}
    }
}
