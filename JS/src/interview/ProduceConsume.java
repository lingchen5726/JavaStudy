package interview;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

public class ProduceConsume {

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
        Storage storage = new Storage(10);
        ExecutorService cachedPool = Executors.newCachedThreadPool();
        cachedPool.submit(new Producer(storage, "Orange"));
        //cachedPool.submit(new Producer(storage, "Apple"));
        cachedPool.submit(new Consumer(storage, "D"));
        cachedPool.submit(new Consumer(storage, "E"));
        cachedPool.submit(new Consumer(storage, "F"));
        cachedPool.shutdown();
    }

}

class Product {
    String productName;
    public String getName() {
        return productName;
    }
    public void setName(String name) {
        this.productName = name;
    }
    public Product(String name) {
        this.productName = name;
    }
}

class Storage {
    int max;
    LinkedBlockingQueue<Product> storage; //It's already supported await, signalAll for multiThread.

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }
    
    public LinkedBlockingQueue<Product> getStorage() {
        return storage;
    }

    public void setStorage(LinkedBlockingQueue<Product> storage) {
        this.storage = storage;
    }

    public Storage(int num) {
        this.storage = new LinkedBlockingQueue<Product>(num);
        setMax(num);
    }
    
    public Product consumeProduct() throws InterruptedException {
        /*
        while (0==(getStorage().size())) {
            try {
                wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        Product product = getStorage().remove();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        notifyAll();
        */
        Product product = getStorage().take();
        System.out.println(Thread.currentThread().getName()+": consumed "+product.getName());
        return product;        
    }
    
    public void produceProduct(Product product) throws InterruptedException {
        /*
        while (getStorage().size()>=getMax()) {
            try {
                wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        try {
            getStorage().put(product);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+": produced "+product.getName());
        notifyAll();
        //Thread.yield();
         * 
         */
        getStorage().put(product);
        System.out.println(Thread.currentThread().getName()+": produced "+product.getName());
    }
}

class Producer implements Runnable {
    private Storage storage;
    private String productName;
    
    public String getProductName() {
        return productName;
    }

    public void setProductName(String name) {
        this.productName = name;
    }

    public Producer(Storage storage, String name) {
        this.storage = storage;
        this.productName = name;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        while (true) {
            Product product = new Product(getProductName());
            try {
                storage.produceProduct(product);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
    
}

class Consumer implements Runnable {
    private Storage storage;
    private String name;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Consumer(Storage storage, String name) {
        this.storage = storage;
        this.name = name;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        while (true) {
            try {
                storage.consumeProduct();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}