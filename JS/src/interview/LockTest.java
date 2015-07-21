package interview;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class LockTest {

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
        CreditCard credit = new CreditCard("abc", 10000);
        //Lock lock = new ReentrantLock();
        ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
        ExecutorService cachedPool = Executors.newCachedThreadPool();
        Operation op1 = new Operation("ZhangSan", credit, -4000, lock, false);
        Operation op2 = new Operation("ZhangSan Die", credit, 6000, lock, false);
        Operation op3 = new Operation("ZhangSan Didi", credit, -8000, lock, false);
        Operation op4 = new Operation("ZhangSan", credit, 800, lock, false);
        Operation op5 = new Operation("ZhangSan", credit, 0, lock, true);
        Operation op6 = new Operation("ZhangSan", credit, 0, lock, true);
        cachedPool.submit(op1);
        cachedPool.submit(op2);
        cachedPool.submit(op5);
        cachedPool.submit(op3);
        cachedPool.submit(op4);
        cachedPool.submit(op6);
        cachedPool.shutdown();
    }

}

class Operation implements Runnable {
    private String userName;
    private CreditCard card;
    private int money; //+for deposit, -for withdraw
    private ReentrantReadWriteLock myLock;
    private boolean isCheck;
    
    Operation(String userName, CreditCard card, int money, ReentrantReadWriteLock lock, boolean isCheck) {
        this.userName = userName;
        this.card = card;
        this.money = money;
        this.myLock = lock;
        this.isCheck = isCheck;
    }

    
    public void run() {
        if (isCheck) {
            myLock.readLock().lock();
            System.out.println(userName+" is checking "+card.toString());;
            myLock.readLock().unlock();
        } else {
        //If without lock, the result could be right as 4800, also could be -1200 or 16000
            myLock.writeLock().lock();
            System.out.println(userName+" try to use "+card.toString()+" to "+money);
            card.setCash(card.getCash()+money);
            System.out.println(userName+" done. "+card.toString());
            myLock.writeLock().unlock();
        }
    }
}

class CreditCard {
    private String name;
    private int cash;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public void deposit(int cash) {
        this.cash += cash;
    }
    
    public void withdraw(int cash) {
        this.cash -= cash;
    }
    
    CreditCard(String name, int cash) {
        this.name = name;
        this.cash = cash;
    }
    
    public String toString() {
        return name+":"+cash;
    }
    
}