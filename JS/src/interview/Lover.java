package interview;

public class Lover {

    private String name = "";
    
    private Lover mate = null;
    
    private static Object locker = new Object();
    
    Lover(String name) {
        this.name = name;
    }
    
    public void setMate(Lover mate) {
        this.mate = mate;
    }
    
    public boolean BuLi() {
        System.out.println(name+": BuLi");
        return true;
    }
    
    public boolean BuQi() {
        System.out.println(name+": BuQi");
        return true;
    }
    
    //If you lock yourself then wait Others' Buli, if others acts the same, deadlock happens.
    public void BuLiBuQi() {
        synchronized(locker) {
            System.out.println(Thread.currentThread().getName()+"If you don't leave me, I will be by your side until the life ends.");
            if (mate.BuLi()) {
                BuQi();
            }
        }
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        final Lover BuZaiYouYu = new Lover("BuZaiYouYu");
        final Lover Yuer = new Lover("Yuer");
        BuZaiYouYu.setMate(Yuer);
        Yuer.setMate(BuZaiYouYu);
        new Thread(new Runnable(){
            public void run() {
                BuZaiYouYu.BuLiBuQi();
            }
        }, "BuZaiYouYu:").start();
        new Thread(new Runnable() {
            public void run() {
                Yuer.BuLiBuQi();
            }
        }, "Yuer:").start();
    }

}
