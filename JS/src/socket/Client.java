package socket;

import java.io.*;
import java.net.*;

public class Client extends Thread {
	String serverIPAddr;
	int serverSocketPort;
	Socket socket;
	BufferedReader in;
	PrintWriter out;

	public Client(String serverIPAddr, int serverSocketPort) {
		try {
			//socket = new Socket("127.0.0.1", 10000);
			socket = new Socket(serverIPAddr, serverSocketPort);
			in = new BufferedReader(new InputStreamReader(
					socket.getInputStream()));
			out = new PrintWriter(socket.getOutputStream(), true);
			//BufferedReader line = new BufferedReader(new InputStreamReader(System.in));
			// out.println(line.readLine());
			System.out.println("Client started ...");
			//out.println("Client: How are you doing?");
			//try {
			//	Thread.sleep(1000);
			//} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			//}
			//System.out.println(in.readLine());
			out.println("Attach");
			Thread.sleep(1000);
			System.out.println(in.readLine());
			out.println("Detach");
			Thread.sleep(1000);
			System.out.println(in.readLine());
			out.println("Bye");

			//line.close();
			out.close();
			in.close();
			socket.close();
			System.out.println("Client stoped.");
		} catch (IOException e) {

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		/*for (int i=0;i<args.length;i++) {
			System.out.println(args[i]);
		}*/
		new Client(args[0], Integer.parseInt(args[1]));
	}
}