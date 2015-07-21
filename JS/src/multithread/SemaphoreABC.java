/*编写一个程序，开启3个线程，这3个线程的ID分别为A、B、C，每个线程将自己的ID在屏幕上打印10遍，要求输出结果必须按ABC的顺序显示；如：ABCABC….依次递推 这是一道迅雷的笔试题*/

package multithread;

import java.util.concurrent.Semaphore;

public class SemaphoreABC {
	static class T extends Thread{  
        
        Semaphore me;  
        Semaphore next;  
          
        public T(String name,Semaphore me,Semaphore next){  
            super(name);  
            this.me = me;  
            this.next = next;  
        }  
          
        @Override  
        public void run(){  
            for(int i = 0 ; i < 3 ; i ++){  
                try {  
                    me.acquire();  
                } catch (InterruptedException e) {  
                    e.printStackTrace();  
                }  
                System.out.println(this.getName());  
                next.release();  
            }  
        }  
    }  
      
    public static void main(String[] args) {  
        Semaphore aSem = new Semaphore(1);  
        Semaphore bSem = new Semaphore(0);  
        Semaphore cSem = new Semaphore(0);  
          
        T a = new T("A",aSem,bSem);  
        T b = new T("B",bSem,cSem);  
        T c = new T("C",cSem,aSem);  
          
        a.start();  
        b.start();  
        c.start();  
    }  
}
