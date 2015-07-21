package socket;

public class SingleExample {
	public static void main(String[] args) {
		SingleServer ss = new SingleServer(10000);
		ss.start();
		Client c = new Client("127.0.0.1", 10000);
		c.start();
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ss.requestStop();
	}
}
