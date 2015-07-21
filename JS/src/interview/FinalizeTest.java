package interview;

public class FinalizeTest {

    public FinalizeTest() {
        System.out.println("FinalizeTest object created.");
    }
    
    public static void main(String args[]) {
        FinalizeTest f = new FinalizeTest();
        f = null;
        System.gc();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Done");
      }
    
    protected void finalize() throws Throwable{           
        super.finalize();  
        //System.out.println("finalize method was called!");
        System.out.println("FinalizeTest object disposed.");
    }

}
