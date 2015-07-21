package interview.MultiThreadProducerConsumer;

import java.util.Stack;

public class Inventory {
    private static final Stack<Merchant> inventory = new Stack<Merchant>();
    private String name = "";
    private int max = 0;
    private static int index = 0;
    
    public Inventory(String name, int max) {
        this.name = name;
        this.max = max;
        //inventory.setSize(max);
    }
 
    public synchronized void produce() throws InterruptedException {
        while (inventory.size()>=this.max) {
            System.out.println("inventory.size: "+inventory.size()+" , full.");
            wait();
        }
        index++;
        Merchant merchant = new Merchant(name+index);
        inventory.push(merchant);
        System.out.println(Thread.currentThread().getName()+": produced "+merchant.getName());
        notifyAll();
    }
    
    public synchronized Merchant consume() throws InterruptedException {
        Merchant merchant = null;
        while (inventory.empty()) {
            System.out.println("inventory.size: "+inventory.size()+" , empty.");
            wait(3000);
        }
        merchant = inventory.pop();
        System.out.println(Thread.currentThread().getName()+": consumed "+merchant.getName());
        notifyAll();
        return merchant;
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        final Inventory inventory = new Inventory("mantou", 10);
        
        new Thread(new Runnable(){
            public void run(){
                for (int i=0;i<30;i++) {
                    try {
                        inventory.produce();
                        Thread.yield();
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            }
        }, "producer").start();
        
        new Thread(new Runnable() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                for (int i=0;i<40;i++) {
                    try {
                        inventory.consume();
                        Thread.yield();
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            }}, "consumer").start();
        
        
    }
}
