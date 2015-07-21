package socket;

import java.net.*;
import java.io.*;

public class Server {
	private ServerSocket ss;
	private Socket socket;
	private BufferedReader in;
	private PrintWriter out;

	public Server() {
		try {
			//ss.setReuseAddress(Boolean.TRUE);
			ss = new ServerSocket(10002);
//			while (true) {
				System.out.println("Server started ...");
				socket = ss.accept();
				in = new BufferedReader(new InputStreamReader(
						socket.getInputStream()));
				out = new PrintWriter(socket.getOutputStream(), true);
				String line = in.readLine();
				System.out.println("Got from Client:" + line);
				out.println("Server: Heng");
				out.close();
				in.close();
				socket.close();
				ss.close();
//			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Server();
	}
}