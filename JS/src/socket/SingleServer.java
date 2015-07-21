package socket;
/*netstat -aon|findstr :10000
 *TCP    0.0.0.0:10000          0.0.0.0:0              LISTENING       8968
  TCP    [::]:10000             [::]:0                 LISTENING       8968
  UDP    127.0.0.1:10000        *:*                                    1920
  C:\>tasklist|findstr "1920"
FireSvc.exe                   1920 Services                   0      3,840 K

C:\>tasklist|findstr "8968"
javaw.exe                     8968 Console                    1     15,852 K

Then could delete what you want in process list with PID: 8968
 * */

import java.net.*;
import java.io.*;

public class SingleServer extends Thread{
	private ServerSocket ss;
	private Socket socket;
	private BufferedReader in;
	private PrintWriter out;
	private volatile boolean stop = false;
	int port;

	public SingleServer(int port){
		this.port = port;
	}
	
	private void response(String request) {
		if ("Attach".equalsIgnoreCase(request)) {
			out.println("Server: To attach");
			//To add serial attach here, which include passing response of serial to client.
		} else if ("Detach".equalsIgnoreCase(request)) {
			out.println("Server: To detach");
			//To add serial detach here, which include passing response of serial to client.
		} else if ("Bye".equalsIgnoreCase(request)) {
			requestStop();
		}
	}
	
	public void run() {
		try {
			ss = new ServerSocket(port);
			System.out.println("SingleServer started at "+port+" ...");
			while (!stop) {
				socket = ss.accept();
				System.out.println("Accepted socket: address is "+ss.getInetAddress()+", LocalPort is "+ss.getLocalPort());
				in = new BufferedReader(new InputStreamReader(
						socket.getInputStream()));
				out = new PrintWriter(socket.getOutputStream(), true);
				String request = in.readLine();
				while(null!=request) {
					System.out.println("Got from client:" + request);
					response(request);
					request = in.readLine();
				}
				out.close();
				in.close();
				socket.close();
				System.out.println("Socket Closed.");
			}
			ss.close();
			System.out.println("SingleServer stoped.");
		} catch (IOException e) {
		}
	}

    public void requestStop() {
    	stop = true;
    }
    
    public static void main(String[] args) {
    	//SingleServer ss = new SingleServer(10000);
		/*for (int i=0;i<args.length;i++) {
			System.out.println(args[i]);
		}*/
    	SingleServer ss = new SingleServer(Integer.parseInt(args[0]));
    	ss.start();
    }
}